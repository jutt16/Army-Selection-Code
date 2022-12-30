/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.softwareconstruction1;
import java.util.*;

class Candidate
{
    private String name;
    private int age;
    private int CNIC;
    private String Qualification;
    Candidate(){
        name="none";
        age=0;
        CNIC=0;
        Qualification="none";
    }
    public void apply()
    {
        System.out.println("Apply for(1/2)");
        System.out.println(availablePosts());
    }
    public String availablePosts()
    {
        return "Soldier Recruitment\nPMA Long Course";
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public int getCNIC()
    {
        return CNIC;
    }
    public String getQualification()
    {
        return Qualification;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setCNIC(int CNIC)
    {
        this.CNIC=CNIC;
    }
    public void setQualification(String Qualification)
    {
        this.Qualification=Qualification;
    }
}
abstract class Posts
{
    protected Candidate candidate=new Candidate();
    Posts()
    {
        //Constructor
    }
    Posts(Candidate candidate)
    {
        this.candidate=candidate;
    }
    public abstract boolean CheckEligibility();
}
class SoldierRecruitment extends Posts
{
    SoldierRecruitment()
    {
        super();
    }
    SoldierRecruitment(Candidate candidate)
    {
        super(candidate);
    }
    @Override
    public boolean CheckEligibility()
    {
        return candidate.getAge()<22 && candidate.getQualification().equals("Matric");
    }    
}
class PmaLongCourse extends Posts
{
    PmaLongCourse()
    {
        super();
    }
    PmaLongCourse(Candidate candidate)
    {
        super(candidate);
    }
    public boolean CheckEligibility()
    {
        return candidate.getAge()<22 && candidate.getQualification().equals("FSC");
    }    
}
class Applicant
{
    private String ID;
    private String password;
    Applicant()
    {
        ID="Applicant";
        password="applicant";
    }
    public void changePassword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter old password:");
        if(sc.next().equals(password))
        {
            System.out.println("Enter new password");
            password=sc.next();
        }
        else
        {
            System.out.println("Wrong Password!");
        }
    }
    public void Applyfor()
    {
        System.out.println("Which post you want to apply for?\nEnter:\n\t1for Soldier Recruitment\n\t2 for PMA Long Course");
        Scanner sc=new Scanner(System.in);
        switch(sc.nextInt())
        {
            case 1 -> {
                Posts p=new SoldierRecruitment();
            }
            case 2 -> {
                Posts p=new PmaLongCourse();
            }
            default -> {
                System.out.println("Invalid Option!");
                return;
            }
        }
        
    }
}
class Criteria
{
    private String Qualification;
    private int height;
    private int weight;
    private int eyesight;
    private int chest;
    Criteria()
    {
        Qualification="none";
        height=0;
        weight=0;
        eyesight=0;
        chest=0;
    }
    public void setQualification(String Qualification)
    {
        this.Qualification=Qualification;
    }
    public void setHeight(int height)
    {
        this.height=height;
    }
    public void setWeight(int weight)
    {
        this.weight=weight;
    }
    public void setEyesight(int eyesight)
    {
        this.eyesight=eyesight;
    }
    public void setChest(int chest)
    {
        this.chest=chest;
    }
    public String getQualification()
    {
        return Qualification;
    }
    public int getHeight()
    {
        return height;
    }
    public int getWeight()
    {
        return weight;
    }
    public int getEyesight()
    {
        return eyesight;
    }
    public int getChest()
    {
        return chest;
    }
}
class Admin
{
    private String Name="Admin";
    private String password="12345678";
    Criteria SoldierCriteria=new Criteria();
    Criteria pmaLongCriteria=new Criteria();
    Admin()
    {
        //constructor
    }
    public void  changePassword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter old password:");
        if(sc.next().equals(password))
        {
            System.out.println("Enter new password");
            password=sc.next();
        }
        else
        {
            System.out.println("Wrong Password!");
        }
    }
    public void setSoldierCriteria()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Criteria for Soldier(Qualification, height, weight, eyesight, chest");
        System.out.println("Enter required Qualification:");
        SoldierCriteria.setQualification(sc.next());
        System.out.println("Enter required height:");
        SoldierCriteria.setHeight(sc.nextInt());
        System.out.println("Enter required weight:");
        SoldierCriteria.setWeight(sc.nextInt());
        System.out.println("Enter required Eye Sight:");
        SoldierCriteria.setEyesight(sc.nextInt());
        System.out.println("Enter required chest size:");
        SoldierCriteria.setChest(sc.nextInt());
    }
    public void SetPmaLongCriteria()
    {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter Criteria for PMA Long(Qualification, height, weight, eyesight, chest");
        System.out.println("Enter required Qualification:");
        pmaLongCriteria.setQualification(sc.next());
        System.out.println("Enter required height:");
        pmaLongCriteria.setHeight(sc.nextInt());
        System.out.println("Enter required weight:");
        pmaLongCriteria.setWeight(sc.nextInt());
        System.out.println("Enter required Eye Sight:");
        pmaLongCriteria.setEyesight(sc.nextInt());
        System.out.println("Enter required chest size:");
        pmaLongCriteria.setChest(sc.nextInt());   
    }
    public Criteria getSoldierCriteria()
    {
        return SoldierCriteria;
    }
    public Criteria getPmaLongCriteria()
    {
        return pmaLongCriteria;
    }
}
class ITGDirMan
{
    private String Name="ITGDM";
    private String password="12345678";
    Criteria SoldierCriteria=new Criteria();
    Criteria pmaLongCriteria=new Criteria();
    ITGDirMan()
    {
        //constructor
    }
    public void  changePassword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter old password:");
        if(sc.next().equals(password))
        {
            System.out.println("Enter new password");
            password=sc.next();
        }
        else
        {
            System.out.println("Wrong Password!");
        }
    }
    public void setSoldierCriteria()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Criteria for Soldier(Qualification, height, weight, eyesight, chest");
        System.out.println("Enter required Qualification:");
        SoldierCriteria.setQualification(sc.next());
        System.out.println("Enter required height:");
        SoldierCriteria.setHeight(sc.nextInt());
        System.out.println("Enter required weight:");
        SoldierCriteria.setWeight(sc.nextInt());
        System.out.println("Enter required Eye Sight:");
        SoldierCriteria.setEyesight(sc.nextInt());
        System.out.println("Enter required chest size:");
        SoldierCriteria.setChest(sc.nextInt());
    }
    public void SetPmaLongCriteria()
    {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter Criteria for PMA Long(Qualification, height, weight, eyesight, chest");
        System.out.println("Enter required Qualification:");
        pmaLongCriteria.setQualification(sc.next());
        System.out.println("Enter required height:");
        pmaLongCriteria.setHeight(sc.nextInt());
        System.out.println("Enter required weight:");
        pmaLongCriteria.setWeight(sc.nextInt());
        System.out.println("Enter required Eye Sight:");
        pmaLongCriteria.setEyesight(sc.nextInt());
        System.out.println("Enter required chest size:");
        pmaLongCriteria.setChest(sc.nextInt());   
    }
    public Criteria getSoldierCriteria()
    {
        return SoldierCriteria;
    }
    public Criteria getPmaLongCriteria()
    {
        return pmaLongCriteria;
    }
    public List<Applicant> ShortListApplicants()
    {
        List<Applicant> list=new ArrayList<>();
        return list;
    }
}
class Login
{
    private String userName;
    private String password;
    Login()
    {
        userName="none";
        password="none";
    }
    public void Register(String userName, String password)
    {
        this.userName=userName;
        this.password=password;
    }
}
/**
 *
 * @author Shahid
 */
public class SoftwareConstruction1 {

    public static void main(String[] args) {
        System.out.println("Main Code canbe written as required!");
    }
}
