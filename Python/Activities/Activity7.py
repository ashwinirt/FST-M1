#Write a Python program to calculate the sum of all the elements in a list.
numberList = list(input("Enter a sequence of comma separated values: ").split(","))
#numberList = [10,20,30,40,50,60,70]

sum = 0
 
for number in numberList:
  sum += int(number)
 
#print sum of all the numbers
print("The sum of all the numbers in the list is:", sum)