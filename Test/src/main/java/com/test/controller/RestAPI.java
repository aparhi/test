package com.test.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.IdModel;
import com.test.service.IdService;

@RestController

public class RestAPI {
	// public static final Logger logger = LoggerFactory.getLogger(RestAPI.class);

	@Autowired
	IdService idService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "Hello again!";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity<?> createContract(@RequestBody IdModel idmodel) throws SQLException {

		String contractID = idService.createContract(idmodel);
		return new ResponseEntity<String>(contractID, HttpStatus.OK);

	}

}
