package blackjack.domain

import blackjack.domain.dealer.Dealer
import blackjack.domain.player.Player
import blackjack.domain.player.Players

object BlackJackGame {
    fun start(playerNames: List<String>): Players {
        return Players(
            playerNames.map { name ->
                Player(name, Dealer.giveCards(2))
            }
        )
    }
}
