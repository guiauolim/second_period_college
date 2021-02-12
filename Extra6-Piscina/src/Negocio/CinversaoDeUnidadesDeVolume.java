package Negocio;

public class CinversaoDeUnidadesDeVolume {
	private int litro = 0;
	private int metrosCub = 0;
    private int galaoAmer = 0;
    private int galao = 0;
	
	 public CinversaoDeUnidadesDeVolume() {
		 
	} 
	 public CinversaoDeUnidadesDeVolume(int litro, int metrosCub, int galaoAmer, int galao) {
    	this.litro = litro;
    	this.metrosCub = metrosCub;
    	this.galaoAmer = galaoAmer;
    	this.galao = galao;
    }
	 public int getCentCubicos() {
		 return litro;
	}
	 public void setCentCubicos (int litro) {
		 this.litro = litro * 1000;
	}
	 public int getLitros () {
		 return metrosCub;
	}
	 public void setLitros (int metrosCub) {
		 this.metrosCub = metrosCub * 1000;	 
	}
	 public int getPolegadasCub() {
		 return galaoAmer; 
	}
	 public void setPolegadasCub (int galaoAmer) {
		 this.galaoAmer = galaoAmer * 231;
	}
	 public int getLitrosGalao () {
		 return galao;
	}
	 public void setLitrosGalao (int galao) {
		 this.galao = galao * 3785;
	 }
	

}