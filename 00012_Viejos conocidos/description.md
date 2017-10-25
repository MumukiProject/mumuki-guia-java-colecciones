¡Entendamos lo que acabamos de hacer!

El mensaje `stream()` devuelve un objeto llamado, ejem, _stream_ :stuck_out_tongue: (que significa _flujo_ en inglés). Este objeto nos permite procesar una lista para realizar operaciones como filtrar, contar o sumar, análogas a los mensajes como `select` y `map` que ya vimos en Ruby. Y también toman un bloque de código como argumento. 

Por ejemplo, si estamos junto a otras personas contando historias en una fogata :fire:, podríamos preguntar las siguientes cosas:

```java
// ¿Cuántas personas viven en La Pampa?
personas.stream().filter(persona -> persona.viveEn(laPampa)).count()

// ¿Todas las personas viven en La Punta?
personas.stream().allMatch(persona -> persona.viveEn(laPunta))

// ¿Alguna de las personas vive en General Roca?
personas.stream().anyMatch(persona -> persona.viveEn(generalRoca))

// ¿Cuántas historias contaron en total las personas?
personas.stream().mapToInt( persona -> persona.cantidadDeHistoriasContadas() ).sum();

// ¿Cuál es la cantidad de historias promedio que contaron las personas?
personas.stream().mapToInt( persona -> persona.cantidadDeHistoriasContadas() ).average().getAsDouble();
```

> Sabiendo esto, agregá al `Repertorio` los métodos: 
> 
>   * `esLargo`: nos dice si la longitud de todos los chistes sumados es mayor a 500
>   * `todosBuenos`: nos dice si todos los chistes son buenos.  