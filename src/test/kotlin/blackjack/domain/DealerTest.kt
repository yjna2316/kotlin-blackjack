package blackjack.domain

import blackjack.domain.dealer.Dealer
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class DealerTest {
    @Test
    fun `Dealer는 카드 수 만큼 중복 없는 카드를 내어준다`() {
        // given
        // when
        val result = Dealer.giveCards(2)
        // then
        assertEquals(2, result.cards.size)
        assertNotEquals(result.cards[0], result.cards[1])
    }
}
