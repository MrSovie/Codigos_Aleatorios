package uscs;

public class Produto {
	
	private int codProduto;
	private String desc;
	private int quantidade;
	private static int limiteEstoque = 10;
	
	public Produto(int codProduto, String desc, int quantidade) {
		this.codProduto = codProduto;
		this.desc = desc;
		this.quantidade = quantidade;
	}

	public Produto() {
		this.codProduto = 0;
		this.desc = "";
		this.quantidade = 0;
	}

	
	public void ImprimeProduto() {
		 System.out.println( "Produto [codProduto=" + codProduto + ", desc=" + desc + ", quantidade=" + quantidade + "]");
	}
	
	public void setQnt(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public static int getLimiteEstoque() {
		return limiteEstoque;
	}

	public static void setLimiteEstoque(int limiteEstoque) {
		Produto.limiteEstoque = limiteEstoque;
	}
	
	public void retiraEstoque(int retirar) {
		if(getQuantidade() < retirar) {
		System.out.println("o valor a ser retirado é menor do que tem em estoque");
		}else{
			setQuantidade(this.quantidade - retirar);
		}
	}
	
	public void adicionaEstoque(int add) {
		setQuantidade(add + this.quantidade);
		
	}
	
	public void statusEstoque() {
		if(this.quantidade > limiteEstoque) {
			System.out.println("estoque regular");
		}else if(this.quantidade <= limiteEstoque){
			System.out.println("estoque restrito");
		}else {
			System.out.println("estoque nulo");
		}
	}
	
	public boolean alteraLimite(int limiteNovo) {
		if(limiteNovo > 0){
			limiteEstoque = limiteNovo;
			return true;
		}else {
			System.out.println("coloque um limite maior que 0");
			return false;
		}
	}
	
}
