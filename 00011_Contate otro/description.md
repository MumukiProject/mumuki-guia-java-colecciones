La famosa comediante Sandra se está preparando para una nueva función, y está repasando qué chistes usará. Ya armó una lista tentativa...

```java
List<Chiste> chistesParaLaFuncion = ....
```

...y además de cada chiste sabe si `esBueno`. Lo que ahora necesita saber es **cuántos** chistes buenos hay. ¿Podemos ayudarla? ¡Por supuesto!   

> Probá en la consola las siguientes consultas: 
> 
> * `ム chistes`
> * `ム chistes.size()`
> * `ム chistes.stream().filter(chiste -> chiste.esBueno()).count()`
> * `ム chistes.stream().filter(chiste -> !chiste.esBueno()).count()`
> 
> ¿Qué está haciendo cada una?
