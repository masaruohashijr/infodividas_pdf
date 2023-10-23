package com.logusinfo.infodividas;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.text.PDFTextStripperByArea;

/**
 *
 */
public class LerLinhasPdf {
  public static void main(String[] args) {
    try {
      // Caminho do arquivo PDF
      String caminhoArquivoPDF = "C:\\Users\\Masaru\\Downloads\\AAAA-CONDIÇÕES.pdf";

      PDDocument document = PDDocument.load(new File(caminhoArquivoPDF));
      PDFTextStripperByArea stripper = new PDFTextStripperByArea();
      stripper.setSortByPosition(true);
      int[] widths = { 30, 28, 57, 30, 33, 36, 215, 50, 60, 25, 30, 27, 25,
          30, 32, 30, 60, 40 };
      List<Contrato> contratos = new LinkedList<Contrato>();
      int numcontrato = 59;
      for (int j = 0; j <= numcontrato; j++) {
        int x = 10;
        int k = 82;
        Contrato contrato = new Contrato();
        for (int i = 0; i < widths.length; i++) {
          int width = widths[i];
          int y = k + (8 * j);
          Rectangle rect = new Rectangle(x, y, width, 4);
          stripper.addRegion("class1", rect);
          PDPageTree pages = document.getDocumentCatalog().getPages();
          PDPage firstPage = pages.get(0);
          stripper.extractRegions(firstPage);
          String texto = stripper.getTextForRegion("class1").trim();
          // System.out.println((i + 1) + ": " + texto);
          if (i == 6 || i == 8 || i == 11 || i == 12 || i == 13 || i == 14
              || i == 15 || i == 16 || i == 17) {
            if (texto.contains("Alt. LC/178/2021")) {
              k += 0;
              i--;
              continue;
            } else {
              if (texto.isEmpty()) {
                if (k >= 80) {
                  k = k - 2;
                  i--;
                  continue;
                } else {
                  k = 82;
                }
              }
            }
          }
          if (i < 8) {
            if (texto.isEmpty()) {
              k = k - 2;
              i--;
              continue;
            } else {
              k = 82;
            }
          }
          contrato.set(i, texto);
          x += widths[i];
        }
        contratos.add(contrato);
        // System.out.println("");
      }
      document.close();
      for (Contrato contrato : contratos) {
        System.out.print(contrato + "\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
