package com.revature.novel.models;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.*;


@Entity
@Table(name = "novels")
public class Novel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "novel_id")
    private int novelId;

    // id, author, genre, year, rating, fictional characters

    private String author;
    private String genre;
    private int year;
    private int rating;

    @OneToMany(mappedBy = "novel")
    @JsonIgnore
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private String characters;

    public Novel() {
    }

    public Novel(int novelId, String author, String genre, int year, int rating, String characters) {
        this.novelId = novelId;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
        this.characters = characters;
    }

    public int getNovelId() {
        return novelId;
    }

    public void setNovelId(int novelId) {
        this.novelId = novelId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Novel novel = (Novel) o;
        return novelId == novel.novelId && year == novel.year && rating == novel.rating && Objects.equals(author, novel.author) && Objects.equals(genre, novel.genre) && Objects.equals(characters, novel.characters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(novelId, author, genre, year, rating, characters);
    }

    @Override
    public String toString() {
        return "Novel{" +
                "novelId=" + novelId +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                ", characters='" + characters + '\'' +
                '}';
    }
}
