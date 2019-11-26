package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: sob */
public final /* synthetic */ class sob implements sor {
    public static final sor a = new sob();

    private sob() {
    }

    public final anrc a(ByteBuffer byteBuffer) {
        baow baow = new baow();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int i = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        baow.a = i;
        baow.b = byteBuffer;
        i -= baow.b.getInt(i);
        baow.c = i;
        baow.d = baow.b.getShort(i);
        return baow;
    }
}
