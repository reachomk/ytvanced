package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bapc */
public final class bapc extends anrc {
    public final void a(int i, ByteBuffer byteBuffer) {
        this.a = i;
        this.b = byteBuffer;
        i -= this.b.getInt(i);
        this.c = i;
        this.d = this.b.getShort(i);
    }

    public final baoz g(int i) {
        return a(new baoz(), i);
    }

    public final baoz a(baoz baoz, int i) {
        int a = a(4);
        if (a == 0) {
            return null;
        }
        baoz.a(b(e(a) + (i << 2)), this.b);
        return baoz;
    }

    public final int a() {
        int a = a(4);
        return a != 0 ? d(a) : 0;
    }
}
