# Algemene plus om nog te vertellen:
- Binnen grote applicaties gebruik je vaak ook meerdere design patterns, je bent absoluut niet gelimiteerd aan 1 specifiek patroon. Het gaat hier om een sjabloon die een oplossing kan bieden voor een bepaalde probleemstelling, als je nou meerdere probleemstellingen hebt, kun je ook meerdere patronen ervoor gebruiken.

# Over facade
Een aantal weetjes over het Facade patroon:
- Facade is een structural pattern
- Een facade verhult een complex systeem, geeft daar 1 interface voor.
- Een facade is een gateway naar een (complexe) set functionaliteit. Infeite maak je een black-box voor clients. Deze hoeven zich minder zorgen te maken en komen met 1 aanspreekpunt verder, dus qua interface wordt het makkelijker voor ze.
- De facade is verantwoordelijk voor het instantieren van subsystemen en het aanroepen op de juiste wijze

In software engineering zijn structurele ontwerppatronen ontwerppatronen die het ontwerp vergemakkelijken door een eenvoudige manier te identificeren om relaties tussen entiteiten te realiseren.

- Providing simple Interface: One of the most important application of Facade Method is that it is used whenever you want to provide the simple interface to the complex sub-system
- Division into layers: It is used when we want to provide a unique structure to a sub-system by dividing them into layers. It also leads to loose coupling between the clients and the subsystem.

## Voordelen van facade?
- Het opsplitsen van verantwoordelijkheid. Een client is niet verantwoordelijk voor het juist aanroepen van een subsysteem. De client vraagt iets aan de facade en de facade regelt de rest.
- In deze zin heb je wel een losse koppeling tussen client en subsysteem, niet tussen facade en subsysteem.
- Isolation: We can easily isolate our code from the complexity of a subsystem.
- Testing Process: Using Facade Method makes the process of testing comparitively easy since it has convenient methods for commmon testing tasks.
- Loose Coupling: Availability of loose coupling between the clients and the Subsytems.

## Nadelen van Facade?
- De koppeling naar de subsystemen is hard
- Door deze koppeling wordt ook het aantal gebruiksmogelijkheden met betrekking tot functies in de subsystemen gereduceert.
- Changes in Methods: As we know that in Facade method, subsequent methods are attached to Facade layer and any change in subsequent method may brings change in Facade layer which is not favourable.
- Costly process: It is not cheap to establish the Facade method in an application for the system reliability.
- Violation of rules: There is always the fear of violation of the construction of the facade layer.



# DEMO:
Laat een aantal demo's zien (we hebben 2 java demo's, eentje car en eentje home theater).

# Conceptueel uitgelegd

## Toepasbaarheid
The Principle of Least Knowledge guides us to reduce the interactions
between objects to just a few close “friends.”

### Wat maakt Facade anders dan adapter of proxy? 
Facade, adapter en proxy lijken veel op elkaar, maar het is belangrijk om te weten dat elk patroon een ander doel heeft:
- Doel van adapter:  
  - Een adapter heeft als doel 2 interfaces met elkaar te kunnen laten communiceren, deze gaat als het waren als communicatielaag tussen deze 2 interfaces zitten.
- Doel van proxy: 
  - Een proxy heeft als doel om 
- Facade: Het doel van facade is om een complex subsysteem toegankelijk te maken voor clienten, zonder een wrapper, maar functioneert meer als een gateway. De façade dient als voorkant voor een collectie van objecten die samen een verzameling diensten aanbieden. Facade is een frans woord voor "voorzijde" of "aangezicht". Met een facade bepaal je welke functionaliteiten de client kan gebruiken. 

### Proxy
Zwart op wit is een proxy een klasse die als interface functioneert voor iets anders. In proxy is in het kort een wrapper.  
Een proxy is een soort doorgeefluik, een van de meest bekende voorbeelden is VPN. Het voegt extra functionaliteit toe aan bestaande services / business logic. Door het toepassen van een proxy pattern kun je voor of na het uitvoeren van de business logic nog extra functionaliteiten toevoegen. 
### Adapter
Een adapter is een communicatielaag tussen twee interfaces die anderszijds niet met elkaar zouden kunnen communiceren.  
Het adapter patroon converteert een interface van een klasse in iets wat een client verwacht. Adapter kan twee klassen laten samenwerken die anders niet zouden samenwerken door hun verschillende interfaces. 
### Facade
Een facade implementeert niet dezelfde interfaces als het service object (niet zoals een proxy zou doen), het is daardoor voor een facade niet mogelijk om zonder aanpassingen tussen een bestaande service en client in komen te staan. Wanneer je een hoop depencies tussen vele klassen maakt, ben je een fragiel systeem aan het bouwen wat kostbaar is en complex is om te onderhouden (eventueel ook voor anderen).

# Vragen?
Op welke vragen kunnen we ons voorbereiden?

# Bronnen
https://www.geeksforgeeks.org/facade-method-python-design-patterns/  
Head First Design Patterns by O'Reilly (boek)