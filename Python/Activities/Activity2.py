#Ask the user for a number.
# Depending on what number they enter, tell them if the number is an even or odd number.

# Take the input from the user
number = int(input("Enter the number: "))

# Check if the number is even or odd
if number%2==0:
    print(str(number)+ " is even number")
    print("{} is even number".format(number))
    print(f"{number} is even number")
else:
    print(str(number)+ " is odd number")
    print("{} is odd number".format(number))
    print(f"{number} is odd number")