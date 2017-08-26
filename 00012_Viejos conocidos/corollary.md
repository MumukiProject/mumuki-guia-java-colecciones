Todo tiene sentido, ¿no? :stuck_out_tongue_winking_eye:

Lo complicado de los streams es que el tipado estático nos obliga a tener mayores cuidados. Por eso es que no tenemos un sólo mensaje `map`, sino varios:

* `mapToInt`: cuando el mapeo va devolver enteros
* `mapToDouble`: cuando el mapeo va devolver flotantes
* `map`: cuando el mapeo va devolver otros tipos de dato
