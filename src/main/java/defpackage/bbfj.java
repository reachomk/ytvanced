package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bbfj */
final class bbfj extends baxf {
    private final ByteBuffer a;

    bbfj(ByteBuffer byteBuffer) {
        this.a = (ByteBuffer) amqw.a((Object) byteBuffer, (Object) "bytes");
    }

    public final int a() {
        return this.a.remaining();
    }

    public final int b() {
        a(1);
        return this.a.get() & 255;
    }

    public final void a(byte[] bArr, int i, int i2) {
        a(i2);
        this.a.get(bArr, i, i2);
    }

    public final /* synthetic */ bbff c(int i) {
        a(i);
        ByteBuffer duplicate = this.a.duplicate();
        duplicate.limit(this.a.position() + i);
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + i);
        return new bbfj(duplicate);
    }
}
