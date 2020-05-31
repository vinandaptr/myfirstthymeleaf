//package com.vinan.myfirstthymeleaf.controller.restapi;
//
////import java.text.DateFormat;
////import java.text.ParseException;
////import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.vinan.myfirstthymeleaf.model.Form;
//
//@RestController
//@RequestMapping("/api/form")
//public class ApiForm {
//
//	private Date dateFromLocalDate(String birthday) {
//		final String myPattern = "yyyy-MM-dd";
//		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(myPattern);
//		LocalDate localDate = LocalDate.parse(birthday, dateTimeFormatter);
//
//		return java.sql.Date.valueOf(localDate);
//	}
//
//	@GetMapping()
//	public Form getForm() {
////		String[] hobbyArr = new String[4];
////		hobbyArr[1] = "Reading";
////		hobbyArr[2] = "Swimming";
////		hobbyArr[3] = "Traveling";
////		hobbyArr[4] = "Eating";
//
//		Form form = new Form();
//		form.setfName("Vinanda");
//		form.setlName("Putritama");
//		form.setEmail("vin@gmail.com");
//		form.setPhone("081234567890");
//		form.setAddress("Jakarta");
//		form.setBirthday(dateFromLocalDate("1997-11-15"));
//		form.setIdCard("3674000000000000");
//		form.setUniv("UI");
//		form.setMajor("Fis");
//		form.setGpa(4);
//		form.setCover("abcdefghijklmno");
//		form.setHobby("Reading");
//		form.setGender("Female");
//		form.setReligion("Other");
//
//		return form;
//	}
//
//	@GetMapping("/all")
//	public List<Form> getAllForm() {
//		List<Form> formList = new ArrayList<>();
//		Form f = new Form();
//		f.setfName("Vinanda");
//	    f.setlName("Putritama");
//	    f.setEmail("vin@gmail.com");
//	    f.setPhone("081234567890");
//		f.setAddress("Jakarta");
//		f.setBirthday(dateFromLocalDate("1997-11-15"));
//		f.setIdCard("3674000000000000");
//		f.setUniv("UI");
//		f.setMajor("Fis");
//		f.setGpa(4);
//		f.setCover("abcdefghijklmno");
//		formList.add(f);
//
//		return formList;
//	}
//}
////String bday = "11-15-1997";
////DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
////try {
////	form.setBirthday(df.parse(bday));
////} catch (ParseException e) {
////	e.printStackTrace();
////}
