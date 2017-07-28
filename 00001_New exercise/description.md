Lo más parecido a los arrays de JS y Ruby que venimos viendo son las `ArrayList`s, que representan agrupaciones de cosas que **tienen un orden y pueden contener duplicados**. Por ejemplo, el siguiente código Java: 

```java
ArrayList<Integer> notas = new ArrayList<Integer>();
notas.put(4);
notas.put(8);
notas.put(4);
```

genera una lista que contiene los elementos 4, 8, 4, en ese orden. En JS o Ruby, esto se vería así: 

```ruby
notas = []
notas.push(4)
notas.push(5)
notas.push(5)
```

> ¿Notaste algo extraño en el tipo de `ArrayList` y en su instanciación? Comparalo con el código en el editor

