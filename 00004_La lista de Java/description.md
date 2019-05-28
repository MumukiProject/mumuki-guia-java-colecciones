\- _¿Pinky, estás pensando lo mismo que yo?_
\- _Creo que sí Cerebro, ¡me encanta el rosa de Mumuki!_
\- _Argg, no Pinky... ¡las listas son polimórficas!_ :mouse:

Efectivamente, las diferentes listas de Java son polimórficas: implementan todos una `interface` llamada `List`, que (un poco simplificada) se ve así:

<!--
interface List {
  int size()
  boolean isEmpty()
  boolean contains(elemento)
  void add(elemento)
  void remove(elemento)
  void clear()
  int indexOf(elemento)
}

class ArrayList implements List {

}

class LinkedList implements List {
  void addFirst(element)
  void addLast(elemento)
}

class Otras implements List {

}
-->

<img src="http://www.plantuml.com/plantuml/png/TOvD3e9038NtdA9BF8OBNP5mXZfJaaQcGzg6YCQxysC867JPho_lUonEsc0WgDWSNWK0YuFnayhJTDnoRWa5s2wfy-6BXIoEB5PIIud4y_piCqV068zGAUMUZZnCPReKpsQMI8-wsSNUHH5QD8EpAWxBJ4xTvsthx2rLiTmf_ebj-wwivgjbFxp2ZU_jjIlQJ_C8"> </img>

Esto significa que si no usas mensajes específicos de `LinkedList` o `ArrayList`, son intercambiables. 

> ¿Ah, no nos creés?  :unamused: Probá tipar `versos` y `anios` como `List` y no usando tipos específicos. 