class Chiste {
  String texto;
  boolean bueno;
  
  Chiste(String texto, boolean bueno) {
    this.texto = texto;
    this.bueno = bueno;
  }
  
  int largo() {
    return texto.length();
  }
  
  String getTexto() {
    return texto;
  }
  
  boolean esBueno() {
    return bueno;
  }
}