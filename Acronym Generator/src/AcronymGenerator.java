import java.util.Arrays;

/**
 * In nearly every company each employee has a certain acronym containing the
 * first characters of his first and last name(s).
 * Your task is to write an acronym generator which generates an acronym for a
 * given name. You don't have to care about duplicate acronyms (someone else
 * will do this for you). Note that names can be given in upper or in lower
 * case. The acronym shall always be upper case.
 * Normally the acronym is always the first letter of your first and the first
 * letter of the last name in upper case.
 * For example:
 * Thomas Meyer => TM
 * martin schmidt => MS
 * In your company there work only people with a maxinmum of two first names. If
 * a person has two first names, they might be joined with a dash.
 * Jan-Erich Schmidt => JES Jan Erich Mueller => JEM
 * Last names may also be joined with a dash. No one can have more than two last
 * names.
 * Paul Meyer-Schmidt
 * In Germany, there are last names which have the leading word "von". This
 * shall be abbreviated with a lower case "v":
 * Paul von Lahnstein => PvL
 * Martin von Lahnstein-Meyer => MvLM
 */



public class AcronymGenerator {

	public static String createAcronym(String lastName, String firstName) {
		
		String result = "";
		String[] ln = lastName.split("[\\-\\ ]");
		String[] fn = firstName.split("[\\-\\ ]");
		for (String first : fn) {
			result += Character.toUpperCase(first.charAt(0));
		}
		for (String last : ln) {
			if (last.toLowerCase().equals("von")) {
				result += Character.toLowerCase(last.charAt(0));
			} else
				result += Character.toUpperCase(last.charAt(0));
		}

		return result;
	}
	
	public static void main(String[] args) {
		
//		System.out.println(createAcronym("Mueller","Jan Erich"));// -> 
//		System.out.println(createAcronym("Schmidt","Jan-Erich"));
//		System.out.println(createAcronym("von Lahnstein","Peter"));
//		System.out.println(createAcronym("Meyer","Thomas"));
//		System.out.println(createAcronym("Meyer-Schmidt","Paul"));
//		System.out.println(createAcronym("VON MEYER-ZAHN","Peter"));
//		System.out.println(createAcronym("von Lahnstein-Meyer","Peter"));
//		System.out.println(createAcronym("schmidt","martin"));
//		System.out.println(createAcronym("meyer-zahn","Peter"));
		
	}
	
	
//	public class AcronymGenerator {
//
//	    public static String createAcronym(String lastName, String firstName) {
//	        Function<String, String> acronymize = name -> Arrays.stream(name.split("[ -]"))
//	                .map(s -> s.matches("(?i:von)") ? s.toLowerCase() : s.toUpperCase())
//	                .map(s -> String.valueOf(s.charAt(0)))
//	                .collect(Collectors.joining());
//	        return Stream.of(firstName, lastName)
//	                .map(acronymize)
//	                .collect(Collectors.joining());
//	    }
//	}
}
