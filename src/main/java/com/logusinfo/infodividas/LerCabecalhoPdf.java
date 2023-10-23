package com.logusinfo.infodividas;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.text.PDFTextStripperByArea;

/**
 *
 */
public class LerCabecalhoPdf {
  public static void main(String[] args) {
    try {
      // Caminho do arquivo PDF
      String caminhoArquivoPDF = "C:\\Users\\Masaru\\Downloads\\AAAA-CONDIÇÕES.pdf";

      PDDocument document = PDDocument.load(new File(caminhoArquivoPDF));
      PDFTextStripperByArea stripper = new PDFTextStripperByArea();
      stripper.setSortByPosition(true);
      int[] widths = { 30, 30, 50, 30, 35, 45, 200, 55, 60, 30, 30, 30, 25,
          30, 30, 30, 60, 30 };
      int[] heights = { 30, 30, 30, 30, 30, 30, 30, 30, 30, 15, 15, 15, 30,
          30, 30, 30, 30, 30 };
      int[] y = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 65, 65, 65, 50, 50,
          50, 50, 50, 50 };
      int x = 10;
      for (int i = 0; i < widths.length; i++) {
        int width = widths[i];
        int height = heights[i];
        Rectangle rect = new Rectangle(x, y[i], width, height);
        stripper.addRegion("class1", rect);
        PDPageTree pages = document.getDocumentCatalog().getPages();
        PDPage firstPage = pages.get(0);
        stripper.extractRegions(firstPage);
        String texto = stripper.getTextForRegion("class1");
        System.out.println(texto);
        x += widths[i];
      }
      document.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
