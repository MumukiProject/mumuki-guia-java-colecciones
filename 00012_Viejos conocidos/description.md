En Ruby <i class="da da-ruby"></i> vimos mensajes como `all?` y `any?`, que nos permiten operar con colecciones. ¡En Java también! Y también toman un bloque de código como argumento. 

El mensaje `stream()` devuelve un objeto llamado, ejem, _stream_ :stuck_out_tongue: (que significa _flujo_ en inglés). Este objeto nos permite procesar una lista para realizar distintas operaciones.

Por ejemplo, si estamos junto a otras personas contando historias en una fogata :fire:, podríamos preguntar las siguientes cosas:

```java
// ¿Todas las personas viven en La Punta?
personas.stream().allMatch(persona -> persona.viveEn(laPunta));

// ¿Alguna de las personas vive en General Roca?
personas.stream().anyMatch(persona -> persona.viveEn(generalRoca));
```

> Sabiendo esto, agregá al `Repertorio` el método `todosBuenos` que nos dice si todos los chistes son buenos.  