# mastercloudapp-practica2
Practica 2 - Diseño y calidad

## MasterMind UML
### svg 
<p align="center">
  <img alt="" src="https://www.plantuml.com/plantuml/img/VLH1QiCm4Bph5NjqYfqNb9BIQmkXEVIyiHOZa2KZoPZGzkzTIuaj9QOtx-piQ7OaVF01NHXxBKIhqNluG1_8zSh8Rm63nakr0n2_j_Q9MaVXo3Wv9XHrTNHsi9vaAdSyxsX0Hr4208sVcCKuJ4u5XbatoPQJip26GFqGF7yEgHa7EmhlxB3ahvAlSSglm8tuPlkpCXYKDLdta_oeGwoL_rB6NBMKVxSybOhMcg3CIFDPodJLgKKJjuCbbKnTa1bx1hHrCEy1u4ZMSDOZrN0XhUrKG-U8J0tMeUaO7aOtQ5h2I9bccclG6PYyeMv7ZSic6-lcSS-Moy3lJd64SbaQ5MSLDs6BrgkRMjcR4K-XIWuUebmoIltv4Cc7pFSgiSUEPE7lVbQixn6UckQbU70FpV9P296JOOjGrc1pJdwfXP1TVUGSyG31Vl-Vt3qp9IHoE6uLOnO5_lpJI3kPPiF69ctBXDW0qsvN8q8So4Z-D_m1">
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
