package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: adtp */
public final class adtp implements adgi, adqf, adtw {
    private static final String e = xtl.b("MDX.GcoreSessionManager");
    public final List a;
    public final Set b;
    public volatile adtq c;
    public final bapu d;
    private int f = 2;
    private final bapu g;
    private final xci h;
    private final xsc i;
    private final bapu j;
    private acxt k;
    private final bapu l;
    private long m;
    private final bapu n;
    private final adtk o;
    private final bapu p;
    private final bapu q;
    private final adeh r;
    private final aebl s;
    private final bapu t;
    private final aduc u = new adtt(this);

    public adtp(bapu bapu, xci xci, xsc xsc, bapu bapu2, bapu bapu3, bapu bapu4, bapu bapu5, bapu bapu6, bapu bapu7, adeh adeh, aebl aebl, bapu bapu8, Set set) {
        this.g = (bapu) amqw.a((Object) bapu);
        this.h = (xci) amqw.a((Object) xci);
        this.a = new CopyOnWriteArrayList(set);
        this.c = null;
        this.i = (xsc) amqw.a((Object) xsc);
        this.l = bapu2;
        this.j = (bapu) amqw.a((Object) bapu3);
        this.n = (bapu) amqw.a((Object) bapu4);
        this.o = new adtk(this);
        this.d = bapu5;
        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
        this.p = bapu6;
        this.q = bapu7;
        this.r = adeh;
        this.s = aebl;
        this.t = bapu8;
    }

    public final void a() {
        ((adbj) this.t.get()).a();
        ((aebi) this.q.get()).b();
        ((adtz) this.d.get()).a(this.u);
        ((adtz) this.d.get()).a();
    }

    public final void b() {
        ((adbj) this.t.get()).b();
    }

    public final void a(adqi adqi) {
        this.a.add((adqi) amqw.a((Object) adqi));
    }

    public final void b(adqi adqi) {
        this.a.remove(amqw.a((Object) adqi));
    }

    public final void a(adqh adqh) {
        this.b.add(adqh);
    }

    public final void b(adqh adqh) {
        this.b.remove(adqh);
    }

    public final adqe c() {
        return this.c;
    }

