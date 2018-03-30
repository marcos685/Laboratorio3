public class Teste {

	public static void main(String[] args) {
		
		Figura q1 = new Quadrado(0, 0, 4);
		Figura q2 = new Quadrado();
		Figura c1 = new Circulo(0, 0, 4);		
		Figura c2 = new Circulo();

		Figura[] a = new Figura[10];

		q1.desenhar();
		c1.desenhar();

		c2.mover(2, 2);

		System.out.println(q1.calcularArea());
		System.out.println(c1.calcularArea());

		a[0] = q1;
		a[1] = c1;
		a[2] = q2;
		a[3] = c2;
		a[4] = new QuadradoColorido(0, 0, 4);
		a[5] = new CirculoColorido(0, 0, 4);

		for (int i = 6; i < 10; i++) {
			a[i] = new Quadrado();
		}

		for (Figura f : a){
			if (f instanceof Colorido){
				System.out.println(f.calcularArea());
			}
		}
	}
}