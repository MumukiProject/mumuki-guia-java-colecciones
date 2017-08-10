Lo más parecido a los arrays de JavaScript y Ruby son las `ArrayList`s, que representan agrupaciones de cosas que **tienen un orden y pueden contener duplicados**. Por ejemplo, el código que genera una lista que contiene los elementos 4, 8, 4... 

```ruby
notas = []
notas.push(4)
notas.push(8)
notas.push(4)
```

...en Java se verá así:

```java
ArrayList<Integer> notas = new ArrayList<Integer>();
notas.put(4);
notas.put(8);
notas.put(4);
```

> ¿Notaste algo extraño en el tipo de `ArrayList` y en su instanciación? Comparalo con el siguiente código...
> 
> ```java
> ArrayList<String> letra = new ArrayList<String>();
> letra.put("Remontar");
> letra.put("el barrilete");
> letra.put("en esta tempestad");
> ```
>
> ...y contanos qué significa lo que está entre `<` y `>`. 

