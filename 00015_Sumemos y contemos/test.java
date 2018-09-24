@Test
public void si_no_hay_chistes_no_es_largo() {
 Repertorio repertorio = new Repertorio(Arrays.asList());

 Assert.assertFalse(repertorio.esLargo());
}

@Test
public void si_la_suma_de_los_largos_de_los_chistes_es_mayor_a_200() {
	Repertorio repertorio = new Repertorio(Arrays.asList(
    new Chiste("Había un perro llamado Pafuera. Un día le gritaron ¡Adentro Pafuera!, y el perro se volvió loco...", true),
    new Chiste("¿Cómo se despiden los químicos? Ácido un placer.", true),
    new Chiste("¿Qué le dice una piedra a otra piedra? La vida es dura.", false),
    new Chiste("Había una vez un hombre tan pequeño que se subió encima de una canica y dijo: ¡El mundo es mío!", true),
    new Chiste("¿Qué planeta va después de Marte? Miércole.", false)));
    
  Assert.assertTrue(repertorio.esLargo());
}