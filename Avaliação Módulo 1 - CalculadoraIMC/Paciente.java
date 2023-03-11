public class Paciente {

    private String nome;
    private double peso;
    private double altura;

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Paciente(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String diagnostico() {
        double imc = Math.round(calcularIMC());

        if (imc <= 16) {
            return "Baixo peso muito grave";
        } else if (imc > 16 && imc <= 16.99) {
            return "Baixo peso grave";
        } else if (imc > 17 && imc <= 18.49) {
            return "Baixo peso";
        } else if (imc > 18.50 && imc <= 24.99) {
            return "Peso normal";
        } else if (imc > 25 && imc <= 29.99) {
            return "Sobrepeso";
        } else if (imc > 30 && imc <= 34.99) {
            return "Obesidade grau I";
        } else if (imc > 35 && imc <= 39.99) {
            return "Obesidade grau II";
        } else if (imc >= 40) {
            return "Obesidade grau III - obesidade morbida";
        } else {
            return "";
        }

    }

    public void outPut() {
        System.out.println();
        System.out.println("Paciente: " + nome);
        System.out.println("IMC: " + calcularIMC());
        System.out.println("Diagnostico: " + diagnostico());
        System.out.println();
    }

}