# Exercise 1 -> Basic Add, Access, Modify
# 1. Create a list of strings called fruits.
# 2. Add "Apple", "Banana", "Orange".
# 3. Insert "Mango" at index 1.
# 4. Change "Orange" to "Watermelon".
# 5. Print all fruits.


fruits = ["Apple", "Banana", "Orange"]
fruits.insert(1, "Mango")

index = fruits.index("Orange")
#or
fruits[fruits.index("Orange")] = "Watermelon"
print(index)
print(fruits)

#Exercise 2 ->  Remove and Search
# 1. Create a list with [5, 10, 15, 20, 25].
# 2. Remove the element at index 2.
# 3. Remove the value 20.
# 4. Check if 25 is in the list.
# 5. Print the size of the list.

nums = [5,10,15,20,25]
nums.remove(nums[2])
nums.remove(20)

has_number = 25 in nums
print (has_number)
print(len(nums))

#Exercise 3 -> Sorting
# 1. Create a list: ["John", "Alice", "Bob", "Charlie"].
# 2. Sort alphabetically.
# 3. Sort by length of name.
# 4. Print results.

names = ["John", "Alice", "Bob", "Charlie"]
names.sort() #Alphabetically
names.sort(key = lambda x : len(x))  ##by length
print(names)

#Exercise 4 -> 2D List / Nested ArrayList
# 1. Create a list of lists.
# 2. Add:
#    Row 1: [1, 2, 3]
#    Row 2: [4, 5]
# 3. Print the second element of the first row.
# 4. Print the first element of the second row.

twoD = [
    [1,2,3],
    [4,5]
]
print(twoD[0][1])
print(twoD[1][0])

#Exercise 5 -> Filtering + Sorting (Interview Style)
# Given a list of dicts:
# [
#  {"name":"Pizza", "price":12},
#  {"name":"Salad", "price":8},
#  {"name":"Burger", "price":10},
#  {"name":"Pasta", "price":10}
# ]
# 1. Keep only items with price >= 10.
# 2. Sort by price ASC, then name ASC.
# 3. Print results.

namesMap = [
  {"name":"Pizza", "price":12},
  {"name":"Salad", "price":8},
  {"name":"Burger", "price":10},
  {"name":"Pasta", "price":10}]

list(filter(lambda x : x["price"] >= 10, namesMap))
namesMap.sort(key = lambda x : (x["price"], len(x["name"])))

print(namesMap)
#Exercise 6 -> Queries on Dynamic Data
# 1. Read N lines of integers into a list of lists.
# 2. Read Q queries: each query gives row and col.
# 3. Print the value or "ERROR!" if not found.

