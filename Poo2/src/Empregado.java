
public class Empregado {

		private String name = "";
		private String surname = "";
		private Double salaryMon = 0.0;
		
		
		public Empregado() {
			super();
		}
		
		
		public Empregado(String name, String surname, Double salaryMon) {
			super();
			this.name = name;
			this.surname = surname;
			this.salaryMon = salaryMon;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public Double getSalaryMon() {
			return salaryMon;
		}
		public void setSalaryMon(Double salaryMon) {
			this.salaryMon = salaryMon;
		}
		
		public Double taxa () {
			Double retorno = 0.0;
			
			retorno = ((salaryYear() * 0.1) + salaryYear());
			
			return retorno;
		}
		
		public Double salaryYear () {
			Double retorno = 0.0;
			
			retorno = (getSalaryMon() * 12);
			
			
			return retorno;
		}
		
}
