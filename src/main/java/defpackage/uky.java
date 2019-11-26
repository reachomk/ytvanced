package defpackage;

import java.nio.ByteBuffer;

/* renamed from: uky */
public final class uky extends bakp {
    public int a = -1;

    public uky() {
        super("st3d");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return 5;
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        int d = cio.d(byteBuffer);
        if (d == 0) {
            this.a = 0;
        } else if (d == 1) {
            this.a = 1;
        } else if (d == 2) {
            this.a = 2;
        } else if (d == 3) {
            this.a = 3;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        cin.c(byteBuffer, this.a);
    }
}
