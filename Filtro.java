public interface Filtro {

    public boolean selecionado(Produto produto);
}

// produto.getQtdEstoque(), produto.getCategoria(), produto.getPreco(), produto.getDescricao()


class FILTRO_TODOS implements Filtro {

    public boolean selecionado(Produto produto) { 
       
        return true;
    }
}

class FILTRO_ESTOQUE_MENOR_OU_IGUAL_A implements Filtro {
   
    public int estoque;

    public FILTRO_ESTOQUE_MENOR_OU_IGUAL_A(int estoque) {
       
        this.estoque = estoque;
    }

    public boolean selecionado(Produto produto) { 
        return (produto.getQtdEstoque() <= this.estoque);
    }
}

class FILTRO_CATEGORIA_IGUAL_A implements Filtro {
 
    public String categoria;

    public FILTRO_CATEGORIA_IGUAL_A(String categoria) {
       
        this.categoria = categoria;
    }

    public boolean selecionado(Produto produto) { 
        return produto.getCategoria().equalsIgnoreCase(this.categoria);
    }
}

class FILTRO_PRECO_ENTRE_O_INTERVALO implements Filtro {

    public String intervaloInserido;
    
    public FILTRO_PRECO_ENTRE_O_INTERVALO(String intervaloInserido) {
        
        this.intervaloInserido = intervaloInserido;
    }

    public boolean selecionado(Produto produto) { 
        
		String[] valores = this.intervaloInserido.split(",");
		int menorValor = Integer.parseInt(valores[0]);
		int maiorValor = Integer.parseInt(valores[1]);

        return (produto.getPreco() >= menorValor && produto.getPreco() <= maiorValor);
    }
}

class FILTRO_CONTEM_SUBSTRING implements Filtro {

    public String subString;

    public FILTRO_CONTEM_SUBSTRING(String subString) {
        
        this.subString = subString;
    }

    public boolean selecionado(Produto produto) {
        
        return produto.getDescricao().contains(this.subString);
    }
}