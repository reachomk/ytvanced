package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bamr */
public abstract class bamr {
    public abstract String a();

    public abstract void a(ByteBuffer byteBuffer);

    public abstract ByteBuffer b();

    public int c() {
        return b().limit();
    }
}