    public final void a(adqe adqe) {
        adqe adqe2 = adqe;
        if (adqe2 == this.c) {
            int i = this.f;
            int d = adqe.d();
            if (this.f != d) {
                this.f = d;
                String str;
                String valueOf;
                StringBuilder stringBuilder;
                String str2;
                Locale locale;
                aupo aupo;
                asmz asmz;
                long b;
                int P;
                int i2;
                adiq adiq;
                asmw asmw;
                if (d == 0) {
                    str = e;
                    valueOf = String.valueOf(adqe.h());
                    stringBuilder = new StringBuilder(valueOf.length() + 26);
                    stringBuilder.append("MDX session connecting to ");
                    stringBuilder.append(valueOf);
                    xtl.c(str, stringBuilder.toString());
                    this.m = this.i.b();
                    this.r.a = adqe2;
                    adtj adtj = (adtj) this.l.get();
                    amqw.a((Object) adqe);
                    int P2 = adqe.P();
                    boolean e = adqe.e();
                    str2 = adtj.a;
                    locale = Locale.US;
                    Object[] objArr = new Object[3];
                    int i3 = P2 - 1;
                    if (P2 != 0) {
                        objArr[0] = Integer.valueOf(i3);
                        objArr[1] = Integer.valueOf(i);
                        objArr[2] = Boolean.valueOf(e);
                        xtl.c(str2, String.format(locale, "mdx session started: sessionType=%d prevState=%d reconnect=%s", objArr));
                        auqo auqo = (auqo) auql.f.createBuilder();
                        auqo.copyOnWrite();
                        auql auql = (auql) auqo.instance;
                        if (P2 != 0) {
                            auql.a |= 1;
                            auql.b = i3;
                            i = adtj.b(i);
                            auqo.copyOnWrite();
                            auql auql2 = (auql) auqo.instance;
                            if (i != 0) {
                                auql2.a |= 2;
                                auql2.c = i - 1;
                                auqo.copyOnWrite();
                                auql auql3 = (auql) auqo.instance;
                                auql3.a |= 4;
                                auql3.d = e;
                                if (adqe.P() == 3) {
                                    aupo = (aupo) aupl.e.createBuilder();
                                    adiq adiq2 = (adiq) adqe.h();
                                    aupo.a(adtj.a(adiq2.k.b()));
                                    aupo.b(adiq2.o());
                                    aupo.a(adiq2.n());
                                    adtj.a((aupl) ((anxl) aupo.build()));
                                    auqo.copyOnWrite();
                                    auql2 = (auql) auqo.instance;
                                    auql2.e = (aupl) ((anxl) aupo.build());
                                    auql2.a |= 8;
                                }
                                asmz = (asmz) asmw.f.createBuilder();
                                asmz.copyOnWrite();
                                asmw asmw2 = (asmw) asmz.instance;
                                asmw2.c = (anxl) auqo.build();
                                asmw2.b = 25;
                                adtj.b.a((asmw) ((anxl) asmz.build()));
                                ((adqm) this.p.get()).a(adqe2);
                                new Handler(Looper.getMainLooper()).post(new adts(this, adqe2));
                            } else {
                                throw new NullPointerException();
                            }
                        }
                        throw new NullPointerException();
                    }
                    throw null;
                } else if (d == 1) {
                    str = e;
                    valueOf = String.valueOf(adqe.h());
                    stringBuilder = new StringBuilder(valueOf.length() + 25);
                    stringBuilder.append("MDX session connected to ");
                    stringBuilder.append(valueOf);
                    xtl.c(str, stringBuilder.toString());
                    b = this.i.b() - this.m;
                    adtj adtj2 = (adtj) this.l.get();
                    amqw.a((Object) adqe);
                    P = adqe.P();
                    boolean e2 = adqe.e();
                    String str3 = adtj.a;
                    Locale locale2 = Locale.US;
                    Object[] objArr2 = new Object[4];
                    i2 = P - 1;
                    if (P != 0) {
                        objArr2[0] = Integer.valueOf(i2);
                        objArr2[1] = Integer.valueOf(i);
                        objArr2[2] = Long.valueOf(b);
                        objArr2[3] = Boolean.valueOf(e2);
                        xtl.c(str3, String.format(locale2, "mdx session connected: sessionType=%d prevState=%d msSinceStart=%d reconnect=%s", objArr2));
                        auqe auqe = (auqe) auqb.g.createBuilder();
                        auqe.copyOnWrite();
                        auqb auqb = (auqb) auqe.instance;
                        if (P != 0) {
                            auqb.a |= 1;
                            auqb.b = i2;
                            i = adtj.b(i);
                            auqe.copyOnWrite();
                            auqb auqb2 = (auqb) auqe.instance;
                            if (i != 0) {
                                auqb2.a |= 2;
                                auqb2.c = i - 1;
                                auqe.copyOnWrite();
                                auqb auqb3 = (auqb) auqe.instance;
                                auqb3.a |= 4;
                                auqb3.d = b;
                                auqe.copyOnWrite();
                                auqb3 = (auqb) auqe.instance;
                                auqb3.a |= 8;
                                auqb3.e = e2;
                                if (adqe.P() == 3) {
                                    aupo = (aupo) aupl.e.createBuilder();
                                    adiq = (adiq) adqe.h();
                                    aupo.a(adtj.a(adiq.k.b()));
                                    aupo.b(adiq.o());
                                    aupo.a(adiq.n());
                                    adtj.a((aupl) ((anxl) aupo.build()));
                                    auqe.copyOnWrite();
                                    auqb auqb4 = (auqb) auqe.instance;
                                    auqb4.f = (aupl) ((anxl) aupo.build());
                                    auqb4.a |= 16;
                                }
                                asmz = (asmz) asmw.f.createBuilder();
                                asmz.copyOnWrite();
                                asmw = (asmw) asmz.instance;
                                asmw.c = (anxl) auqe.build();
                                asmw.b = 26;
                                adtj2.b.a((asmw) ((anxl) asmz.build()));
                                this.p.get();
                                acxt acxt = this.k;
                                if (acxt != null) {
                                    acxt.a("mdx_ls");
                                }
                                h();
                                new Handler(Looper.getMainLooper()).post(new adtr(this, adqe2));
                            } else {
                                throw new NullPointerException();
                            }
                        }
                        throw new NullPointerException();
                    }
                    throw null;
                } else if (d != 2) {
                    String str4 = e;
                    i = this.f;
                    StringBuilder stringBuilder2 = new StringBuilder(39);
                    stringBuilder2.append("invalid mdxConnectionState: ");
                    stringBuilder2.append(i);
                    Log.wtf(str4, stringBuilder2.toString());
                    return;
                } else {
                    str = e;
                    String valueOf2 = String.valueOf(adqe.h());
                    StringBuilder stringBuilder3 = new StringBuilder(valueOf2.length() + 30);
                    stringBuilder3.append("MDX session disconnected from ");
                    stringBuilder3.append(valueOf2);
                    xtl.c(str, stringBuilder3.toString());
                    b = this.i.b() - this.m;
                    adtj adtj3 = (adtj) this.l.get();
                    amqw.a((Object) adqe);
                    int P3 = adqe.P();
                    i2 = adqe.I();
                    Integer c = adqe.c();
                    boolean e3 = adqe.e();
                    locale = Locale.US;
                    Object[] objArr3 = new Object[6];
                    P = P3 - 1;
                    if (P3 != 0) {
                        objArr3[0] = Integer.valueOf(P);
                        int i4 = i2 - 1;
                        if (i2 != 0) {
                            objArr3[1] = Integer.valueOf(i4);
                            objArr3[2] = Integer.valueOf(i);
                            objArr3[3] = Long.valueOf(b);
                            objArr3[4] = c;
                            objArr3[5] = Boolean.valueOf(e3);
                            valueOf = String.format(locale, "mdx session disconnected: sessionType=%d disconnectReason=%d prevState=%d msSinceStart=%d errorCode=%d reconnect=%s", objArr3);
                            if (adqe.K()) {
                                xtl.b(adtj.a, valueOf);
                            } else {
                                xtl.c(adtj.a, valueOf);
                            }
                            auqg auqg = (auqg) auqd.i.createBuilder();
                            auqg.copyOnWrite();
                            auqd auqd = (auqd) auqg.instance;
                            if (P3 != 0) {
                                auqd.a |= 1;
                                auqd.b = P;
                                auqg.copyOnWrite();
                                auqd auqd2 = (auqd) auqg.instance;
                                if (i2 != 0) {
                                    auqd2.a |= 256;
                                    auqd2.g = i4;
                                    if (P3 == 2 && c != null) {
                                        str2 = "cast status error code set: ";
                                        String str5;
                                        String valueOf3;
                                        StringBuilder stringBuilder4;
                                        if (adqe.K()) {
                                            str5 = adtj.a;
                                            valueOf3 = String.valueOf(c);
                                            stringBuilder4 = new StringBuilder(valueOf3.length() + 28);
                                            stringBuilder4.append(str2);
                                            stringBuilder4.append(valueOf3);
                                            xtl.b(str5, stringBuilder4.toString());
                                        } else {
                                            str5 = adtj.a;
                                            valueOf3 = String.valueOf(c);
                                            stringBuilder4 = new StringBuilder(valueOf3.length() + 28);
                                            stringBuilder4.append(str2);
                                            stringBuilder4.append(valueOf3);
                                            xtl.c(str5, stringBuilder4.toString());
                                        }
                                        i4 = c.intValue();
                                        auqg.copyOnWrite();
                                        auqd2 = (auqd) auqg.instance;
                                        auqd2.a |= 512;
                                        auqd2.h = i4;
                                    }
                                    i = adtj.b(i);
                                    auqg.copyOnWrite();
                                    auqd auqd3 = (auqd) auqg.instance;
                                    if (i != 0) {
                                        auqd3.a |= 4;
                                        auqd3.c = i - 1;
                                        auqg.copyOnWrite();
                                        auqd auqd4 = (auqd) auqg.instance;
                                        auqd4.a |= 8;
                                        auqd4.d = b;
                                        auqg.copyOnWrite();
                                        auqd4 = (auqd) auqg.instance;
                                        auqd4.a |= 32;
                                        auqd4.e = e3;
                                        if (adqe.P() == 3) {
                                            aupo = (aupo) aupl.e.createBuilder();
                                            adiq = (adiq) adqe.h();
                                            aupo.a(adtj.a(adiq.k.b()));
                                            aupo.b(adiq.o());
                                            aupo.a(adiq.n());
                                            adtj.a((aupl) ((anxl) aupo.build()));
                                            auqg.copyOnWrite();
                                            auqd auqd5 = (auqd) auqg.instance;
                                            auqd5.f = (aupl) ((anxl) aupo.build());
                                            auqd5.a |= 64;
                                        }
                                        asmz = (asmz) asmw.f.createBuilder();
                                        asmz.copyOnWrite();
                                        asmw = (asmw) asmz.instance;
                                        asmw.c = (anxl) auqg.build();
                                        asmw.b = 27;
                                        adtj3.b.a((asmw) ((anxl) asmz.build()));
                                        this.r.a = null;
                                        ((adqm) this.p.get()).c(adqe2);
                                        this.c = null;
                                        this.k = null;
                                        h();
                                        new Handler(Looper.getMainLooper()).post(new adtu(this, adqe2));
                                    } else {
                                        throw new NullPointerException();
                                    }
                                }
                                throw new NullPointerException();
                            }
                            throw new NullPointerException();
                        }
                        throw null;
                    }
                    throw null;
                }
                this.h.d(new adqk(this.c));
            }
        }
    }

