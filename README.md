# rock-paper-scissors

Build a game in which two players compete in a game of Rock-Paper-Scissors with different strategies. 
Who will win more rounds? 

## Rules
The rules:
- Scissor beats Paper
- Rock beat Scissors
- Paper beats Rock
- If both players choose the same, the round is counted as a tie

Implement two players:
- Player A always chooses Paper
- Player B chooses randomly

The game consists of 100 rounds of above two players competing. 

The output of the program should be like the following:

"Player A wins 31 of 100 games"

"Player B wins 37 of 100 games"

"Tie: 32 of 100 games"

## Architecture

The game is implemented following Visitor design pattern principle.

GameVisitor represent visitor, and defines three different kind of visitors to implement, Paper, Rock and Scissors.
PaperVisitor, RockVisitor and ScissorVisitor are concrete visitors, implementing rules of the game.

Element interface declares a method for "accepting" visitors, through playAgainst method and AbstractElement.
PaperElement, RockElement and ScissorsElement are concrete elements from the Move, that accepts visitor calling play method from him.
ElementFactory creates concrete element from the move, and add appropriate Visitor to it.

GameController creates players, rounds and adding moves for every round. Result is Game object, that contains information about players and game,
as well as final result.

### Pros
- Well-structured
- Clear responsibility
- Simulating Double Dispatch - inspect for Elements and for Visitors
- Solve the problem

### Cons
- Adding new type of move, needs to create new concrete Visitor. Also, it leads to changing GameVisitor interface, that will break all concrete Visitors

The biggest problem with this implementation is, if there is a constant need for adding new type of moves. In that situation,
should think about some other design pattern.
But this game is well-structured so there is no need for constant inventing new moves, so this solution seems okay.
