package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: anaf */
abstract class anaf extends anah {
    anaf() {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* Access modifiers changed, original: protected */
    public void a(byte[] bArr, int i) {
        throw null;
    }

    public final anal a(byte[] bArr) {
        amqw.a((Object) bArr);
        a(bArr, bArr.length);
        return this;
    }
}
