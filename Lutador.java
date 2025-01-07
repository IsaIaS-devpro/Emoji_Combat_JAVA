
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
            int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (this.getPeso() < 52.2) {
            this.setCategoria("INVÁLIDO");
        } else if (this.getPeso() <= 70.3) {
            this.setCategoria("LEVE");
        } else if (this.getPeso() <= 83.9) {
            this.setCategoria("MÉDIO");
        } else if (this.getPeso() <= 120.2) {
            this.setCategoria("PESADO");
        } else {
            this.setCategoria("INVÁLIDO");
        }
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar() {
        System.out.println("\n LUTADOR: " + this.getNome());
        System.out.println("\n ORIGEM: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " ANOS \n");
        System.out.println(this.getAltura() + " M de ALTURA\n");
        System.out.println("\n PESANDO: " + this.getPeso());
        System.out.println("\n GANHOU: " + this.getVitorias());
        System.out.println("\n PERDEU: " + this.getDerrotas());
        System.out.println("\n EMPATOU: " + this.getEmpates());
    }

    public void status() {
        System.out.println("\n LUTADOR: " + this.getNome());
        System.out.println("\n CATEGORIA " + this.getCategoria());
        System.out.println("\n GANHOU: " + this.getVitorias());
        System.out.println("\n PERDEU: " + this.getDerrotas());
        System.out.println("\n EMPATOU: " + this.getEmpates());
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
