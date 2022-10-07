import java.util.ArrayList;



public class CatalogoProdutos {
	private ArrayList<Produto> produtos = new ArrayList<Produto>();


    //construtor
    public CatalogoProdutos() {
        produtos = new ArrayList<Produto>();

    }


    //cadastro de produto
    public void cadastrarProduto(Produto p) {
        produtos.add(p);
    }



    public void impressaoDados() {
        for(int i=0; i < produtos.size(); i++) {
			System.out.println(produtos.get(i));
		}
    }

    public Produto buscarProduto(int codigo) {
        for (Produto p : produtos) {
            if (codigo == p.getCodigo()) {
                return p;
            }
        }
        return null;
    }

}

