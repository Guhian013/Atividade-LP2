public class Main {
    public static void main(String[] args) throws Exception {
        Lista<Integer> l1 = new Lista<>();

        l1.adicionarElemento(8);
        l1.adicionarElemento(1);
        l1.adicionarElemento(5);
        l1.adicionarElemento(3);

        System.out.println(l1.existe(8));
        System.out.println(l1.existe(10));
        System.out.println(l1.existePorPosicao(0));

        l1.adicionarElementoPorPosicao(1, 2);

        System.out.println(l1.primeiroElemento());
        System.out.println(l1.ultimoElemento());
        System.out.println(l1.listarElementos());

        l1.ordenar();
        System.out.println(l1.listarElementos());

        l1.editarElemento(0, 2004);
        System.out.println(l1.listarElementos());

        l1.encontrarElemento(8);
        l1.encontrarElementoPorPosicao(1);
        System.out.println(l1.listarElementos());

        l1.removerElemento(3);
        l1.removerElementoPorPosicao(0);

        System.out.println(l1.listarElementos());

        System.out.println("----------------------------------");

        Lista<String> l2 = new Lista<>();

        l2.adicionarElemento("uhum");
        l2.adicionarElemento("bão");
        l2.adicionarElemento("nice");
        l2.adicionarElemento("pão redondo");
        l2.adicionarElemento("kkkkk");

        System.out.println(l2.existe("bão"));
        System.out.println(l2.existe("pexe"));
        System.out.println(l2.existePorPosicao(2));

        l2.adicionarElementoPorPosicao(1, "alex esteve aqui");

        System.out.println(l2.primeiroElemento());
        System.out.println(l2.ultimoElemento());
        System.out.println(l2.listarElementos());

        l2.ordenar();
        System.out.println(l2.listarElementos());

        l2.editarElemento(0, "Alexa Senha Campos");
        System.out.println(l2.listarElementos());

        l2.encontrarElemento("nice");
        l2.encontrarElementoPorPosicao(2);
        System.out.println(l2.listarElementos());

        l2.removerElemento("uhum");
        l2.removerElementoPorPosicao(0);

        System.out.println(l2.listarElementos());

        System.out.println("----------------------------------");

        ListaInteger li1 = new ListaInteger();

        li1.adicionarElemento(9);
        li1.adicionarElemento(5);
        li1.adicionarElemento(0);
        li1.adicionarElemento(1);

        System.out.println(li1.existe(5));
        System.out.println(li1.existe(23));
        System.out.println(li1.existePorPosicao(10));

        li1.encontrarElemento(1);
        li1.encontrarElementoPorPosicao(1);
        System.out.println(li1.listarElementos());

        li1.adicionarElementoPorPosicao(1, 2);

        System.out.println(li1.primeiroElemento());
        System.out.println(li1.ultimoElemento());
        System.out.println(li1.listarElementos());

        li1.ordenar();
        System.out.println(li1.listarElementos());

        li1.editarElemento(0, 2004);
        System.out.println(li1.listarElementos());

        li1.removerElemento(5);
        li1.removerElementoPorPosicao(0);

        System.out.println(li1.listarElementos());

        System.out.println("----------------------------------");

        Lista<Integer> l3 = new Lista<>();

        l3.adicionarElemento(1);
        l3.adicionarElemento(9);
        l3.adicionarElemento(4);
        l3.adicionarElemento(5);

        System.out.println(l1.ehIgual(l3));
    }
}