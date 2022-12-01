package com.revature.novel.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "characters")
public class FictionalCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "character_id")
    private int characterId;

    // id, novel, name, age, gender, type of character
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private String gender;
    @Column
    private String type;

//    @ManyToOne
//    @JoinColumn(name = "novel_id")
    @Column
    private Novel novel;

    public FictionalCharacter() {
    }

    public FictionalCharacter(int characterId, String name, int age, String gender, String type, Novel novel) {
        this.characterId = characterId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.type = type;
        this.novel = novel;
    }

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Novel getNovel() {
        return novel;
    }

    public void setNovel(Novel novel) {
        this.novel = novel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FictionalCharacter that = (FictionalCharacter) o;
        return characterId == that.characterId && age == that.age && Objects.equals(name, that.name) && Objects.equals(gender, that.gender) && Objects.equals(type, that.type) && Objects.equals(novel, that.novel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characterId, name, age, gender, type, novel);
    }

    @Override
    public String toString() {
        return "FictionalCharacter{" +
                "characterId=" + characterId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", type='" + type + '\'' +
                ", novel=" + novel +
                '}';
    }
}
