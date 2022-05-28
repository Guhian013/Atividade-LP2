import java.util.*;

public class Lista<T> {
    List<T> elementos;

    public Lista() {
        this.elementos = new ArrayList<T>();
    }

    public void adicionarElemento(T elemento) {
        this.elementos.add(elemento);
    }

    public void adicionarElementoPorPosicao(int posicao, T elemento) {
        this.elementos.add(posicao, elemento);
    }

    public List<T> listarElementos() {
        return this.elementos;
    }

    public void removerElemento(T elemento) {
        this.elementos.remove(elemento);
    }

    public void removerElementoPorPosicao(int indice) {
        this.elementos.remove(indice);
    }

    public void ordenar() {
        this.elementos.sort(null);
    }  

    public T primeiroElemento() {
        return this.elementos.get(0);
    } 

    public T ultimoElemento() {
        return this.elementos.get(this.elementos.size() - 1);
    } 

    public T encontrarElemento(T elemento) {
        return this.elementos.get(this.elementos.indexOf(elemento));
    }

    public T encontrarElementoPorPosicao(int indice) {
        return this.elementos.get(indice);
    }

    public void editarElemento(int indice, T elemento) {
        this.elementos.set(indice, elemento);
    }

    public boolean existe(T elemento) {
        return this.elementos.contains(elemento);
    }

    public boolean existePorPosicao(int indice) {
        return this.elementos.contains(indice);
    }

    public boolean ehIgual(Lista<T> lista) {
        return this.elementos.equals(lista.elementos);
    }
}

    