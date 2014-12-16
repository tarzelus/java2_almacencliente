public class  Cesta {
//propiedades
	private String nombreproducto;
	private Double precioku;
	private Double preciototalp;
	private Cliente cliente;
	private Manzana manzana;
	private Lechuga lechuga;
	private Leche leche;



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

	public Manzana getManzana()
		{
			return manzana;
		}
		
	public void  setManzana(Manzana manzana1)
		{
			manzana=manzana1;
		}

	public Lechuga getLechuga()
		{
			return lechuga;
		}
		
	public void  setLechuga(Lechuga lechuga1)
		{
			lechuga=lechuga1;
		}



	public Leche getLeche()
		{
			return leche;
		}
		
		public void  setCod_barras(Leche leche1)
		{
			leche=leche1;
		}
}

