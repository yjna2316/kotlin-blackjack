package blackjack.domain

object BlackJackGame {
    fun start(playerNames: List<String>): Players {
        return Players(
            playerNames.map { name ->
                Player(name, Dealer.giveCards(2))
            }
        )
    }
}
