package pattern.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HtmlBuilder extends Builder{

    public String filename;

    private PrintWriter printWriter;

    @Override
    public void makeTitle(String title) {
        filename = title + ".html";
        try{
            printWriter = new PrintWriter(new FileWriter(filename));
        }catch (IOException e){
            e.printStackTrace();
        }
        printWriter.println("<html><head><title>" + title + "</title></head><body>");
        printWriter.write("<h1>" + title + "</h1>");

    }

    @Override
    public void makeString(String str) {
        printWriter.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        printWriter.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            printWriter.println("<li>" + items[i] + "</li>");
        }
        printWriter.println("</ul>");
    }

    @Override
    public void close() {
        printWriter.println("</body></html>");
        printWriter.close();
    }

    public String getResult(){
        return filename;
    }
}
