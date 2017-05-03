package unidue.ub.knowledgebase.backend;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "publicationAuthor", path = "knowledgebase")
public interface PublicationAuthorRepository extends JpaRepository<PublicationAuthor, Long> {
	
	List<PublicationAuthor> findBySurname(@Param("surname") String surname);

	List<PublicationAuthor> findBySurnameAndFirstname(@Param("surname") String surname,@Param("firstname") String firstname);
	
	List<PublicationAuthor> findByScopusAuthorID(@Param("id") String scopusAuthorID);
	
	List<PublicationAuthor> findByOrcid(@Param("id") String orcid);
	
	List<PublicationAuthor> findByResearcherID(@Param("id") String researcherID);
	
	List<PublicationAuthor> findByGnd(@Param("id") String gnd);

}
