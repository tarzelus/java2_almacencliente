public class Lechuga {

//propiedades
private String tipoLechuga;
private String procedencia;
private String color;
private Double eurosUnidad;
private Distribuidor distribuidor;
private int cod_barras;

//métodos getter y setter

public String getTipoLechuga()
		{
			return tipoLechuga;
		}
		
		public void  setTipoLechuga(String tipoLechuga1)
		{
			tipoLechuga=tipoLechuga1;
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

		public Double getEurosUniad()
		{
			return eurosUnidad;
		}
		
		public void  setEurosUnidad(Double eurosUnidad1)
		{
			eurosUnidad=eurosUnidad1;
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