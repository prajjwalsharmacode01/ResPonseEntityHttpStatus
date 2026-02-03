package com.example.ResPonseEntityHttpStatus.serivices;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.ResPonseEntityHttpStatus.model.DataModel;

@Service
public class DataService {
	private static DataModel dataModel;
	static {
//        dataModel = new DataModel(1L, "Prajjwala");
	}
	public ResponseEntity<DataModel> getData() {
		if (dataModel == null) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		} else
			return ResponseEntity.of(Optional.of(dataModel));
	}
}
