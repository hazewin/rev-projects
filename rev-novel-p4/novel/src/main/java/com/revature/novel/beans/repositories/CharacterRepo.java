package com.revature.novel.beans.repositories;

import com.revature.novel.models.FictionalCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;

public interface CharacterRepo extends JpaRepository <FictionalCharacter, Integer> {
}
