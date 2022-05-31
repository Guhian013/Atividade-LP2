import java.util.*;

public class ListaInteger {
    private List<Integer> elementos;

    public ListaInteger() {
        this.elementos = new ArrayList<Integer>();
    }

    public void adicionarElemento(Integer elemento) {
        this.elementos.add(elemento);
    }

    public void adicionarElementoPorPosicao(int posicao, Integer elemento) {
        this.elementos.add(posicao, elemento);
    }
    

    public List<Integer> listarElementos() {
        return this.elementos;
    }

    public void listarElementosInterator() {
        Iterator<Integer> it = this.elementos.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        };

    }

    public void removerElemento(Integer elemento) {
        this.elementos.remove(elemento);
    }

    public void removerElementoPorPosicao(int indice) {
        this.elementos.remove(indice);
    }

    public void ordenar() {
        this.elementos.sort(null);
    }
    
    public Integer primeiroElemento() {
        return this.elementos.get(0);
    } 

    public Integer ultimoElemento() {
        return this.elementos.get(this.elementos.size() - 1);
    } 

    public Integer encontrarElemento(Integer elemento) {
        return this.elementos.get(this.elementos.indexOf(elemento));
    }

    public void encontrarElementoMap(int posicao) {
        Map<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < this.tamanho(); i++) {
            mapa.put(i, this.encontrarElementoPorPosicao(i));
        }

        System.out.println(mapa.get(posicao));
    }

    public Integer encontrarElementoPorPosicao(int indice) {
        return this.elementos.get(indice);
    }

    public void editarElemento(int indice, Integer elemento) {
        this.elementos.set(indice, elemento);
    }

    public boolean existe(Integer elemento) {
        return this.elementos.contains(elemento);
    }

    public boolean existePorPosicao(int indice) {
        return this.elementos.contains(indice);
    }

    public Boolean existe(Collection<Integer> colecao, Integer elemento) {
        return colecao.contains(elemento);
    }
    

    public boolean ehIgual(ListaInteger li1) {
        return this.elementos.equals(li1.elementos);
    }

    public int tamanho() {
        Collection<Integer> colecao = this.elementos;
        return colecao.size();
    }
}
