import random
arr=["nat","man","shak"]
choice=random.choice(arr)
print(choice)
guess=[]
for i in range(len(choice)):
    guess +="_"
print(guess)
    
for i in range(len(choice)):
    a=input("Guess  a letter: ").lower()
    letter=choice[i]
    if letter==a:
        guess[i]=letter
    print(guess)
if (i == len(choice)-1):
    print("You win")

print(10/3)

