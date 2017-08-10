@Test
public void una_biblioteca_recien_creada_esNueva() {
  Assert.assertTrue("debería ser nueva", new Biblioteca().esNueva());
}

@Test
public void si_agregamos_tres_titulos_el_tamanio_es_3() {
  Biblioteca alejandria = new Biblioteca();
  alejandria.incorporar(new Titulo());
  alejandria.incorporar(new Titulo());
  alejandria.incorporar(new Titulo());
  Assert.assertEquals(3, alejandria.tamanio());
}

