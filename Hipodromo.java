 class TestCarreras {
  public static void main(String args[]) {
    Caballo caballo1 = new Caballo("Tiro al Blanco");
    caballo1.carrera();
    Caballo caballo2 = new Caballo("Secretariat");
    caballo2.carrera();
    Caballo caballo3 = new Caballo("Justify");
    caballo3.carrera();
  }
}

class Caballo{
	
  String nombre;
  int metrosRecorridos;
  
  public Caballo(String n){
  	nombre = n;
  }
  
  public void carrera() {
    metrosRecorridos = 0;

    while (true) {
      System.out.println("Caballo " + nombre + " -> " + metrosRecorridos + " metros");
      if ( metrosRecorridos++ == 50 ) {
		break;
      }
    }
  }
  
}