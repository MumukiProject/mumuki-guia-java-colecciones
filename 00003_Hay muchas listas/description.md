Como en todo [_shonen_](https://es.wikipedia.org/wiki/Sh%C5%8Dnen), siempre que creemos que conocemos a nuestro oponente, descubrimos que no es el único. Así son también las listas de Java: ¡hay muchas! Por ejemplo, también contamos con las `LinkedList`...

```java
LinkedList<Articulo> listaDeCompras = new LinkedList<>();
```
... que están pensadas para agregar elementos al principio (de forma similar a las listas de Haskell) mediante `addFirst(unElemento)` o incluso al final, mediante `addLast(unElemento)`.

> A un centro de atención al cliente llegan decenas de reclamos diarios, los cuales se atienden por orden de llegada. La excepción son algunos reclamos prioritarios, que se agregan por delante de todos los otros. 
> 
> Modelá un `CentroDeAtencion` de forma que se pueda hacer: 
> 
> ```java
> ReclamoComun faltaUnaBirome = new ReclamoComun();
> ReclamoComun elMonitorAndaMal = new ReclamoComun();
> ReclamoComun incendioEnPlanta = new ReclamoPrioritario();
> ReclamoComun corteGeneralDeServicio = new ReclamoPrioritario();
>
> CentroDeAtencion centro = new CentroDeAtencion();
> centro.aceptarReclamo(faltaUnaBirome);
> centro.aceptarReclamo(corteGeneralDeServicio);
> centro.aceptarReclamo(elMonitorAndaMal);
> centro.aceptarReclamo(incendioEnPlanta);
> centro.getReclamos(); 
> // devuelve incendioEnPlanta, corteGeneralDeServicio, faltaUnaBirome y elMontorAndaMal, en ese orden
> ```
> 
> Y como reto adicional: ¡no uses `if`s! :muscle:

