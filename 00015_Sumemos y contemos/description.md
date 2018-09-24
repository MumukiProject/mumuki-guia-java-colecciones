Ya se va apagando la fogata pero seguimos teniendo dudas de la gente de la ronda, por ejemplo:

``` java
// ¿Cuántas personas viven en Gral. Las Heras?
personas.stream().filter(persona -> persona.viveEn(gralLasHeras)).count()

// ¿Cuántas historias contaron en total las personas?
personas.stream().mapToInt( persona -> persona.cantidadDeHistoriasContadas() ).sum();

// ¿Cuál es la cantidad de historias promedio que contaron las personas?
personas.stream().mapToInt( persona -> persona.cantidadDeHistoriasContadas() ).average().getAsDouble();
```

Veamos que hacen estos mensajes:

* `count` nos devuelve un `long` con la cantidad de elementos del `Stream`;
* `sum` nos devuelve la sumatoria de un `Stream` compuesto de números;
* `average` nos dice un promedio, y `getAsDouble` convierte este valor al tipo `double`.

> Definí el método `granRepertorio` en la clase `Repertorio` que nos dice si la longitud de todos los chistes sumados es mayor a 200. 