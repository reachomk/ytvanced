package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ajfd */
public final class ajfd {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public volatile boolean E;
    public int F;
    public int G;
    public String H;
    public float I;
    public long J;
    public int K;
    public long L;
    public final String M;
    public final boolean N;
    public long O;
    public ScheduledFuture P;
    public int Q;
    private final xsc R;
    private final xvo S;
    private final xvo T;
    private final afmi U;
    private final xpt V;
    private final xhv W;
    private final boolean X;
    private final ScheduledExecutorService Y;
    private final afpu Z;
    public final aakm a;
    private final Runnable aa;
    private long ab;
    private List ac;
    public final aakm b;
    public final aakm c;
    public final xvo d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final xrt l;
    public final afqv m;
    public final afmq n;
    public final ajfk o;
    public final afti p;
    public final int q;
    public final int[] r;
    public int s;
    public final zzl t;
    public ahjn u;
    public long v;
    public long w;
    public long x;
    public boolean y;
    public boolean z;

    public static boolean a(aajj aajj, aiqf aiqf) {
        boolean z = true;
        if (aiqf.q != 2) {
            if (aajj != null) {
                if (!aajj.m()) {
                    if (aajj.n()) {
                        if (aiqf.q == 1) {
                            return z;
                        }
                        return false;
                    }
                }
            }
            z = false;
        }
        return z;
    }

    private static boolean b(int i) {
        return i == 0;
    }

    ajfd(ScheduledExecutorService scheduledExecutorService, afqv afqv, afmq afmq, xsc xsc, xhv xhv, xrt xrt, afmi afmi, afti afti, xpt xpt, ahhq ahhq, afpu afpu, zzl zzl, aiqf aiqf, airt airt, aakj aakj, String str, int i) {
        aiqf aiqf2 = aiqf;
        aakm aakm = aakj.m().b;
        aakm aakm2 = aakj.m().c;
        aakm aakm3 = aakj.m().d;
        String b = aakj.b();
        long toMillis = !aipo.d(zzl) ? TimeUnit.SECONDS.toMillis((long) aakj.h()) : 0;
        aakm aakm4 = aakj.m().c;
        int a = aakm4 != null ? aakm4.a(!airt.e() ? 0 : 4) : 0;
        boolean z = ajfd.b(i) && airt.e();
        boolean z2 = ajfd.b(i) && airt.f();
        boolean j = aakj.j();
        boolean z3 = ajfd.b(i) && ajfd.a(aakj.n(), aiqf2);
        this(scheduledExecutorService, afqv, afmq, xsc, aakm, aakm2, aakm3, b, toMillis, a, z, z2, j, z3, str, ajfd.b(i) ? airt.h() : null, xsc.b(), "-", 1.0f, aiqf.j(), aiqf2.r, xhv, xrt, afmi, xpt, afti, aakj.m().i, aakj.m().j, 0, ahhq.b(), (String) ahhq.i().get(), afpu, zzl, xrt.a(), -1);
    }

    ajfd(ScheduledExecutorService scheduledExecutorService, afqv afqv, afmq afmq, xsc xsc, xhv xhv, xrt xrt, afmi afmi, afti afti, xpt xpt, ahhq ahhq, afpu afpu, zzl zzl, aiqf aiqf, ajfh ajfh) {
        ajfh ajfh2 = ajfh;
        ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
        afqv afqv2 = afqv;
        afmq afmq2 = afmq;
        xsc xsc2 = xsc;
        xhv xhv2 = xhv;
        xrt xrt2 = xrt;
        afmi afmi2 = afmi;
        afti afti2 = afti;
        xpt xpt2 = xpt;
        afpu afpu2 = afpu;
        zzl zzl2 = zzl;
        aakm aakm = ajfh2.a;
        aakm aakm2 = ajfh2.b;
        aakm aakm3 = ajfh2.c;
        String str = ajfh2.g;
        long j = ajfh2.f;
        int i = ajfh2.j;
        boolean z = ajfh2.l;
        boolean z2 = ajfh2.m;
        ajfh ajfh3 = ajfh2;
        boolean z3 = ajfh2.r;
        boolean z4 = ajfh3.s;
        String str2 = ajfh3.h;
        String str3 = ajfh3.i;
        long j2 = ajfh3.d;
        String str4 = ajfh3.x;
        float f = ajfh3.y;
        ahjn j3 = aiqf.j();
        int i2 = aiqf.r;
        int i3 = ajfh3.z;
        int[] iArr = ajfh3.A;
        int i4 = ajfh3.B;
        boolean b = ahhq.b();
        String str5 = ajfh3.C;
        int i5 = ajfh3.v;
        long j4 = ajfh3.w;
        this(scheduledExecutorService, afqv, afmq2, xsc2, aakm, aakm2, aakm3, str, j, i, z, z2, z3, z4, str2, str3, j2, str4, f, j3, i2, xhv2, xrt2, afmi2, xpt2, afti2, i3, iArr, i4, b, str5, afpu2, zzl2, i5, j4);
        ajfh3 = ajfh;
        this.v = ajfh3.e;
        this.x = ajfh3.k;
        this.y = ajfh3.n;
        this.z = ajfh3.p;
        this.A = ajfh3.o;
        this.E = ajfh3.q;
        this.F = ajfh3.t;
        this.G = ajfh3.u;
    }

