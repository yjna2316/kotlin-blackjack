package blackjack.domain.player

import blackjack.domain.card.Cards

data class Player(
    val name: String,
    val cards: Cards
)
