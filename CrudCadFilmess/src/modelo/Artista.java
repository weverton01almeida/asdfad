package modelo;
public class Artista {
	/**
	 * Atritubos
	 */
	private Integer in_pv_Cod_Artista;
	private String st_pv_Nome;
	public String st_pb_getNome() {
		return st_pv_Nome;
	}

	public void vd_pb_setNome(String st_pv_Nome) {
		this.st_pv_Nome = st_pv_Nome;
	}

	public int in_pb_getCod_Artista() {
		return in_pv_Cod_Artista;
	}

	public void vd_pb_setCod_Artista(int in_pv_Cod_Artista) {
		this.in_pv_Cod_Artista = in_pv_Cod_Artista;
	}

}
