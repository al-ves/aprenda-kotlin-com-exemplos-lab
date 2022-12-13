enum class Nivel { BÁSICO, INTERMEDIÁRIO, AVANÇADO }

data class Usuario(val nome: String, val email: String, val id: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 0, val nivel: Nivel = Nivel.BÁSICO)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel = Nivel.BÁSICO) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    // Cria algumas instâncias de ConteudoEducacional
    val cursoKotlin = ConteudoEducacional("Introdução ao Kotlin", 60)
    val cursoJava = ConteudoEducacional("Introdução ao Java", 120)
    val cursoPython = ConteudoEducacional("Introdução ao Python", 180)
    
    // Cria uma instância de Formacao
    val formacao = Formacao("Programação", listOf(cursoKotlin, cursoJava, cursoPython))
    
    // Cria algumas instâncias de Usuario
    val usuario1 = Usuario("João", "joao@email.com", 1)
    val usuario2 = Usuario("Maria", "maria@email.com", 2)
    val usuario3 = Usuario("José", "jose@email.com", 3)
    
    // Matricula os usuários na formação
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.matricular(usuario3)

	// Testa a adição de usuários na lista de inscritos
	println("Testando adição de usuários na lista de inscritos:")
	println("Número de inscritos: ${formacao.inscritos.size}")
	println()

	// Testa a propriedade "nome" do objeto ConteudoEducacional
	println("Testando propriedade 'nome' do objeto ConteudoEducacional:")
	println("Nome do curso de Kotlin: ${cursoKotlin.nome}")
	println()

	// Testa a propriedade "duracao" do objeto ConteudoEducacional
	println("Testando propriedade 'duracao' do objeto ConteudoEducacional:")
	println("Duração do curso de Python: ${cursoPython.duracao} minutos")
	println()

	// Testa a propriedade "nivel" do objeto ConteudoEducacional
	println("Testando propriedade 'nivel' do objeto ConteudoEducacional:")
	println("Nível do curso de Java: ${cursoJava.nivel}")
	println()

	// Testa a propriedade "nome" do objeto Formacao
	println("Testando propriedade 'nome' do objeto Formacao:")
	println("Nome da formação: ${formacao.nome}")
	println()

	// Testa a propriedade "conteudos" do objeto Formacao
	println("Testando propriedade 'conteudos' do objeto Formacao:")
	println("Conteúdos da formação: ${formacao.conteudos.map { it.nome }}")
	println()

	// Testa a propriedade "nivel" do objeto Formacao
	println("Testando propriedade 'nivel' do objeto Formacao:")
	println("Nível da formação: ${formacao.nivel}")
	println()
}
