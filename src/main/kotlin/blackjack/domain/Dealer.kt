package blackjack.domain

import blackjack.domain.Card
import blackjack.domain.Cards

object Dealer {
    fun giveCards(numOfCard: Int): Cards {
        return Cards(List(numOfCard) { Card() })
    }
}
