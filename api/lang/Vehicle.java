package api.lang;

public class Vehicle {
	Owner owner; // Vehicle객체가 Owner객체를 소유.(has a 관계)
	private int price;
	
	public Vehicle() {
		
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Vehicle) {
			Vehicle owner = (Vehicle)obj;
			if(this.owner.equals(owner.getOwner())){
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
		return "" + owner + "" + "\n차랑정보: 가격은" + price + " 입니다.";
	}


	//g,s
	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
