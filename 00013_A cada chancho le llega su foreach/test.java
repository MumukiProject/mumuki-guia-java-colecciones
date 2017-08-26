@Test
public void inicialmente_todas_las_luces_deben_estar_apagadas() {
  List<Luz> luces = Arrays.asList(new Luz(), new Luz(), new Luz());
  
  ArbolDeNavidad arbol = new ArbolDeNavidad(luces);
  
  Assert.assertTrue(
    "todas las luces deberían estar encendidas después de encender al árbol", 
    luces.stream().allMatch(l -> !l.encendida));
  
} 

@Test
public void encender_prende_todas_las_luces() {
  List<Luz> luces = Arrays.asList(new Luz(), new Luz(), new Luz());
  
  ArbolDeNavidad arbol = new ArbolDeNavidad(luces);
  arbol.encender();
  
  Assert.assertTrue(
    "todas las luces deberían estar encendidas después de encender al árbol", 
    luces.stream().allMatch(l -> l.encendida));
  
} 