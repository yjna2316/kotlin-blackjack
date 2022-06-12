package blackjack.domain.dealer

import blackjack.domain.card.Card
import blackjack.domain.card.Cards

object Dealer {
    fun giveCards(numOfCard: Int): Cards {
        return Cards(List(numOfCard) { Card() })
    }
}
