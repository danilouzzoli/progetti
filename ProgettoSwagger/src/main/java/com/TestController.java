package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping( value = "/test")
@Api(value = "TestController", tags = "Controller di prova")
public class TestController {
	
	@ApiOperation(   
			value = "Ricerca articolo per codice",
			notes = "Restituisce i dati dell'articolo in formato JSON",
			response = String.class,
			produces = "application/json"
	)
	
	@ApiResponses( value = 
	{
			@ApiResponse( code = 200, message = "L'articolo cercato è stato trovato" ),
			@ApiResponse( code = 404, message = "L'articolo cercato NON è stato trovato" ),
			@ApiResponse( code = 403, message = "NON sei autorizzato ad accede alle informazioni" ),
			@ApiResponse( code = 401, message = "Non sei autenticato" )
			
	})
	
	
	
	@RequestMapping(value = "/saluta", method = RequestMethod.GET, produces = "application/json")
	public String saluto() {
		return "Hello World";
	}
	
	
}
