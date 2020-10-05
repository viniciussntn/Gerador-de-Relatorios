import java.awt.Color;
public class Cor implements Produto{
    
    private Produto produto;
    private String corEscolhida;

public Cor (Produto produto, String cor){
    this.produto = produto;
    this.corEscolhida = cor;
}
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
            
   
		return "<span style=\"color:" + this.corEscolhida + "\">" + produto.formataParaImpressao()  + "</span>";
                             
             
	}


}