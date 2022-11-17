/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.guardian.angel.project;

/**
 *
 * @author aluno
 */
public class Funcionario {
    private Integer idFuncionario;
    private String nome;
    private String email;
    private String senha;
    private Integer fkMaquina;

    public Integer getFkEmpresa() {
        return fkMaquina;
    }

    public void setFkEmpresa(Integer fkMaquina) {
        this.fkMaquina = fkMaquina;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "idFuncionario=" + idFuncionario + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", fkMaquina=" + fkMaquina + '}';
    }
    
}
