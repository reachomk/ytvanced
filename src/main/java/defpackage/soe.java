package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: soe */
public final /* synthetic */ class soe implements sor {
    public static final sor a = new soe();

    private soe() {
    }

    public final anrc a(ByteBuffer byteBuffer) {
        baos baos = new baos();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int i = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        baos.a = i;
        baos.b = byteBuffer;
        i -= baos.b.getInt(i);
        baos.c = i;
        baos.d = baos.b.getShort(i);
        return baos;
    }
}
