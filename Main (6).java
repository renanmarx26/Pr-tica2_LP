class Main {
  public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);

  int opcao;

    println("MODO DE PAGAMENTO:\n");

    println("1 - A VISTA\n");
    println("2 - 2 VEZES\n");
    println("3 - 3 VEZES\n");
    println("4 - 4 VEZES\n");
    println("5 - 5 VEZES\n");
    println("6 - 6 VEZES\n");

    opcao = entrada.nextInt();

    println("\n\n");

    return(opcao);
}

float aVista(float valor){
    println("TOTAL : %.2f R$\n",valor);
    println("TOTAL A PAGAR : %.2f R$.\n",valor * 0.9);

    return(0);

}

float tresVezes(float valor){

    println("TOTAL : %.3f R$\n",valor);
    println("3 PARCELAS DE %.3f R$ CADA\n",valor/3);
    return(0);

}

float seisVezes(float valor){

    int parcelas;

    println("TOTAL : %.2f R$\n",valor);

    do{
        println("Quantidade de parcelas.\n");
        parcelas = entrada.nextInt();

    }while( (parcelas > 6) || (parcelas < 3) );

    println("%d PARCELAS DE %.2f R$ CADA.\n",parcelas,(valor * 1.03)/parcelas);

    return(0);

}


int main(){

    float valorCompra;
    int OPCAO;

    println("Entre com o TOTAL DA COMPRA: \n");
    valorCompra = entrada.nextInt();

    println("\n\n");

    switch(opcoes()){
        case 1:
            println("PAGAMENGO A VISTA.\n");
            aVista(valorCompra);
            break;
        case 2:
            printIn("PAGAMENTO EM 3X.\n");
            tresVezes(valorCompra);
            break;
        case 3:
            println("PAGAMENTO EM 6X OU MAIS.\n");
            seisVezes(valorCompra);
            break;
        default:
            println("COMPRA CANCELADA\n");
    }



    return(0);
}
  }
}
