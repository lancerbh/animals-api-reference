package br.com.grupomult.flows;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.com.grupomult.api.models.Animal;
import br.com.grupomult.api.models.ResponseGetAnimals;

public class ListAnimalsResponse {

	public ResponseEntity<ResponseGetAnimals> execute(List<Animal> animalsApi) {
		if (animalsApi.isEmpty()) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.ok(new ResponseGetAnimals().animais(animalsApi));
		}
	}

}
