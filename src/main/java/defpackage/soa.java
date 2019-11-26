package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: soa */
public final /* synthetic */ class soa implements sor {
    public static final sor a = new soa();

    private soa() {
    }

    public final anrc a(ByteBuffer byteBuffer) {
        bapj bapj = new bapj();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int i = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        bapj.a = i;
        bapj.b = byteBuffer;
        i -= bapj.b.getInt(i);
        bapj.c = i;
        bapj.d = bapj.b.getShort(i);
        return bapj;
    }
}
