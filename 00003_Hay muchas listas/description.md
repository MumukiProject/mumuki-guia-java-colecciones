Como en todo [_shonen_](https://es.wikipedia.org/wiki/Sh%C5%8Dnen), siempre que creemos que conocemos a nuestro oponente, descubrimos que no es el único. 

Así son también las listas de Java: ¡hay muchas! Por ejemplo, también contamos con `LinkedList`...

```java
LinkedList<Articulo> listaDeCompras = new LinkedList<>();
```
..., que están pensadas para agregar elementos al principio (de forma similar a las listas de Haskell) mediante `addFirst(unElemento)` o incluso al final, mediante `addLast(unElemento)`.

> A un centro de atención al cliente todos los días llegan decenas de reclamos, los cuales se atienden por orden de llegada. La excepción son algunos reclamos especiales, llamados prioritarios, que se agregan por delante de todos los otros reclamos. 
> 
> Modelá el centro de atención de forma que se pueda hacer: 
> 
> ```java
> centro.aceptarReclamo();
> centro.aceptarReclamo();
> centro.aceptarReclamo();
> centro.aceptarReclamo();
> ```

