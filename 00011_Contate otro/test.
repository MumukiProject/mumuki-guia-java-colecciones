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