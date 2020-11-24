# •	Wat zijn software design patterns?

Een design pattern is een generieke, herbruikbare oplossing voor een vaak voorkomend probleem in software ontwerp.

# •	Hoe hebben design patterns hun intrede gedaan in het vak van software engineering?

In 1994, met het uitbrengen van het book Design Patterns: Elements of Reusable Object-Oriented  Software van ” van Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides  werd in het object geörienteerd programmeren een nieuwe manier van programmeren ingebracht. Deze vier schrijvers worden vaak aangeduid met de afkorting GoF (Gang of Four). Dit boek beschrijft 23 design patterns voor het ontwikkelen van object georiënteerde software.

#	Welke software design pattern categorieën onderkennen we?
We onderscheiden drie soorten van design patterns, structural, creational en behavioral patterns.

## Creational
Creationele patterns houden zich bezig met de manier waarop objecten worden gemaakt. Deze patterns worden gebruikt wanneer een beslissing moet worden genomen op het moment van instantiatie van een klasse (d.w.z. het creëren van een object van een klasse).

## Structural:
Structurele patterns houden zich bezig met hoe klassen en objecten kunnen worden samengesteld om complexere structuren te vormen.
Het zijn patronen die de structuur van een programma verbeteren en een programma inzichtelijker maken.door de relaties te identificeren.
Deze patronen richten zich op, hoe de klassen van elkaar erven en hoe ze zijn samengesteld uit andere klassen
## Behavioral
Behavioral patterns houden zich bezig met het toewijzen van verantwoordelijkheden aan objecten.
In deze ontwerppatronen moet de interactie tussen de objecten zodanig zijn dat ze gemakkelijk met elkaar kunnen praten en toch los van elkaar gekoppeld moeten zijn.


# •	Wat zijn de voordelen van het toepassen van design patterns? Nadelen?
### Voordelen
* De toepassing van ontwerppatronen verhoogt de kwaliteit van software omdat ontwerpen worden gemaakt die zich in de praktijk reeds hebben bewezen.
* het oplossingspatroon herkenbaar is, ongeacht de implementatiedetails. Een groot voordeel is ook dat veel programmeurs bekend zijn met Design Patterns en ze beter begrijpen hoe de code in elkaar zit.Het verhoogt de leesbaarheid van de code.
* Het gebruiken van design patterns versnelt het maken van bijvoorbeeld software, omdat beschikbare oplossingen direct kunnen worden hergebruikt.


# Facade Pattern
Façade Een façade verhult een complex systeem en geeft daar één (eenvoudige) interface voor. Bij het façade pattern wordt aanbevolen om een systeem op te delen in subsystemen, om complexiteit tegen te gaan. Het façade-object kan vervolgens al deze subsystemen instantiëren en op de juiste wijze aanroepen.
 ## Wanneer te gebruiken
 Als er veel afhankelijkheden tussen clients en implementaties zijn, kan het handig zijn om dit met een façade af te schermen van de rest van het programma. 
 Het pattern kan ook toegepast worden als je subsystemen op wilt delen in lagen. Alle communicatie tussen deze lagen verloopt via façades.
 

 
 




In de bovenstaande UML class diagram , het Client klasse heeft niet direct toegang tot het subsysteem klassen. In plaats daarvan, het Clientwerken door middel van een Facadeklasse die een eenvoudige interface in termen van implementeert  (door delegeren aan) het subsysteem klassen ( Class1, Class2, en Class3). Het Client klasse hangt alleen af van de eenvoudige Facadei klasse en is onafhankelijk van het complex subsysteem. De sequentie diagram toont de run-time interacties: het Clientobject werkt via een Facadeobject dat gedelegeerden het verzoek om de Class1, Class2en Class3 instanties die het verzoek uitvoert. 

## De voordelen van het toepassen van het design Façade

Het beschermt de klanten tegen de complexiteit van de componenten van het subsysteem.
Het bevordert een losse koppeling tussen subsystemen en zijn klanten.


### Bronnen
https://nl.wikipedia.org/wiki/Ontwerppatroon
https://www.javatpoint.com/design-patterns-in-java
https://nl.qaz.wiki/wiki/Facade_pattern
https://en.wikipedia.org/wiki/Facade_pattern




