package co.edu.unilibre.rest.CountryDto;

public class CountryDto {

	private Integer Id;
	private String name;
	
	public CountryDto(Integer Id, String name ) {
		super();
		this.Id = Id;	
		this.name = name;
			
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer Id) {
		this.Id =Id;
	}
	public String getName() {
		return name;		
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
