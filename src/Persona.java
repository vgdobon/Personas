public class Persona {
   String name;
   int edad;
   String dni;
   String sexo;
   float peso;
   float altura;
   float iMC;

   public Persona(){

   }
    public Persona(String name,int edad,String sexo){
        this.name=name;
        this.edad=edad;
        this.sexo=sexo;
    }
    public Persona(String name,int edad,String dni,String sexo,float peso,float altura){
        this.name=name;
        this.edad=edad;
        this.dni=dni;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
    }

    public float calcularIMC(){
       iMC = peso  /(float) Math.pow(altura,2);
       return iMC;
    }

}
