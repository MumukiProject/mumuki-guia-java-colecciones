ReclamoComun faltaUnaBirome = new ReclamoComun();
ReclamoComun elMonitorAndaMal = new ReclamoComun();
ReclamoPrioritario incendioEnPlanta = new ReclamoPrioritario();
ReclamoPrioritario corteGeneralDeServicio = new ReclamoPrioritario();
CentroDeAtencion centro = new CentroDeAtencion();

@Test 
public void agregarEnOrdenDePrioridad() {
  centro.aceptarReclamo(faltaUnaBirome);
  centro.aceptarReclamo(corteGeneralDeServicio);
  centro.aceptarReclamo(elMonitorAndaMal);
  centro.aceptarReclamo(incendioEnPlanta);
  Assert.assertEquals(
    "no es el orden correcto. Debería ser incendioEnPlanta, corteGeneralDeServicio, faltaUnaBirome, elMontorAndaMal",
    Arrays.asList(incendioEnPlanta, corteGeneralDeServicio, faltaUnaBirome, elMonitorAndaMal), 
    centro.getReclamos()); 
}

