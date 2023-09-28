package com.sbi;

import in.vision.security.PwdSecurityService;

public class UserRegistation {
   public static void main(String args [])
   {
	   PwdSecurityService pss = new PwdSecurityService();
	   String encode = pss.encord("chinu");
	   System.out.println(encode);
   }
}
