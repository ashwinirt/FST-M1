#Rock-Paper-Scissors game

#Take two user inputs
player1 = input("Player 1, enter your move (rock, paper, or scissors): ").lower()
player2 = input("Player 2, enter your move (rock, paper, or scissors): ").lower()

#Define the rules of the game
if player1 == player2:
    print("It's a tie")
elif (player1 == "rock"):
    if(player2 == "scissors"):
        print("Player 1 wins!")
    else:
        print("Player 2 wins!")
elif(player1 =="paper"):
    if(player2 =="rock"):
        print("Player 1 wins!")
    else:
        print("Player 2 wins!")
elif(player1 =="scissors"):
    if(player2 == "paper"):
        print("Player 1 wins!")
    else:
        print("Player 2 wins!")