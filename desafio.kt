// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria", StatusUsuario.INATIVO)

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 45, TipoConteudo.VIDEO)
    val conteudo2 = ConteudoEducacional("Programação Funcional", 60, TipoConteudo.ARTIGO)

    val formacao1 = Formacao("Desenvolvimento Android")
    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)
    formacao1.adicionarConteudo(conteudo1)
    formacao1.adicionarConteudo(conteudo2)

    println("Usuários matriculados na formação: ${formacao1.inscritos}")
    println("Conteúdos da formação: ${formacao1.conteudos}")
        formacao1.removerConteudo(conteudo1)
    usuario1.status = StatusUsuario.INATIVO
}
