package defpackage;

import java.nio.ByteBuffer;

/* renamed from: cji */
public final class cji extends cip {
    private int a;
    private int b;
    private long c;
    private long d;

    public cji() {
        super("hmhd");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return 20;
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        this.a = cio.c(byteBuffer);
        this.b = cio.c(byteBuffer);
        this.c = cio.a(byteBuffer);
        this.d = cio.a(byteBuffer);
        cio.a(byteBuffer);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        cin.b(byteBuffer, this.a);
        cin.b(byteBuffer, this.b);
        cin.a(byteBuffer, this.c);
        cin.a(byteBuffer, this.d);
        cin.a(byteBuffer, 0);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        long j = this.c;
        long j2 = this.d;
        StringBuilder stringBuilder = new StringBuilder(132);
        stringBuilder.append("HintMediaHeaderBox{maxPduSize=");
        stringBuilder.append(i);
        stringBuilder.append(", avgPduSize=");
        stringBuilder.append(i2);
        stringBuilder.append(", maxBitrate=");
        stringBuilder.append(j);
        stringBuilder.append(", avgBitrate=");
        stringBuilder.append(j2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
