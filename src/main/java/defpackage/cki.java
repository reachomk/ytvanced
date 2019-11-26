package defpackage;

import java.nio.ByteBuffer;

/* renamed from: cki */
public class cki extends bakn {
    private ByteBuffer a;

    public cki(String str) {
        super(str);
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return (long) this.a.limit();
    }

    public final void a(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        this.a.rewind();
        byteBuffer.put(this.a);
    }
}
