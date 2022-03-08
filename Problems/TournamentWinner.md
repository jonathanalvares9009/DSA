# [Tournament Winner](./TournamentWinner.java)

There's an algorithms tournament taking place in which teams of programmers
compete against each other to solve algorithmic problems as fast as possible.
Teams compete in a round robin, where each team faces off against all other
teams. Only two teams compete against each other at a time, and for each
competition, one team is designated the home team, while the other team is the
away team. In each competition there's always one winner and one loser; there
are no ties. A team receives 3 points if it wins and 0 points if it loses. The
winner of the tournament is the team that receives the most amount of points.

Given an array of pairs representing the teams that have competed against each
other and an array containing the results of each competition, write a
function that returns the winner of the tournament. The input arrays are named
competitions and results, respectively. The
competitions array has elements in the form of
[homeTeam, awayTeam], where each team is a string of at most 30
characters representing the name of the team. The results array
contains information about the winner of each corresponding competition in the
competitions array. Specifically, results[i] denotes
the winner of competitions[i], where a in the
results array means that the home team in the corresponding
competition won and a 0 means that the away team won.

It's guaranteed that exactly one team will win the tournament and that each
team will compete against all other teams exactly once. It's also guaranteed
that the tournament will always have at least two teams.

## Sample Input

competitions = = [
["HTML", "C#"],
["C#", "Python"],
["Python", "HTML"],
]

results = [0, 0, 1]

## Sample Output

Python

## Approach 1: Using a hashmap to store the scores of each team.

1. Iterate through the results array.
2. If result is 1, check if the home team is present if it is then add 3 to the score of the home team. If it is not present then create an entry in the hashmap and add 3 to the score.
3. If result is 0, check if the away team is present if it is then add 3 to the score of the away team. If it is not present then create an entry in the hashmap and add 3 to the score.
4. Iterate through the hashmap and find the team with the highest score.

O(n) time | O(n) space

## Approach 2: Using a hashmap to store the scores of each team and checking the maximum score at the same time.

1. Initialize max to 0 and winnerTeam to empty string.
2. Iterate through the results array.
3. If result is 1, check if the home team is present if it is then add 3 to the score of the home team. If it is not present then create an entry in the hashmap and add 3 to the score. Check the max score and update the winnerTeam if the score is greater than max.
4. If result is 0, check if the away team is present if it is then add 3 to the score of the away team. If it is not present then create an entry in the hashmap and add 3 to the score. Check the max score and update the winnerTeam if the score is greater than max.

O(n) time | O(n) space
