package com.myrsoft.seguridadciudadana.modelo;

import java.sql.Timestamp;

public class Alerta {

    private int id;

    private int usuarioId;

    private String tipoAlerta;

    private Timestamp fechaHora;

    private double latitud;

    private double longitud;

    private String mensaje;

    public Alerta() {
    }

    public Alerta(int id, int usuarioId, String tipoAlerta, Timestamp fechaHora, double latitud, double longitud, String mensaje) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.tipoAlerta = tipoAlerta;
        this.fechaHora = fechaHora;
        this.latitud = latitud;
        this.longitud = longitud;
        this.mensaje = mensaje;
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

    public String getTipoAlerta() {
        return tipoAlerta;
    }

    public void setTipoAlerta(String tipoAlerta) {
        this.tipoAlerta = tipoAlerta;
    }

    public Timestamp getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Timestamp fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}