Lo más parecido a los arrays de JavaScript y Ruby son las `ArrayList`s, que representan agrupaciones que **tienen un orden y pueden contener duplicados**. Por ejemplo, el código en Ruby que genera una lista que contiene los elementos 4, 8, 4... 

```ruby
notas = []
notas.push(4)
notas.push(8)
notas.push(4)
```

...en Java se verá así:

```java
ArrayList<Integer> notas = new ArrayList<Integer>();
notas.add(4);
notas.add(8);
notas.add(4);
```

> ¿Notaste algo extraño en el tipo de `ArrayList` y en su instanciación? Comparalo con el siguiente código...
> 
> ```java
> ArrayList<String> letra = new ArrayList<String>();
> letra.add("Remontar");
> letra.add("el barrilete");
> letra.add("en esta tempestad");
> ```
>
> ...y contanos qué significa lo que está entre `<` y `>`. 

