Y ahora te estarás preguntando: ¿y si quiero hacer algo con cada elemento de la colección? ¿Hay un `for` o un `each`? Sí, y se llama.... `forEach` :stuck_out_tongue:.

Por ejemplo, si los chistes entendieran un mensaje `contar` que tuviera algún tipo de efecto, podríamos escribir lo siguiente:

```java
chistes.forEach(chiste -> chister.contar());

// Otra forma equivalente es...
chistes.stream().forEach(chiste -> chister.contar());
```

> Veamos si queda claro: implementá en la clase `ArbolDeNavidad` los métodos `encender` y `apagar` que permitan, respectivamente, encender y apagar todas las luces. 