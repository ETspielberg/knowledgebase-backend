package unidue.ub.knowledgebase.backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/knowledgebase")
@CrossOrigin(origins="*")
public class PublicationAuthorController {
	
	@Autowired
	private PublicationAuthorRepository repository;
	
	@RequestMapping(value="/",
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE,
			headers = "Accept=application/json")
	public ResponseEntity<?> getEntries() {
		List<PublicationAuthor> authors = (List<PublicationAuthor>) repository.findAll();
		
		return ResponseEntity.ok(authors);
	}
	
	@RequestMapping(value="/search/name",
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE,
			headers = "Accept=application/json")
	public ResponseEntity<?> findByName(@RequestParam("name") String name) {
		List<PublicationAuthor> authors;
		if (name.contains(",")) {
			int position = name.indexOf(",");
			authors = (List<PublicationAuthor>) repository.findBySurnameAndFirstname(name.substring(0,position), name.substring(position +1));
		} else if (name.contains(" ")) {
			int position = name.indexOf(" ");
			authors = (List<PublicationAuthor>) repository.findBySurnameAndFirstname(name.substring(0,position), name.substring(position +1));
		} else {
			authors = (List<PublicationAuthor>) repository.findBySurname(name);
		}
		return ResponseEntity.ok(authors);
	}
	
	@RequestMapping(value="/search/scopusAuthorID",
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE,
			headers = "Accept=application/json")
	public ResponseEntity<?> findByScopusAuthorID(@RequestParam("id") String id) {
		List<PublicationAuthor> authors =  (List<PublicationAuthor>) repository.findByScopusAuthorID(id);
		return ResponseEntity.ok(authors);
	}
	
	@RequestMapping(value="/search/orcid",
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE,
			headers = "Accept=application/json")
	public ResponseEntity<?> findByOrcid(@RequestParam("id") String id) {
		List<PublicationAuthor> authors =  (List<PublicationAuthor>) repository.findByOrcid(id);
		return ResponseEntity.ok(authors);
	}
	
	@RequestMapping(value="/search/researcherID",
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE,
			headers = "Accept=application/json")
	public ResponseEntity<?> findByResearcherID(@RequestParam("id") String id) {
		List<PublicationAuthor> authors =  (List<PublicationAuthor>) repository.findByResearcherID(id);
		return ResponseEntity.ok(authors);
	}
	
	@RequestMapping(value="/search/gnd",
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE,
			headers = "Accept=application/json")
	public ResponseEntity<?> findByGnd(@RequestParam("id") String id) {
		List<PublicationAuthor> authors =  (List<PublicationAuthor>) repository.findByGnd(id);
		return ResponseEntity.ok(authors);
	}
	
	@RequestMapping(value="/",
			method=RequestMethod.PUT,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<?> create(@RequestBody PublicationAuthor author) {
		author = repository.save(author);
		
		return ResponseEntity.ok(author);
	}
	
	

}
