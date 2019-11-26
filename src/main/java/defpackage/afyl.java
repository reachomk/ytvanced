package defpackage;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: afyl */
public class afyl implements afyj {
    private final xsc a;
    private final xry b;
    private final aapg c;
    private final afym d;
    private final agwa e;
    private final agee f;
    public afyo h;

    public afyl(xsc xsc, xry xry, aapg aapg, afym afym, agwa agwa, agee agee) {
        this.a = (xsc) amqw.a((Object) xsc);
        this.b = (xry) amqw.a((Object) xry);
        this.c = (aapg) amqw.a((Object) aapg);
        this.d = (afym) amqw.a((Object) afym);
        this.e = (agwa) amqw.a((Object) agwa);
        this.f = (agee) amqw.a((Object) agee);
    }

    public synchronized int a(String str, agvz agvz) {
        agvz agvz2 = agvz;
        synchronized (this) {
            xak.b();
            aapg aapg = this.c;
            aapi aapi = new aapi(aapg.c, aapg.d.c());
            aapi.g();
            agwf o = agvz.o();
            if (this.f.b()) {
                for (agqr a : o.c()) {
                    asas a2 = a(agvz2, a);
                    if (a2 != null) {
                        aapi.a.add(a2);
                    }
                }
            }
            if (this.f.c()) {
                afyo afyo = this.h;
                if (afyo != null) {
                    for (asay add : afyo.a()) {
                        aapi.b.add(add);
                    }
                }
            }
            this.f.d();
            aapi.c = this.e.a();
            aapi.d = this.e.b();
            aapi.e = afyl.a(this.a, agvz.k().a());
            aapi.p = !this.b.b() ? this.b.a() : 1.0f;
            Calendar instance = Calendar.getInstance();
            aapi.q = (int) ((this.a.a() + ((long) (instance.get(15) + instance.get(16)))) / 1000);
            try {
                ajrl ajrl = (ajrl) this.c.a.b(aapi);
                HashSet hashSet = new HashSet();
                asam[] asamArr = ajrl.b;
                int length = asamArr.length;
                int i = 0;
                while (i < length) {
                    long j;
                    asam asam = asamArr[i];
                    if ((asam.a & 2) != 0) {
                        if (this.f.b()) {
                            anxl anxl = asam.b;
                            if (anxl == null) {
                                anxl = asaw.g;
                            }
                            a(agvz2, (asaz) ((anxo) anxl.toBuilder()), hashSet);
                        }
                    }
                    if ((asam.a & 8) != 0) {
                        if (this.f.c()) {
                            asba asba = asam.d;
                            if (asba == null) {
                                asba = asba.d;
                            }
                            agwf o2 = agvz.o();
                            avmy a3 = avmy.a(asba.c);
                            if (a3 == null) {
                                a3 = avmy.OFFLINE_CANDIDATE_TYPE_UNKNOWN;
                            }
                            String a4 = agqr.a(a3);
                            if (o2.g(a4) == null) {
                                avmy a5 = avmy.a(asba.c);
                                if (a5 == null) {
                                    a5 = avmy.OFFLINE_CANDIDATE_TYPE_UNKNOWN;
                                }
                                o2.a(new agqr(agqr.a(a5), 0, 2));
                            }
                            ArrayList arrayList = new ArrayList();
                            for (avrg avrg : asba.b) {
                                if ((avrg.a & 1) != 0) {
                                    avre avre = avrg.b;
                                    if (avre == null) {
                                        avre = avre.p;
                                    }
                                    arrayList.add(agqp.a(avre));
                                }
                            }
                            o2.b(a4, arrayList);
                            hashSet.add(a4);
                        }
                    }
                    if ((asam.a & 16) != 0 && this.f.d()) {
                        asbe asbe = asam.e;
                        if (asbe == null) {
                            asbe = asbe.d;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (avnc a6 : asbe.c) {
                            arrayList2.add(agpy.a(a6));
                        }
                        j = 1000;
                        agvz.r().a(arrayList2, ((long) asbe.b) * 1000);
                    } else {
                        j = 1000;
                    }
                    i++;
                    long j2 = j;
                }
                for (agqt agqt : agvz.o().a()) {
                    String str2 = agqt.a.a;
                    if (agqt.d == 2 && !hashSet.contains(str2)) {
                        agvz.o().i(str2);
                    }
                }
                int i2 = ajrl.a;
                if (i2 > 0) {
                    this.d.a(str, (long) i2, (long) ajrl.c);
                } else {
                    this.d.c(str);
                }
            } catch (aanq e) {
                String valueOf = String.valueOf(e.getMessage());
                String str3 = "AutoOfflineService request failed: ";
                xtl.c(valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf));
                return 1;
            }
        }
        return 0;
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
    public defpackage.asas a(defpackage.agvz r5, defpackage.agqr r6) {
        /*
        r4 = this;
        r0 = r6.c;
        r1 = -1;
        r2 = 1;
        if (r0 != r2) goto L_0x0019;
    L_0x0006:
        r0 = r6.a;	 Catch:{ NumberFormatException -> 0x0013 }
        r3 = 24;
        r0 = r0.substring(r3);	 Catch:{ NumberFormatException -> 0x0013 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0013 }
        goto L_0x001a;
    L_0x0013:
        r0 = move-exception;
        r3 = "Auto offline video list list type parse failed.";
        defpackage.xtl.a(r3, r0);
    L_0x0019:
        r0 = -1;
    L_0x001a:
        if (r0 == r1) goto L_0x0060;
    L_0x001c:
        r0 = defpackage.asau.a(r0);
        r1 = r4.a;
        r5 = r5.o();
        r6 = r6.a;
        r5 = r5.e(r6);
        r5 = defpackage.afyl.a(r1, r5);
        r6 = defpackage.asau.UNKNOWN;
        if (r0 == r6) goto L_0x0036;
    L_0x0034:
        r6 = 1;
        goto L_0x0037;
    L_0x0036:
        r6 = 0;
    L_0x0037:
        defpackage.amqw.a(r6);
        r6 = defpackage.asas.e;
        r6 = r6.createBuilder();
        r6 = (defpackage.asav) r6;
        if (r0 == 0) goto L_0x0054;
    L_0x0044:
        r6.copyOnWrite();
        r1 = r6.instance;
        r1 = (defpackage.asas) r1;
        r3 = r1.a;
        r2 = r2 | r3;
        r1.a = r2;
        r0 = r0.c;
        r1.b = r0;
    L_0x0054:
        r6.a(r5);
        r5 = r6.build();
        r5 = (defpackage.anxl) r5;
        r5 = (defpackage.asas) r5;
        return r5;
    L_0x0060:
        r5 = 0;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afyl.a(agvz, agqr):asas");
    }

    /* Access modifiers changed, original: protected */
    public void a(agvz agvz, asaz asaz, Set set) {
        String a = agqr.a(asaz.b());
        if (agvz.o().g(a) == null) {
            agvz.o().a(new agqr(agqr.a(asaz.b()), 0, 1));
        }
        ArrayList arrayList = new ArrayList();
        for (avrg avrg : asaz.a()) {
            if ((avrg.a & 1) != 0) {
                avre avre = avrg.b;
                if (avre == null) {
                    avre = avre.p;
                }
                arrayList.add(agqp.a(avre));
            }
        }
        agvz.o().a(a, arrayList);
        set.add(a);
    }

    private static int a(xsc xsc, Collection collection) {
        int i = Integer.MAX_VALUE;
        for (agqy agqy : collection) {
            int toSeconds = (int) TimeUnit.MILLISECONDS.toSeconds(xsc.a() - agqy.g);
            if (toSeconds >= 0) {
                if (toSeconds < i) {
                    i = toSeconds;
                }
            }
        }
        return i;
    }
}
