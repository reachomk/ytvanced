package defpackage;

import java.nio.ByteBuffer;

/* renamed from: balq */
public final class balq extends balt {
    private byte[] a;

    public balq() {
        super("covr");
    }

    /* Access modifiers changed, original: protected|final */
    public final byte[] a() {
        return this.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(ByteBuffer byteBuffer) {
        this.a = new byte[byteBuffer.limit()];
        byteBuffer.get(this.a);
    }

    /* Access modifiers changed, original: protected|final */
    public final int g() {
        return this.a.length;
    }
}
