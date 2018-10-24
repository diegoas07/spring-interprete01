package beans;

public class Traductor {

	private InterpreteEspanol interprete;
	private String _nombre;
	
	public void hablar() {
		this.interprete.saludar();
		System.err.println(_nombre);
		this.interprete.despedirse();
	}
	
	public InterpreteEspanol getInterprete() {
		return interprete;
	}
	public void setInterprete(InterpreteEspanol interprete) {
		this.interprete = interprete;
	}
	public String get_nombre() {
		return _nombre;
	}
	public void set_nombre(String _nombre) {
		this._nombre = _nombre;
	}
	
	
	
}
