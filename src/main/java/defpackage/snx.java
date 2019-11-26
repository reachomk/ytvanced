package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: snx */
public final /* synthetic */ class snx implements sor {
    public static final sor a = new snx();

    private snx() {
    }

    public final anrc a(ByteBuffer byteBuffer) {
        baor baor = new baor();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int i = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        baor.a = i;
        baor.b = byteBuffer;
        i -= baor.b.getInt(i);
        baor.c = i;
        baor.d = baor.b.getShort(i);
        return baor;
    }
}
