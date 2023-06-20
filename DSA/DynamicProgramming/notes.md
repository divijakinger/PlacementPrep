# Basic Idea

1) We always create a dp - array of size 'n' .

2) dp[i] is the best answer for the given problem till index ‘i’ of the array.

3) dp[n] is the final answer!!!

4) We write the values of dp[1],dp[2],dp[3],.. by pure observation.(as its very easy to do!!)

5) We find a formula, example formula : dp[i]= 2*dp[i-1]+3*dp[i-2] , and apply this formula (run a for loop) to calculate further dp-values like dp[3],dp[4],….dp[n]…And then we are done!!
