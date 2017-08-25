¡Entendamos lo que acabamos de hacer!

El mensaje `stream()` devuelve un objeto llamado, ejem, _stream_  (que significa _flujo_ en inglés) :stuck_out_tongue:. Este objeto nos permite procesar una lista para realizar operaciones como filtrar, contar o sumar, análogas a las que ya vimos en Haskell o Ruby. Y al igual que en éste último, también toman un bloque de código como argumento.

Todo tiene sentido, ¿no? :stuck_out_tongue_winking_eye:

Pero algunos ejemplos valen más que mil palabras:

```java
// ¿Cuántos chistes son buenos?
chistes.stream().filter( chiste -> chiste.esBueno() ).count();

// ¿Todos los chistes son buenos?
chistes.stream().allMatch( chiste -> chiste.esBueno() );

// ¿Algún chiste es bueno?
chistes.stream().anyMatch( chiste -> chiste.esBueno() );

// ¿Cuál es la suma de los largos de todos los chistes?
chistes.stream().mapToInt( chiste -> chiste.longitud() ).sum();
```

> Nuevamente, probá todas estas consultas en la consola. Y si no te queda clara la sintaxis de los bloques, mirá la ayuda :wink:. 

