public class Circulo extends Figura{
	private float raio;

	public Circulo(){
		raio = 0f;
	}

	public Circulo(float x, float y, float r){
		super(x, y);
		raio = r;
	}

	public String toString(){
		return "Circulo";
	}

	public void desenhar(){
		System.out.println(this.toString());
	}

	public float calcularArea(){
		return 3.14f * raio * raio;
	}

}