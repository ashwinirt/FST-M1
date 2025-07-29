#Write a program that asks the user to enter their name and their age.

# Take the user name and age as input
name =input("Enter your name:" )
age = int(input("Enter your age:"))

#Calculate the year in which the user will turn 100
year_when_100 = 2025 + (100 - age)

# print the result

print(name + " will turn 100 in the year " + str(year_when_100))
print(name + " will turn 100 in the year {}".format(year_when_100))