# -Mini-Program---Gaming-Store
Write a program, which helps you buy the games. The valid games are the following games in this table: README file
Write a program, which helps you buy the games. The valid games are the following games in this table:
Name	Price
OutFall 4	$39.99
CS: OG	$15.99
Zplinter Zell	$19.99
Honored 2	$59.99
RoverWatch	$29.99
RoverWatch Origins Edition	$39.99
On the first line, you will receive your current balance – a floating-point number in the range [0.00…5000.00].
Until you receive the command “Game Time”, you have to keep buying games. When a game is bought, the user’s balance decreases by the price of the game.
Additionally, the program should obey the following conditions:
•	If a game the user is trying to buy is not present in the table above, print “Not Found” and read the next line.
•	If at any point, the user has $0 left, print “Out of money!” and end the program.
•	Alternatively, if the user is trying to buy a game which they can’t afford, print “Too Expensive” and read the next line.
When you receive “Game Time”, print the user’s remaining money and total spent on games, rounded to the 2nd decimal place.
Examples
Input	Output
120
RoverWatch
Honored 2
Game Time	Bought RoverWatch
Bought Honored 2
Total spent: $89.98. Remaining: $30.02
19.99
Reimen origin
RoverWatch
Zplinter Zell
Game Time	Not Found
Too Expensive
Bought Zplinter Zell
Out of mo-ney!
79.99
OutFall 4
RoverWatch Origins Edition
Game Time	Bought OutFall 4
Bought RoverWatch Origins Edition
Total spent: $79.98. Remaining: $0.01
