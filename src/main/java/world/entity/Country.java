package world.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the country database table.
 * 
 */
@Entity
@NamedQuery(name="Country.findAll", query="SELECT c FROM Country c")
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(columnDefinition="char(3)")
	private String code;

	@Column(columnDefinition="int(11)")
	private Integer capital;
	
	@Column(columnDefinition="char(2)")
	private String code2;
	
	@Column(columnDefinition="enum('Asia','Europe','North America','Africa','Oceania','Antarctica','South America')")
	//@Enumerated(EnumType.STRING)
	private String continent;

	private float gnp;
	
	
	private Float GNPOld;
	
	@Column(name="governmentform", columnDefinition="char(45)")
	private String governmentForm;
	
	@Column(name="headofstate", columnDefinition="char(60)")
	private String headOfState;
	
	@Column(name="indepyear", nullable=true, columnDefinition="smallint(6)")
	private Integer indepYear;
	
	@Column(name="lifeexpectancy")
	private Float lifeExpectancy;
	
	@Column(name="localname", columnDefinition="char(45)")
	private String localName;
	
	@Column(columnDefinition="char(52)")
	private String name;

	private int population;
	
	@Column(columnDefinition="char(26)")
	private String region;
	
	@Column(name="surfacearea")
	private float surfaceArea;

	public Country() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}
		
	public Integer getCapital() {
		return this.capital;
	}

	public void setCapital(Integer capital) {
		this.capital = capital;
	}

	public String getCode2() {
		return this.code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	public String getContinent() {
		return this.continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public float getGnp() {
		return this.gnp;
	}

	public void setGnp(float gnp) {
		this.gnp = gnp;
	}

	public Float getGNPOld() {
		return this.GNPOld;
	}

	public void setGNPOld(Float GNPOld) {
		this.GNPOld = GNPOld;
	}

	public String getGovernmentForm() {
		return this.governmentForm;
	}

	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}

	public String getHeadOfState() {
		return this.headOfState;
	}

	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}

	public Integer getIndepYear() {
		return this.indepYear;
	}

	public void setIndepYear(Integer indepYear) {
		this.indepYear = indepYear;
	}

	public Float getLifeExpectancy() {
		return this.lifeExpectancy;
	}

	public void setLifeExpectancy(Float lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public String getLocalName() {
		return this.localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return this.population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public float getSurfaceArea() {
		return this.surfaceArea;
	}

	public void setSurfaceArea(float surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

}