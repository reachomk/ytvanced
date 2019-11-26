package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bawy */
final class bawy implements bbhv {
    public final ByteBuffer a;

    public bawy(ByteBuffer byteBuffer) {
        this.a = (ByteBuffer) amqw.a((Object) byteBuffer, (Object) "buffer");
    }

    public final void c() {
    }

    public final void a(byte[] bArr, int i, int i2) {
        this.a.put(bArr, i, i2);
    }

    public final void a(byte b) {
        this.a.put(b);
    }

    public final int a() {
        return this.a.remaining();
    }

    public final int b() {
        return this.a.position();
    }
}
