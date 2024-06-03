package com.myrsoft.seguridadciudadana.modelo;

public class ContactoEmergencia {

    private int id;
    private int usuarioId;
    private String nombre;
    private String telefono;
    private String tipoContacto;
    private String direccion;
    private String email;

    public ContactoEmergencia() {
    }

    public ContactoEmergencia(int id, int usuarioId, String nombre, String telefono, String tipoContacto, String direccion, String email) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.telefono = telefono;
        this.tipoContacto = tipoContacto;
        this.direccion = direccion;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoContacto() {
        return tipoContacto;
    }

    public void setTipoContacto(String tipoContacto) {
        this.tipoContacto = tipoContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}