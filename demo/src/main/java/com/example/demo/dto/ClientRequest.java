package com.example.demo.dto;

public class ClientRequest {
    private int CC;
    private String Nombre;
    private String Fecha_nacimiento;
    private int CI;
    private String Correo;
    private String Usuario;
    private String Password;
    private int Altura;
    private int Peso;
    public ClientRequest(int CC, String Nombre, String Fecha_nacimiento, int CI, String Correo, String Usuario, String Password, int Altura, int Peso) {
        this.CC = CC;
        this.Nombre = Nombre;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.CI = CI;
        this.Correo = Correo;
        this.Usuario = Usuario;
        this.Password = Password;
        this.Altura = Altura;
        this.Peso = Peso;
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        Fecha_nacimiento = fecha_nacimiento;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int altura) {
        Altura = altura;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int peso) {
        Peso = peso;
    }
    @Override
public String toString() {
        return "ClientRequest{" +
                "CC=" + CC +
                ", Nombre='" + Nombre + '\'' +
                ", Fecha_nacimiento='" + Fecha_nacimiento + '\'' +
                ", CI=" + CI +
                ", Correo='" + Correo + '\'' +
                ", Usuario='" + Usuario + '\'' +
                ", Password='" + Password + '\'' +
                ", Altura=" + Altura +
                ", Peso=" + Peso +
                '}';
    }
}

