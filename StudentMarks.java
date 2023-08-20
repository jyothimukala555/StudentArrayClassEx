package com.java;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StudentMarks {

	private int[] marks;
	private String name;

	
	  public StudentMarks(String name,int[] marks) {
		  this.setName(name);
	      this.marks=marks;
	  }
	 
	/*
	 * public StudentMarks(String name, int... marks) {
	 *  this.setName(name);
	 * this.marks = marks;
	 *  }
	 */

	public static void main(String[] args) {
		// int [] marks = {97,98,100};//{1,2,3,4,5,6,7,8,9}
		// StudentMarks studentMarks = new StudentMarks("Jyothi",marks});
		StudentMarks studentMarks = new StudentMarks("Jyothi", new int[] { 5, 3, 4, 7 });

		/*
		 * StudentMarks studentMarks1 = new StudentMarks("Jyothi",95,35,63,43);
		 * StudentMarks studentMarks2 = new StudentMarks("Anusha",76,34,57);
		 * StudentMarks studentMarks3 = new StudentMarks("Reshma",56,78,98,34,57,88,96);
		 * StudentMarks studentMarks4 = new StudentMarks("Srujana",97,96,55);
		 * System.out.println("Marks1 MaximumMarks : "+
		 * studentMarks1.getMaximumMarks());
		 * System.out.println("Marks2 MinimumMarks : "+
		 * studentMarks2.getMinimumMarks());
		 * System.out.println("Marks3 NumberOfMarks : "+
		 * studentMarks3.getNumberOfMarks()); System.out.println("Marks4 SumOfMarks : "+
		 * studentMarks4.getSumOfMarks());
		 * 
		 */

		int number = studentMarks.getNumberOfMarks();
		System.out.println("Number of Marks : " + number);
		int sum = studentMarks.getSumOfMarks();
		System.out.println("Sum of Marks : " + sum);
		int maximumMarks = studentMarks.getMaximumMarks();
		System.out.println("Maximum marks obtained : " + maximumMarks);
		int minimumMarks = studentMarks.getMinimumMarks();
		System.out.println("Minimum marks obtained : " + minimumMarks);
		BigDecimal average = studentMarks.getAverageMarks();
		System.out.println("Average marks obtained : " + average);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfMarks() {
		return marks.length;
	}

	public int getSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}
		return sum;
	}

	public int getMaximumMarks() {
		int maximum = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > maximum) {
				maximum = mark;
			}
		}
		return maximum;
	}

	public int getMinimumMarks() {
		int minimum = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < minimum) {
				minimum = mark;
			}
		}
		return minimum;
	}

	public BigDecimal getAverageMarks() {
		int sum = getSumOfMarks();
		int number = getNumberOfMarks();
		// return new BigDecimal(sum/number);
		// return new BigDecimal(sum).divide(new BigDecimal(number);
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
		/*
		 * gives Exception in thread "main" java.lang.ArithmeticException:
		 * Non-terminating decimal expansion; no exact representable decimal result.
		 * 98.6666666666666666 precision (3) // 98.667 98.3335 rounding
		 * mode(UP/down)--Down-98.333;up-98.334
		 */ }

}
