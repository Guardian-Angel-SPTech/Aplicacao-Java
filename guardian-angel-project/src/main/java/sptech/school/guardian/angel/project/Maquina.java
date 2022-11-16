/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.guardian.angel.project;

/**
 *
 * @author aluno
 */
public class Maquina {
    private Integer idMaquina;
    private String nomeMaquina;
    private String statusMaquina;
    private String processo;
    private Double usoProcesso;
    private String sistOp;
    private Integer fkEmpresa;
    private Integer fkFuncionario;

    public Integer getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(Integer idMaquina) {
        this.idMaquina = idMaquina;
    }

    public String getNomeMaquina() {
        return nomeMaquina;
    }

    public void setNomeMaquina(String nomeMaquina) {
        this.nomeMaquina = nomeMaquina;
    }

    public String getStatusMaquina() {
        return statusMaquina;
    }

    public void setStatusMaquina(String statusMaquina) {
        this.statusMaquina = statusMaquina;
    }

    public String getProcesso() {
        return processo;
    }

    public void setProcesso(String processo) {
        this.processo = processo;
    }

    public Double getUsoProcesso() {
        return usoProcesso;
    }

    public void setUsoProcesso(Double usoProcesso) {
        this.usoProcesso = usoProcesso;
    }

    public String getSistOp() {
        return sistOp;
    }

    public void setSistOp(String sistOp) {
        this.sistOp = sistOp;
    }

    public Integer getFkEmpresa() {
        return fkEmpresa;
    }

    public void setFkEmpresa(Integer fkEmpresa) {
        this.fkEmpresa = fkEmpresa;
    }

    public Integer getFkFuncionario() {
        return fkFuncionario;
    }

    public void setFkFuncionario(Integer fkFuncionario) {
        this.fkFuncionario = fkFuncionario;
    }

   
}
