# mastercloudapp-practica2
Practica 2 - Diseño y calidad

## MasterMind UML
### svg 
<p align="center">
  <img alt="" src="https://www.plantuml.com/plantuml/svg/ZLF12eCm3BttAteUw1SC4Jpiii7Om7kdsIYqpMWhNlRnKqjNhKwzb9ZtclUIrDnOfcqZ1I6LOCRG2pCMjEIg9Y6aXwJ6LYKPFUEBLuj8oQ4bXAiEUB8At7T_q3JDQ87AQXG2j1VgCWO51DhnuqfDa54SfEwzvnEJQnIeDDW2vOChPZcg_zIhnZSQsCMzWMd4lh8zLSBFPUZQpo64eVMXimtEtE_61UTalW6to-6CPZlYHl2gUCITwKPuFvi5UGlZPnIkbznmYvtxMIgqwjVXPp1zUWiLQEADHBd12AM4vA3gxl_u0W00">
</p>

### PlantUML
 ```PlantUML

@startuml

class Mastermind
Mastermind *-down-> Logic
Mastermind *-down-> View

interface View
View ..> Controller

class ConsoleView
View <|-down- ConsoleView
ConsoleView *-down-> StartGameView
ConsoleView *-down-> SecretCombinationView
ConsoleView *-down-> ProposeCombinationView
ConsoleView *-down-> ResultCombinationView
ConsoleView *-down-> ResumeGameView

class Controller
Controller <|-down- StartController
Controller <|-down- ProposeCombinationController
Controller <|-down- ResumeController

class Logic
Logic *-down-> StartController
Logic *-down-> ProposeCombinationController
Logic *-down-> ResumeController
Logic *-down-> Game
Logic *-down-> State

interface ControllerVisitor

ControllerVisitor <|-down- View
Controller ..> ControllerVisitor

Controller --> Game
Controller --> State  

@enduml
 ```
