package stringUtil

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StringUtilTest {


    @Test
    fun `deve remover acentos do nome`() {
        // cenario

        val name = "Wágnér de límâ Bragão"

        // ação

        // assertivas
        Assertions.assertEquals("Wagner de lima Bragao", StringUtil.removeAccent(name) )
    }

    @Test
    fun `deve remover caracter ' especial do nome`() {
        // cenario

        val name = "W'agner de lima Braga"

        // ação

        // assertivas
        Assertions.assertEquals("Wagner de lima Braga", StringUtil.removeAccent(name) )
    }

    @Test
    fun `deve remover espaco em branco no inicio do nome`() {
        // cenario

        val name = " Wagner de Lima Braga Silva"

        // ação

        // assertivas
        Assertions.assertEquals("Wagner de Lima Braga Silva", StringUtil.removeWhiteSpace(name) )
    }

    @Test
    fun `deve remover espaco em branco no fim do nome`() {
        // cenario

        val name = "Wagner de Lima Braga Silva "

        // ação

        // assertivas
        Assertions.assertEquals("Wagner de Lima Braga Silva", StringUtil.removeWhiteSpace(name) )
    }

    @Test
    fun `deve formatar o nome, deixando com a primeira letra maiuscula`() {
        // cenario

        val name = "wagner de lima braga silva"

        // ação

        // assertivas
        Assertions.assertEquals("Wagner De Lima Braga Silva", StringUtil.capitalizeFirstLetter(name) )
    }

    @Test
    fun `deve validar o nome, se o nome conter caracter especial deve retornar true`() {
        // cenario

        val name = "wagn-er de lima braga silva"

        // ação

        // assertivas
        Assertions.assertEquals(true, StringUtil.specialCharacterValidator(name) )
    }

    @Test
    fun `deve validar o nome, se o nome nao conter caracter especial deve retornar false`() {
        // cenario

        val name = "wagner de lima braga silva"

        // ação

        // assertivas
        Assertions.assertEquals(false, StringUtil.specialCharacterValidator(name) )
    }
}