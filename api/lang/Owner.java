package api.lang;

public class Owner {
	private String name;
	private String cellPhone;

	public Owner() {

	}

	public Owner(String name, String cellPhone) {
		super();
		this.name = name;
		this.cellPhone = cellPhone;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Owner) {
			Owner owner = (Owner)obj;
			if(this.name.equals(owner.name)){
				return true;
			}
			else {
				return false;
			}
		}

		return super.equals(obj);
	}


	@Override
	public String toString() {
		return "소유주 정보: 이름은 " + name + "이고, 핸드폰 번호는 " + cellPhone + "입니다.";
	}

	// g,s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

}
