¡Exactamente! 

Ciertas clases, conocidas en Java como _clases genéricas_ admiten ser parametrizadas según uno o más tipos. Los `ArrayList`, por ejemplo, están parametrizados **según el tipo de elemento que contendrán**, lo cual, si viste Haskell, te será familiar: 

```haskell
nombres :: [String]
nombres = ["Victoria", "Mercedes", "Laura", "Alfonsina", "Juana"]

numeros :: [Int]
numeros = [4, 8, 15, 16, 23, 42]
```

Ah, algo más: en realidad no es necesario indicar explícitamente el tipo **en la instanciación**, sino sólo **en la variable**. 

¿Eh, qué? :dizzy_face: Un ejemplo vale más que mil palabras:

```java
ArrayList<Integer> notas = new ArrayList<>();
```

¿Más conciso, no? :smile:


