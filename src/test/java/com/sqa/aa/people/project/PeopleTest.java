/**
 *   File Name: PeopleTest.java<br>
 *
 *   Antonyan, Anna<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jan 30, 2016
 *   
 */

package com.sqa.aa.people.project;

import org.junit.Test;

/**
 * PeopleTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class PeopleTest {

	@Test
	public void test() {
		Person aa = new Person("Anna Antonyan", 30, "1800 Woodside rd", "QA");
		Person ab = new Person("Ann Antony", 30, "224 Woodside rd", "Realtor");
		Person ac = new Person("Annan", 76, "10 Woodside rd", "doctor");
		//
		Person[] people = new Person[] { aa, ab, ac };
		//
		for (Person p : people) {
			System.out.println("Person details: " + p);
			System.out.println("Person does work: " + p);
			System.out.println("Person sleeps: " + p);
			System.out.println("Person moves: " + p);
		}
	}

}
