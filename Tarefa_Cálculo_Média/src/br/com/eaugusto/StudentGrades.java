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
		grade1 = 0;
		grade2 = 0;
		grade3 = 0;
		grade4 = 0;
	}
	
	public void setGradesAndTotalScore(int grade1, int grade2, int grade3, int grade4) {
		this.totalScore = grade1 + grade2 + grade3 + grade4;
		if (this.totalScore >= 0 && this.totalScore <= 50) {
			this.grade1 = grade1;
			this.grade2 = grade2;
			this.grade3 = grade3;
			this.grade4 = grade4;
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
}
