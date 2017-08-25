Piso recepcion = new Piso();
Piso comedor = new Piso();
Piso mirador = new Piso();

@Test
public void se_puede_crear_una_torre_pasando_los_pisos_por_parametro() {
  new Torre(Arrays.asList(recepcion, comedor, mirador));
}

@Test
public void si_la_torre_tiene_3_pisos_su_altura_es_3() {
  Torre torre = new Torre(Arrays.asList(recepcion, comedor, mirador));
  Assert.assertEquals(3, torre.altura());
}


@Test
public void si_la_torre_tiene_2_pisos_su_altura_es_2() {
  Torre torre = new Torre(Arrays.asList(recepcion, comedor));
  Assert.assertEquals(2, torre.altura());
}

@Test
public void el_primer_piso_es_el_1() {
  Torre torre = new Torre(Arrays.asList(recepcion, comedor));
  Assert.assertEquals(1, torre.numeroDePiso(recepcion));
}
