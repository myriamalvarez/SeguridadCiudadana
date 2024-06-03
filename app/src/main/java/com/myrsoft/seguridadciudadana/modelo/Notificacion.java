package com.myrsoft.seguridadciudadana.modelo;

import java.sql.Timestamp;

public class Notificacion {
    private int id;
    private int alertaId;
    private int usuarioId;
    private Timestamp fechaHora;
    private String estado;

    public Notificacion() {
    }

    public Notificacion(int id, int alertaId, int usuarioId, Timestamp fechaHora, String estado) {
        this.id = id;
        this.alertaId = alertaId;
        this.usuarioId = usuarioId;
        this.fechaHora = fechaHora;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAlertaId() {
        return alertaId;
    }

    public void setAlertaId(int alertaId) {
        this.alertaId = alertaId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Timestamp getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Timestamp fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
