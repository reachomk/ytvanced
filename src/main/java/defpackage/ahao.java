package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ahao */
public final class ahao {
    public final xsc a;
    public final avqk b;
    public final long c;
    private long d = 0;

    public ahao(xsc xsc, avqk avqk) {
        this.a = (xsc) amqw.a((Object) xsc);
        this.b = avqk;
        this.c = xsc.a();
    }

    public final synchronized int a(int i) {
        long j;
        avqk avqk = this.b;
        if (avqk == null || !avqk.b) {
            throw new ahan();
        }
        if (this.a.a() < this.c + TimeUnit.SECONDS.toMillis((long) this.b.c)) {
            if (this.d < this.b.d) {
                r5 = new long[3];
                int i2 = 1;
                r5[1] = 10240;
                r5[2] = (long) i;
                amqw.a(true);
                j = r5[0];
                while (i2 < 3) {
                    long j2 = r5[i2];
                    if (j2 < j) {
                        j = j2;
                    }
                    i2++;
                }
            } else {
                throw new ahan();
            }
        }
        throw new ahan();
        return (int) j;
    }

    public final synchronized void b(int i) {
        this.d += (long) i;
    }
}
