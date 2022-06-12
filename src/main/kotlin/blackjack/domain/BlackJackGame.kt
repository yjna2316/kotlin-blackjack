package blackjack.domain

object BlackJackGame {
    fun start(players: List<String>): Players {
        return Players(players.map { name -> Player(name) })
    }
}