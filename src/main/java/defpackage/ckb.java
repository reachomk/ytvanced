package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ckb */
public final class ckb extends bakp {
    public long[] a;

    public ckb() {
        super("stss");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return (long) ((this.a.length << 2) + 8);
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        int a = bana.a(cio.a(byteBuffer));
        this.a = new long[a];
        for (int i = 0; i < a; i++) {
            this.a[i] = cio.a(byteBuffer);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        cin.a(byteBuffer, (long) this.a.length);
        for (long a : this.a) {
            cin.a(byteBuffer, a);
        }
    }

    public final String toString() {
        int length = this.a.length;
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("SyncSampleBox[entryCount=");
        stringBuilder.append(length);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
