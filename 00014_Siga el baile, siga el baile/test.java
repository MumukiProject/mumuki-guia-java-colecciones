Repertorio repertorio;
Chiste chisteLargo;
Chiste chisteCorto;
List<String> textoChistes;
List<String> textosDeChistesLargos;

@Before 
public void before() {
	chisteLargo = new Chiste("Había un perro llamado Pafuera. Un día le gritaron ¡Adentro Pafuera!, y el perro se volvió loco...", true);
	chisteCorto = new Chiste("¿Qué planeta va después de Marte? Miércole.", false);
	repertorio = new Repertorio(Arrays.asList(
    chisteLargo,
    new Chiste("¿Cómo se despiden los químicos? Ácido un placer.", true),
    new Chiste("¿Qué le dice una piedra a otra piedra? La vida es dura.", false),
    new Chiste("Había una vez un hombre tan pequeño que se subió encima de una canica y dijo: ¡El mundo es mío!", true),
    chisteCorto));
    
    textoChistes = new ArrayList<String>();
    textoChistes.add("Había un perro llamado Pafuera. Un día le gritaron ¡Adentro Pafuera!, y el perro se volvió loco...");
    textoChistes.add("¿Cómo se despiden los químicos? Ácido un placer.");
    textoChistes.add("¿Qué le dice una piedra a otra piedra? La vida es dura.");
    textoChistes.add("Había una vez un hombre tan pequeño que se subió encima de una canica y dijo: ¡El mundo es mío!");
    textoChistes.add("¿Qué planeta va después de Marte? Miércole.");
    
    textosDeChistesLargos = new ArrayList<String>();
    textosDeChistesLargos.add("Había un perro llamado Pafuera. Un día le gritaron ¡Adentro Pafuera!, y el perro se volvió loco...");
    textosDeChistesLargos.add("¿Qué le dice una piedra a otra piedra? La vida es dura.");
    textosDeChistesLargos.add("Había una vez un hombre tan pequeño que se subió encima de una canica y dijo: ¡El mundo es mío!");
}

@Test
public void textoDeLosChistes_me_dice_el_texto_de_cada_chiste() {
    Collections.sort(textoChistes);
    List<String> textos = repertorio.textoDeLosChistes();
    Collections.sort(textos);
    Assert.assertEquals(textoChistes, textos);
}

@Test
public void chistesLargos_devuelve_los_chistes_con_largo_mayor_a_50() {
  Collections.sort(textosDeChistesLargos);
  List<Chiste> chistes = repertorio.chistesLargos();
  List<String> textosDeChistesLargosObtenidos = repertorio.chistesLargos().stream().map(chiste -> chiste.getTexto()).collect(Collectors.toList());
  Collections.sort(textosDeChistesLargosObtenidos);
  Assert.assertEquals(textosDeChistesLargos, textosDeChistesLargosObtenidos);
}