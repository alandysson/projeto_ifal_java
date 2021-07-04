
package modelo;

import java.util.Date;

public class Agendamento {
    private int codigo;
    private int cpfPac;
    private String nomePac;
    private String nomeMed;
    private String tipo_consulta;
    private Date data_consulta;
    private String turno_consulta;
    private String especialidade;
    
    
    public Date getData_consulta() {
        return data_consulta;
    }

    public void setData_consulta(Date data_consulta) {
        this.data_consulta = data_consulta;
    }

    public String getTurno_consulta() {
        return turno_consulta;
    }

    public void setTurno_consulta(String turno_consulta) {
        this.turno_consulta = turno_consulta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomePac() {
        return nomePac;
    }
    
    public void setNomePac(String nomePac) {
        this.nomePac = nomePac;
    }

    public String getNomeMed() {
        return nomeMed;
    }

    public void setNomeMed(String nomeMed) {
        this.nomeMed = nomeMed;
    }

    public String getTipo_consulta() {
        return tipo_consulta;
    }

    public void setTipo_consulta(String tipo_consulta) {
        this.tipo_consulta = tipo_consulta;
    }

    public int getCpfPac() {
        return cpfPac;
    }

    public void setCpfPac(int cpfPac) {
        this.cpfPac = cpfPac;
    }

    /**
     * @return the especialidade
     */
    public String getEspecialidade() {
        return especialidade;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
}
