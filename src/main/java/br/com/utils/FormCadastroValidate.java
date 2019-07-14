package br.com.utils;

import javax.faces.component.behavior.ClientBehaviorBase;
import javax.faces.component.behavior.ClientBehaviorContext;
import javax.faces.component.behavior.FacesBehavior;

@FacesBehavior(value = "form-validation")
public class FormCadastroValidate extends ClientBehaviorBase {
	
	@Override
	public String getScript(ClientBehaviorContext behaviorContext) {
		return "return confirm('Você tem certeza?');";
	}
}