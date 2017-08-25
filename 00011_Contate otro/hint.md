Lo que nos está faltando es una forma de _hacer algo con cada elemento_ de una lista, en particular _contar_ todos los elementos _que cumplen_ una condición. En Java ésto lo podemos hacer enviando los siguientes mensajes:

```java
personas.stream().filter(persona -> persona.viveEn(usuahia)).count()
```

Si mirás esta expresión con detenimiento, vas a ver que es muy parecida a su equivalente en Ruby:

```ruby
personas.select { |persona|  persona.vive_en? usuahia }.size
```

Pero no nos adelantemos :smile:. 