    public final boolean a() {
        boolean z = true;
        if (this.q <= 0) {
            int[] iArr = this.r;
            if (iArr != null) {
                return this.s < iArr.length ? z : false;
            } else {
                z = false;
            }
        }
    }

    private final long h() {
        return this.R.b() - this.e;
    }

    public final void a(boolean z) {
        this.B = z;
        this.o.c = z;
    }

    public final void a(long j) {
        e();
        this.v = j;
        d();
    }

    public final void b() {
        e();
        if (this.A) {
            a(4);
        }
    }

    public final boolean c() {
        return this.L != -1;
    }

    public final synchronized void d() {
        if (this.B && !this.C) {
            i();
        }
    }

    private final synchronized void i() {
        this.C = true;
        ajfj ajfj = new ajfj();
        ajfj.a = ajfd.b(k());
        ajfj.c = String.valueOf(this.W.k());
        ajfj.e = this.H;
        ajfj.i = this.I;
        ajfj.d = this.u.a.a();
        ajfj.f = airj.b(this.Q);
        ajfj.g = !this.u.f ? "0" : "1";
        ajfj.j = this.l.a();
        ajfj.h = !this.D ? "0" : "1";
        this.ac.add(ajfj);
    }

    public final synchronized void e() {
        if (this.C && !this.ac.isEmpty()) {
            List list = this.ac;
            ((ajfj) list.get(list.size() - 1)).b = ajfd.b(k());
            this.C = false;
        }
    }

    public final void f() {
        aakm aakm = this.b;
        if (aakm != null && !this.y) {
            int i = this.i;
            if (i != 0 && this.x >= ((long) (i * 1000))) {
                this.y = true;
                a(this.S, aakm, false);
            }
        }
    }

    public final void a(xvo xvo, aakm aakm, boolean z) {
        long h = h();
        String b = ajfd.b(h);
        xvo = xvo.a(xvo);
        a(xvo, b);
        xvo.b("cmt", ajfd.b(k()));
        xvo a = xvo.a("conn", this.W.k());
        a.b("vis", this.u.a.a());
        a.b("uao", airj.b(this.Q));
        a.b("muted", !this.D ? "0" : "1");
        a.b("volume", String.valueOf(this.l.a()));
        int i = this.i;
        if (i > 0) {
            xvo.a("delay", i);
        }
        if (!TextUtils.equals(this.H, "-")) {
            xvo.b("cc", this.H);
        }
        float f = this.I;
        if (f != 1.0f) {
            xvo.b("rate", String.valueOf(f));
        }
        if (z) {
            a(xvo, 1, h);
        }
        a(this.Z.c(), xvo, new aakn(aakm));
    }

    public final synchronized void g() {
        if (!this.z) {
            e();
            a(2);
            d();
        }
    }

    private final void a(xvo xvo) {
        if (xvo != null) {
            xvo.b("cpn", this.g);
            xvo.b("ns", "yt");
            xvo.b("docid", this.f);
            xvo.b("ver", "2");
            this.U.b(xvo);
            String str = "el";
            String str2 = "1";
            if (xvo.b("adformat") != null) {
                xvo.b(str, "adunit");
            } else {
                xvo.b(str, "detailpage");
                if (this.j && !TextUtils.isEmpty(this.h)) {
                    xvo.b(ahhv.AUTONAV, str2);
                }
            }
            if (!TextUtils.isEmpty(this.h)) {
                xvo.b("list", this.h);
            }
            if (this.j) {
                xvo.b("autoplay", str2);
            }
            if (this.k) {
                xvo.b("splay", str2);
            }
            if (!this.X) {
                xvo.b("dnc", str2);
            }
            if (!TextUtils.isEmpty(this.M)) {
                xvo.b("referring_app", this.M);
            }
        }
    }

