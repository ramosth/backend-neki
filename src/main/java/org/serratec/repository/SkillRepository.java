package org.serratec.repository;

import java.util.Optional;

import org.serratec.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long>{

	boolean existsByName(String name);
	public Optional<Skill> findByName(String name);
}
