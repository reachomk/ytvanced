package defpackage;

import java.nio.ByteBuffer;

/* renamed from: balu */
public final class balu extends bakn {
    public int a;
    public int b;

    public balu() {
        super("pasp");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return 8;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        byteBuffer.putInt(this.b);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
    }
}
