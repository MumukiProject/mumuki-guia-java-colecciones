@Test
public void si_hay_1_chiste_bueno_cantidadBuenos_devuelve_1() {
  Repertorio repertorio = new Repertorio(Arrays.asList(
    new Chiste("...", false),
    new Chiste("...", false),
    new Chiste("...", false),
    new Chiste("...", true),
    new Chiste("...", false)));
  
  Assert.assertEquals(1, repertorio.cantidadBuenosChistes());
}

@Test
public void si_hay_1_chiste_bueno_de_entre_5_todosBuenos_devuelve_false() {
  Repertorio repertorio = new Repertorio(Arrays.asList(
    new Chiste("...", false),
    new Chiste("...", false),
    new Chiste("...", false),
    new Chiste("...", true),
    new Chiste("...", false)));
  
  Assert.assertFalse(repertorio.todosBuenos());
}


@Test
public void si_hay_2_chiste_bueno_de_entre_2_todosBuenos_devuelve_true() {
  Repertorio repertorio = new Repertorio(Arrays.asList(
    new Chiste("...", true),
    new Chiste("...", true)));
  
  Assert.assertTrue(repertorio.todosBuenos());
}


@Test
public void si_hay_4_chistes_buenos_cantidadBuenos_devuelve_4() {
Repertorio repertorio = new Repertorio(Arrays.asList(
    new Chiste("...", true),
    new Chiste("...", false),
    new Chiste("...", true),
    new Chiste("...", true),
    new Chiste("...", true)));
  
  Assert.assertEquals(4, repertorio.cantidadBuenosChistes());
}


@Test
public void si_no_hay_chistes_buenos_cantidadBuenos_devuelve_0() {
  Repertorio repertorio = new Repertorio(Arrays.asList());
  
  Assert.assertEquals(0, repertorio.cantidadBuenosChistes());
}


@Test
public void si_no_hay_chistes_no_es_largo() {
  Repertorio repertorio = new Repertorio(Arrays.asList());
  
  Assert.assertFalse(repertorio.esLargo());
}