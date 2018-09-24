A las colecciones también las podemos transformar y filtrar, con los mensajes `map` y `filter` respectivamente. 

Siguiendo el ejemplo de la fogata:

``` java
// ¿Cuáles son las personas que viven en La Pampa?
personas.stream().filter(persona -> persona.viveEn(laPampa)).collect(Collectors.toList());

// ¿Cuáles son los nombres de las personas?
personas.stream().map(persona -> persona.getNombre()).collect(Collectors.toList());

// ¿Cuáles son las edades de los mayores?
personas.stream().filter(persona -> persona.esMayor()).map(persona -> persona.getEdad()).collect(Collectors.toList());
```

Pero, ¿qué significa el mensaje `collect(Collectors.toList())`?

Tanto `filter` como `map` devuelven un `Stream`, pero a nosotros nos interesa trabajar con listas. Por eso, en nuestras tres primeras preguntas, llamamos a `collect(Collectors.toList())` para transformar un `Stream<Persona>` en una `List<Persona>`.

> Definí en `Repertorio` los métodos:
> * `chistesLargos`, que nos devuelve los chistes que tengan un `largo` mayor a 50.
> * `textoDeLosChistes`, que nos devuelve una lista con los textos de cada chiste.