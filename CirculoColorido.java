public class CirculoColorido extends Circulo implements Colorido{
	public CirculoColorido(float x, float y, float r){
		super(x, y, r);
	}

	public void desenharColorido(String cor){
		System.out.println(super.toString() + cor);
	}
}