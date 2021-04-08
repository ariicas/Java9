package com.class27;

public abstract class File {

    void edit (){
        System.out.println("File edits");
    }
    void close (){
        System.out.println("File closes");
    }
    public abstract void open ();

}

class JavaFile extends File{

    @Override
    public void open() {
        System.out.println("we need notepad++");
    }
}

class WordFile extends File{

    @Override
    public void open() {
        System.out.println("we need microsoft word");
    }
}

class PdfFile extends File{

    @Override
    public void open() {
        System.out.println("we need to download file on microsoft word");
    }
    public static void main (String []args) {
        JavaFile javaFile=new JavaFile();
        javaFile.open();
        File file= new JavaFile();
        file.open();
        WordFile wordFile=new WordFile();
        wordFile.open();
        File file1=new WordFile();
        file1.open();
        PdfFile pdfFile=new PdfFile();
        pdfFile.open();
        File file2=new PdfFile();
        file2.open();

    }
}
