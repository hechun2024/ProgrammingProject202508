## Task 3_1 (W) — Age Distribution Algorithm
To simulate the age structure, follow these steps:

1. Define a mapping table linking cumulative probability ranges to student ages.  
   Example:
    - 16% → age 20
    - 18% → age 21
    - …

2. Generate a random integer between 1 and 100.
3. Check which probability range the number falls into.
4. Assign the corresponding age.
5. Repeat until 1000 ages are generated.
6. Count occurrences to compare with expected distribution.