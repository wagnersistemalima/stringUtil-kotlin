package constant

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DateConverterUtilTest {

    @Test
    fun `deve formatar a data, quando receber uma data nesse formato yyyy-MM-dd HH-mm para este yyyy-MM-dd HH-mm-ss`() {
        val date = "2022-01-12T08:39"

        val expectedDate = DateConverterUtil.converterDate(date)

        Assertions.assertEquals(expectedDate, DateConverterUtil.converterDate(date))
        Assertions.assertEquals("2022-01-12T08:39:01", expectedDate.toString())
    }

    @Test
    fun `deve formatar a data, quando receber nesse formato yyyy-MM-dd HH-mmZ para esse padao yyyy-MM-dd HH-mm-ss`() {
        val date = "2022-01-12T08:39Z"

        val expectedDate = DateConverterUtil.converterDate(date)

        Assertions.assertEquals(expectedDate, DateConverterUtil.converterDate(date))
        Assertions.assertEquals("2022-01-12T08:39:01", expectedDate.toString())
    }

    @Test
    fun `deve formatar a data, quando receber nesse formato yyyy-MM-dd HH-mm-ss-SSSZ para esse padrao yyyy-MM-dd HH-mm-ss`() {
        val dateIso8601 = "2021-12-15T06:00:47.995Z"
        val expectedDate = DateConverterUtil.converterDate(dateIso8601)

        Assertions.assertEquals(expectedDate, DateConverterUtil.converterDate(dateIso8601))
        Assertions.assertEquals("2021-12-15T06:00:47", expectedDate.toString())
    }

    @Test
    fun `deve formatar a data, quando receber nesse formato yyyy-MM-dd HH-mm-ss-SSS para esse padrao yyyy-MM-dd HH-mm-ss`() {
        val date = "2021-12-15T06:00:47.995"
        val expectedDate = DateConverterUtil.converterDate(date)
        Assertions.assertEquals(expectedDate, DateConverterUtil.converterDate(date))
        Assertions.assertEquals("2021-12-15T06:00:47", expectedDate.toString())
    }

    @Test
    fun `deve formatar a data, quando receber nesse formato yyyy-MM-dd HH-mm-ss-SSS-time zone para esse padrão yyyy-MM-dd HH-mm-ss`() {
        val date = "2021-12-15T06:00:47.995-03:00"
        val expectedDate = DateConverterUtil.converterDate(date)

        Assertions.assertEquals(expectedDate, DateConverterUtil.converterDate(date))
        Assertions.assertEquals("2021-12-15T06:00:47", expectedDate.toString())
    }

    @Test
    fun `deve formatar a data, quando receber nesse formato yyyy-MM-dd HH-mm-ss para esse padrao yyyy-MM-dd HH-mm-ss`() {
        val date = "2021-12-15T06:00:47"
        val expectedDate = DateConverterUtil.converterDate(date)

        Assertions.assertEquals(expectedDate, DateConverterUtil.converterDate(date))
        Assertions.assertEquals("2021-12-15T06:00:47", expectedDate.toString())
    }

    @Test
    fun `deve formatar a data, quando receber nesse formato yyyy-MM-dd HH-mm-ssZ para esse padraogit status yyyy-MM-dd HH-mm-ss`() {
        val date = "2021-12-15T06:00:47Z"
        val expectedDate = DateConverterUtil.converterDate(date)

        Assertions.assertEquals(expectedDate, DateConverterUtil.converterDate(date))
        Assertions.assertEquals("2021-12-15T06:00:47", expectedDate.toString())
    }

}