package br.com.grupomult.flows;

import org.springframework.http.ResponseEntity;

import br.com.grupomult.api.models.Animal;
import br.com.grupomult.api.models.ResponseGetAnimalsById;

public class ListAnimalsByIdResponse {

	public ResponseEntity<ResponseGetAnimalsById> execute(Animal animal) {
		return ResponseEntity.ok(new ResponseGetAnimalsById().animal(animal));
	}

}
