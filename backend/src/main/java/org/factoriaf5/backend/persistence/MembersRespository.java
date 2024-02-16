package org.factoriaf5.backend.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MembersRespository extends JpaRepository<Member, Long> {
    @Query("SELECT m FROM Member m WHERE lower (m.fist_name) LIKE lower(query)" +
            "OR lower (m.last_name) LIKE lower (:query)" +
            "OR lower (m.dni) LIKE lower (:query)" +
            "OR lower (m.email) LIKE lower (:query)" +
            "OR lower (m.loaned) LIKE lower (:query)")
    List<Member> searchMembers(String query);

}
