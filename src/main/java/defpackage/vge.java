package defpackage;

import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: vge */
public final class vge extends ajps implements vgz, vhb {
    public final bcaa a;
    public final vgc b;
    public final bcaa c;
    public final vrk d;
    public final bcaa e;
    public final vmv f;
    public final bapu g;
    public final xci h;
    public final zzl i;
    public String j;
    public vpd k;
    public String l;
    public vgd m;
    public ajpu n;
    private final bcaa o;
    private final CopyOnWriteArrayList p;
    private final vgv q;
    private final long r;

    public vge(bcaa bcaa, vgc vgc, vdj vdj, bcaa bcaa2, bcaa bcaa3, vrk vrk, bcaa bcaa4, vmv vmv, bapu bapu, bctz bctz, bctz bctz2, bctz bctz3, xci xci, zzl zzl, vgv vgv, CopyOnWriteArrayList copyOnWriteArrayList) {
        xci xci2 = xci;
        super(1);
        this.a = bcaa;
        this.b = vgc;
        this.c = bcaa2;
        this.o = bcaa3;
        this.d = vrk;
        this.e = bcaa4;
        this.f = vmv;
        this.g = bapu;
        this.h = xci2;
        this.i = zzl;
        this.q = vgv;
        this.p = copyOnWriteArrayList;
        this.r = vdj.f();
        bctz.c().a(new vgh(this));
        bctz.c().c(vgg.a).a(new vgj(this));
        bctz2.c().a(new vgi(this));
        bctz3.c().a(new vgl(this));
        xci2.a((Object) this, voz.class, new vgk(this));
    }

    public final void b() {
    }

    public final Parcelable d() {
        return null;
    }

