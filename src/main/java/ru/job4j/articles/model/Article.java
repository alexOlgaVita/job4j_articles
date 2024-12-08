package ru.job4j.articles.model;

public class Article {

    private int id;

    private String text;

    public Article(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public Article(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 17;
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Article article = (Article) obj;
        return (id == article.id) && (text.equals(article.text));
    }
}
