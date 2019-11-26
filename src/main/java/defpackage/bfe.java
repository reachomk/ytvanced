package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bfe */
public class bfe {
    public int a;
    public ByteBuffer b;

    public final int a(int i) {
        int i2 = this.a;
        i2 -= this.b.getInt(i2);
        return i < this.b.getShort(i2) ? this.b.getShort(i2 + i) : 0;
    }

    public final int b(int i) {
        i += this.a;
        return this.b.getInt(i + this.b.getInt(i));
    }

    public final int c(int i) {
        i += this.a;
        return (i + this.b.getInt(i)) + 4;
    }

    static {
        bfh bfh = new bfh();
        bfg bfg = new bfg();
        ThreadLocal threadLocal = new ThreadLocal();
    }
}
