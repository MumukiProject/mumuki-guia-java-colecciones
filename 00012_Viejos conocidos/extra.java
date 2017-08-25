class Chiste {
  String texto;
  boolean esBueno;
  
  Chiste(String texto, boolean esBueno) {
    this.texto = texto;
    this.esBueno = esBueno;
  }
  
  int largo() {
    return texto.size();
  }
  
  String getTexto() {
    return texto;
  }
  
  boolean esBueno() {
    return esBueno;
  }
}

List<Chiste> chistes = Arrays.asList(
  new Chiste("¿Sabés que le dice un jaguar a otro? ¿'Jaguar you?'", false),
  new Chiste("Dos presos en la cárcel y uno le dice al otro: - ¿Y vos por qué estás acá? - Por lo mismo que vos, ¡porque no me dejan salir!", false),
  new Chiste("Éste es un chiste tan malo, que le pega a los chistes mas chicos", true));
 


