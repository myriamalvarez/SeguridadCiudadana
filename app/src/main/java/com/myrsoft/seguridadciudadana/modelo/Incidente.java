package com.myrsoft.seguridadciudadana.modelo;

import java.sql.Timestamp;

public class Incidente {

    private int id;

    private int usuarioId;

    private String tipoIncidente;

    private String descripcion;
    private Timestamp fechaHora;

    private double latitud;

    private double longitud;

    private String fotoUrl;

    private String videoUrl;

    private String estado;

    public Incidente() {
    }

    public Incidente(int id, int usuarioId, String tipoIncidente, String descripcion, Timestamp fechaHora, double latitud, double longitud, String fotoUrl, String videoUrl, String estado) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.tipoIncidente = tipoIncidente;
        this.descripcion = descripcion;
        this.fechaHora = fechaHora;
        this.latitud = latitud;
        this.longitud = longitud;
        this.fotoUrl = fotoUrl;
        this.videoUrl = videoUrl;
        this.estado = estado;
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

    public String getTipoIncidente() {
        return tipoIncidente;
    }

    public void setTipoIncidente(String tipoIncidente) {
        this.tipoIncidente = tipoIncidente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

