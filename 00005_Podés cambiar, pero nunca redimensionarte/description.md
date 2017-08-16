Y ya que estamos hablando de torres y pisos, te presentemos una nueva forma de crear listas que nos va a venir como anillo al dedo :point_up_2:: `Arrays.asList`. Se usa así: 

```java
// Esto crea una lista de 3 pisos
List<Piso> pisos = Arrays.asList(primerPiso, segundoPiso, tercerPiso);
```

Lo particular de este método es que crea una lista que no es instancia de `LinkedList` ni `ArrayList` (¡ahá, otro buen motivo para abstraernos del tipo de lista! :sunglasses:), sino que es una clase que **no permite agregar ni quitar elementos**. 

Pero claro, si no pensás redimensionarla una vez creada, ésto no es un problema. Por ejemplo, por más que remodeles los pisos es poco probable que le agregues nuevos a una torre :stuck_out_tongue:.

> Justamente lo que sí queremos hacer es:
> 
>  * `unaTorre.cantidadDePisos()`
>  * `unaTorre.` `numeroDePisoDe` un  


