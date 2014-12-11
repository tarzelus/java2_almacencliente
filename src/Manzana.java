public class Manzana {
//propiedades
	private String tipoManzana;
	private String procedencia;
	private String color;
	private Double eurosKilo;
	private Distribuidor distribuidor;
	private int cod_barras;


//métodos getter y setter

	public String getTipoManzana()
		{
			return tipoManzana;
		}
		
	public void  setTipoManzana(String tipoManzana1)
		{
			tipoManzana=tipoManzana1;
		}

	public String getProcedencia()
		{
			return procedencia;
		}
		
	public void  setProcedencia(String procedencia1)
		{
			procedencia=procedencia1;
		}

	public String getColor()
		{
			return color;
		}
		
	public void  setColor(String color1)
		{
			color=color1;
		}

	public Double getEurosKilo()
		{
			return eurosKilo;
		}
		
	public void  setEurosKilo(Double eurosKilo1)
		{
			eurosKilo=eurosKilo1;
		}

	public Distribuidor getDistribuidor()
		{
			return distribuidor;
		}
		
	public void  setDistribuidor(Distribuidor distribuidor1)
		{
			distribuidor=distribuidor1;
		}



	public int getCod_barras()
		{
			return cod_barras;
		}
		
		public void  setCod_barras(int cod_barras1)
		{
			cod_barras=cod_barras1;
		}
}