    public final void a(String str, String str2, vsm vsm) {
        String valueOf = String.valueOf(vsm);
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 49) + String.valueOf(str2).length()) + valueOf.length());
        stringBuilder.append("onUnresolvedAd(contentCpn=");
        stringBuilder.append(str);
        stringBuilder.append(", breakId=");
        stringBuilder.append(str2);
        stringBuilder.append(", breakType=");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        vge.f(stringBuilder.toString());
        ((vjr) this.a.get()).a(str2, vsm, str);
    }

    public final void a(String str, String str2, vsm vsm, vso vso) {
        String valueOf = String.valueOf(vsm);
        String valueOf2 = String.valueOf(vso);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 51) + length2) + valueOf.length()) + valueOf2.length());
        stringBuilder.append("onAdEntered(contentCpn=");
        stringBuilder.append(str);
        stringBuilder.append(", breakId=");
        stringBuilder.append(str2);
        stringBuilder.append(", breakType=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", ad=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(")");
        vge.f(stringBuilder.toString());
        vgd vgd = this.m;
        if (vgd == null || !vgd.a()) {
            if (vso instanceof vsk) {
                this.h.d(new vpc());
            } else if (vso instanceof vsl) {
                ((vfw) this.g.get()).a(str2, vsm, vso);
            } else if ((vso instanceof vrx) || (vso instanceof vta)) {
                ((vjr) this.a.get()).a(str2, false);
                ((vjr) this.a.get()).a(str2, vso);
            }
        } else if (vso instanceof vrx) {
            ((vjr) this.a.get()).a(str2, vso);
        } else {
            ((vjr) this.a.get()).a(str2, vso.j, str, this.m.c);
        }
    }

    public final void a(String str, vsm vsm, vso vso, vra vra, int i, int i2) {
        String valueOf = String.valueOf(vsm);
        String valueOf2 = String.valueOf(vso);
        String valueOf3 = String.valueOf(vra);
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder((((length + 91) + length2) + valueOf2.length()) + valueOf3.length());
        stringBuilder.append("onAdEnded(breakId=");
        stringBuilder.append(str);
        stringBuilder.append(", breakType=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", ad=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", reason=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", xClickPos=");
        stringBuilder.append(i);
        stringBuilder.append(", yClickPos=");
        stringBuilder.append(i2);
        stringBuilder.append(")");
        vge.f(stringBuilder.toString());
        vgd vgd = this.m;
        if (vgd == null || !vgd.a()) {
            if ((vso instanceof vrx) || (vso instanceof vta)) {
                ((vjr) this.a.get()).b(str, vso);
            } else {
                ((vjr) this.a.get()).a(str, vsm, vso, vra, i, i2);
            }
        } else if (vso instanceof vrx) {
            ((vjr) this.a.get()).b(str, vso);
        } else {
            ((vjr) this.a.get()).a(str);
        }
    }

    public final void a() {
        afpc.a(2, afpf.ad, "PlaybackAdapter: Refused to enter break");
    }

    public final void b(String str, String str2, vsm vsm) {
        String valueOf = String.valueOf(vsm);
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 52) + String.valueOf(str2).length()) + valueOf.length());
        stringBuilder.append("onUnresolvedBreak(contentCpn=");
        stringBuilder.append(str);
        stringBuilder.append(", breakId=");
        stringBuilder.append(str2);
        stringBuilder.append(", breakType=");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        vge.f(stringBuilder.toString());
        ((vjr) this.a.get()).a(str, str2, vsm);
    }

    public final void a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 37) + String.valueOf(str2).length());
        stringBuilder.append("onBreakEntered(contentCpn=");
        stringBuilder.append(str);
        stringBuilder.append(", breakId=");
        stringBuilder.append(str2);
        stringBuilder.append(")");
        vge.f(stringBuilder.toString());
        vgd vgd = this.m;
        if (vgd == null || !vgd.a()) {
            ((vgb) this.c.get()).a(true);
        } else {
            ((vjr) this.a.get()).a(str2, true);
        }
    }

    public final void b(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 35) + String.valueOf(str2).length());
        stringBuilder.append("onBreakEnded(contentCpn=");
        stringBuilder.append(str);
        stringBuilder.append(", breakId=");
        stringBuilder.append(str2);
        stringBuilder.append(")");
        vge.f(stringBuilder.toString());
        vgd vgd = this.m;
        if (vgd == null || !vgd.a()) {
            ((vfw) this.g.get()).a();
            ((vgb) this.c.get()).a(false);
            ((vjr) this.a.get()).a(str2, str, null, false, false);
            return;
        }
        ((vjr) this.a.get()).a(str2, str, this.m.c, true, false);
    }

    public final void a(String str, vsm vsm) {
        String valueOf = String.valueOf(vsm);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 34) + valueOf.length());
        stringBuilder.append("onBreakEnded(breakId=");
        stringBuilder.append(str);
        stringBuilder.append(", breakType=");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        vge.f(stringBuilder.toString());
        ((vfw) this.g.get()).a();
        ((vgb) this.c.get()).a(false);
        ((vjr) this.a.get()).a(str, vsm);
    }

    public final void c(String str, String str2) {
        this.h.d(new vpz());
        ((vjr) this.a.get()).b(str, str2);
    }

    public final void d(String str, String str2) {
        ((vjr) this.a.get()).a(str, str2);
    }

    public final void b_(String str) {
        if (this.m != null) {
            if (wcf.d(this.i)) {
                if (this.m.a(str) != null) {
                    try {
                        this.m.a(str).b();
                    } catch (vha e) {
                        str = String.valueOf(e);
                        StringBuilder stringBuilder = new StringBuilder(str.length() + 48);
                        stringBuilder.append("PlaybackAdapter: Unable to disable slotHandler: ");
                        stringBuilder.append(str);
                        afpc.a(2, afpf.ad, stringBuilder.toString());
                    }
                }
                return;
            }
            ajmp ajmp = (vgr) this.m.b(str);
            if (ajmp != null) {
                ajmp ajmp2 = ajmp.a;
                vgd vgd = this.m;
                if (vgd != null) {
                    ajmv e2 = vgd.d.e();
                    if (e2 != null) {
                        e2.b(ajmp);
                        e2.b(ajmp2);
                    }
                }
                this.m.a(str, null);
            }
        }
    }

    private final void e(String str) {
        boolean z;
        xak.a();
        ((vgb) this.c.get()).a(false);
        ((vfw) this.g.get()).a();
        vgd vgd = this.m;
        boolean z2 = true;
        if (vgd != null) {
            vgd.c();
            if (this.m.d(str) != null) {
                z2 = false;
            }
            vgd = this.m;
            xak.a();
            ajpa ajpa = (ajpa) vgd.h.get(str);
            if (ajpa != null) {
                ajpa.a();
            }
            vgd.h.remove(str);
            z = z2;
        } else {
            z = true;
        }
        vjr vjr = (vjr) this.a.get();
        vgd = this.m;
        vjr.a(str, vgd != null ? vgd.a : null, vgd != null ? vgd.c : null, false, z);
    }

    public final void a(ahiy ahiy) {
        aett aett = ahiy.a;
        vgd vgd = this.m;
        if (vgd != null && vgd.d != null && vgd.a() && ahiy.b.equals(this.m.a) && this.m.b() != null && aett.c != -1 && aett.a() != -1) {
            vjr vjr = (vjr) this.a.get();
            vgd vgd2 = this.m;
            List list = vgd2.f;
            aett aett2 = ahiy.a;
            aakj aakj = vgd2.c;
            long d = vgd2.d.d();
            vgd vgd3 = this.m;
            vjr.a(list, aett2, aakj, d, vgd3.a, vgd3.b());
        }
    }

    public final void b(String str) {
        xak.a();
        waw waw = (waw) this.o.get();
        xak.a();
        was was = waw.i;
        if (was != null) {
            was.o();
            if (!waw.e.c) {
                was.l();
            }
        }
    }

    public final void c() {
        xak.a();
        ((waw) this.o.get()).e();
    }

    public final void a(Parcelable parcelable, ajpr ajpr) {
        xak.a();
        this.j = ajpr.b;
        if (!ajpr.a) {
            this.l = null;
            this.k = null;
            ((vfw) this.g.get()).a();
        }
    }

    @Deprecated
    public final vpd a(String str, vsm vsm, vso vso, vrd vrd) {
        vrh vgm;
        xci xci = this.h;
        vse vse = new vse(vso);
        aakj aakj = this.m.c;
        if (vso instanceof vtk) {
            vgm = new vgm(this, str, vsm, vso);
        } else {
            vgm = vrh.g;
        }
        return new vpd(xci, vse, vsm, aakj, vgm, vrd);
    }

    private final void a(String str, vqy vqy, List list) {
        vgy a = this.m.a(str);
        if (a != null) {
            if (!(list.size() != 1 || (list.get(0) instanceof vrx) || (list.get(0) instanceof vta) || (list.get(0) instanceof vtg))) {
                list = Arrays.asList(new vso[]{(vso) list.get(0), vtg.a});
            }
            a.a(vqy, list);
        }
    }

    private final void a(String str, vsm vsm, long j, long j2, vqy vqy, List list) {
        String str2 = str;
        if (this.m.a(str) == null) {
            try {
                vgy a = this.q.a(this.m, this.n, vqy, list, str, vsm, j, j2);
                this.m.a(str, a);
                a.a();
            } catch (Exception e) {
                str2 = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(str2.length() + 47);
                stringBuilder.append("PlaybackAdapter: Unable to enable slotHandler: ");
                stringBuilder.append(str2);
                afpc.a(2, afpf.ad, stringBuilder.toString());
            }
        }
    }

    public final void a(String str, vqy vqy, vsm vsm, long j, long j2, boolean z) {
        String str2 = str;
        vsm vsm2 = vsm;
        if (this.m != null) {
            if (vsm2 == vsm.PRE_ROLL) {
                this.m.c(str2);
            } else if (!this.m.e.contains(str2)) {
                this.m.e.add(str2);
            }
            vgd vgd = this.m;
            if (vgd != null && vgd.a()) {
                return;
            }
            if (wcf.d(this.i)) {
                a(str, vsm, j, j2, vqy, Arrays.asList(new vso[]{vtg.a}));
            } else if (z) {
                b(str2, vsm2);
            } else {
                vgd = this.m;
                if (vgd != null) {
                    if (!vgd.e.contains(str2)) {
                        this.m.e.add(str2);
                    }
                    ajmv e = this.m.d.e();
                    if (e != null) {
                        long j3;
                        long toMillis = TimeUnit.SECONDS.toMillis((long) this.m.c.h());
                        if (vsm2 == vsm.MID_ROLL) {
                            j3 = j - this.r;
                        } else {
                            j3 = toMillis - this.r;
                        }
                        ajmp vgt = new vgt(this, str, j3, vsm2 == vsm.MID_ROLL ? j : toMillis);
                        vgt = new vgr(this, vgt, str, vsm, ajmr.AD_MARKER, j, j2);
                        e.a(vgt);
                        e.a(vgt);
                        this.m.a(str2, vgt);
                    } else if (this.d.a) {
                        afpc.a(2, afpf.ad, "Trying to create cue ranges on null registrar.");
                    }
                }
            }
        }
    }

    /* JADX WARNING: Missing block: B:14:0x0031, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:16:0x0033, code skipped:
            return;
     */
    public final synchronized void b(java.lang.String r3, defpackage.vsm r4) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.h;	 Catch:{ all -> 0x0034 }
        r1 = new vph;	 Catch:{ all -> 0x0034 }
        r1.<init>();	 Catch:{ all -> 0x0034 }
        r0.d(r1);	 Catch:{ all -> 0x0034 }
        r0 = defpackage.vsm.PRE_ROLL;	 Catch:{ all -> 0x0034 }
        if (r4 != r0) goto L_0x0019;
    L_0x000f:
        r0 = r2.h;	 Catch:{ all -> 0x0034 }
        r1 = new vqa;	 Catch:{ all -> 0x0034 }
        r1.<init>();	 Catch:{ all -> 0x0034 }
        r0.d(r1);	 Catch:{ all -> 0x0034 }
    L_0x0019:
        r0 = r2.m;	 Catch:{ all -> 0x0034 }
        if (r0 != 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0032;
    L_0x001e:
        r0 = r0.d;	 Catch:{ all -> 0x0034 }
        if (r0 == 0) goto L_0x0032;
    L_0x0022:
        r0 = r0.f();	 Catch:{ all -> 0x0034 }
        if (r0 == 0) goto L_0x0030;
    L_0x0028:
        r1 = new vgn;	 Catch:{ all -> 0x0034 }
        r1.<init>(r2, r3, r4);	 Catch:{ all -> 0x0034 }
        r0.a(r1);	 Catch:{ all -> 0x0034 }
    L_0x0030:
        monitor-exit(r2);
        return;
    L_0x0032:
        monitor-exit(r2);
        return;
    L_0x0034:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vge.b(java.lang.String, vsm):void");
    }

    public final void a(String str, vqy vqy, List list, boolean z) {
        if (this.m != null) {
            if (!wcf.d(this.i)) {
                vso vso = (vso) list.get(0);
                if (z) {
                    boolean z2 = vso instanceof vrx;
                    if ((z2 || (vso instanceof vta)) && vso != null && (z2 || (vso instanceof vta))) {
                        ((vjr) this.a.get()).a(str, false);
                        ((vjr) this.a.get()).a(str, vso);
                        ((vjr) this.a.get()).b(str, vso);
                        vjr vjr = (vjr) this.a.get();
                        vgd vgd = this.m;
                        vjr.a(str, vgd.a, vgd.c, false, false);
                    }
                } else if ((vso instanceof vrx) || (vso instanceof vta)) {
                    ((vgr) this.m.b(str)).d = vso;
                }
            } else if (z) {
                if (list.size() == 1 && (list.get(0) instanceof vrx)) {
                    if (list.get(0) instanceof vta) {
                        afpc.a(2, afpf.ad, "Received throttledAd for preroll");
                    }
                    this.m.c(str);
                    a(str, vsm.PRE_ROLL, 0, 0, vqy, list);
                }
            } else {
                a(str, vqy, list);
            }
        }
    }

    public final void a(String str, vqy vqy, List list, vsm vsm, long j, long j2, @Deprecated aakj aakj) {
        String str2 = str;
        vsm vsm2 = vsm;
        vgd vgd = this.m;
        if (vgd != null) {
            if (vgd.a()) {
                String.valueOf(list).length();
                vgy a = this.m.a(str);
                if (a == null) {
                    try {
                        a = this.q.a(this.m, this.n, vqy, list, str, vsm, j, j2);
                        this.m.a(str, a);
                        a.a();
                        return;
                    } catch (Exception e) {
                        String valueOf = String.valueOf(e);
                        String valueOf2 = String.valueOf(Arrays.asList(Thread.currentThread().getStackTrace()));
                        valueOf.length();
                        valueOf2.length();
                        afpf afpf = afpf.ad;
                        str2 = String.valueOf(e);
                        StringBuilder stringBuilder = new StringBuilder(str2.length() + 33);
                        stringBuilder.append("Unable to schedule DAI playback: ");
                        stringBuilder.append(str2);
                        afpc.a(2, afpf, stringBuilder.toString());
                        return;
                    }
                }
                a.a(j, j2);
            } else if (wcf.d(this.i)) {
                a(str, vqy, list);
            } else if (list.isEmpty()) {
                e(str);
            } else {
                vso vso = (vso) list.get(0);
                if (vso instanceof vsl) {
                    if (vsm2 == vsm.PRE_ROLL) {
                        this.h.d(new vps());
                    }
                    vgd vgd2 = this.m;
                    ajpa d = vgd2 != null ? vgd2.d(str) : null;
                    if (d != null) {
                        ((vfw) this.g.get()).a(str, vsm2, vso);
                        d.a(aakj, vso.j, new vgo(this, str, vsm2, vso));
                    }
                } else if (vso instanceof vsk) {
                    if (vsm2 == vsm.PRE_ROLL) {
                        this.h.d(new vps());
                    }
                    if (this.m != null) {
                        this.h.d(new vpc());
                        vgp vgp = new vgp(this, str, vsm2, vso);
                        Iterator it = this.p.iterator();
                        while (it.hasNext()) {
                            vdo vdo = (vdo) it.next();
                            if (vdo.a(vgp)) {
                                this.m.a(vdo);
                                return;
                            }
                        }
                        vgp.a(vra.VIDEO_ERROR);
                    }
                } else if ((vso instanceof vrx) || (vso instanceof vta)) {
                    ((vjr) this.a.get()).a(str, vso);
                    ((vjr) this.a.get()).b(str, vso);
                    e(str);
                }
            }
        }
    }

    public final void a(vdo vdo) {
        xak.a();
        this.p.add((vdo) amqw.a((Object) vdo));
    }

    public final void b(vdo vdo) {
        xak.a();
        this.p.remove(amqw.a((Object) vdo));
    }

    public final void e() {
        xak.a();
        vgd vgd = this.m;
        if (vgd != null) {
            vgd.c();
            try {
                for (vgy b : this.m.g.values()) {
                    b.b();
                }
            } catch (vha unused) {
            }
        }
        this.l = null;
        this.k = null;
        vgb vgb = (vgb) this.c.get();
        xak.a();
        vgb.c = false;
        vgb.b.set(Boolean.valueOf(false));
        ((vjr) this.a.get()).a();
        this.m = null;
    }

    public final void a(vqy vqy, vso vso) {
        vgb vgb = (vgb) this.c.get();
        if (vqy.e() == vsm.MID_ROLL) {
            float av = vso.i() != null ? vso.i().n().av() : 0.0f;
            aakj aakj = null;
            if (vso.i() != null) {
                aakj = vso.i();
            } else if (!(vso.j() == null || vso.k() == null || vso.i == null)) {
                aakj = new aakj(vso.j(), vso.k(), vso.i);
            }
            if (aakj != null) {
                vgb.a(new vpl(vso.j));
                if (av > 0.0f && !((Boolean) vgb.b.getAndSet(Boolean.valueOf(true))).booleanValue()) {
                    vgb.a.a(aakj, (long) (av * 1000.0f), vgb);
                }
            }
        }
    }

    public final void b(String str, vsm vsm, vso vso, vra vra, int i, int i2) {
        if (this.m != null) {
            if (wcf.d(this.i)) {
                if (this.m.a(str) != null) {
                    this.m.a(str).a(vso, vra, i, i2);
                }
            } else if (vso instanceof vtk) {
                ((vjr) this.a.get()).a(str, vsm, vso, vra, i, i2);
                ((vjr) this.a.get()).a(str, vsm, this.m.a);
            }
        }
    }

    private static void f(String str) {
        str = String.valueOf(str);
        String str2 = "PACF PlaybackAdapter: ";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str2.concat(str);
        }
    }
}
