# Design Patterns
Proof of Concept

# Wat zijn software design patterns
Design patterns zijn generieke, herbruikbare oplossingen voor vaak voorkomende problemen in software ontwikkeling. Verder wordt er beschreven wanneer het pattern is toe te passen en de gevolgen hiervan. Design patterns zijn geen oplossing, maar bieden een sjabloon om tot een oplossing te komen.

# Hoe hebben design patterns hun intrede gedaan in het vak van software engineering?
Design patterns komen voort uit de architectuur (bouw) en zijn door E. Gamma, R. Helm, R. Johnson en J. Vlissides vertaald naar de softwarewereld.
Design patterns vinden hun intrede [sinds 1966](https://en.wikipedia.org/wiki/Software_design_pattern) en het belangrijkste waar ze voor zorgen is herbruikbaarheid van software. Zie o.a. ook het [DRY](https://nl.wikipedia.org/wiki/DRY_(programmeren)) (Dont Repeat Yourself) principe. 

# Welke software design pattern categorieën onderkennen we?
Software design patterns zijn onder te verdelen in 3 categorieen, wel te verstaan:
- Behavioral
  - Behavioral patterns houden zich bezig met het toewijzen van verantwoordelijkheden aan objecten.
    In deze ontwerppatronen moet de interactie tussen de objecten zodanig zijn dat ze gemakkelijk met elkaar kunnen praten en toch los van elkaar gekoppeld moeten zijn.
- Structural
  - Structural patterns houden zich bezig met hoe klassen en objecten kunnen worden samengesteld om complexere structuren te vormen.
    Het zijn patronen die de structuur van een programma verbeteren en een programma inzichtelijker maken door de onderlinge (klasse) relaties te identificeren.
    Deze patronen richten zich op, hoe de klassen van elkaar erven en hoe ze zijn samengesteld uit andere klassen.
- Creational
  - Creationel patterns houden zich bezig met de manier waarop objecten worden gemaakt. Deze patterns worden gebruikt wanneer een beslissing moet worden genomen op het moment van instantiatie van een klasse (d.w.z. het creëren van een object van een klasse).

# Wat zijn de voordelen van het toepassen van design patterns? Nadelen?
### Voordelen
- Design patterns worden gemaakt op basis van trialproof methodes, er zit een bepaalde mate van zekerheid in dat ze goed werken.
- Design patterns zorgen voor structuur in de code, waardoor het voor mede-programmeurs makkelijker wordt om bij te dragen aan de code.
- Het gebruik maken van design patterns zorgt ervoor dat je gestructureerd en sneller code kan maken.

### Nadelen
- Niet iedereen is bekend met design patterns en maakt er gebruik van.
- Het gebruik van 1 specifiek design pattern is geen oplossing voor alle problemen. Het ligt echt aan de probleemstelling om tot een keuze te komen over welk design pattern er gebruikt zal worden.

# Facade Pattern
Een façade verhult een complex systeem en geeft daar één (eenvoudige) interface voor. Bij het façade pattern wordt aanbevolen om een systeem op te delen in subsystemen, om complexiteit tegen te gaan. Het façade-object kan vervolgens al deze subsystemen instantiëren en op de juiste wijze aanroepen.

Als er veel afhankelijkheden tussen clients en implementaties zijn, kan het handig zijn om dit met een façade af te schermen van de rest van het programma.
Het pattern kan ook toegepast worden als je subsystemen op wilt delen in lagen. Alle communicatie tussen deze lagen verloopt via façades.

## De voordelen van het toepassen van het design Façade

- Het beschermt clients tegen de complexiteit van de componenten van het subsysteem. De verantwoordelijkheid ligt bij de facade, niet bij de client.
- Het bevordert een losse koppeling (en encapsulatie) tussen subsystemen en clients. De koppeling tussen de subsystemen en de facade class is niet los gekoppeld.


# Bronnen
https://nl.wikipedia.org/wiki/Ontwerppatroon
https://www.javatpoint.com/design-patterns-in-java
https://nl.qaz.wiki/wiki/Facade_pattern
https://en.wikipedia.org/wiki/Facade_pattern
