package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
public	WebDriver driver;
	//Test data
	public String url   ="http://183.82.103.245/nareshit/login.php";
	public String un    ="nareshit";
	public String pw    ="nareshit";
	public String firstname ="kanchana";
	public String middlename="nanda kumar";
	public String lastname  ="reddy";
	public String nickname  ="nandu";
	public String file_photo="C:\\image4.jpg";
	
	
	//Object/elements
	public String txt_login    ="txtUserName";
	public String txt_password ="txtPassword";
	public String btn_login    ="Submit";
	public String logout_link  ="Logout";
	
	//add emp
	public String frame        ="rightMenu";
	public String btn_add      ="//input[@value='Add']";
	public String first_txt    ="txtEmpFirstName";
	public String middle_txt   ="txtEmpMiddleName";
	public String last_txt     ="txtEmpLastName";
	public String nick_txt     ="txtEmpNickName";
	public String file         ="photofile";
	public String save_btn     ="btnEdit";
	public String edit_btn     ="EditMain";
	public String save_btn1     ="EditMain";

}
