import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada; 
    
    public Luta(){
        
    }

    public Lutador getDesafiado() {
		return desafiado;
	}



	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}



	public Lutador getDesafiante() {
		return desafiante;
	}



	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}



	public int getRounds() {
		return rounds;
	}



	public void setRounds(int rounds) {
		this.rounds = rounds;
	}



	public boolean isAprovada() {
		return aprovada;
	}



	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}



	public void marcarLuta(Lutador lutadores1,Lutador lutadores2){
         if(lutadores1.getCategoria() == lutadores2.getCategoria() && lutadores1 != lutadores2) {
        	 this.aprovada = true;
        	 this.desafiado = lutadores1;
        	 this.desafiante = lutadores2;
         }else {
        	 this.aprovada = false;
        	 this.desafiado = null;
        	 this.desafiante = null;
         }
    }

    public void lutar(){
          if(this.aprovada == true) {
        	  System.out.println("\n ### DESAFIADO ### ");
        	  this.desafiado.apresentar();
        	  System.out.println("\n ### DESAFIANTE ###");
        	  this.desafiante.apresentar();
        	  
        	  Random aleatorio = new Random();
        	  int vencedor = aleatorio.nextInt(3); //0, 1 ou 2
        	  System.out.println("\n ======= RESULTADO DA LUTA ======== ");
        	  switch(vencedor) {
        	  case 0:
        		  System.out.println("\n  EMPATOUUU!!!!");
        		  this.desafiado.empatarLuta();
        		  this.desafiante.empatarLuta();
        		  break;
        	  case 1:		  
                   System.out.println("\n VITORIA DO  " + this.desafiado.getNome());
                   this.desafiado.ganharLuta();
                   this.desafiante.perderLuta();
                   break;
        	  case 2:		  
        		  System.out.println("\n VITORIA DO " + this.desafiante.getNome());
        		  this.desafiante.ganharLuta();
        		  this.desafiado.perderLuta();
        		  break;
        	  }
        	  System.out.println("\n ======================================");
          }else{
        	  System.out.println("\n A LUTA NÃO PODE OCORRER.");
          }
    }
}
