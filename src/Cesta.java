public class  Cesta {
//propiedades
	private String nombreproducto;
	private Double precioku;
	private Double preciototalp;
	private Cliente cliente;
	private Double descuento;





//métodos getter y setter

	public String getNombreproducto()
		{
			return nombreproducto;
		}
		
	public void  setNombreproducto(String nombreproducto1)
		{
			nombreproducto=nombreproducto1;
		}

	public Double getPrecioku()
		{
			return precioku;
		}
		
	public void  setPrecioku(Double precioku1)
		{
			precioku=precioku1;
		}


	public Double getPreciototalp()
		{
			return preciototalp;
		}
		
	public void  setPreciototalp(Double preciototalp1)
		{
			preciototalp=preciototalp1;
		}







	public Cliente getCliente()
		{
			return cliente;
		}
		
	public void  setCliente(Cliente cliente1)
		{
			cliente=cliente1;
		}

		public Double getDescuento()
		{
			return descuento;
		}
		
		public void  setDescuento(Double descuento1)
		{
			descuento=descuento1;
		}


}

