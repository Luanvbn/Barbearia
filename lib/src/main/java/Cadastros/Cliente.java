package Cadastros;

import java.util.Date;
public class Cliente extends Pessoa {
	public Date getHora_agendada() {
		return hora_agendada;
	}

	public void setHora_agendada(Date hora_agendada) {
		this.hora_agendada = hora_agendada;
	}

	public Date hora_agendada;

}
