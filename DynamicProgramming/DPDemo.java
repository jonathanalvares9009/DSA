package DynamicProgramming;

class DPDemo {

    public static int countMinStepsToOne(int n) {
        if(n == 1) {
            return 0;
        }
        int subtractOne = countMinStepsToOne(n-1);
        int minSteps = subtractOne;
        if(n%2 == 0) {
            int divideByTwo = countMinStepsToOne(n/2);
            minSteps = Math.min(minSteps, divideByTwo);
        }
        if(n%3 == 0) {
            int divideByThree = countMinStepsToOne(n/3);
            minSteps = Math.min(minSteps, divideByThree);
        }
        return 1 + minSteps;
    }

    //Memoisation texhnique
    public static int countMinStepsToOneM(int n, int minStepsArr[]) {
        if(n == 1) {
            return minStepsArr[n];
        }
        if(minStepsArr[n] != 0) {
            return minStepsArr[n];
        }
        int subtractOne = countMinStepsToOneM(n-1, minStepsArr);
        int minSteps = subtractOne;
        if(n%2 == 0) {
            int divideByTwo = countMinStepsToOneM(n/2, minStepsArr);
            minSteps = Math.min(minSteps, divideByTwo);
        }
        if(n%3 == 0) {
            int divideByThree = countMinStepsToOneM(n/3, minStepsArr);
            minSteps = Math.min(minSteps, divideByThree);
        }
        minStepsArr[n] = 1 + minSteps;
        return minStepsArr[n];
    }

    public static int countMinStepsToOneM(int n) {
        int minSteps[] = new int[n+1];
        return countMinStepsToOneM(n, minSteps);
    }
    
    public static int countMinStepsToOneDP(int n) {
        int steps[] = new int[n+1];
        steps[1] = 0;
        int i = 2;
        while(i <= n) {
            int subtractOne = steps[i-1];
            int divideByTwo = Integer.MAX_VALUE, divideByThree = Integer.MAX_VALUE;
            if(i%3 == 0) {
                divideByThree = steps[i/3];
            }
            if(i%2 == 0) {
                divideByTwo = steps[i/2];
            }
            steps[i] = 1 + Math.min(subtractOne, Math.min(divideByTwo, divideByThree));
            i++;
        } 
        return steps[n];
    }

    public static int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    private static int fibM(int n, int storage[]) {
        if(n == 0 || n == 1) {
            storage[n] = n;
            return storage[n];
        }
        if(storage[n] != -1) {
            return storage[n];
        }
        storage[n] = fibM(n-1, storage) + fibM(n-2, storage);
        return storage[n];
    }

    public static int fibM(int n) {
        int storage[] = new int[n+1];
        for(int i=0;i<n+1;i++) {
            storage[i] = -1;
        }
        return fibM(n, storage);
    }

    public static int fibDP(int n) {
        int storage[] = new int[n+1];
        storage[0] = 0;
        storage[1] = 1;
        for(int i=2;i<=n;i++) {
            storage[i] = storage[i-1] + storage[i-2];
        }
        return storage[n];
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibDP(n));
        System.out.println(fibM(n));
        System.out.println(fib(n));
        System.out.println(countMinStepsToOneM(n));
    }
}
