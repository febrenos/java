
public class Produto {
	
	//atributs
	private int codigo;
	private String desc;
	private float precoUnitario;
	
	//params constructor
	public Produto(int c, String d, float p) {
		codigo = c;
		desc = d;
		precoUnitario = p;
	}
	
	
	//getters and setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public float getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(float p) {
		precoUnitario = p;
	}
	
}
