¿Y por qué nos podría interesar que las listas sean polimórficas? ¡Porque nos permite _abstraernos_ un poco más! 

Por ejemplo, si tenemos una clase `Torre`, con una lista de pisos tipada como `List<Piso>`...

```java
class Torre {
   List<Piso> pisos;
   Torre(List<Piso> pisos) {
      this.pisos = pisos;
   }
   // ...
}
```

...podés instanciarla tanto pasando un `ArrayList` o un `LinkedList`: 

```java
List<Piso> pisos = new LinkedList<>();
// ...agregamos pisos a la lista
Torre orthanc = new Torre(pisos);

List<Piso> masPisos = new ArrayList<>();
// ...agregamos pisos a la lista
Torre  baraddur = new Torre(masPisos);
```

Esto es bueno porque:

  * nos ayuda a tener que pensar menos: ¿uso una lista u otra? ¡da lo mismo!;
  * y nos da más flexibilidad: tanto si lo que tenía era un `LinkedList<Piso>` o un `ArrayList<Piso>`, podés usarlo indistintamente.

:warning: De todas formas, es cierto que en algunos casos usar una u otra hará que, por ejemplo, tu programa  se ejecute más rápido. Pero por ahora eso no va a preocuparnos
