package objects;

public class tShoes {
	// properties
	private short shoes_id;
	private String shoes_manage_id;
	private String shoes_name;
	private String[] shoes_images;
	private SIZE shoes_size;
	private float shoes_price;
	private float shoes_price_discount;
	private String shoes_intro;
	private String shoes_detail;
	private Person shoes_manager;
	private String shoes_update;
	private String shoes_last_modified;
	private boolean shoes_is_show;
	private boolean shoes_is_delete;
	private GENDER shoes_gender;
	private TYPE shoes_typr;
	private short shoes_count;

	enum SIZE {
		XSMALL, SMALL, MEDIUM, LARGE, XLARGE, XXLARGE
	}

	enum GENDER {
		MALE, FEMALE
	}

	enum TYPE {

	}

}
