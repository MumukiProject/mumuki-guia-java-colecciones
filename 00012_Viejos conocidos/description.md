¡Entendamos lo que acabamos de hacer!

El mensaje `stream()` devuelve un objeto llamado, ejem, _stream_  (que significa _flujo_ en inglés) :stuck_out_tongue:. Este objeto nos permite procesar una lista para realizar operaciones como filtrar, contar o sumar, análogas a las que ya vimos en Haskell o Ruby.

Pero algunos ejemplos valen más que mil palabras:

```java
// ¿Cuántos chistes son buenos?
chistes.stream().filter( chiste -> chiste.esBueno() ).count();

// ¿Todos los chistes son buenos?
chistes.stream().allMatch( chiste -> chiste.esBueno() );

// ¿Algún chiste es bueno?
chistes.stream().anyMatch( chiste -> chiste.esBueno() );

// ¿
chistes.stream().mapToInt( chiste -> chiste.esBueno() ).sum();
