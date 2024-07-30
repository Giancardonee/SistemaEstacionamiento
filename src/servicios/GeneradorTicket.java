package servicios;


import com.itextpdf.text.BaseColor;
import servicios.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import modelo.Tarifa;

public  class GeneradorTicket {
    

    
 public static void generarPDF(Tarifa tarifa) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        // Especifica la ruta donde quieres guardar el archivo
        Path outputPath = Paths.get("tickets", "Ticket_" + tarifa.getIdTarifa() + ".pdf");

        // Asegúrate de que el directorio exista
        try {
            Files.createDirectories(outputPath.getParent());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el directorio: " + e.getMessage());
            return;
        }

        String outputFilePath = outputPath.toString();

        try {
            Document ticket = new Document(PageSize.A6);
            PdfWriter.getInstance(ticket, new FileOutputStream(outputFilePath));
            ticket.open();

            // Agrega el logo al ticket
            Image logo = Image.getInstance("src/img/logo parking sin fondo.png");
            logo.scaleToFit(60, 60); // Ajusta el tamaño del logo si es necesario
            logo.setAlignment(Element.ALIGN_CENTER);
            ticket.add(logo);

            // Agrega el título
            Paragraph titulo = new Paragraph("Ticket de Estacionamiento", FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.BLUE));
            titulo.setAlignment(Element.ALIGN_CENTER);
            ticket.add(titulo);

            // Información del ticket
            PdfPTable tabla = new PdfPTable(2);
            tabla.setWidthPercentage(100);
            tabla.setSpacingBefore(5f); // Ajusta el espacio antes de la tabla
            tabla.setSpacingAfter(5f); // Ajusta el espacio después de la tabla

            PdfPCell cell1 = new PdfPCell(new Phrase("TICKET Nº " + tarifa.getIdTarifa(), FontFactory.getFont("Tahoma", 12, Font.BOLD, BaseColor.BLUE)));
            cell1.setBorder(Rectangle.NO_BORDER);
            PdfPCell cell2 = new PdfPCell(new Phrase("DNI Cliente: " + tarifa.getDniDueno(), FontFactory.getFont("Tahoma", 12, Font.NORMAL, BaseColor.BLACK)));
            cell2.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(cell1);
            tabla.addCell(cell2);

            cell1 = new PdfPCell(new Phrase("Patente Vehículo: " + tarifa.getPatenteVehiculo(), FontFactory.getFont("Tahoma", 12, Font.NORMAL, BaseColor.BLUE)));
            cell1.setBorder(Rectangle.NO_BORDER);
            cell2 = new PdfPCell(new Phrase("Ingreso: " + sdf.format(tarifa.getIngreso()), FontFactory.getFont("Tahoma", 12, Font.NORMAL, BaseColor.BLACK)));
            cell2.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(cell2);
            tabla.addCell(cell1);
            
             cell2 = new PdfPCell(new Phrase("Total a Pagar: $" + String.format("%.2f", tarifa.getTotalPagar()), FontFactory.getFont("Tahoma", 12, Font.BOLD, BaseColor.BLUE)));
            
            cell1 = new PdfPCell(new Phrase("Salida: " + sdf.format(tarifa.getSalida()), FontFactory.getFont("Tahoma", 12, Font.NORMAL, BaseColor.BLACK)));
            cell1.setBorder(Rectangle.NO_BORDER);
           
            cell2.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(cell1);
            tabla.addCell(cell2);

            ticket.add(tabla);


            // Línea de separación
            ticket.add(new Paragraph("---------------------------------------------------", FontFactory.getFont("Tahoma", 12, Font.BOLD, BaseColor.BLACK)));

            // Finaliza el documento
            ticket.close();
            JOptionPane.showMessageDialog(null, "Ticket generado exitosamente: " + outputFilePath);
        } catch (DocumentException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error al generar el ticket: " + e.getMessage());
        }
    }
    
}