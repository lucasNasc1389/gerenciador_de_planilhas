package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class PlanExcelApplication {

	public static void main(String[] args) throws IOException {
		//SpringApplication.run(PlanExcelApplication.class, args);
		GerenciadorDeCheques cheques = new GerenciadorDeCheques();

		List<Cheque> chequeList = cheques.criar();

		cheques.imprimir(chequeList);
	}

}
