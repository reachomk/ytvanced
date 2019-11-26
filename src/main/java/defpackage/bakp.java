package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bakp */
public abstract class bakp extends bakn implements cis {
    public int l;
    public int m;

    protected bakp(String str) {
        super(str);
    }

    public final int m() {
        if (!this.k) {
            l();
        }
        return this.l;
    }

    public final int n() {
        if (!this.k) {
            l();
        }
        return this.m;
    }

    /* Access modifiers changed, original: protected|final */
    public final long c(ByteBuffer byteBuffer) {
        this.l = cio.d(byteBuffer);
        this.m = cio.b(byteBuffer);
        return 4;
    }

    /* Access modifiers changed, original: protected|final */
    public final void d(ByteBuffer byteBuffer) {
        cin.c(byteBuffer, this.l);
        cin.a(byteBuffer, this.m);
    }
}