    private final void a(xvo xvo, String str) {
        for (Entry entry : this.U.b().entrySet()) {
            xvo.b((String) entry.getKey(), (String) entry.getValue());
        }
        xvo.b("rt", str);
        xvo.b("len", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.J)));
        xpt xpt = this.V;
        if (xpt != null) {
            xvo.b("lact", String.valueOf(xpt.b()));
        }
        if (this.G == 0 && this.F == 0) {
            xtl.d("Warning: Sending VSS ping without a format parameter.");
        }
        int i = this.F;
        if (i > 0) {
            xvo.a("fmt", i);
        }
        i = this.G;
        if (i > 0 && i != this.F) {
            xvo.a("afmt", i);
        }
    }

    private final synchronized List j() {
        List list;
        if (this.ac.isEmpty()) {
            i();
            e();
        }
        list = this.ac;
        this.ac = new ArrayList();
        return list;
    }

    private final void a(afpt afpt, xvo xvo, afsd afsd) {
        if (this.z) {
            String str = this.g;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 65);
            stringBuilder.append("Final ping for playback ");
            stringBuilder.append(str);
            stringBuilder.append(" has already been sent - Ignoring request");
            xtl.d(stringBuilder.toString());
        } else if (this.E) {
            String.valueOf(this.g).length();
        } else {
            this.Y.execute(new ajff(this, xvo, afsd, afpt));
        }
    }

    private final long k() {
        if (!(this.N && aipo.a(this.t).g)) {
            long j = this.v;
            long j2 = this.J;
            if (j > j2 && j2 != 0) {
                StringBuilder stringBuilder = new StringBuilder(110);
                stringBuilder.append("Reported playback position ");
                stringBuilder.append(j);
                stringBuilder.append(" is greater than the duration of the video ");
                stringBuilder.append(j2);
                xtl.d(stringBuilder.toString());
                return this.J;
            }
        }
        return this.v;
    }

    private static String b(long j) {
        j += 50;
        String valueOf = String.valueOf(j / 1000);
        String valueOf2 = String.valueOf((j % 1000) / 100);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(".");
        stringBuilder.append(valueOf2);
        return stringBuilder.toString();
    }

    @Deprecated
    private ajfd(ScheduledExecutorService scheduledExecutorService, afqv afqv, afmq afmq, xsc xsc, aakm aakm, aakm aakm2, aakm aakm3, String str, long j, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, String str3, long j2, String str4, float f, ahjn ahjn, int i2, xhv xhv, xrt xrt, afmi afmi, xpt xpt, afti afti, int i3, int[] iArr, int i4, boolean z5, String str5, afpu afpu, zzl zzl, int i5, long j3) {
        aakm aakm4 = aakm2;
        ahjn ahjn2 = ahjn;
        this.aa = new ajfc(this);
        this.Y = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
        this.m = (afqv) amqw.a((Object) afqv);
        this.n = (afmq) amqw.a((Object) afmq);
        this.R = xsc;
        this.a = (aakm) amqw.a((Object) aakm);
        this.d = xvo.a(aakm.a());
        this.b = aakm4;
        this.S = aakm4 != null ? xvo.a(aakm2.a()) : null;
        this.c = (aakm) amqw.a((Object) aakm3);
        this.T = xvo.a(aakm3.a());
        this.t = zzl;
        this.f = str;
        this.J = j;
        this.i = i;
        this.j = z;
        this.k = z2;
        this.N = z3;
        this.D = z4;
        this.g = str2;
        this.e = j2;
        this.H = str4;
        this.I = f;
        this.u = ahjn2;
        this.Q = i2;
        this.W = xhv;
        this.l = xrt;
        this.U = afmi;
        this.h = str3;
        this.x = 0;
        this.V = xpt;
        this.p = (afti) amqw.a((Object) afti);
        this.X = z5;
        this.o = new ajfk(xhv, ahjn2 != null ? ahjn2.a : null, i2, xsc, this.e, str2);
        this.p.a(this.o);
        this.q = i3;
        this.r = iArr;
        this.s = i4;
        this.ac = new ArrayList();
        this.M = str5 == null ? "" : str5;
        this.Z = afpu;
        this.K = i5;
        this.L = j3;
        a(this.d);
        a(this.T);
        a(this.S);
    }

    public final synchronized void a(int i) {
        int i2 = i;
        synchronized (this) {
            int i3;
            long h = h();
            String b = ajfd.b(h);
            xvo a = xvo.a(this.T);
            a(a, b);
            List j = j();
            a.b("state", !this.B ? "paused" : "playing");
            if (this.N) {
                long j2 = this.w;
                if (j2 > 0) {
                    a.a("lio", ajfd.b(j2));
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("st", new StringBuilder());
            hashMap.put("et", new StringBuilder());
            hashMap.put("conn", new StringBuilder());
            hashMap.put("vis", new StringBuilder());
            hashMap.put("uao", new StringBuilder());
            hashMap.put("cc", new StringBuilder());
            hashMap.put("rate", new StringBuilder());
            hashMap.put("blo", new StringBuilder());
            if (aipo.e(this.t)) {
                hashMap.put("muted", new StringBuilder());
            }
            hashMap.put("volume", new StringBuilder());
            Iterator it = j.iterator();
            String str = "";
            Object obj = null;
            Object obj2 = null;
            int i4 = 0;
            while (true) {
                i3 = 1;
                if (!it.hasNext()) {
                    break;
                }
                ajfj ajfj = (ajfj) it.next();
                if (j.size() != 1) {
                    if (ajfj.a.equals(ajfj.b)) {
                    }
                }
                StringBuilder stringBuilder = (StringBuilder) hashMap.get("st");
                stringBuilder.append(str);
                stringBuilder.append(ajfj.a);
                stringBuilder = (StringBuilder) hashMap.get("et");
                stringBuilder.append(str);
                stringBuilder.append(ajfj.b);
                stringBuilder = (StringBuilder) hashMap.get("conn");
                stringBuilder.append(str);
                stringBuilder.append(ajfj.c);
                stringBuilder = (StringBuilder) hashMap.get("vis");
                stringBuilder.append(str);
                stringBuilder.append(ajfj.d);
                stringBuilder = (StringBuilder) hashMap.get("uao");
                stringBuilder.append(str);
                stringBuilder.append(ajfj.f);
                stringBuilder = (StringBuilder) hashMap.get("cc");
                stringBuilder.append(str);
                stringBuilder.append(ajfj.e);
                stringBuilder = (StringBuilder) hashMap.get("rate");
                stringBuilder.append(str);
                stringBuilder.append(ajfj.i);
                stringBuilder = (StringBuilder) hashMap.get("blo");
                stringBuilder.append(str);
                stringBuilder.append(ajfj.g);
                if (aipo.e(this.t)) {
                    stringBuilder = (StringBuilder) hashMap.get("muted");
                    stringBuilder.append(str);
                    stringBuilder.append(ajfj.h);
                }
                stringBuilder = (StringBuilder) hashMap.get("volume");
                stringBuilder.append(str);
                stringBuilder.append(ajfj.j);
                if (!ajfj.e.equals("-")) {
                    obj = 1;
                }
                if (ajfj.i != 1.0f) {
                    obj2 = 1;
                }
                if (TextUtils.equals("0", ajfj.g)) {
                    i3 = i4;
                }
                str = ",";
                i4 = i3;
            }
            if (obj == null) {
                hashMap.remove("cc");
            }
            if (obj2 == null) {
                hashMap.remove("rate");
            }
            if (i4 == 0) {
                hashMap.remove("blo");
            }
            for (Entry entry : hashMap.entrySet()) {
                if (((StringBuilder) entry.getValue()).toString().length() > 0) {
                    a.a((String) entry.getKey(), ((StringBuilder) entry.getValue()).toString(), ",:");
                }
            }
            if (i2 == 3) {
                a.b("final", "1");
            }
            if (a()) {
                a(a, i2, h);
            }
            a(this.Z.c(), a, new aakn(this.c));
            boolean z = this.z;
            if (i2 != 3) {
                i3 = 0;
            }
            this.z = z | i3;
        }
    }

    private final void a(xvo xvo, int i, long j) {
        long j2 = this.ab;
        if (j2 > 0 && i != 1) {
            xvo.b("rti", ajfd.b(j2));
        }
        if (this.r != null) {
            while (this.s < this.r.length) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                int[] iArr = this.r;
                int i2 = this.s;
                this.s = i2 + 1;
                j2 = timeUnit.toMillis((long) iArr[i2]);
                if (j2 > j) {
                    break;
                }
            }
        }
        j2 = this.q > 0 ? TimeUnit.SECONDS.toMillis((long) this.q) + j : 0;
        if (j2 != 0) {
            ScheduledFuture scheduledFuture;
            if (i == 1 || (i == 2 && (this.B || (this.R.b() < this.O && !this.B)))) {
                xvo.b("rtn", ajfd.b(j2));
                this.ab = j2;
                scheduledFuture = this.P;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                this.P = this.Y.schedule(this.aa, j2 - j, TimeUnit.MILLISECONDS);
            } else {
                if (i == 4) {
                    scheduledFuture = this.P;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                    }
                }
                this.P = null;
                this.ab = 0;
            }
        }
    }
}
