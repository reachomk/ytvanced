package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: bdat */
public final class bdat {
    private final int a;
    private final bdas[] b;
    private long c;

    bdat(ThreadFactory threadFactory, int i) {
        this.a = i;
        this.b = new bdas[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.b[i2] = new bdas(threadFactory);
        }
    }

    public final bdas a() {
        int i = this.a;
        if (i == 0) {
            return bdap.a;
        }
        bdas[] bdasArr = this.b;
        long j = this.c;
        this.c = 1 + j;
        return bdasArr[(int) (j % ((long) i))];
    }

    public final void b() {
        for (bdbc b : this.b) {
            b.b();
        }
    }
}
