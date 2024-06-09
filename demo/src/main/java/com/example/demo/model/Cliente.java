package com.example.demo.model;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

@Entity
@Table(name = "Cliente", schema = "nutrcion", catalog = "")
public class Cliente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
        @Column(name = "CC")
        private int CC;

    @Basic
    @Column(name = "Nombre")
    private String Nombre;

    @Basic
    @Column(name = "Fecha_nacimiento")
    private String Fecha_nacimiento;

    @Basic
    @Column(name = "CI")
    private String CI;

    @Basic
    @Column(name = "Correo")
    private String Correo;

    @Basic
    @Column(name = "Usuario")
    private String Usuario;

    @Basic
    @Column(name = "Password")
    private String Password;

    @Basic
    @Column(name = "Altura")
        private int Altura;

    @Basic
    @Column(name = "Peso")
    private int Peso;

    public Cliente(int CC, String Nombre, String Fecha_nacimiento, String CI, String Correo, String Usuario, String Password, int Altura, int Peso) {
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

    public Cliente() {

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

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
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


}

