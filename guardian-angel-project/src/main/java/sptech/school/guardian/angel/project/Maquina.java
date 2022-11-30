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
    private String sistOp;
    private String macAdress;
    private String fkEmpresa;

    @Override
    public String toString() {
        return "Maquina{" + "idMaquina=" + idMaquina + ", sistOp=" + sistOp + ", macAdress=" + macAdress + ", fkEmpresa=" + fkEmpresa + '}';
    }

    public String getMacAdress() {
        return macAdress;
    }

    public void setMacAdress(String macAdress) {
        this.macAdress = macAdress;
    }
    
    public Integer getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(Integer idMaquina) {
        this.idMaquina = idMaquina;
    }

    public String getSistOp() {
        return sistOp;
    }

    public void setSistOp(String sistOp) {
        this.sistOp = sistOp;
    }

    public String getFkEmpresa() {
        return fkEmpresa;
    }

    public void setFkEmpresa(String fkEmpresa) {
        this.fkEmpresa = fkEmpresa;
    }
    
    
}
