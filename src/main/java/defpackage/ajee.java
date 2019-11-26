package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ajee */
public final class ajee implements afhf, Observer {
    private static final long H = TimeUnit.MINUTES.toMillis(10);
    public static final long a = TimeUnit.SECONDS.toMillis(30);
    public boolean A;
    public int B = 1;
    public xvo C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G = true;
    private long I;
    private final xsc J;
    private final ScheduledExecutorService K;
    private final amro L;
    private final Runnable M = new ajeh(this);
    private final Runnable N = new ajeg(this);
    private ScheduledFuture O;
    private ScheduledFuture P;
    private int Q;
    private long R;
    private boolean S;
    public final afhc b;
    public final xhv c;
    public final xry d;
    public final afia e;
    public final ajej f;
    public final ajej g;
    public final ajel h;
    public final ajet i;
    public final ajql j;
    public final amro k;
    public final ajem l;
    public ajeq m;
    public int n = -1;
    public int o;
    public String p;
    public int q;
    public int r;
    public String s;
    public airc t;
    public int u = -1;
    public int v = -1;
    public ahkm w;
    public boolean x;
    public float y = -1.0f;
    public List z;

    public final void a(aakm aakm, xvo xvo) {
        this.C = xvo;
        this.i.a(aakm);
        this.i.a(xvo);
        if (this.I < 0) {
            this.I = this.J.b();
        }
    }

    public final void p() {
    }

