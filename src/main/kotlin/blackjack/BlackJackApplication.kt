package blackjack

import blackjack.domain.BlackJackGame
import blackjack.view.InputView

fun main() {
    val playerNames = InputView.getPlayerNames()
    val players = BlackJackGame.start(playerNames)
    // OutputView.showStartCard(players)
}
