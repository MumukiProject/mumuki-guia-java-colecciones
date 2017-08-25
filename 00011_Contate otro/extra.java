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