package Atividade2;

public class Main {

	public static void main(String[] args) {
		
		Professor professor1 = new Professor();
		professor1.setNome("Pedro");
		professor1.setCpf("00099990999");
		professor1.setEmail("pedroprof@gmail.com");
			Endereco endereco = new Endereco("Brasilia", "Distrito federal", "Rua 33 Sul - Aguas Claras");
		professor1.setEndereco(endereco);
		professor1.setTitulacao("Titulação");
		professor1.setSalario(1500.00);
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Rafael Santos");
		aluno1.setCpf("99900090923");
		aluno1.setEmail("rafastudent@gmail.com");
		aluno1.setNotas(10.00);
		
		Curso curso1 = new Curso();
		curso1.setNome("ADS");
		curso1.addProfessores(professor1);
		aluno1.setCurso(curso1);
		
		Curso curso2 = new Curso();
		curso2.setNome("Engenharia de Software");
		curso2.addProfessores(professor1);
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setNome("Engenharia de Requisitos");
		disciplina1.setHorario("Terça/Quinta");
		
		professor1.setDisciplina(disciplina1);
		aluno1.addDisciplinas(disciplina1);
		curso1.addDisciplinas(disciplina1);
		curso2.addDisciplinas(disciplina1);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setNome("POO com Java");
		disciplina2.setHorario("Segunda/quarta");
		
		aluno1.addDisciplinas(disciplina2);
		curso1.addDisciplinas(disciplina2);
		curso2.addDisciplinas(disciplina2);
		
		professor1.addCursos(curso1);
		professor1.addCursos(curso2);
		
		professor1.imprimir();
		aluno1.imprimir();
		curso1.imprimir();
		curso2.imprimir();
		
	}

}
