package blackjack.view

object InputView {
    private const val PLAYER_NAME_IN_DIALOG = "게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)"

    fun getPlayerNames(): List<String> {
        println(PLAYER_NAME_IN_DIALOG)
        return convertToList(readLine())
    }

    private fun convertToList(names: String?): List<String> {
        return names
            .also { it.checkNullOrBlank() }!!
            .split(",").map { it.trim() }
    }
}

fun String?.checkNullOrBlank() = require(!this.isNullOrBlank()) { "입력값이 없어요. 다시 입력해주세요." }
