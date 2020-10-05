public interface Filtro {
    public boolean selecionado(int getQtdEstoque, Object argFiltro, String getCategoria, double preco, String descricao);
}

class FILTRO_TODOS implements Filtro {
    public boolean selecionado(int getQtdEstoque, Object argFiltro, String getCategoria, double preco, String descricao) { 
        return true;
    }
}

class FILTRO_ESTOQUE_MENOR_OU_IGUAL_A implements Filtro {
    public boolean selecionado(int getQtdEstoque, Object argFiltro, String getCategoria, double preco, String descricao) { 
        return (getQtdEstoque <= (Integer) argFiltro);
    }
}

class FILTRO_CATEGORIA_IGUAL_A implements Filtro {
    public boolean selecionado(int getQtdEstoque, Object argFiltro, String getCategoria, double preco, String descricao) { 
        return (getCategoria.equalsIgnoreCase((String)argFiltro));
    }
}

class FILTRO_PRECO_ENTRE_O_INTERVALO implements Filtro {
    public boolean selecionado(int getQtdEstoque, Object argFiltro, String getCategoria, double preco, String descricao) { 
        
        String intervaloInserido = (String) argFiltro;
		String[] valores = intervaloInserido.split(",");
		int menorValor = Integer.parseInt(valores[0]);
		int maiorValor = Integer.parseInt(valores[1]);

        return (preco >= menorValor && preco <= maiorValor);
    }
}

class FILTRO_CONTEM_SUBSTRING implements Filtro {
    public boolean selecionado(int getQtdEstoque, Object argFiltro, String getCategoria, double preco, String descricao) { 
        
        String subString = (String) argFiltro;
        return descricao.contains(subString);
    }
}