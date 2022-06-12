package blackjack.domain

import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BlackJackGameTest {
    @Test
    fun `블랙잭 게임이 시작되면, 전달한 이름을 가진 Player가 생성된다`() {
        // given
        val playerNames = listOf("Sally", "Jack", "Joe")
        // when
        val result = BlackJackGame.start(playerNames)
        // then
        assertAll(
            "players",
            { assertEquals(3, result.players.size) },
            { assertEquals("Sally", result.players[0].name) },
            { assertEquals("Jack", result.players[1].name) },
            { assertEquals("Joe", result.players[2].name) }
        )
    }

    @Test
    fun `블랙잭 게임이 시작되면, 각 Player는 카드 2장을 받게 된다`() {
        // given
        val playerNames = listOf("Sally", "Jack", "Joe")
        // when
        val result = BlackJackGame.start(playerNames)
        // then
        assertAll(
            "players with given cards",
            { assertEquals(3, result.players.size) },
            { assertEquals(2, result.players[0].cards.cards.size) },
            { assertEquals(2, result.players[1].cards.cards.size) }
        )
    }
}
