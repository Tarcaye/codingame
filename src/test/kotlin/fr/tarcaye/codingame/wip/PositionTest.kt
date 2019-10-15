package fr.tarcaye.codingame.wip

import org.assertj.core.api.Assertions.assertThat
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

class PositionTest : Spek({
    describe("Batman") {
        it("Moves right but why ????") {
            val searchArea = SearchArea(0, 5, 0, 5)
            val batman = Position(2, 2)
            val futureBatman = batman.move(searchArea, Distance.UNKNOWN)

            assertThat(futureBatman).isEqualTo(Position(3, 2))
        }

        it("Moves right for some reason") {
            val searchArea = SearchArea(0, 5, 0, 5)
            val batman = Position(1, 2)
            val futureBatman = batman.move(searchArea, Distance.UNKNOWN)

            assertThat(futureBatman).isEqualTo(Position(4, 2))
        }

        it("Moves left haha, you didn't expect that !") {
            val searchArea = SearchArea(0, 5, 0, 5)
            val batman = Position(5, 2)
            val futureBatman = batman.move(searchArea, Distance.UNKNOWN)

            assertThat(futureBatman).isEqualTo(Position(0, 2))
        }

        it("Moves left when stuck in the middle") {
            val searchArea = SearchArea(0, 6, 0, 6)
            val batman = Position(3, 2)
            val futureBatman = batman.move(searchArea, Distance.UNKNOWN)

            assertThat(futureBatman).isEqualTo(Position(2, 2))
        }
    }
})