# [Best Time to Buy and Sell Stock](./BestTimeToBuyAndSellStock.java)

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:

    Input: prices = [7,1,5,3,6,4]
    Output: 5
    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:

    Input: prices = [7,6,4,3,1]
    Output: 0
    Explanation: In this case, no transactions are done and the max profit = 0.

Solutions:

Sliding Window:

    1. If length of prices is less than 2, return 0.
    2. Initialise a left = 0 and right = 1 pointer.
    3. Initialise a maxProfit = 0.
    3. Loop through the array until right is less than the prices array length.
        1. If left < right, left = right.
        2. right = right + 1.
    4. If currentProfit is greater than maxProfit, update the maxProfit variable.
    5. Return the maxProfit.
