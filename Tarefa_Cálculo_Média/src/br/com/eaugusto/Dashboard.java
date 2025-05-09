package br.com.eaugusto;

public class Dashboard {

	public static void main(String[] args) {
		
		System.out.println("A média é 7 - Mínimo de 24 pontos para passar.");
		
		System.out.println("---------------------------------");
		
		StudentGrades firstStudent = new StudentGrades();
		
		firstStudent.setStudentName("Eduardo");
		firstStudent.setGradesAndTotalScore(6, 6, 10, 8);
		
		firstStudent.calculateFinalGrade();
		
		System.out.println("---------------------------------");
		
		StudentGrades secondStudent = new StudentGrades();
		
		secondStudent.setStudentName("Augusto");
		secondStudent.setGradesAndTotalScore(5, 4, 7, 9);
		
		secondStudent.calculateFinalGrade();
		
		System.out.println("---------------------------------");
		
		StudentGrades thirdStudent = new StudentGrades();
		
		thirdStudent.setStudentName("Maria");
		thirdStudent.setGradesAndTotalScore(5, 4, 4, 6);
		
		thirdStudent.calculateFinalGrade();
		
		System.out.println("---------------------------------");
		
		StudentGrades errorStudent = new StudentGrades();
		
		errorStudent.setStudentName("Rosa");
		errorStudent.setGradesAndTotalScore(50, 4, 4, 6);
		
		errorStudent.calculateFinalGrade();
		
	}

}
