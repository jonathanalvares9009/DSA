package Trie;

import java.util.ArrayList;
import java.util.Scanner;

class Trie {
    static class TrieNode {
        char data;
        boolean isTerminating;
        TrieNode children[];
        int childCount;
    
        public TrieNode(char data) {
            this.data = data;
            this.isTerminating = false;
            this.children = new TrieNode[26];
            this.childCount = 0;
        }
    }

    private TrieNode root;
    int numWords;

    public Trie() {
        this.root = new TrieNode('\0');
        this.numWords = 0;
    }

    private void add(TrieNode root, String word) {
        if(word.length() == 0 && !root.isTerminating) {
            root.isTerminating = true;
            this.numWords++;
            return;
        } else if(word.length() == 0) {
            return;
        }
        int childIdx = word.charAt(0) - 'a';
        TrieNode child = root.children[childIdx];
        if(child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIdx] = child;
            root.childCount++;
        }
        add(child, word.substring(1)); 
    }

    public void add(String word) {
        add(root, word);
    }

    private void remove(TrieNode root, String word) {
        if(word.length() == 0) {
            root.isTerminating = false;
            this.numWords--;
            return;
        }
        int childIdx = word.charAt(0) - 'a';
        TrieNode child = root.children[childIdx];
        if(child == null) {
            this.numWords--;
            return;
        }
        remove(child, word.substring(1)); 
        if(!child.isTerminating && child.childCount == 0) {
            root.children[childIdx] = null;
            child = null;
            root.childCount--;
        }
    }

    public void remove(String word) {
        remove(root, word);
    }

    private boolean search(TrieNode root, String word) {
        if(word.length() == 0) {
            return root.isTerminating;
        } else {
            int childIdx = word.charAt(0) - 'a';
            if(root.children[childIdx] == null) {
                return false;
            } 
            TrieNode child = root.children[childIdx];
            return search(child, word.substring(1));
        }
    }

    public boolean search(String word) {
        return search(root, word);
    }

    public int countWords() {
        return this.numWords;
    }

    public boolean patternMatching(ArrayList<String> vect, String pattern) {
        // Write your code here
        for(int idx=0;idx<vect.size();idx++) {
            add(vect.get(idx));
        }
        return search(pattern);
	}

    public boolean isPalindromePair(ArrayList<String> words) {
		//Your code goes here
        for(int idx=0;idx<words.size();idx++) {
            String word = words.get(idx);
            String reverseWord = new StringBuilder(word).reverse().toString();
            for(int i=0;i<reverseWord.length();i++) {
                this.add(reverseWord.substring(i));
                this.add(reverseWord.substring(0, reverseWord.length()-i));
            }
        }
        for(int idx=0;idx<words.size();idx++) {
            String word = words.get(idx);
            if(this.search(word)) {
                return true;
            }
        }
        return false;
	}

    private void printPossibleWords(TrieNode trie, String word, String output) {
        if(trie.isTerminating) System.out.println(word+output);
        for(int idx=0;idx<trie.children.length;idx++) {
            if(trie.children[idx] != null) {
                printPossibleWords(trie.children[idx], word, output+trie.children[idx].data);
            }
        }
    }

    public void autoComplete(ArrayList<String> words, String word) {
        for(int idx=0;idx<words.size();idx++) {
            this.add(words.get(idx));
        }
        if(this.search(word)) {
            int wordIdx = word.charAt(0) - 'a';
            TrieNode trie = this.root.children[wordIdx];
            printPossibleWords(trie, ""+trie.data, "");
        }
    }

    public static void main(String[] args) {
        Trie words = new Trie();

        Scanner s = new Scanner(System.in);
        int wordCount = s.nextInt();
        s.nextLine();
        ArrayList<String> wordsArrayList = new ArrayList<>();
        for(int idx=0;idx<wordCount;idx++) {
            String word = s.nextLine();
            wordsArrayList.add(word);
        }
        String word = s.nextLine();
        // System.out.println(words.patternMatching(wordsArrayList, pattern));
        // System.out.println(words.isPalindromePair(wordsArrayList));
        words.autoComplete(wordsArrayList, word);
    }
}
