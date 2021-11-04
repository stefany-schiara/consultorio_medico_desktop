/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.consultorio.medico.model;

import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author esqui
 */
public class Consulta {
    
    private Integer idConsulta;
    private Integer idPaciente;
    private Integer idMedico;
    private Date dtConsulta;
    private TimeZone horarioConsulta;
    private String especialidade;

    public Consulta() {
        super();
    }

    public Consulta(Integer idPaciente, Integer idMedico, Date dtConsulta, TimeZone horarioConsulta, String especialidade) {
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.dtConsulta = dtConsulta;
        this.horarioConsulta = horarioConsulta;
        this.especialidade = especialidade;
    }

    public Integer getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Integer idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public Date getDtConsulta() {
        return dtConsulta;
    }

    public void setDtConsulta(Date dtConsulta) {
        this.dtConsulta = dtConsulta;
    }

    public TimeZone getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(TimeZone horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }    
    
}
