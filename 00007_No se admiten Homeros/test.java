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
public void el_club_de_no_homeros_tiene_tres_integrantes() {
  club.integrantes.add("Abe");
  club.integrantes.add("Abe");
  Assert.assertEquals(4, club.cantidadIntegrantes());
}

@Test
public void el_club_de_no_homeros_tiene_tres_integrantes() {
  club.integrantes.add("Homero");
  club.integrantes.add("Abe");
  club.integrantes.add("Burns");
  Assert.assertEquals(5, club.cantidadIntegrantes());
}