package objects;

public class Address {
 // Constanst- 1

 public static final String CITYNAME = "No CITYNAME";
 public static final String DISTRICTNAME = "No DISTRICTNAME";
 public static final String STREETNAME = "No STREETNAME";

 private static int count;

 // Object's properties - 0
 private String cityName;
 private String districtName;
 private String streetName;

 // Constructor methods - 2

 public Address() {
  this(Address.CITYNAME, Address.DISTRICTNAME, Address.STREETNAME);
 }

 public Address(String cityName, String districtName, String streetName) {
  this.cityName = cityName;
  this.districtName = districtName;
  this.streetName = streetName;
  Address.count++;
 }
 // Đặc biệt loại 3
 public Address(Address addr) {
  this(addr.getcityName(), addr.districtName(), addr.getstreetName());
 }

 // Getter methods - 3
 public String getcityName() {
  return this.cityName;
 }

 public String districtName() {
  return this.districtName;
 }

 public String getstreetName() {
  return this.streetName;
 }

 // Setter methods - 4
 public Address setcityName(String cityName) {
  this.cityName = cityName;
  return this;
 }

 public Address setdictrictName(String districtName) {
  this.districtName = districtName;
  return this;
 }

 public Address setstreetName(String streetName) {
  this.streetName = streetName;
  return this;
 }

 // Other method -5

 public String toString() {
  return this.streetName + " " + districtName + ", " + cityName;
 }

 public static int countAddress() {
  return Address.count;
 }

 protected void finalize() throws Throwable {

  Address.count--;

 }

 public static void main(String[] args) {

  Address a;
  Address add = new Address("Ha Noi", "Bac Tu Liem", "Pho Nhon");
  Address a1 = new Address("Bac Giang", "Yen The", "Canh Nau");
  System.out.println(add);
 }

}