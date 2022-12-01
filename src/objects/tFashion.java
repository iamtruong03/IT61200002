package objects;

public class tFashion {
	// object properties
	private short fashion_id; // mã tìm kiếm
	private String fashion_mamage_id; // mã quản lý bat buoc
	private String fashion_name; // tên sp bat buoc
	private byte fashion_category_id; // loại sp
	private byte fashion_group_id; // mhoms sp
	private byte fashion_system_id; // phân hệ sp
	private String[] fashion_image; // danh sách ảnh+ video
	private BRAND fashion_brand; // thương hiệu sp
	private float fashion_price; // giá sp bat buoc
	private float fashion_price_disscount; // giá khuyến mãi
	private SIZE fashion_size; // kích thước
	private String fashion_update; // ngày cập nhật bat buoc
	private String fashion_last_modified; // ngày chỉnh sửa
	private String fashion_count; // sl hàng trong kho
	private boolean fashion_is_show; // hiển thị trog kho
	private boolean fashion_is_delete; // đánh dấu loại bỏ
	private String fashion_intro; // tóm tắt nhanh
	private String fashion_detail; // chi tiết
	private QUALITY fashion_quality; // chất liệu/ chất lượng
	private COLOR fashion_color; // màu sắc bag buoc
	private Person fashion_manager; // người quản lý

	
	// Contructor
	public tFashion() {

	}

	public tFashion(short fashion_id, String fashion_mamage_id, String fashion_name, byte fashion_category_id,
			byte fashion_group_id, byte fashion_system_id, String[] fashion_image, BRAND fashion_brand,
			float fashion_price, float fashion_price_disscount, SIZE fashion_size, String fashion_update,
			String fashion_last_modified, String fashion_count, boolean fashion_is_show, boolean fashion_is_delete,
			String fashion_intro, String fashion_detail, QUALITY fashion_quality, COLOR fashion_color,
			Person fashion_manager) {
		this.fashion_id = fashion_id;
		this.fashion_mamage_id = fashion_mamage_id;
		this.fashion_name = fashion_name;
		this.fashion_category_id = fashion_category_id;
		this.fashion_group_id = fashion_group_id;
		this.fashion_system_id = fashion_system_id;
		this.fashion_image = fashion_image;
		this.fashion_brand = fashion_brand;
		this.fashion_price = fashion_price;
		this.fashion_price_disscount = fashion_price_disscount;
		this.fashion_size = fashion_size;
		this.fashion_update = fashion_update;
		this.fashion_last_modified = fashion_last_modified;
		this.fashion_count = fashion_count;
		this.fashion_is_show = fashion_is_show;
		this.fashion_is_delete = fashion_is_delete;
		this.fashion_intro = fashion_intro;
		this.fashion_detail = fashion_detail;
		this.fashion_quality = fashion_quality;
		this.fashion_color = fashion_color;
		this.fashion_manager = fashion_manager;
	}

	public short getFashion_id() {
		return fashion_id;
	}

	public void setFashion_id(short fashion_id) {
		this.fashion_id = fashion_id;
	}

	public String getFashion_mamage_id() {
		return fashion_mamage_id;
	}

	public void setFashion_mamage_id(String fashion_mamage_id) {
		this.fashion_mamage_id = fashion_mamage_id;
	}

	public String getFashion_name() {
		return fashion_name;
	}

	public void setFashion_name(String fashion_name) {
		this.fashion_name = fashion_name;
	}

	public byte getFashion_category_id() {
		return fashion_category_id;
	}

	public void setFashion_category_id(byte fashion_category_id) {
		this.fashion_category_id = fashion_category_id;
	}

	public byte getFashion_group_id() {
		return fashion_group_id;
	}

	public void setFashion_group_id(byte fashion_group_id) {
		this.fashion_group_id = fashion_group_id;
	}

	public byte getFashion_system_id() {
		return fashion_system_id;
	}

	public void setFashion_system_id(byte fashion_system_id) {
		this.fashion_system_id = fashion_system_id;
	}

	public String[] getFashion_image() {
		return fashion_image;
	}

	public void setFashion_image(String[] fashion_image) {
		this.fashion_image = fashion_image;
	}

	public BRAND getFashion_brand() {
		return fashion_brand;
	}

	public void setFashion_brand(BRAND fashion_brand) {
		this.fashion_brand = fashion_brand;
	}

	public float getFashion_price() {
		return fashion_price;
	}

	public void setFashion_price(float fashion_price) {
		this.fashion_price = fashion_price;
	}

	public float getFashion_price_disscount() {
		return fashion_price_disscount;
	}

	public void setFashion_price_disscount(float fashion_price_disscount) {
		this.fashion_price_disscount = fashion_price_disscount;
	}

	public SIZE getFashion_size() {
		return fashion_size;
	}

	public void setFashion_size(SIZE fashion_size) {
		this.fashion_size = fashion_size;
	}

	public String getFashion_update() {
		return fashion_update;
	}

	public void setFashion_update(String fashion_update) {
		this.fashion_update = fashion_update;
	}

	public String getFashion_last_modified() {
		return fashion_last_modified;
	}

	public void setFashion_last_modified(String fashion_last_modified) {
		this.fashion_last_modified = fashion_last_modified;
	}

	public String getFashion_count() {
		return fashion_count;
	}

	public void setFashion_count(String fashion_count) {
		this.fashion_count = fashion_count;
	}

	public boolean isFashion_is_show() {
		return fashion_is_show;
	}

	public void setFashion_is_show(boolean fashion_is_show) {
		this.fashion_is_show = fashion_is_show;
	}

	public boolean isFashion_is_delete() {
		return fashion_is_delete;
	}

	public void setFashion_is_delete(boolean fashion_is_delete) {
		this.fashion_is_delete = fashion_is_delete;
	}

	public String getFashion_intro() {
		return fashion_intro;
	}

	public void setFashion_intro(String fashion_intro) {
		this.fashion_intro = fashion_intro;
	}

	public String getFashion_detail() {
		return fashion_detail;
	}

	public void setFashion_detail(String fashion_detail) {
		this.fashion_detail = fashion_detail;
	}

	public QUALITY getFashion_quality() {
		return fashion_quality;
	}

	public void setFashion_quality(QUALITY fashion_quality) {
		this.fashion_quality = fashion_quality;
	}

	public COLOR getFashion_color() {
		return fashion_color;
	}

	public void setFashion_color(COLOR fashion_color) {
		this.fashion_color = fashion_color;
	}

	public Person getFashion_manager() {
		return fashion_manager;
	}

	public void setFashion_manager(Person fashion_manager) {
		this.fashion_manager = fashion_manager;
	}

	enum BRAND {
		NEM, ABC, XYZ
	}

	enum SIZE {
		XSMALL, SMALL, MEDIUM, LARGE, XLARGE, XXLARGE
	}

	enum QUALITY {
		Q1, Q2, Q3, Q4
	}

	enum COLOR {
		B, Y, C, O, W, V, P
	}

}
