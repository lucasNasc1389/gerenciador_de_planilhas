package com.example.demo;

import org.apache.commons.collections4.IteratorUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GerenciadorDeCheques {

    public List<Cheque> criar() throws IOException {

        List<Cheque> cheques = new ArrayList<>();

        try {

            // Recuperando o arquivo
            FileInputStream file = new FileInputStream("/home/logic/Desktop/demo/src/main/resources/planilhaTesteLucas.xlsx");
            Workbook workbook = new XSSFWorkbook(file);

            // Setando a aba
            Sheet aba =  workbook.getSheetAt(0);

            // Setando as linhas que vamos trabalhar
            List<Row> rows = (List<Row>) toList(aba.iterator());

            rows.remove(0);

            rows.forEach(row -> {
                // Setando as células
               List<Cell> celulas = (List<Cell>) toList(row.cellIterator());

               //Atribui os valores da classe cheque
               Cheque cheque = new Cheque();

               cheque.setData(celulas.get(0).getDateCellValue());
               cheque.setNumeroCheque((int) celulas.get(1).getNumericCellValue());
               cheque.setNome(celulas.get(2).getStringCellValue());
               cheque.setValor(new BigDecimal(celulas.get(3).getNumericCellValue()));
               cheque.setStatus(celulas.get(4).getStringCellValue());
               cheque.setQntdParcelas((int) celulas.get(5).getNumericCellValue());
               cheque.setFormulaTotal(celulas.get(6).getCellFormula());

               cheques.add(cheque);
            });

            file.close();

        } catch (Exception e){
            System.out.println(e);
        }

        return cheques;
    }

    public List<?> toList(Iterator<?> iterator){
        return IteratorUtils.toList(iterator);
    }

    public void imprimir(List<Cheque> cheques) {
        cheques.forEach(System.out::println);
    }
}