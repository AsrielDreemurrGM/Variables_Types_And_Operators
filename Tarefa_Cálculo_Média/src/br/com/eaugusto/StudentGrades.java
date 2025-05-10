package br.com.eaugusto;

public class StudentGrades {
	private String studentName;
	
	private double totalScore;
	private boolean isEverythingCorrect;
	
	private int grade1;
	private int grade2;
	private int grade3;
	private int grade4;
	
	public StudentGrades() {
		isEverythingCorrect = false;
		studentName = "";
		totalScore = 0;
		setGrade1(0);
		setGrade2(0);
		setGrade3(0);
		setGrade4(0);
	}
	
	public void setGradesAndTotalScore(int grade1, int grade2, int grade3, int grade4) {
		this.totalScore = grade1 + grade2 + grade3 + grade4;
		if (this.totalScore >= 0 && this.totalScore <= 50) {
			this.setGrade1(grade1);
			this.setGrade2(grade2);
			this.setGrade3(grade3);
			this.setGrade4(grade4);
			this.isEverythingCorrect = true;
			System.out.println("Notas definidas com sucesso");
		} else {
			this.isEverythingCorrect = false;
			System.out.println("A soma das notas não pode ser maior que 50 pontos ou menor que zero.");
		}
	}
	
	public void calculateFinalGrade() {
		if (!isEverythingCorrect) {
			System.out.println("Por favor, corrija as notas do aluno(a): " + this.studentName);
		return;
		}
		
		double average = this.totalScore / 4;
		
		System.out.println("Aluno(a): " + getStudentName());
		System.out.println("Média: " + average);
		
		if (average < 5) {
			System.out.println("Status: Reprovado");
		} else if (average < 7) {
			System.out.println("Status: Em Recuperação");
		} else {
			System.out.println("Status: Aprovado");
		}
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade4() {
		return grade4;
	}

	private void setGrade4(int grade4) {
		this.grade4 = grade4;
	}

	public int getGrade3() {
		return grade3;
	}

	private void setGrade3(int grade3) {
		this.grade3 = grade3;
	}

	public int getGrade2() {
		return grade2;
	}

	private void setGrade2(int grade2) {
		this.grade2 = grade2;
	}

	public int getGrade1() {
		return grade1;
	}

	private void setGrade1(int grade1) {
		this.grade1 = grade1;
	}
}
