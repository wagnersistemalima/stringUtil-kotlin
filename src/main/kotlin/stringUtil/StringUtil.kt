package stringUtil

import java.text.Normalizer

class StringUtil {

    companion object {

        private val regexUnaccent = "\\p{InCOMBINING_DIACRITICAL_MARKS}+".toRegex()

        // função para remover acentos do nome

        fun removeAccent(name: String): String {
            val normalizer = Normalizer.normalize(name, Normalizer.Form.NFD)
            val formattedName = regexUnaccent.replace(normalizer, "")

            return if (formattedName.contains("'")) {
                formattedName.replace("'", "")
            } else {
                formattedName
            }
        }

        // função para remover espaços em branco no inicio e no fim do nome

        fun removeWhiteSpace(name: String): String {
            return name.trim()
        }

        // função para formatar o nome, deixando o nome com a primeira letra maiuscula

        fun capitalizeFirstLetter(name: String): String {
            return name.split(" ")
                .joinToString(separator = " ") {letra -> letra.replaceFirstChar { it.uppercase() }}
        }

        // função para validar o nome, se o nome conter caracter especial retorna true

        fun specialCharacterValidator(name: String): Boolean {
            val listName = name.splitToSequence(" ").toMutableList()
            for(sentence in listName) {
                if (!sentence.all { it.isLetter() }) return true
            }
            return false
        }
    }
}
