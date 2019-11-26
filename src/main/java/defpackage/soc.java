package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: soc */
public final /* synthetic */ class soc implements sor {
    public static final sor a = new soc();

    private soc() {
    }

    public final anrc a(ByteBuffer byteBuffer) {
        baoo baoo = new baoo();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int i = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        baoo.a = i;
        baoo.b = byteBuffer;
        i -= baoo.b.getInt(i);
        baoo.c = i;
        baoo.d = baoo.b.getShort(i);
        return baoo;
    }
}