    public final int d() {
        return this.f;
    }

    public final void e() {
        ((adtz) this.d.get()).b();
    }

    public final void a(adis adis, adpw adpw) {
        adis adis2 = adis;
        adpw adpw2 = adpw;
        amqw.a((Object) adis);
        xtl.c(e, String.format("connectAndPlay to screen %s", new Object[]{adis.bv_()}));
        ((aebi) this.q.get()).a();
        adtq adtq = this.c;
        if (adtq == null || adtq.b() || !adtq.h().equals(adis2)) {
            adtp adtp;
            adtq adtq2;
            acxt a = ((acxw) this.j.get()).a(atyw.LATENCY_ACTION_MDX_LAUNCH);
            this.k = a;
            boolean a2 = ((adtz) this.d.get()).a(adis2);
            adtm adtm = (adtm) this.g.get();
            if (adis2 instanceof adil) {
                boolean z = adtm.C.g() == 1 || (adis.bt_() && adtm.C.g() == 2);
                if (adtm.K) {
                    adtq = new adrf((adil) adis2, adtm, adtm.a, this, adtm.o, adtm.l, a, a2, adtm.D, adtm.C, adtm.y);
                    adtp = this;
                } else {
                    String str = adtm.A;
                    if (adtm.z) {
                        adhn adhn = (adhn) adtm.x.get();
                        adhn.c.get();
                        if (adhn.a(bbb.c(), adhn.b)) {
                            str = adtm.B;
                        }
                    }
                    adrb adrb = new adrb((adil) adis2, adtm, adtm.a, this, adtm.o, str, adtm.j, adtm.k, z, adtm.l, a, a2);
                    adtp = this;
                    adtq2 = adrb;
                }
            } else if (adis2 instanceof adiq) {
                adsw adsw = new adsw((adiq) adis2, adtm, adtm.a, this, adtm.o, adtm.d, adtm.e, adtm.f, adtm.g, adtm.h, adtm.i, adtm.b, a, (addx) adtm.G.get(), adtm.F, adtm.t, a2, adtm.C);
                adtp = this;
                adtq2 = adsw;
            } else {
                acxt acxt = a;
                if (adis2 instanceof adio) {
                    adtq2 = adtm.a((adio) adis2, this, null, acxt, a2);
                    adtp = this;
                } else {
                    throw new IllegalArgumentException("Screen type not supported");
                }
            }
            adtp.c = adtq2;
            adtq2.a(adpw);
        } else if (adpw.l()) {
            xtl.c(e, "Already connected, just playing video.");
            adtq.b(adpw2);
        } else {
            xtl.c(e, "Ignore connectAndPlay on a CONNECTED remote control: non playable descriptor.");
        }
    }

    public final void a(boolean z) {
        adtq adtq = this.c;
        if (adtq != null) {
            int i = !z ? !this.s.a(adtq.P()) ? 5 : 3 : 2;
            adtq.b(i);
        }
    }

    public final adqp f() {
        return ((adtz) this.d.get()).c();
    }

    public final boolean g() {
        return ((adtz) this.d.get()).c().a() == 1;
    }

    public final void h() {
        Object obj = (g() || this.f == 1) ? 1 : null;
        ajko ajko = (ajko) this.n.get();
        ajla ajla = obj != null ? this.o : null;
        if (ajla != null) {
            ajla ajla2 = ajko.g;
            if (!(ajla2 == null || ajla2 == ajla)) {
                afpc.a(1, afpf.player, "overriding an existing dismiss plugin");
            }
        }
        ajko.g = ajla;
    }
}
