package defpackage;

import java.util.List;

/* renamed from: agis */
final class agis implements agib {
    private agqi a;
    private final List b;
    private avsi c = avsi.UNKNOWN_FORMAT_TYPE;
    private final long d;
    private agqk e;
    private final /* synthetic */ agip f;

    public final agqi a() {
        agqi agqi;
        synchronized (this.f.l) {
            agqi = this.a;
        }
        return agqi;
    }

    public final void a(agqi agqi) {
        synchronized (this.f.l) {
            amqw.a((Object) agqi);
            amqw.a(this.a.a.equals(agqi.a));
            this.a = agqi;
            this.e = null;
        }
    }

    public final void c() {
        synchronized (this.f.l) {
            this.e = null;
        }
    }

    public final agqk b() {
        agqk agqk;
        synchronized (this.f.l) {
            if (this.e == null) {
                int i;
                agqi agqi = this.a;
                List list = this.b;
                avsi avsi = this.c;
                synchronized (this.f.l) {
                    i = 0;
                    for (String b : xsb.b(this.f.h, this.a.a)) {
                        agid b2 = this.f.b(b);
                        if (b2 != null) {
                            agqy h = b2.h();
                            if (h != null && h.o()) {
                                i++;
                            }
                        }
                    }
                }
                this.e = new agqk(agqi, list, avsi, i, this.d);
            }
            agqk = this.e;
        }
        return agqk;
    }

    /* synthetic */ agis(agip agip, agqi agqi, List list, avsi avsi, long j) {
        this.f = agip;
        this.a = (agqi) amqw.a((Object) agqi);
        this.b = (List) amqw.a((Object) list);
        this.c = avsi;
        this.d = j;
    }
}
