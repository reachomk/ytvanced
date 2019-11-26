package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bbho */
public final class bbho {
    private static final bbho c = new bbho(new bawd[0]);
    public final bawd[] a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public static bbho a(barv barv, barq barq, baum baum) {
        List list = barv.g;
        if (list.isEmpty()) {
            return c;
        }
        basj basj = new basj();
        basj.a = (barq) amqw.a((Object) barq, (Object) "transportAttrs cannot be null");
        basj.b = (barv) amqw.a((Object) barv, (Object) "callOptions cannot be null");
        bask bask = new bask(basj.a, basj.b);
        bawd[] bawdArr = new bawd[list.size()];
        for (int i = 0; i < bawdArr.length; i++) {
            bawdArr[i] = ((bash) list.get(i)).a(baum);
        }
        return new bbho(bawdArr);
    }

    private bbho(bawd[] bawdArr) {
        this.a = bawdArr;
    }

    public final void a() {
        for (bawd b : this.a) {
            b.b();
        }
    }

    public final void a(int i, long j, long j2) {
        for (bawd a : this.a) {
            a.a(i, j, j2);
        }
    }

    public final void a(long j) {
        for (bawd b : this.a) {
            b.b(j);
        }
    }

    public final void b(long j) {
        for (bawd a : this.a) {
            a.a(j);
        }
    }

    public final void c(long j) {
        for (bawd d : this.a) {
            d.d(j);
        }
    }

    public final void d(long j) {
        for (bawd c : this.a) {
            c.c(j);
        }
    }
}
