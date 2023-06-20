# Prefix Sum Approach

1. Check if the window size **`k`** is 0. If it is, return the original array **`nums`** as there are no elements to average.
2. Create a new array **`sums`** of type **`long`** with a length of **`nums.length + 1`**. This array will store the cumulative sums of elements in **`nums`**.
3. Iterate over the elements of **`nums`** using a for loop:
    - Calculate the cumulative sum at index **`i+1`** in the **`sums`** array by adding the current element in **`nums[i]`** to the sum at index **`i`** in **`sums`**.
4. Create a new array **`ans`** of type **`int`** with the same length as **`nums`**. Initialize all elements in **`ans`** to -1 using **`Arrays.fill()`**. This step is done to mark positions where the moving averages cannot be calculated.
5. Check if the window size **`2 * k + 1`** is greater than the length of **`nums`**. If it is, return the array **`ans`** as it is not possible to calculate moving averages with the given window size.
6. Iterate over the elements of **`nums`** starting from index **`k`** and ending at **`nums.length - k`** (exclusive):
    - Calculate the moving average at index **`j`** in **`ans`** by subtracting the cumulative sum at index **`j - k`** in **`sums`** from the cumulative sum at index **`j + k + 1`** in **`sums`**, and then dividing the result by **`2 * k + 1`**.
    - Cast the result to **`int`** since the method expects an array of **`int`** type.
7. Return the resulting array **`ans`**, which contains the moving averages.
Time Complexity : O(N)
Space Complexity : O(N)

# Sliding Window Approach

1. Check if the window size **`k`** is 0. If it is, return the original array **`nums`** as there are no elements to average.
2. Create an array **`averages`** of the same length as **`nums`** to store the calculated averages.
3. Iterate over the elements of **`nums`** using a for loop:
    - Check if the current index **`i`** is less than **`k`** or greater than or equal to **`nums.length - k`**. If true, assign **`nums[i]`** to **`averages[i]`** as these positions cannot have a complete window of size **`k`**.
    - Otherwise, calculate the average of the subarray from index **`i - k`** to index **`i + k`** (inclusive) by summing the elements in this subarray and dividing the sum by **`2 * k + 1`**. Assign the result to **`averages[i]`**.
4. Return the resulting array **`averages`**.
Time Complexity : O(N)
Space Complexity : O(1)
