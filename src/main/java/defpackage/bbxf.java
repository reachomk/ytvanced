package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: bbxf */
final class bbxf {
    private final int a;
    private final bbxi[] b;
    private long c;

    bbxf(int i, ThreadFactory threadFactory) {
        this.a = i;
        this.b = new bbxi[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.b[i2] = new bbxi(threadFactory);
        }
    }

    public final bbxi a() {
        int i = this.a;
        if (i == 0) {
            return bbxd.a;
        }
        bbxi[] bbxiArr = this.b;
        long j = this.c;
        this.c = 1 + j;
        return bbxiArr[(int) (j % ((long) i))];
    }

    public final void b() {
        for (bbxt bK_ : this.b) {
            bK_.bK_();
        }
    }
}
