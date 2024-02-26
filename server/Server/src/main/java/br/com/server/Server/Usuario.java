package br.com.server.Server;

import org.springframework.boot.SpringApplication;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "users")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_user")
    private Integer ID_user;

    @Column(name = "Username", length = 255, nullable = true)
    private String username;

    @Column(name = "Email", length = 255, nullable = true)
    private String Email;

    @Column(name = "Password", length = 32, nullable = true)
    private String Password;

    @Column(name = "Birth_date", columnDefinition = "DATE", nullable = true)
    private String Birth_date;

    @Column(name = "Telephone", length = 45, nullable = true)
    private String Telephone;

    @Column(name = "Sex", length = 15, nullable = true)
    private String Sex;

    @Column(name = "Address", length = 100, nullable = true)
    private String Address;

    @Column(name = "Unit", length = 100, nullable = true)
    private String Unit;

    @Column(name = "Instructor", length = 45, nullable = true)
    private String Instructor;

    @Column(name = "Height", columnDefinition = "INT", nullable = true)
    private String Height;

    @Column(name = "Weight", columnDefinition = "INT", nullable = true)
    private String Weight;

    @Column(name = "Plan", length = 45, nullable = true)
    private String Plan;


    public Integer getID(){
        return ID_user;
    }

    public void setID(Integer ID_user){
        this.ID_user = ID_user;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String Username){
        this.username = Username;
    }

    public String getEmail(){
        return Email;
    }

    public void setEmail(String Email){
        this.Email = Email;
    }

    public String getPassword(){
        return Password;
    }

    public void setPassword(String Password){
        this.Password = Password;
    }

    public String getBirth_date(){
        return Birth_date;
    }

    public void setBirth_date(String Birth_date){
        this.Birth_date = Birth_date;
    }

    public String getTelephone(){
        return Telephone;
    }

    public void setTelephone(String Telephone){
        this.Telephone = Telephone;
    }

    public String getSex(){
        return Sex;
    }

    public void setSex(String Sex){
        this.Sex = Sex;
    }

    public String getAddress(){
        return Address;
    }

    public void setAddress(String Address){
        this.Address = Address;
    }

    public String getUnit(){
        return Unit;
    }

    public void setUnit(String Unit){
        this.Unit = Unit;
    }

    public String getInstructor(){
        return Instructor;
    }

    public void setInstructor(String Instructor){
        this.Instructor = Instructor;
    }

    public String getHeight(){
        return Height;
    }

    public void setHeight(String Height){
        this.Height = Height;
    }

    public String getWeight(){
        return Weight;
    }

    public void setWeight(String Weight){
        this.Weight = Weight;
    }

    public String getPlan(){
        return Plan;
    }

    public void setPlan(String Plan){
        this.Plan = Plan;
    }

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}
