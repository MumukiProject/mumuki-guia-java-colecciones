Repertorio repertorio;
Chiste chisteLargo;
Chiste chisteCorto;
List<String> textoChistes;

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
    
    /*textoChistes = new ArrayList<String>();
    textoChistes.add("Había un perro llamado Pafuera. Un día le gritaron ¡Adentro Pafuera!, y el perro se volvió loco...");
    textoChistes.add("¿Cómo se despiden los químicos? Ácido un placer.");
    textoChistes.add("¿Qué le dice una piedra a otra piedra? La vida es dura.");
    textoChistes.add("Había una vez un hombre tan pequeño que se subió encima de una canica y dijo: ¡El mundo es mío!");
    textoChistes.add("¿Qué planeta va después de Marte? Miércole.");*/
}

@Test
public void textoDeLosChistes_me_dice_el_texto_de_cada_chiste() {
    Collections.sort(textoChistes)
    Assert.assertEquals(textoChistes, Collections.sort(repertorio.textoDeLosChistes()));
    /*Assert.assertTrue(repertorio.textoDeLosChistes().contains("¿Cómo se despiden los químicos? Ácido un placer."));
    Assert.assertEquals(5, repertorio.textoDeLosChistes().size());*/
}

@Test
public void chistesLargos_devuelve_los_chistes_con_largo_mayor_a_50() {
	Assert.assertTrue(repertorio.chistesLargos().contains(chisteLargo));
	Assert.assertFalse(repertorio.chistesLargos().contains(chisteCorto));
  Assert.assertEquals(3, repertorio.chistesLargos().size());
}