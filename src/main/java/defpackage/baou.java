package defpackage;

import java.nio.ByteBuffer;

/* renamed from: baou */
public final class baou extends anrd {
    public final void a(int i, ByteBuffer byteBuffer) {
        this.a = i;
        this.b = byteBuffer;
    }

    public final float a() {
        return this.b.getFloat(this.a);
    }

    public final int b() {
        return this.b.getInt(this.a + 4);
    }
}
