package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: snv */
public final /* synthetic */ class snv implements sor {
    public static final sor a = new snv();

    private snv() {
    }

    public final anrc a(ByteBuffer byteBuffer) {
        baom baom = new baom();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int i = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        baom.a = i;
        baom.b = byteBuffer;
        i -= baom.b.getInt(i);
        baom.c = i;
        baom.d = baom.b.getShort(i);
        return baom;
    }
}
