package unidue.ub.knowledgebase.backend;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.xml.bind.annotation.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@XmlRootElement
public class PublicationAuthor {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    @XmlElement
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date = new Date();

    @XmlElement
    private String surname;

    @XmlElement
    private String firstname;

    @XmlElement
    private String middlename;

    @XmlElement
    private String institution;

    @XmlElement
    private String department;

    @XmlElement
    private String address;

    @XmlElement
    private String scopusAuthorID;

    @XmlElement
    private String hIndex;

    @XmlElement
    private String orcid;

    @XmlElement
    private String lsfID;

    @XmlElement
    private String researcherID;

    @XmlElement
    private String gnd;

    @XmlElement
    private boolean researchGate;

    @XmlElement
    private int numberOfPublicationsUniBib;

    @XmlElement
    private int numberOfPublicationsScopus;

    @XmlElement
    private int numberOfPublicationsWoS;

    @XmlElement
    private String linkGoogleProfile;

    @XmlElement
    private String linkHomepage;

    @Lob
    @XmlElement
    private String foundInDatabase;

    @Lob
    @XmlElement
    private String comment;

    @Lob
    @XmlElement
    private String keywords;

    public PublicationAuthor() {
        gnd = "";
        orcid = "";
        researcherID = "";
        scopusAuthorID = "";
        surname = "";
        firstname = "";
        institution = "";
        department = "";
        address = "";
        middlename = "";
        hIndex = "0";
        researchGate = false;
        numberOfPublicationsUniBib = 0;
        numberOfPublicationsScopus = 0;
        numberOfPublicationsWoS = 0;
        linkGoogleProfile = "";
        linkHomepage = "";
        foundInDatabase = "";
        comment = "";
        keywords = "";
        lsfID = "";
    }

    /**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the researchGate
     */
    public boolean isResearchGate() {
        return researchGate;
    }

    /**
     * @return the numberOfPublicationsUniBib
     */
    public int getNumberOfPublicationsUniBib() {
        return numberOfPublicationsUniBib;
    }

    /**
     * @return the numberOfPublicationsScopus
     */
    public int getNumberOfPublicationsScopus() {
        return numberOfPublicationsScopus;
    }

    /**
     * @return the numberOfPublicationsWoS
     */
    public int getNumberOfPublicationsWoS() {
        return numberOfPublicationsWoS;
    }

    /**
     * @return the linkGoogleProfile
     */
    public String getLinkGoogleProfile() {
        return linkGoogleProfile;
    }

    /**
     * @return the linkHomepage
     */
    public String getLinkHomepage() {
        return linkHomepage;
    }

    /**
     * @return the foundInDatabase
     */
    public String getFoundInDatabase() {
        return foundInDatabase;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @return the keywords
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @param researchGate the researchGate to set
     */
    public void setResearchGate(boolean researchGate) {
        this.researchGate = researchGate;
    }

    /**
     * @param numberOfPublicationsUniBib the numberOfPublicationsUniBib to set
     */
    public void setNumberOfPublicationsUniBib(int numberOfPublicationsUniBib) {
        this.numberOfPublicationsUniBib = numberOfPublicationsUniBib;
    }

    /**
     * @param numberOfPublicationsScopus the numberOfPublicationsScopus to set
     */
    public void setNumberOfPublicationsScopus(int numberOfPublicationsScopus) {
        this.numberOfPublicationsScopus = numberOfPublicationsScopus;
    }

    /**
     * @param numberOfPublicationsWoS the numberOfPublicationsWoS to set
     */
    public void setNumberOfPublicationsWoS(int numberOfPublicationsWoS) {
        this.numberOfPublicationsWoS = numberOfPublicationsWoS;
    }

    /**
     * @param linkGoogleProfile the linkGoogleProfile to set
     */
    public void setLinkGoogleProfile(String linkGoogleProfile) {
        this.linkGoogleProfile = linkGoogleProfile;
    }

    /**
     * @param linkHomepage the linkHomepage to set
     */
    public void setLinkHomepage(String linkHomepage) {
        this.linkHomepage = linkHomepage;
    }

    /**
     * @param foundInDatabase the foundInDatabase to set
     */
    public void setFoundInDatabase(String foundInDatabase) {
        this.foundInDatabase = foundInDatabase;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @param keywords the keywords to set
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getName() {
        return surname + ", " + firstname;
    }

    public String getSurname() {
        return surname;
    }

    public String getGnd() {
        return gnd;
    }

    public PublicationAuthor setGnd(String gnd) {
        this.gnd = gnd;
        return this;
    }

    public PublicationAuthor setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public PublicationAuthor setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getMiddlename() {
        return middlename;
    }

    public PublicationAuthor setMiddlename(String middlename) {
        this.middlename = middlename;
        return this;
    }

    public String getInstitution() {
        return institution;
    }

    public PublicationAuthor setInstitution(String institution) {
        this.institution = institution;
        return this;
    }

    public String getScopusAuthorID() {
        return scopusAuthorID;
    }

    public void setScopusAuthorID(String scopusAuthorID) {
        this.scopusAuthorID = scopusAuthorID;
    }

    public String gethIndex() {
        return hIndex;
    }

    public void sethIndex(String hIndex) {
        this.hIndex = hIndex;
    }

    public String getOrcid() {
        return orcid;
    }

    public void setOrcid(String orcid) {
        this.orcid = orcid;
    }

    public String getLsfID() {
        return lsfID;
    }

    public void setLsfID(String lsfID) {
        this.lsfID = lsfID;
    }

    public String getResearcherID() {
        return researcherID;
    }

    public void setResearcherID(String researcherID) {
        this.researcherID = researcherID;
    }

    public PublicationAuthor(String surname, String firstname, String institution) {
        this.surname = surname;
        this.firstname = firstname;
        this.institution = institution;
    }
    
    @Override
    public String toString() {
    	String name = (middlename.isEmpty()) ? firstname + " " + surname : firstname + " " + middlename + " " + surname;
    	return name;
    }

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
}
