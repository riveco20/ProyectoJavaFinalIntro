package mx.com.gm.proyectojavafinal.slnpun16;
import java.security.PrivilegedAction;
import java.util.Scanner;

public class Persona {
    private String nombre="";
    private int edad=0;
    private String DNI;
    private char sexo='h';
    private double peso=0;
    private double altura=0;

    Persona(){

    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        double calculoIMC=(this.peso/Math.pow(this.altura,2));
        int numero=0;
        if(calculoIMC<20){
            numero=-1;
        }
        else if(calculoIMC>=20 && calculoIMC<=25){
            numero=0;
        }
        else {
            numero=1;
        }

        return numero;
    }

    public boolean esMayorEdad(){
        boolean respues=true;
        if(this.edad>17){
            respues=true;

        }
        else {
            respues=false;
        }

        return respues;
    }

    protected void comprobarSexo(char sexo){
        if(sexo != this.sexo){
            this.sexo='H';
        }
    }

    protected void generaDNI(){

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }



    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
