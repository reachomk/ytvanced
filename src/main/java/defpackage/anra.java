package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: anra */
public final class anra extends anrb {
    public static final anra a = new anra();

    public final ByteBuffer a(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }
}
