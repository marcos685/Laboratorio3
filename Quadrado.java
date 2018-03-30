public class Quadrado extends Figura{
	private float lado;

	public Quadrado(){
		lado = 0f;
	}

	public Quadrado(float x, float y, float l){
		super(x, y);
		lado = l;
	}

	public String toString(){
		return "Quadrado";
	}

	public void desenhar(){
		System.out.println(this.toString());
	}

	public float calcularArea(){
		return lado * lado;
	} 
} 
