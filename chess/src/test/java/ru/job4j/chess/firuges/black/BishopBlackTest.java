package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    public void position() {
        Cell cell = Cell.C8;
        BishopBlack bishop = new BishopBlack(cell);
        assertThat(bishop.position(), is(cell));
    }

    @Test
    public void copy() {
        Cell dest = Cell.C7;
        BishopBlack bishop = new BishopBlack(Cell.C8);
        assertThat(bishop.copy(dest).position(), is(dest));

    }

    @Test
    public void way() throws ImpossibleMoveException {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell[] way = bishop.way(Cell.H6);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5, Cell.H6};
        assertThat(way, is(expected));
    }

    @Test
    public void isDiagonal() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        assertThat(bishop.isDiagonal(Cell.G1, Cell.A7), is(true));

    }
}