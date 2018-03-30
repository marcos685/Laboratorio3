public class QuadradoColorido extends Quadrado implements Colorido{
	public QuadradoColorido(float x, float y, float l){
		super(x, y, l);
	}

	public void desenharColorido(String cor){
		System.out.println(super.toString() + cor);
	}
}