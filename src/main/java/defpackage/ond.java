package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ond */
public final class ond implements olk {
    private final oza a = new oza();
    private final oyx b = new oyx();
    private ozo c;

    public final olj a(olp olp) {
        onn onh;
        ozo ozo = this.c;
        if (ozo == null || olp.d != ozo.a()) {
            this.c = new ozo(olp.c);
            this.c.c(olp.c - olp.d);
        }
        ByteBuffer byteBuffer = olp.b;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.a.a(array, limit);
        this.b.a(array, limit);
        this.b.b(39);
        long c = (((long) this.b.c(1)) << 32) | ((long) this.b.c(32));
        this.b.b(20);
        limit = this.b.c(12);
        int c2 = this.b.c(8);
        this.a.d(14);
        if (c2 == 0) {
            onh = new onh();
        } else if (c2 == 255) {
            onh = omy.a(this.a, limit, c);
        } else if (c2 == 4) {
            onh = onj.a(this.a);
        } else if (c2 == 5) {
            onh = onc.a(this.a, c, this.c);
        } else if (c2 != 6) {
            onh = null;
        } else {
            oza oza = this.a;
            ozo ozo2 = this.c;
            c = onn.a(oza, c);
            onh = new onn(c, ozo2.b(c));
        }
        if (onh == null) {
            return new olj(new oll[0]);
        }
        return new olj(onh);
    }
}
