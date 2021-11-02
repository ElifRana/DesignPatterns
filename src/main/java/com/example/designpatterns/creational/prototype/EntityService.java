package com.example.designpatterns.creational.prototype;

public class EntityService {

    public DocumentType findDocumentTypeById(Long id){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        DocumentType documentType = new DocumentType();
        documentType.setId(id);

        String name;
        if (id.compareTo(1L) == 0){
            name = "Kisisel";
        }else if(id.compareTo(2L) == 0){
            name = "Kurumsal";
        }else{
            name = "Genel";
        }

        documentType.setName(name);
        return documentType;
    }

    public Category findCategoryById(Long id){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Category category = new Category();
        category.setId(id);

        String name;
        if (id.compareTo(1L) == 0){
            name = "Özel";
        }else if(id.compareTo(2L) == 0){
            name = "İş";
        }else{
            name = "Genel";
        }

        category.setName(name);
        return category;
    }

    public Document findDocumentById(Long id) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Document document = new Document();
        document.setId(id);
        document.setDocumentType(findDocumentTypeById(id));
        document.setCategory(findCategoryById(id));

        String name;
        String data;
        if (id.compareTo(1L) == 0){
            name = "Mektup";
            data = "Sevgili Arkadasım";
        }else if(id.compareTo(2L) == 0){
            name = "Rapor";
            data = "Rapor Müdüre gönderildi";
        }else{
            name = "Aktiflik Durumu";
            data = "Mavi tik okundu bilgisidir.";
        }

        document.setName(name);
        document.setData(data);

        return document;
    }
}
