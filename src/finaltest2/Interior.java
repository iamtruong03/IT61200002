package finaltest2;

public class Interior extends Product {
	private TYPE Interior_type;
	private MATERIAL interior_material;
	private String interior_noteString;
	
	public Interior () {
		
	}

	public Interior(TYPE interior_type, MATERIAL interior_materialMaterial, String interior_noteString) {
		super();
		Interior_type = interior_type;
		this.interior_material = interior_material;
		this.interior_noteString = interior_noteString;
	}

	public TYPE getInterior_type() {
		return Interior_type;
	}

	public void setInterior_type(TYPE interior_type) {
		Interior_type = interior_type;
	}

	public MATERIAL getInterior_material() {
		return interior_material;
	}

	public void setInterior_material(MATERIAL interior_material) {
		this.interior_material = interior_material;
	}

	public String getInterior_noteString() {
		return interior_noteString;
	}

	public void setInterior_noteString(String interior_noteString) {
		this.interior_noteString = interior_noteString;
	}

	@Override
	public String toString() {
		return "Interior [" + super.toString() + ", Interior_type=" + Interior_type + ", interior_materialMaterial=" + interior_material
				+ ", interior_noteString=" + interior_noteString + "]";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub

		// xác định chất liệu
		byte index = (byte) (Math.random() * MATERIAL.values().length);

		this.interior_material = MATERIAL.values()[index];

		float scale = 0;
		switch (this.interior_material) {
		case MDF:
			scale = 1.2f;
			break;
		case CONGNGHIEP:
			scale = 1;
			break;
		case GO:
			scale = 1.5f;
			break;
		case GOLIM:
			scale = 2;
			break;
		}

		// xac dinh loai san pham
		index = (byte) (Math.random() * TYPE.values().length);

		this.Interior_type = TYPE.values()[index];

		double price = 0;
		switch (this.Interior_type) {
		case TABLE_EAT_4:
			price = this.getPrice() * this.getProduct_total() * scale * 1;
			break;
		case TABLE_EAT_6:
			price = this.getPrice() * this.getProduct_total() * scale * 1.2;
			break;
		case TABLE_EAT_8:
			price = this.getPrice() * this.getProduct_total() * scale * 1.5;
			break;
		case SOFA_L_4:
			price = this.getPrice() * this.getProduct_total() * scale * 1.8;
			break;
		case SOFA_L_6:
			price = this.getPrice() * this.getProduct_total() * scale * 2;
			break;
		case SOFA_L_8:
			price = this.getPrice() * this.getProduct_total() * scale * 2.3;
			break;
		}

		return price;
	}

}