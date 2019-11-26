package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: qrg */
final class qrg implements qsg {
    private final ByteBuffer a;

    public qrg(ByteBuffer byteBuffer) {
        this.a = byteBuffer.slice();
    }

    public final long a() {
        return (long) this.a.capacity();
    }

    public final void a(MessageDigest[] messageDigestArr, long j, int i) {
        int i2;
        ByteBuffer slice;
        synchronized (this.a) {
            i2 = (int) j;
            this.a.position(i2);
            this.a.limit(i2 + i);
            slice = this.a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
