public abstract class Figura{ 

	protected float[] pOrigem = new float[2]; 

	public Figura(){
		pOrigem[0] = 0f;
		pOrigem[1] = 0f;
	}

	public Figura(float x, float y){
		pOrigem[0] = x;
		pOrigem[1] = y;
	}

    public abstract void desenhar();  

    public abstract float calcularArea(); 


    public void mover(float dx, float dy) {
    	pOrigem[0] = pOrigem[0] + dx;
    	pOrigem[1] = pOrigem[1] + dy; 
    } 

} 