package br.com.grupomult.flows;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.grupomult.api.models.ResponseGetAnimals;

public class ListAnimalsValidate {

	@Autowired
	private ListAnimalsLoad load;

	public ResponseEntity<ResponseGetAnimals> execute() {
		// Nothing to validate
		return load.execute();
	}

}
