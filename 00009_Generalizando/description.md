<!-- ¿Ves algo en común entre las listas y los sets? ¿No te parecen muy, muy parecidos? Repasemos su interfaz: -->

Efectivamente, la diferentes listas de Java son polimórficas: implementan todos una `interface` llamada `Collection`, que (un poco simplificada) se ve así:

<!--
interface Collection {
  int size()
  boolean isEmpty()
  boolean contains(elemento)
  void add(elemento)
  void remove(elemento)
  void clear()
}

interface List implements Collection {
  int indexOf(elemento)
}

interface Set implements Collection {

}

interface Otras implements Collection {

}
-->

<img src="http://www.plantuml.com/plantuml/png/VOvD2W8n34RtFKMMupd4dJ0BJr3RRo3G9aCR1d_mxdOGn3BgCY-FnyTYA9CFeBscX62iGdT7n69K-OPXruwpQe8Nudh8irqx5bJCizG12HbYkZuNvKW-nYqioBfWoqEBbHP-ECVlJKUkHfpdbro_RMI9k8pJHx0hdF0xq9kZ5L__kKy0">

Esto quiere decir que si no usas mensajes específicos de `List` o `Set`, son intercambiables.

> Probá tipar ambas variables del ejemplo como ``.
