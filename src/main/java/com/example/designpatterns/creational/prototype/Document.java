package com.example.designpatterns.creational.prototype;

public class Document implements Cloneable {

    private Long id;
    private String name;
    private DocumentType documentType;
    private Category category;
    private String data;

    public Document() {
    }

    public Document(Long id, String name, DocumentType documentType, Category category, String data) {
        this.id = id;
        this.name = name;
        this.documentType = documentType;
        this.category = category;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Document{" +
                "\n id=" + id +
                "\n, name='" + name + '\'' +
                "\n, documentType=" + documentType +
                "\n, category=" + category +
                "\n, data='" + data + '\'' +
                '}';
    }

//    // Shellov Copy
//    @Override
//    protected Document clone() throws CloneNotSupportedException {
//        return (Document) super.clone();
//    }


    //Deep Copy
    @Override
    protected Document clone() throws CloneNotSupportedException {
        Document document = (Document) super.clone();
        DocumentType documentType = document.getDocumentType().clone();
        Category category = document.getCategory().clone();

        document.setDocumentType(documentType);
        document.setCategory(category);

        return (Document) super.clone();
    }
}
