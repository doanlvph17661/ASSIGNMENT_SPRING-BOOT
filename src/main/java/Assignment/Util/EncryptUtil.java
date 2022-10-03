package Assignment.Util;

import org.mindrot.jbcrypt.BCrypt;

public class EncryptUtil {
   public static String hash(String origin) {
	   String salt=BCrypt.gensalt();
	    return BCrypt.hashpw(origin, salt);
   }
   
   public static boolean verify(String origin,String encryted) {
	   return BCrypt.checkpw(origin, encryted);
   }
}
