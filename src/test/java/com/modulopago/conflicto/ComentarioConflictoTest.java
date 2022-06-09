package com.modulopago.conflicto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ComentarioConflictoTest {

    @Test
    public void testSetDescripcionConflictoVacia() {
        ComentarioConflicto comentarioConflicto = new ComentarioConflicto();
        assertThrows(IllegalArgumentException.class, () -> comentarioConflicto.setDescripcionComentario(""));
    }

    @Test
    public void testSetFechaCreacionComentarioNula() {
        ComentarioConflicto comentarioConflicto = new ComentarioConflicto();
        assertThrows(IllegalArgumentException.class, () -> comentarioConflicto.setFechaCreacionComentario(null));
    }
}