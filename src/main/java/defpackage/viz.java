package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: viz */
public final class viz implements vjr, vjt {
    public final viw a;
    public final vit b;
    public final Executor c;
    public final bcaa d;
    public final xci e;
    public final bcaa f;
    public final zzl g;
    public final bapu h;
    private final Executor i;
    private final xsc j;
    private final vju k;
    private final xua l;
    private final waq m;
    private final long n;

    public viz(viw viw, vit vit, vdj vdj, Executor executor, Executor executor2, xsc xsc, bcaa bcaa, xci xci, xua xua, vju vju, bcaa bcaa2, waq waq, zzl zzl, bapu bapu) {
        this.a = viw;
        this.b = vit;
        this.i = executor;
        this.c = executor2;
        this.j = xsc;
        this.d = bcaa;
        this.e = xci;
        this.l = (xua) amqw.a((Object) xua);
        this.k = vju;
        this.f = bcaa2;
        this.m = waq;
        this.n = vdj.d();
        this.g = zzl;
        this.h = bapu;
    }

    /* JADX WARNING: Missing block: B:34:0x00af, code skipped:
            if (r13 > r33) goto L_0x00bb;
     */
    public final void a(java.util.List r30, defpackage.aett r31, defpackage.aakj r32, long r33, java.lang.String r35, java.lang.String r36) {
        /*
        r29 = this;
        r11 = r29;
        r0 = r30;
        r10 = r31;
        r12 = r35;
        r13 = r31.a();
        r1 = 0;
        r2 = 0;
    L_0x000e:
        r3 = r30.size();
        r4 = 1;
        if (r2 >= r3) goto L_0x00a9;
    L_0x0015:
        r3 = r11.a;
        r5 = r0.get(r2);
        r5 = (java.lang.String) r5;
        r3 = r3.g(r5);
        if (r3 == 0) goto L_0x00a5;
    L_0x0023:
        r5 = r3.b();
        r5 = r5.a;
        r5 = r10.b(r5);
        if (r5 != 0) goto L_0x0031;
    L_0x002f:
        goto L_0x00a5;
    L_0x0031:
        defpackage.xak.a();
        r0 = r3.g;
        r0 = r0.get();
        r0 = (defpackage.vkd) r0;
        r2 = r3.e;
        r5 = r0.a;
        r5 = r5.b(r10);
        defpackage.amqw.b(r5);
        r5 = r0.a;
        r5 = r10.a(r5);
        if (r5 == 0) goto L_0x00a4;
    L_0x004f:
        r5 = r31.a();
        r7 = r10.c;
        if (r7 != 0) goto L_0x007c;
    L_0x0057:
        r7 = r0.b;
        r13 = r7.a();
        r13 = r5 - r13;
        r13 = java.lang.Math.abs(r13);
        r15 = 50;
        r7 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1));
        if (r7 > 0) goto L_0x006a;
    L_0x0069:
        goto L_0x007c;
    L_0x006a:
        r2.b = r5;
        r1 = r0.b;
        r13 = r1.a();
        r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1));
        if (r1 <= 0) goto L_0x0078;
    L_0x0076:
        r1 = 3;
        goto L_0x0079;
    L_0x0078:
        r1 = 2;
    L_0x0079:
        r0.e = r1;
        r1 = 1;
    L_0x007c:
        r13 = r10.e;
        r7 = r0.b;
        r8 = r7.e;
        r7 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1));
        if (r7 == 0) goto L_0x0087;
    L_0x0086:
        goto L_0x008a;
    L_0x0087:
        if (r1 != 0) goto L_0x008a;
    L_0x0089:
        goto L_0x0097;
    L_0x008a:
        r5 = r5 + r13;
        r2.c = r5;
        r1 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1));
        if (r1 <= 0) goto L_0x0093;
    L_0x0091:
        r1 = 3;
        goto L_0x0094;
    L_0x0093:
        r1 = 2;
    L_0x0094:
        r0.d = r1;
        r1 = 1;
    L_0x0097:
        r0.a = r10;
        if (r1 == 0) goto L_0x00a4;
    L_0x009b:
        r0.b = r10;
        r0 = r3.b();
        r11.a(r12, r3, r0);
    L_0x00a4:
        return;
    L_0x00a5:
        r2 = r2 + 1;
        goto L_0x000e;
    L_0x00a9:
        r1 = r10.c;
        if (r1 != 0) goto L_0x00b2;
    L_0x00ad:
        r1 = (r13 > r33 ? 1 : (r13 == r33 ? 0 : -1));
        if (r1 <= 0) goto L_0x0158;
    L_0x00b1:
        goto L_0x00bb;
    L_0x00b2:
        if (r1 != r4) goto L_0x0158;
    L_0x00b4:
        r1 = 0;
        r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1));
        if (r3 > 0) goto L_0x00bb;
    L_0x00ba:
        return;
    L_0x00bb:
        r1 = r11.k;
        r15 = r1.a(r12, r10);
        r1 = r10.e;
        r8 = r13 + r1;
        r7 = new vka;
        r3 = defpackage.vsm.MID_ROLL;
        r1 = r30.size();
        r6 = new vkc;
        r6.<init>(r13, r8);
        r4 = r4 + r1;
        r16 = 1;
        r17 = 0;
        r1 = r7;
        r2 = r15;
        r5 = r32;
        r12 = r7;
        r7 = r16;
        r18 = r8;
        r8 = r17;
        r9 = r31;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);
        r1 = r11.a;
        r2 = r12.a;
        r1.a(r2, r12);
        r1 = r11.b;
        r2 = r12.a;
        r3 = r32;
        r1.a(r2, r3);
        r0.add(r15);
        r0 = r11.h;
        r0 = r0.get();
        r20 = r0;
        r20 = (defpackage.vgz) r20;
        r0 = r12.a;
        r22 = r12.c();
        r1 = r12.b;
        r2 = r12.e;
        r4 = r2.b;
        r6 = r2.c;
        r28 = 0;
        r21 = r0;
        r23 = r1;
        r24 = r4;
        r26 = r6;
        r20.a(r21, r22, r23, r24, r26, r28);
        r15 = r12.a;
        r8 = r12.c;
        r9 = new xvk;
        r0 = r11.j;
        r1 = r11.n;
        r9.<init>(r0, r1);
        r0 = r11.b;
        r0.h(r15);
        r6 = r11.i;
        r7 = new vjj;
        r13 = r18 - r13;
        r0 = r7;
        r1 = r29;
        r2 = r32;
        r3 = r35;
        r4 = r36;
        r5 = r31;
        r10 = r6;
        r11 = r7;
        r6 = r13;
        r13 = r10;
        r10 = r15;
        r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r10);
        r13.execute(r11);
        r0 = r12.b();
        r2 = r35;
        r3 = r12;
        r1.a(r2, r3, r0);
        return;
    L_0x0158:
        r1 = r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.viz.a(java.util.List, aett, aakj, long, java.lang.String, java.lang.String):void");
    }

    public final void a(aakj aakj, boolean z, String str) {
        aakj aakj2 = aakj;
        String str2 = str;
        xak.a();
        aopb a = wcf.a(this.g);
        if (a != null && a.g) {
            ((vfk) this.f.get()).a(aakj2, z, str2);
            return;
        }
        boolean z2 = z;
        if (((vfk) this.f.get()).c(aakj2)) {
            xci xci = this.e;
            if (xci != null) {
                xci.d(new vqj());
                this.e.d(new vqb());
            }
            vqy vqy = null;
            String a2 = this.k.a(str2, vsm.PRE_ROLL, null);
            vka vka = new vka(a2, vsm.PRE_ROLL, 0, aakj, vkc.a, z, null, null);
            if (aakj.k()) {
                this.e.d(new vpy());
                a(a2, aakj2, vka, vsm.PRE_ROLL);
                this.i.execute(new viy(this, aakj, a2, vka, str));
                return;
            }
            Object obj;
            aogi r = aakj.r();
            if (r == null) {
                obj = null;
                break;
            }
            for (aogm aogm : r.c) {
                if ((aogm.a & 2) != 0) {
                    obj = null;
                    break;
                }
            }
            obj = 1;
            if (!wcf.f(this.g)) {
                List b = ((vfk) this.f.get()).b(aakj2);
                if (!b.isEmpty() && ((vsd) b.get(0)).e() == vsm.PRE_ROLL) {
                    vqy = (vsd) b.get(0);
                }
                vja vja = r0;
                Executor executor = this.i;
                vja vja2 = new vja(this, vqy, r, vka, a2, aakj, str, b);
                executor.execute(vja);
                if (!(vqy == null || obj == null)) {
                    this.e.d(new vpy());
                    a(a2, aakj, vka, vqy, vsm.PRE_ROLL);
                }
            } else if (r != null) {
                vsd vsd = new vsd(new aafx(r), 0, aakj.k(), aakj.b(), this.l.a(), aakj.y(), aakj.x());
                if (a(r)) {
                    vka.a(vsd);
                } else {
                    this.i.execute(new vjb(this, a2, vka, vsd, aakj, str));
                }
                if (obj != null) {
                    a(a2, aakj, vka, (vqy) vsd, vsm.PRE_ROLL);
                    return;
                }
                a(str, aakj);
            } else {
                a(str, aakj);
            }
        }
    }

    private final void a(String str, aakj aakj) {
        this.i.execute(new vjd(this, aakj, str));
    }

    public final void a(String str, vka vka, vsd vsd, aakj aakj, String str2) {
        this.e.d(new vpt());
        List a = ((vfk) this.f.get()).a(vsd, aakj, str2, new xvk(this.j, this.n));
        this.e.d(new vpq());
        a(str2, aakj, str, vka, vsd, vsd.e(), a);
    }

    public final void a(String str, aakj aakj, List list) {
        String str2 = str;
        if (!list.isEmpty()) {
            String a;
            Iterator it = list.iterator();
            vqy vqy = (vqy) it.next();
            vqy vqy2 = vqy;
            long a2 = vqy.i() != vsp.POST_ROLL ? vqy.a() : 9223372036854775806L;
            int i = 1;
            while (it.hasNext()) {
                vqy vqy3 = (vqy) it.next();
                long a3 = vqy3.i() != vsp.POST_ROLL ? vqy3.a() : 9223372036854775806L;
                a = this.k.a(str2, vqy2.e(), vqy2);
                int i2 = i + 1;
                a(a, aakj, viz.a(aakj, a, a3, a2, vqy2, i), vqy2, vqy2.e());
                vqy2 = vqy3;
                a2 = a3;
                i = i2;
            }
            a = this.k.a(str2, vqy2.e(), vqy2);
            a(a, aakj, viz.a(aakj, a, 9223372036854775806L, a2, vqy2, i), vqy2, vqy2.e());
        }
    }

    public final boolean a(aogi aogi) {
        if (!wcf.i(this.g)) {
            return false;
        }
        boolean z = false;
        for (aogm aogm : aogi.c) {
            if ((aogm.a & 1) != 0) {
                if (z) {
                    return false;
                }
                z = true;
            }
        }
        return z;
    }

    public final void a(String str, aakj aakj, vka vka, vsm vsm) {
        if (vsm == vsm.PRE_ROLL) {
            this.a.a(str, vka);
            this.b.a(str, aakj);
            this.b.h(str);
            ((vgz) this.h.get()).a(str, vth.c, vsm.PRE_ROLL, 0, 0, true);
        }
    }

    public final void a(String str, aakj aakj, vka vka, vqy vqy, vsm vsm) {
        this.a.a(str, vka);
        this.a.a(str, vqy);
        this.b.a(str, aakj);
        if (vsm == vsm.PRE_ROLL) {
            this.b.h(str);
        }
        vgz vgz = (vgz) this.h.get();
        vkc vkc = vka.e;
        vgz.a(str, vqy, vsm, vkc.b, vkc.c, vsm == vsm.PRE_ROLL);
    }

    public final void a(String str, aakj aakj, String str2, vka vka, vqy vqy, vsm vsm, List list) {
        this.a.a(str2, vka);
        this.a.a(str2, vqy);
        this.b.a(str2, aakj);
        a(str2, str, list, vka);
        if (!wcf.c(this.g)) {
            this.b.a(vka);
        }
        if (vsm == vsm.PRE_ROLL && !list.isEmpty()) {
            if ((((vse) list.get(0)).a instanceof vrx) || (((vse) list.get(0)).a instanceof vta)) {
                this.b.b(str2, new vjc(this, str, vqy, str2));
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, vqy vqy, vso vso) {
        if (vso instanceof vrj) {
            ((waw) this.d.get()).a(str, vqy, ((vrj) vso).b);
        } else {
            ((waw) this.d.get()).a(str, vqy, vso);
        }
    }

    private static vka a(aakj aakj, String str, long j, long j2, vqy vqy, int i) {
        long j3 = j;
        long j4 = j2;
        return new vka(str, vqy.e(), i, aakj, new vkc(j2, j), false, vqy, null);
    }

    public final vpd a(String str, List list, String str2, aakj aakj) {
        vpd a = str != null ? a(str, this.a.i(str), str2, aakj) : null;
        if (a == null) {
            for (int i = 0; i < list.size(); i++) {
                a = a((String) list.get(i), this.a.i((String) list.get(i)), str2, aakj);
                if (a != null) {
                    break;
                }
            }
        }
        return a;
    }

    private final vpd a(String str, vsm vsm, String str2, aakj aakj) {
        vrs b = this.b.b(str, str2);
        if (b == null) {
            return null;
        }
        vso a = b.a();
        return new vpd(this.e, new vse(a), vsm, aakj, new vjg(this, str, vsm, a), b.b());
    }

    public final void a() {
        xak.a();
        this.a.a();
        this.b.a();
    }

    public final void a(String str, String str2, aakj aakj, boolean z, boolean z2) {
        if (z) {
            this.e.d(new vqc(aakj, null, false));
            vkd b = this.a.b(str);
            List<vso> d = this.b.d(str);
            if (!d.isEmpty()) {
                waw waw = (waw) this.d.get();
                xak.a();
                waw.h = null;
                waw.i = null;
            }
            if (!(b == null || b.c)) {
                waq waq = this.m;
                long j = 0;
                for (vso f : d) {
                    j += TimeUnit.SECONDS.toMillis((long) f.f());
                }
                aooc aooc = (aooc) aood.i.createBuilder();
                aooc.copyOnWrite();
                aood aood = (aood) aooc.instance;
                if (str2 != null) {
                    aood.a |= 1;
                    aood.b = str2;
                    long j2 = b.b.e;
                    aooc.copyOnWrite();
                    aood aood2 = (aood) aooc.instance;
                    aood2.a |= 2;
                    aood2.c = j2;
                    aooc.copyOnWrite();
                    aood2 = (aood) aooc.instance;
                    aood2.a |= 4;
                    aood2.d = j;
                    int i = b.e;
                    aooc.copyOnWrite();
                    aood = (aood) aooc.instance;
                    if (i != 0) {
                        aood.a |= 8;
                        aood.e = i - 1;
                        i = b.d;
                        aooc.copyOnWrite();
                        aood = (aood) aooc.instance;
                        if (i != 0) {
                            aood.a |= 16;
                            aood.f = i - 1;
                            str2 = b.b.b;
                            aooc.copyOnWrite();
                            aood = (aood) aooc.instance;
                            if (str2 != null) {
                                aood.a |= 128;
                                aood.g = str2;
                                aooc.copyOnWrite();
                                aood2 = (aood) aooc.instance;
                                aood2.a |= 256;
                                aood2.h = 4;
                                aood aood3 = (aood) ((anxl) aooc.build());
                                asmz asmz = (asmz) asmw.f.createBuilder();
                                aons aons = (aons) aont.c.createBuilder();
                                aons.copyOnWrite();
                                aont aont = (aont) aons.instance;
                                if (aood3 != null) {
                                    aont.b = aood3;
                                    aont.a = 5;
                                    asmz.a(aons);
                                    waq.a((asmw) ((anxl) asmz.build()));
                                    b.c = true;
                                } else {
                                    throw new NullPointerException();
                                }
                            }
                            throw new NullPointerException();
                        }
                        throw new NullPointerException();
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            return;
        }
        if (this.a.a(str, z2)) {
            ((waw) this.d.get()).f();
            ((waw) this.d.get()).e();
            if (this.a.c(str)) {
                ((vgz) this.h.get()).b_(str);
            } else {
                this.b.e(str);
                this.b.g(str);
            }
            vka g = this.a.g(str);
            if (wcf.f(this.g) && g != null && g.b == vsm.PRE_ROLL) {
                a(str2, g.f);
            }
        }
    }

    private final void a(String str, vka vka, boolean z) {
        amqw.a(vka.c());
        amqw.a(vka.c() instanceof vsd);
        this.i.execute(new vji(this, vka, str, new xvk(this.j, this.n), z));
    }

    public final void a(String str, String str2, String str3, aakj aakj) {
        this.b.a(str, str2);
        List<vso> d = this.b.d(str);
        vtl f = this.a.f(str);
        if (d != null && !d.isEmpty()) {
            vso vso = null;
            for (vso vso2 : d) {
                if (TextUtils.equals(str2, vso2.j)) {
                    vso = vso2;
                }
            }
            if (vso != null) {
                this.e.d(new vqc(aakj, new vse(vso), true));
                waw waw = (waw) this.d.get();
                xak.a();
                if (!waw.g.containsKey(f)) {
                    waw.g.put(f, waw.b.a(waw.d.a(f), f, vso));
                }
                waw.h = (wao) waw.g.get(f);
                waw = (waw) this.d.get();
                xak.a();
                if (waw.i != null) {
                    if (!TextUtils.equals(waw.i.n(), vso.j)) {
                        waw.i.b();
                    } else {
                        return;
                    }
                }
                if (!waw.f.containsKey(vso.j)) {
                    waw.f.put(vso.j, waw.c.a(waw.d.a(f, vso), str3, f, vso));
                }
                waw.i = (was) waw.f.get(vso.j);
                waw.a.a(waw.i.c());
            }
        }
    }

    public final void a(String str, vso vso) {
        if (vso instanceof vrx) {
            was was = ((waw) this.d.get()).i;
            if (was != null) {
                was.d();
                was.a(vqi.a);
            }
        }
        this.b.a(str, vso.j);
    }

    public final void a(String str, String str2, vsm vsm) {
        xak.a();
        this.e.d(new vpe());
        anjv a = this.b.a(str2);
        vka g = this.a.g(str2);
        if (vsm == vsm.PRE_ROLL && !g.f.k()) {
            vsd vsd = (vsd) g.c();
            if (vsd != null && a(vsd.c.a)) {
                a(str2, g, (vsd) g.c(), g.f, str);
            }
        }
        if (wcf.f(this.g) && vsm == vsm.PRE_ROLL && a != null) {
            vka g2 = this.a.g(str2);
            if (this.a.d(str2) == null) {
                this.e.d(new vpc());
                ((vgz) this.h.get()).a(str2, null, amul.g(), vsm, 0, 0, null);
                return;
            }
            this.a.h(str2);
            ((waw) this.d.get()).a(g2.c());
            if (a.isDone()) {
                a(str, str2, vsm, g2, true);
                return;
            } else {
                a.a(new vjf(this, str, str2, vsm, g2), this.c);
                return;
            }
        }
        this.i.execute(new vjn(this, str2, str, vsm));
    }

    public final void a(String str, boolean z) {
        this.a.e(str);
        if (!z) {
            this.a.h(str);
            vka g = this.a.g(str);
            if (g != null) {
                ((waw) this.d.get()).a(g.c());
            }
        }
    }

    public final void a(String str, vsm vsm) {
        xak.a();
        this.a.a(str);
        vso b = this.b.b(str);
        if (b != null && b.h()) {
            vpd a = ((vgz) this.h.get()).a(str, vsm, b, vrd.a);
            if (a != null) {
                a.a();
            }
        }
        ((waw) this.d.get()).f();
        ((waw) this.d.get()).e();
    }

    private final void a(String str, vka vka, vkd vkd) {
        this.i.execute(new vje(this, str, vka, vkd));
    }

    public final void a(String str, String str2) {
        boolean i;
        vka g = this.a.g(str2);
        synchronized (this) {
            i = this.b.i(str2);
            this.b.h(str2);
        }
        if (!i) {
            a(str, g, false);
        }
        this.e.c(new airq());
    }

    public final void a(String str, String str2, vjq vjq) {
        vka g = this.a.g(str2);
        if (this.b.j(g.a) && g.b != vsm.POST_ROLL) {
            this.i.execute(new vjp(this, str, g, vjq));
        } else if (this.a.a(g) == null) {
            this.e.d(new vpc());
            vjq.a(false);
        } else {
            vjq.a(true);
        }
    }

    public final void b(String str, String str2) {
        int i;
        vka g = this.a.g(str2);
        synchronized (this) {
            i = this.b.i(str2) ^ 1;
            if (i != 0) {
                this.b.h(str2);
            }
        }
        if (i != 0) {
            a(str, g, true);
        }
    }

    public final void a(String str, String str2, List list, vka vka) {
        if (this.b.a(str, str2, list, vka)) {
            vka.d.b(vjy.COMPLETE);
        }
    }

    public final void a(String str, String str2, vsm vsm, vka vka, boolean z) {
        xak.a();
        this.b.a(str2, new vjh(this, str2, vsm, z, str, vka));
    }

    public final void a(String str, vsm vsm, vso vso, vra vra, int i, int i2) {
        int a = this.b.a(str, vra);
        if (a != 0 && a != 1) {
            if (vso instanceof vtk) {
                if (vra == vra.USER_SKIPPED) {
                    ((waw) this.d.get()).a(i, i2);
                }
                ((waw) this.d.get()).a(vra);
                this.e.d(new vow(new vse(vso), vra));
            }
            if (a == 2) {
                ((waw) this.d.get()).d();
            }
            ((vfk) this.f.get()).a(new vse(vso));
            if (vso.h()) {
                vpd a2 = ((vgz) this.h.get()).a(str, vsm, vso, vrd.a);
                if (a2 != null) {
                    a2.a();
                }
            }
            ((waw) this.d.get()).e();
        }
    }

    public final void a(String str, vsm vsm, String str2) {
        a(str2, str, vsm, this.a.g(str), false);
    }

    public final void a(String str) {
        this.b.c(str);
    }

    public final void b(String str, vso vso) {
        this.a.a(str, vso);
        this.b.a(str, vso);
    }

    public final void a(int i) {
        this.b.a(i);
    }
}
