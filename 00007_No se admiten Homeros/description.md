Pero no todo es una lista en el mundo de Java. Otra posible agrupación de elementos es el _conjunto_ o `Set`, cuya implementación es el `HashSet`.

Los `Set`s tienen dos características:

  * **no admiten elementos** repetidos: si tratás de agregar a un mismo elemento dos veces, solo lo hace una;
  * **no mantienen un orden**: si los recorrés mediante un mensaje de colecciones (como por ejemplo `forEach`), el orden en que los elementos son visitados no sigue ninguna lógica especial.

Por ejemplo:

```java
List<Integer> numeros = Arrays.asList(1,1,3,3,4,4,8,7);

numeros.size(); //Esto devuelve 8

Set<Integer> numerosSinRepetidos = new HashSet(numeros);

numerosSinRepetidos.size(); //Esto devuelve 5, ya que la colección no contiene repetidos
```

> Modificá el tipo de `integrantes` de manera tal que no tenga repetidos.


