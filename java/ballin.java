public class ballin {
     private static int COUNT = 1;
     int id;
     private String firstname;
     private String lastname;
     private String dob;
     private String email;
     private String phoneNumber;
     private int points;

     public String getfirstname(){
          return firstname;
     }
     public void setfirstname(String fNameIn){
          firstname = fNameIn;
     }
     
     public String getlastname(){
          return lastname;
     }
     public void setlastname(String lNameIn){
          lastname = lNameIn;
     }

     public String getdob(){
          return dob;
     }
     public void setdob(String dobIn){
          dob = dobIn;
     }

     public String getemail(){
          return email;
     }
     public void setemail(String emailIn){
          email = emailIn;
     }

     public String getphoneNumber(){
          return phoneNumber;
     }
     public void setphoneNumber(String phoneNumberIn){
          phoneNumber = phoneNumberIn;
     }

     public Integer getpoints(){
          return points;
     }
     public void setpoints(Integer pointsIn){
          points = pointsIn;
     }
}
