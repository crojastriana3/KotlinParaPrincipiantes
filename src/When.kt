
fun main(args: Array<String>){
	sentencia()
	
}

/*
 Sentencia de control llamada When el tipico switch en java
 */

private fun sentencia(){
	
	val country = "Peru"
	
	// cundo tenemos gran n�mero de condiciones es mejor usar when
	
	when (country){
		
		// si tengo casos considentes
		
		"Espa�a","Colombia","Peru" -> {
			print("Espa�ol")
			
		}
		"EEUU" -> {
			print("Ingles")
			
		}
		"Francia" -> {
			print("Frances")
		}
		else -> {
			println("No concemos el idioma")
			
		}
		
	}
	//when con int
	
	val age = 100
	when (age){
		//podemos abreviar con numeros
		in 0..3 ->{
		println("Eres beb�")
	    }
		in 4..12 -> {
			println("Eres Ni�o")
			
		}
		in 13..17 ->{
		println("Eres Adolecente")
	    }
		in 18..69 -> {
			println("Eres Adulto")
		}
		in  70..89 ->{
			println("Eres Abuelo")
		}
		else -> {
			println("ohhhh")
		}
		
			
		
	}
	
	
}