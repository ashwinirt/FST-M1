#Given a tuple of numbers, iterate through it and print only those numbers which are divisible by 5

# Given tuple
num_tuple = (input("Enter a sequence of comma separated values: ").split(","))
#num_tuple = (10, 20, 33, 46, 55)
print("Given list is ", num_tuple)

# Print elements that are divisible by 5
print("Elements that are divisible by 5:")
for num in num_tuple:
    if (int(num) % 5 == 0):
        print(num)