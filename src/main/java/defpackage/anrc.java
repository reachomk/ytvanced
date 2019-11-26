package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: anrc */
public class anrc {
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;
    private final anre e = anre.a();

    public final int a(int i) {
        return i < this.d ? this.b.getShort(this.c + i) : 0;
    }

    public final int b(int i) {
        return i + this.b.getInt(i);
    }

    public final String c(int i) {
        i += this.b.getInt(i);
        return this.e.a(this.b, i + 4, this.b.getInt(i));
    }

    public final int d(int i) {
        i += this.a;
        return this.b.getInt(i + this.b.getInt(i));
    }

    public final int e(int i) {
        i += this.a;
        return (i + this.b.getInt(i)) + 4;
    }

    /* Access modifiers changed, original: protected|final */
    public final ByteBuffer f(int i) {
        i = a(i);
        if (i == 0) {
            return null;
        }
        ByteBuffer order = this.b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int e = e(i);
        order.position(e);
        order.limit(e + d(i));
        return order;
    }

    static {
        anrf anrf = new anrf();
    }
}
