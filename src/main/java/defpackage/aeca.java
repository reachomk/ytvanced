package defpackage;

import android.text.TextUtils;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: aeca */
public final class aeca implements adqi {
    public static final String a = xtl.b("MDX.WatchStateAggregator");
    public boolean b;
    public boolean c;
    public wxi d;
    public final airv e;
    public vrh f;
    public aeby g;
    private boolean h;
    private final xci i;
    private final aecd j = new aecd(this);
    private final aeck k = new aeck(this);
    private final aecf l = new aecf(this);
    private final aece m = new aece(this);
    private final ajam n;
    private final bdfu o = new bdfu();
    private final Set p = new CopyOnWriteArraySet();
    private final aeci q;
    private adqe r;
    private aecc s;

    public aeca(xci xci, airv airv, ajam ajam, aeci aeci) {
        this.i = xci;
        this.n = ajam;
        this.e = airv;
        this.q = aeci;
        this.f = vrh.g;
        this.g = aeby.m().a(aeca.a()).a();
    }

    public final void a(aecb aecb) {
        this.p.add(aecb);
    }

    public final void b(aecb aecb) {
        this.p.remove(aecb);
    }

    public final void a(adqe adqe) {
        if (!this.h) {
            this.o.a(this.j.a(this.n));
            this.o.a(this.k.a(this.n));
            this.i.a(this.m);
            this.q.a(this.l);
            this.h = true;
        }
        a(this.g.k().d(adqe.d()).b(aeca.d(adqe)));
        this.r = adqe;
        if (this.s == null) {
            this.s = new aecc(this);
        }
        this.r.a(this.s);
        b(2);
    }

    public final void b(adqe adqe) {
        amqw.b(this.r == adqe);
        a(this.g.k().d(adqe.d()).b(aeca.d(adqe)));
        b(2);
    }

    public final void c(adqe adqe) {
        a(aeby.m().d(adqe.d()).a(aeca.a()));
        adqe = this.r;
        if (adqe != null) {
            adqe.b(this.s);
            this.r = null;
        }
        wxi wxi = this.d;
        if (wxi != null) {
            wxi.a();
            this.d = null;
        }
        b(2);
        if (this.h) {
            this.o.a();
            this.i.b(this.m);
            this.q.b(this.l);
            this.h = false;
        }
    }

    public final void a(int i) {
        int a = this.g.a();
        if (i != a) {
            aebx k = this.g.k();
            if (a == 2) {
                k.a(aeca.a());
                this.b = false;
            }
            a(k.a(i));
            b(0);
        }
    }

    private static aebu a() {
        return aebu.g().a(null).b(null).b(2).a(-1).a(null).a();
    }

    public final void a(String str) {
        if (!TextUtils.equals(str, this.g.b())) {
            a(this.g.k().a(str));
            b(1);
        }
    }

    public final void a(CharSequence charSequence, aygk aygk) {
        aygk e = this.g.f().e();
        boolean equals = e != null ? e.equals(aygk) : aygk == null;
        if (!TextUtils.equals(charSequence, this.g.f().a()) || !equals) {
            a(this.g.f().f().a(charSequence).a(aygk));
            b(1);
        }
    }

    public final void a(int i, int i2) {
        if (i != this.g.e() || i2 != this.g.d()) {
            a(this.g.k().c(i).b(i2));
            b(3);
        }
    }

    public final void b(int i) {
        xak.a();
        if (!this.p.isEmpty()) {
            if (i != 2) {
                adqe adqe = this.r;
                if (adqe == null || adqe.d() == 2) {
                    String str = a;
                    StringBuilder stringBuilder = new StringBuilder(64);
                    stringBuilder.append("session disconnected, not notifying property change: ");
                    stringBuilder.append(i);
                    xtl.b(str, stringBuilder.toString());
                    return;
                }
            }
            for (aecb a : this.p) {
                a.a(i, this.g);
            }
        }
    }

    private static String d(adqe adqe) {
        if (adqe != null) {
            return adqe.h().bv_();
        }
        xtl.d("MDx watch UI shown unexpectedly. It should only be shown for an active session.");
        return "";
    }

    public final void a(aebx aebx) {
        this.g = aebx.a();
    }

    public final void a(aebt aebt) {
        a(this.g.k().a(aebt.a()));
    }
}
