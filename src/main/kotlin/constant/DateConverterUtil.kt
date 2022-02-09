package constant

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class DateConverterUtil {

    companion object {

        private val pattern = "yyyy-MM-dd'T'HH:mm:ss"

        fun converterDate(date: String): LocalDateTime {
            val dataSizeWithoutSecondsWhitTimeZone = "yyyy-MM-ddTHH:mmZ"
            val dataSizeWithoutSecondsAndWithoutTimeZone = "yyyy-MM-ddTHH:mm"
            val localDateSizeTime = "yyyy-MM-ddTHH:mm:ss"

            if (date.length == dataSizeWithoutSecondsWhitTimeZone.length) {
                var data = "${date.substring(0, 16)}:01"
                return LocalDateTime.parse(data, DateTimeFormatter.ofPattern(pattern))
            } else if (date.length == dataSizeWithoutSecondsAndWithoutTimeZone.length) {
                var data = "${date.substring(0, 16)}:01"
                return LocalDateTime.parse(data, DateTimeFormatter.ofPattern(pattern))
            }
            return LocalDateTime.parse(date.substring(0, localDateSizeTime.length), DateTimeFormatter.ofPattern(pattern))

        }

    }
}