package defpackage;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: afvy */
public final class afvy implements afwr, xcp {
    public int a;
    private final wxw b;
    private final wya c;
    private final xci d;
    private final Executor e;
    private final String f;
    private final afwc g;
    private final atul h;
    private final afvz i;
    private final int j;
    private final afws k;
    private final bcaa l;
    private final zzl m;
    private int n;

    public afvy(wxw wxw, wya wya, xhv xhv, xci xci, Executor executor, zzl zzl, afvv afvv, bcaa bcaa, afvz afvz, String str, String str2, afwc afwc, atul atul, int i) {
        this.b = wxw;
        this.c = wya;
        this.d = xci;
        this.e = executor;
        this.i = (afvz) amqw.a((Object) afvz);
        this.f = (String) amqw.a((Object) str2);
        this.g = afwc;
        this.h = atul;
        this.l = bcaa;
        this.m = zzl;
        xvd.a(str);
        if (xhv.c()) {
            this.a = 2;
        } else {
            this.a = 1;
        }
        this.k = new afvt((xsc) afvv.a((xsc) afvv.a.get(), 1), (anqr) afvv.a((anqr) afvv.b.get(), 2), (String) afvv.a(str2, 3), (afwr) afvv.a(this, 4));
        this.j = i;
    }

    public final void a() {
        this.d.a((Object) this);
        String a = afvy.a(this.j);
        afwb afwb = (afwb) this.b.a(a);
        if (afwb == null) {
            this.b.a(a, new afwb());
            afwb = (afwb) this.b.a(a);
        }
        afwb.a = this;
        if (this.a == 2) {
            this.e.execute(new afvx(this));
        }
    }

    public final void b() {
        this.d.b(this);
        ((afwb) this.b.a(afvy.a(this.j))).a = null;
    }

    private final int e() {
        atul atul = this.h;
        if (atul == null) {
            return 1;
        }
        return atul.c;
    }

    public final void c() {
        this.a = 3;
        this.n = 0;
        d();
    }

    public final void d() {
        if (this.n < e()) {
            int i = this.a;
            if (i == 3 || i == 2) {
                this.k.a(this.g);
            }
        }
    }

    public final void a(long j) {
        this.n++;
        String.format(Locale.US, "Attempting %s %s %d of %d SUCCESS took %s ms", new Object[]{this.g.name(), this.f, Integer.valueOf(this.n), Integer.valueOf(e()), Long.valueOf(j)});
        if (this.g.equals(afwc.SUBSCRIBE)) {
            afxh.a(this.l, "SUBSCRIBED", true, this.m);
        } else if (this.g.equals(afwc.UNSUBSCRIBE)) {
            afxh.a(this.l, "UNSUBSCRIBED", true, this.m);
        }
        this.i.a();
    }

    public final void a(String str) {
        String str2 = str;
        this.n++;
        String.format(Locale.US, "Attempting %s %s %d of %d FAIL %s", new Object[]{this.g.name(), this.f, Integer.valueOf(this.n), Integer.valueOf(e()), str2});
        if (this.g.equals(afwc.SUBSCRIBE)) {
            afxh.a(this.l, "SUBSCRIBED", false, this.m);
        } else if (this.g.equals(afwc.UNSUBSCRIBE)) {
            afxh.a(this.l, "UNSUBSCRIBED", false, this.m);
        }
        xtl.a("Exception while attempting to subscribe to GCM topic", str2);
        if (this.n >= e()) {
            this.a = 4;
            this.i.b();
            return;
        }
        this.a = 3;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        atul atul = this.h;
        int i = this.n;
        int i2 = atul.b;
        double pow = Math.pow((double) atul.e, (double) (i - 1));
        int i3 = atul.d;
        double d = (double) i2;
        Double.isNaN(d);
        this.c.a(afvy.a(this.j), (long) ((int) Math.max(1, timeUnit.toSeconds((long) Math.min((int) (d * pow), i3)))), 1, true, 0, false, null, null, false, false);
    }

    private static String a(int i) {
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("gcm_subscription_retry_topic_");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{xgg.class};
        } else if (i != 0) {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (((xgg) obj).a && this.a == 1) {
            this.a = 2;
            this.e.execute(new afwa(this));
            return null;
        } else {
            this.a = 1;
            return null;
        }
    }
}
