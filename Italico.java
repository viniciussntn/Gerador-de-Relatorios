
public class Italico implements Produto{
    private Produto produto;

	public Italico(Produto produto){

		this.produto = produto;
	}

	// setters	
    
		// setters	
        public void setQtdEstoque(int qtdEstoque){

			this.produto.setQtdEstoque(qtdEstoque);
		}
		
		
		public void setPreco(double preco){
		
			this.produto.setPreco(preco);
		}
	
		// getters
		
		public int getId(){
	
			return this.produto.getId();
		}
	   
		public String getDescricao(){
	
			return this.produto.getDescricao();
		}
		
		public String getCategoria(){
	
			return this.produto.getCategoria();
		}
		
		public int getQtdEstoque(){
	
			return this.produto.getQtdEstoque();
		}
		
		public double getPreco(){
		
			return this.produto.getPreco();
		}

	// metodo que devolve uma String que representa o produto, a ser usada na geração dos relatorios.
    @Override
	public String formataParaImpressao(){
        
            String semFormatacao = produto.formataParaImpressao();    
            return "<span style=\"font-style:italic\">" + produto.formataParaImpressao()  + "</span>";

        }
}