package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: snz */
public final /* synthetic */ class snz implements sor {
    public static final sor a = new snz();

    private snz() {
    }

    public final anrc a(ByteBuffer byteBuffer) {
        bapa bapa = new bapa();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int i = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        bapa.a = i;
        bapa.b = byteBuffer;
        i -= bapa.b.getInt(i);
        bapa.c = i;
        bapa.d = bapa.b.getShort(i);
        return bapa;
    }
}
