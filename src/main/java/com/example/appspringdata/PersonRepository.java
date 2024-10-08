package com.example.appspringdata;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

public interface PersonRepository extends Neo4jRepository<Person, String> {
//    @Query("MATCH (m:Movie {title: $title})<-[r:ACTED_IN]-(p:Person)" +
//            "RETURN p, collect(r), collect(m);")
//    Iterable<Person> findPersonsByMovie(String title);
}
