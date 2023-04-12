package uscs;

import java.util.Scanner;
import uscs.Produto;

public class TesteProduto {
    
    public static int entradaValorLimite() {
        Scanner dados = new Scanner(System.in);
        
        int limite = dados.nextInt();
        
        while(limite < 0) {
            limite = dados.nextInt();
        }
        
        return limite;
    }

    public static void main(String[] args) {

        Produto p1 = new Produto(1234, "Celular Samsung S8", 30);

        Produto p2 = new Produto();
        p2.setCodProduto(3456);
        p2.setDesc("Monitor Samsung SyncMaster");
        p2.setQuantidade(12);

        p1.retiraEstoque(5);
        p2.retiraEstoque(8);

        // Status e Imprimir dados
        p1.ImprimeProduto();
        p1.statusEstoque();

        p2.ImprimeProduto();
        p2.statusEstoque();

        // Retirar estoque
        p1.retiraEstoque(10);
        p2.retiraEstoque(12);

        // Status e Imprimir dados
        p1.ImprimeProduto();
        p1.statusEstoque();

        p2.ImprimeProduto();
        p2.statusEstoque();
        
        int limete = entradaValorLimite();
        p1.alteraLimite(limete);
    }
}