    public final void a(afif afif) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f());
        String str = ":";
        stringBuilder.append(str);
        stringBuilder.append(afif.a());
        stringBuilder.append(str);
        stringBuilder.append(ajee.b(afif.b));
        if (afif.c != null) {
            stringBuilder.append(str);
            stringBuilder.append(afif.c());
        }
        this.i.a("error", stringBuilder.toString());
        if (afif.d()) {
            a(ajeq.ERROR);
            this.i.a();
        }
    }

    public final void a() {
        a(ajeq.SUSPENDED);
        c();
        if (!this.x) {
            this.i.a();
        }
    }

    public final void a(String str, aevf aevf) {
        String a = aevf.a(this.I);
        String str2 = "cat";
        if (TextUtils.equals(str2, str)) {
            this.i.a(str2, a);
            return;
        }
        String str3 = "ctmp";
        if (a.isEmpty()) {
            this.i.a(str3, str);
            return;
        }
        ajet ajet = this.i;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + a.length());
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(a);
        ajet.a(str3, stringBuilder.toString());
    }

    public final void b() {
        ahkm ahkm = this.w;
        if (ahkm != null) {
            long j = this.I;
            long j2 = 0;
            if (j >= 0) {
                j2 = ahkm.f - j;
            }
            j = ahkm.e;
            long j3 = ahkm.a;
            String str = "bh";
            this.i.a(str, String.format(Locale.US, "%s:%.2f", new Object[]{ajee.b(j2), Float.valueOf(((float) (j - j3)) / 1000.0f)}));
        }
    }

    public final void update(Observable observable, Object obj) {
        if (observable instanceof ajql) {
            this.i.a("qoealert", "1");
        }
    }

    public final synchronized void a(String str) {
        c();
        this.f.a(str);
        this.g.a(str);
        ajel ajel = this.h;
        if (ajel.a > 0) {
            a(0.5f);
            ajet ajet = this.i;
            long j = ajel.a;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 21);
            stringBuilder.append(str);
            stringBuilder.append(":");
            stringBuilder.append(j);
            ajet.a("cache_bytes", stringBuilder.toString());
            ajel.a = 0;
        }
        c(str);
        b(str);
        b();
        if (this.b.a() != -1.0f) {
            this.i.a("ctmp", String.format(Locale.US, "%s:%s;%.1f", new Object[]{"lux", str, Float.valueOf(r0)}));
        }
        i();
    }

    private final void c(String str) {
        String e = e();
        if (e != null) {
            ajet ajet = this.i;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + e.length());
            stringBuilder.append(str);
            stringBuilder.append(":");
            stringBuilder.append(e);
            ajet.a("cmt", stringBuilder.toString());
        }
    }

    public final void b(String str) {
        int intValue = ((Integer) this.L.get()).intValue();
        int i = this.Q;
        if (i < intValue && i != -1) {
            ajet ajet = this.i;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 12);
            stringBuilder.append(str);
            stringBuilder.append(":");
            stringBuilder.append(intValue - i);
            ajet.a("df", stringBuilder.toString());
        }
        this.Q = intValue;
    }

    public final synchronized void c() {
        ScheduledFuture scheduledFuture = this.P;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.P = null;
        }
    }

    private final synchronized void i() {
        this.P = this.K.schedule(this.N, this.R, TimeUnit.MILLISECONDS);
    }

    public final synchronized void a(long j) {
        this.R = j;
        c();
        i();
    }

    public final synchronized void d() {
        this.A = true;
        this.i.a(true);
    }

    public final String e() {
        ahkm ahkm = this.w;
        if (ahkm == null) {
            return null;
        }
        return ajee.b(ahkm.a);
    }

    public final String f() {
        return ajee.b(g());
    }

    public final long g() {
        return this.I >= 0 ? this.J.b() - this.I : 0;
    }

    public static String b(long j) {
        return String.format(Locale.US, "%.3f", new Object[]{Float.valueOf(((float) j) / 1000.0f)});
    }

    public final void a(float f) {
        float f2 = this.y;
        if (f2 == -1.0f || f > f2) {
            this.y = f;
        }
    }

    public final synchronized void a(ajeq ajeq) {
        if (!this.m.equals(ajeq)) {
            if (this.S && !(this.m == ajeq.NOT_STARTED && ajeq == ajeq.BUFFERING)) {
                long b = this.J.b() - this.I;
                ahkm ahkm = this.w;
                long j = ahkm != null ? ahkm.a : 0;
                if (b > TimeUnit.SECONDS.toMillis(15)) {
                    a(new afif("qoe.start15s", j));
                }
                this.S = false;
            }
            ScheduledFuture scheduledFuture = this.O;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.O = null;
            }
            String f = f();
            ajet ajet = this.i;
            String valueOf = String.valueOf(ajeq);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(f).length() + 1) + valueOf.length());
            stringBuilder.append(f);
            stringBuilder.append(":");
            stringBuilder.append(valueOf);
            ajet.a("vps", stringBuilder.toString());
            this.m = ajeq;
            if (ajeq == ajeq.PLAYING) {
                j();
            }
            a(f);
        }
    }

    public final synchronized void h() {
        if (this.m == ajeq.PLAYING) {
            ajeq ajeq = ajeq.PLAYING;
            String f = f();
            ajet ajet = this.i;
            String valueOf = String.valueOf(ajeq);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(f).length() + 1) + valueOf.length());
            stringBuilder.append(f);
            stringBuilder.append(":");
            stringBuilder.append(valueOf);
            ajet.a("vps", stringBuilder.toString());
            c(f);
            j();
        }
    }

    private final synchronized void j() {
        this.O = this.K.schedule(this.M, H, TimeUnit.MILLISECONDS);
    }

    public static xvo a(Uri uri, String str, String str2, boolean z, afmi afmi) {
        xvo a = xvo.a(uri);
        a.b("event", "streamingstats");
        a.b("cpn", str);
        a.b("ns", "yt");
        if (z && !TextUtils.isEmpty(str2)) {
            a.b("docid", str2);
        }
        afmi.b(a);
        return a;
    }

    /* synthetic */ ajee(xsc xsc, afqv afqv, afmq afmq, afhc afhc, xhv xhv, xry xry, afmi afmi, afia afia, long j, long j2, long j3, afhe afhe, ajql ajql, ScheduledExecutorService scheduledExecutorService, Executor executor, afpu afpu, amro amro, amro amro2, boolean z, aakm aakm, xvo xvo, boolean z2, boolean z3, List list) {
        afhc afhc2 = afhc;
        xvo xvo2 = xvo;
        boolean z4 = z3;
        this.J = xsc;
        this.b = afhc2;
        this.c = xhv;
        this.d = xry;
        this.e = afia;
        this.f = new ajej(this, "bwm", 1);
        this.g = new ajej(this, "obwm", 2);
        this.l = new ajem(this);
        this.h = new ajel(this, j, j2, j3, afhe);
        this.j = ajql;
        this.K = scheduledExecutorService;
        this.L = amro;
        this.k = amro2;
        this.C = xvo2;
        ajei ajei = new ajei(this);
        this.i = new ajet(afqv, afmq, executor, afpu, new ajep(this, afmi), ajei, this.l);
        this.i.a(z4);
        this.z = list;
        for (ajer ajer : list) {
            ajer.a.add(this);
        }
        this.A = z4;
        this.I = -1;
        ajet ajet = this.i;
        String valueOf = String.valueOf(ajeq.NOT_STARTED);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 6);
        stringBuilder.append("0.000:");
        stringBuilder.append(valueOf);
        ajet.a("vps", stringBuilder.toString());
        this.m = ajeq.NOT_STARTED;
        this.S = true;
        if (z && z4) {
            afhc2.a(this);
        }
        if (z2) {
            this.i.a("ctmp", "ttr");
        }
        this.x = false;
        String b = ajei.b();
        if (b != null) {
            ajei.a.i.a("bat", b);
        }
        this.Q = ((Integer) amro.get()).intValue();
        a(aakm, xvo2);
    }
}
