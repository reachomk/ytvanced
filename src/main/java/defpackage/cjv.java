package defpackage;

import java.nio.ByteBuffer;

/* renamed from: cjv */
public final class cjv extends cip {
    private float a;

    public cjv() {
        super("smhd");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return 8;
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        this.a = cio.i(byteBuffer);
        cio.c(byteBuffer);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        cin.c(byteBuffer, (double) this.a);
        cin.b(byteBuffer, 0);
    }

    public final String toString() {
        float f = this.a;
        StringBuilder stringBuilder = new StringBuilder(44);
        stringBuilder.append("SoundMediaHeaderBox[balance=");
        stringBuilder.append(f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
