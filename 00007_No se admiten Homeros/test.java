ClubDeNoHomeros club;

@Before
public void setUp() {
  club = new ClubDeNoHomeros();
}

@Test
public void el_club_de_no_homeros_tiene_tres_integrantes() {
  Assert.assertEquals(3, club.cantidadIntegrantes());
}

@Test
public void el_club_de_no_homeros_tiene_cuatro_integrantes_si_agrego_alguno_que_no_existe_muchas_veces() {
  club.integrantes.add("Abe");
  club.integrantes.add("Abe");
  Assert.assertEquals(4, club.cantidadIntegrantes());
}

@Test
public void el_club_de_no_homeros_no_tiene_en_cuenta_los_integrantes_repetidos() {
  club.integrantes.clear();
  club.integrantes.add("Homero");
  club.integrantes.add("Homero");
  club.integrantes.add("Abe");
  club.integrantes.add("Abe");
  club.integrantes.add("Burns");
  club.integrantes.add("Burns");
  Assert.assertEquals(3, club.cantidadIntegrantes());
}