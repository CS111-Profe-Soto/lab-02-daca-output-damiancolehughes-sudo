/**
 * Identification Generator
 * @author Damian Hughes
 */
public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String surname;
		String givenname;
		String usciscatcard;
		String cob;
		String tac;
		String dob;
		String vf;
		String vt;
		//INPUT SECTION
		surname = "SPECIMEN";
		givenname = "TESTV";
		usciscatcard = "000-000-725    C09        SRC0000000725";
		cob = "Ethiopia";
		tac = "None";
		dob = "01 Jan 1920     M";
		vf = "01/01/80";
		vt = "5/10/11";
		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       " + surname + " ");
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )   " + givenname + " ");
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          " + usciscatcard + " ");
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      " + cob + " ");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /       " + tac + " ");
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         " + dob + " ");
		System.out.println("║                       Valid From:     " + vf + "");
		System.out.println("║                       Card Expires:   " + vt + "");
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}
