public class IMC {
    private float altura;
    private float peso;

    public IMC(float altura, float peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public String getIMC() {
        float imcValue = this.peso / this.altura * this.altura;
        if(imcValue < 18.5){
            return "Magreza e obesidade 0";
        }
        else if(imcValue >= 18.5 && imcValue <= 24.9){
            return "Normal e obesidade 0";
        }
        else if(imcValue >= 25.0 && imcValue <= 29.9){
            return "Sobrepeso e obesidade 1";
        }
        else if(imcValue >= 30.0 && imcValue <= 100){
            return "Obesidade";
        }
        else{
            return "Valores inválidos";
        }           
    }
}
