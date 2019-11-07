package ua.nure.ITKN177AnastasyaMinenko;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class User implements Serializable {
	/**
	 * 
	 */
 private static final long serialVersionUID = 2084719897569752425L;
	
 private Long id;
 private String firstName;
 private String lastName;
 private Date dateofBirth;
 
 public Long getId() {
  return id;
 }
 public void setId(Long id) {
  this.id = id;
 }
 public String getFirstName() {
  return firstName;
 }
 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }
 public String getLastName() {
  return lastName;
 }
 public void setLastName(String lastName) {
  this.lastName = lastName;
 }
 public Date getDateofBirth() {
  return dateofBirth;
 }
 public void setDateofBirth(Date dateofBirth) {
  this.dateofBirth = dateofBirth;
 }
 public String getFullName() {
  return getLastName()+", "+getFirstName();
 }
 public int getAge() {
     Calendar calendar = Calendar.getInstance();
     calendar.setTime(new Date());
     int currentYear = calendar.get(Calendar.YEAR);
     int currentMonth = calendar.get(Calendar.MONTH);
     int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
     calendar.setTime(getDateofBirth());
     int year = calendar.get(Calendar.YEAR);
     int month = calendar.get(Calendar.MONTH);
     int day = calendar.get(Calendar.DAY_OF_MONTH);

     int age = currentYear - year - 1;
     if ( (currentMonth > month) || (currentMonth == month && currentDay >= day))
         age++; 
     return age;
 }
}