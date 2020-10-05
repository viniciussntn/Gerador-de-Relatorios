public interface Criterio {
    public boolean comparaMaior(Produto[] produtos, int i, int j, Produto x);
    public boolean comparaMenor(Produto[] produtos, int i, int j, Produto x);
    public boolean compara(Produto x, Produto[] produtos, int j);

}

class CRIT_DESC_CRESC implements Criterio {

    public boolean comparaMaior(Produto[] produtos, int i, int j, Produto x) {
        return produtos[j].getDescricao().compareToIgnoreCase(x.getDescricao()) > 0;
    }

    public boolean comparaMenor(Produto[] produtos, int i, int j, Produto x) {
        return produtos[i].getDescricao().compareToIgnoreCase(x.getDescricao()) < 0;
    }

    public boolean compara(Produto x, Produto[] produtos, int j) {
        return ( x.getDescricao().compareToIgnoreCase(produtos[j].getDescricao()) < 0 );
    }

}

class CRIT_DESC_DECRESC implements Criterio {

    public boolean comparaMaior(Produto[] produtos, int i, int j, Produto x) {
        return produtos[j].getDescricao().compareToIgnoreCase(x.getDescricao()) < 0;
    }

    public boolean comparaMenor(Produto[] produtos, int i, int j, Produto x) {
        return produtos[i].getDescricao().compareToIgnoreCase(x.getDescricao()) > 0;
    }

    public boolean compara(Produto x, Produto[] produtos, int j) {
        return ( x.getDescricao().compareToIgnoreCase(produtos[j].getDescricao()) > 0 );
    }

}


class CRIT_PRECO_CRESC implements Criterio {

    public boolean comparaMaior(Produto[] produtos, int i, int j, Produto x) {
        return produtos[j].getPreco() > x.getPreco();
    }

    public boolean comparaMenor(Produto[] produtos, int i, int j, Produto x) {
        return produtos[i].getPreco() < x.getPreco();
    }

    public boolean compara(Produto x, Produto[] produtos, int j) {
        
        return ( x.getPreco() < produtos[j].getPreco() );
    }
}

class CRIT_PRECO_DECRESC implements Criterio {

    public boolean comparaMaior(Produto[] produtos, int i, int j, Produto x) {
        return produtos[j].getPreco() < x.getPreco();
    }

    public boolean comparaMenor(Produto[] produtos, int i, int j, Produto x) {
        return produtos[i].getPreco() > x.getPreco();
    }

    public boolean compara(Produto x, Produto[] produtos, int j) {
        
        return ( x.getPreco() > produtos[j].getPreco() );
    }
}


class CRIT_ESTOQUE_CRESC implements Criterio {

    public boolean comparaMaior(Produto[] produtos, int i, int j, Produto x) {
        return produtos[j].getQtdEstoque() > x.getQtdEstoque();
    }

    public boolean comparaMenor(Produto[] produtos, int i, int j, Produto x) {
        return produtos[i].getQtdEstoque() < x.getQtdEstoque();
    }

    public boolean compara(Produto x, Produto[] produtos, int j) {
        
        return (x.getQtdEstoque() < produtos[j].getQtdEstoque());
    }
}

class CRIT_ESTOQUE_DECRESC implements Criterio {

    public boolean comparaMaior(Produto[] produtos, int i, int j, Produto x) {
        return produtos[j].getQtdEstoque() < x.getQtdEstoque();
    }

    public boolean comparaMenor(Produto[] produtos, int i, int j, Produto x) {
        return produtos[i].getQtdEstoque() > x.getQtdEstoque();
    }

    public boolean compara(Produto x, Produto[] produtos, int j) {
        
        return (x.getQtdEstoque() > produtos[j].getQtdEstoque());
    }
}