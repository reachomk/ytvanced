package defpackage;

import java.nio.ByteBuffer;

/* renamed from: tpd */
final class tpd implements bsv, tpb {
    private final tos a;
    private final tot b;
    private final bzc c;
    private bsy d;

    public tpd(tos tos, tot tot, bzc bzc) {
        this.a = tos;
        this.b = tot;
        this.c = bzc;
    }

    public final void a() {
    }

    public final int c() {
        return 2;
    }

    public final void a(bre bre, bsy bsy) {
        tou tou;
        Object obj;
        this.d = bsy;
        tos tos = this.a;
        bzc bzc = this.c;
        synchronized (tos) {
            tou = (tou) tos.d.get(bzc);
            if (tou == null) {
                tou = tos.c.a(bzc);
                tos.d.put(bzc, tou);
                obj = 1;
            } else {
                obj = null;
            }
            synchronized (tou.g) {
                tou.a.add(this);
            }
        }
        if (obj != null) {
            tou.c = bre;
            tou.d = tos.e.a(bzc.a(), ((Integer) tos.a.get(bre)).intValue(), bzc.b(), tou).d();
            tou.d.a();
            if (tou.e) {
                tou.d.c();
            }
        }
    }

    public final void b() {
        tou tou;
        tos tos = this.a;
        bzc bzc = this.c;
        synchronized (tos) {
            tou = (tou) tos.d.get(bzc);
        }
        if (tou != null) {
            synchronized (tou.g) {
                tou.a.remove(this);
                if (tou.a.isEmpty()) {
                    tou.e = true;
                    tou.g.d.remove(tou.b);
                }
            }
            if (tou.e) {
                bckx bckx = tou.d;
                if (bckx != null) {
                    bckx.c();
                }
            }
        }
    }

    public final Class d() {
        return this.b.b();
    }

    public final void a(ByteBuffer byteBuffer) {
        this.d.a(this.b.a(byteBuffer));
    }

    public final void a(Exception exception) {
        this.d.a(exception);
    }
}
