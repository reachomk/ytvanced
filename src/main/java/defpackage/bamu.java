package defpackage;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

/* renamed from: bamu */
public final class bamu extends bakp {
    public String a;
    public final List b = new LinkedList();
    private String c;

    public bamu() {
        super("sbgp");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return (long) (m() != 1 ? (this.b.size() << 3) + 12 : (this.b.size() << 3) + 16);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        byteBuffer.put(this.a.getBytes());
        if (m() == 1) {
            byteBuffer.put(this.c.getBytes());
        }
        cin.a(byteBuffer, (long) this.b.size());
        for (bamx bamx : this.b) {
            cin.a(byteBuffer, bamx.a);
            cin.a(byteBuffer, (long) bamx.b);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        this.a = cio.j(byteBuffer);
        if (m() == 1) {
            this.c = cio.j(byteBuffer);
        }
        long a = cio.a(byteBuffer);
        while (true) {
            long j = -1 + a;
            if (a > 0) {
                this.b.add(new bamx((long) bana.a(cio.a(byteBuffer)), bana.a(cio.a(byteBuffer))));
                a = j;
            } else {
                return;
            }
        }
    }
}
