package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: vii */
public final class vii implements vit {
    private final bcaa a;
    private final xua b;
    private final xsc c;
    private final xci d;
    private final vrk e;
    private final Executor f;
    private final Executor g;
    private final zzl h;
    private final Map i = new ConcurrentHashMap();
    private final int j;

    public vii(bcaa bcaa, xua xua, xsc xsc, xci xci, vrk vrk, Executor executor, Executor executor2, zzl zzl) {
        this.a = bcaa;
        this.b = xua;
        this.c = xsc;
        this.d = xci;
        this.e = vrk;
        this.f = executor;
        this.g = executor2;
        this.h = zzl;
        int i = vrk.m;
        if (i == 0) {
            i = 5000;
        }
        this.j = i;
    }

    public final void a(String str, aakj aakj) {
        if (!this.i.containsKey(str)) {
            this.i.put(xvd.a(str), new vik(aakj));
        }
    }

    public final anjv a(String str) {
        vik vik = (vik) this.i.get(str);
        return vik != null ? vik.c : null;
    }

    public final vso b(String str) {
        vio vio;
        vik vik = (vik) this.i.get(str);
        if (vik == null) {
            vii.k("getActiveAdUnitState()");
            vio = null;
        } else {
            vio = vik.a();
        }
        if (vio == null) {
            vii.k("onBreakEndedReasonCanceled()");
            return null;
        }
        xak.a();
        vio.c().b(vip.COMPLETE);
        return vio.a();
    }

    public final void c(String str) {
        vik vik = (vik) this.i.get(str);
        if (vik == null) {
            vii.k("onAdEndedRequest()");
            return;
        }
        for (List<vio> it : vik.b) {
            for (vio e : it) {
                e.e();
            }
        }
    }

    public final void a(String str, vso vso) {
        vik vik = (vik) this.i.get(str);
        if (vik == null) {
            vii.k("onAdEndedRequest()");
            return;
        }
        for (List<vio> it : vik.b) {
            for (vio vio : it) {
                if (TextUtils.equals(vso.j, vio.a().j)) {
                    vio.c().b(vip.COMPLETE);
                    vik.a(null);
                }
            }
        }
    }

    public final int a(String str, vra vra) {
        vik vik = (vik) this.i.get(str);
        if (vik == null) {
            vii.k("onAdEndedRequest()");
            return 0;
        }
        vio a = vik.a();
        if (a == null) {
            vii.k("onAdEndedRequest() no activeAus");
            return 0;
        } else if ((a.a() instanceof vtk) && a.a != null) {
            return 1;
        } else {
            a.a = vra;
            a.c().b(vip.COMPLETE);
            return (a.a().m() != null ? a.a != vra.ENDCAP_ENDED : (a.a() instanceof vtk) ? a.a != vra.VIDEO_ENDED : !((a.a() instanceof vsu) && a.a == vra.SURVEY_ENDED)) ? 3 : 2;
        }
    }

    public final void a(String str, String str2) {
        vik vik = (vik) this.i.get(str);
        if (vik == null) {
            vii.k("onAdEnteredRequest()");
            return;
        }
        for (List<vio> it : vik.b) {
            for (vio vio : it) {
                if (TextUtils.equals(str2, vio.a().j)) {
                    if (vio.d()) {
                        vio.e();
                        return;
                    }
                    vio.c().b(vip.STARTED);
                    vik.a(vio);
                }
            }
        }
    }

    public final void a(int i) {
        for (vik vik : this.i.values()) {
            if (vik.a) {
                int i2 = vik.d;
                if (i2 != -1 && i2 <= vik.b.size() - 1) {
                    break;
                }
            }
        }
        vik vik2 = null;
        if (vik2 != null) {
            vir b = vik2.b();
            if (b == null || b.a.isDone()) {
                afpc.a(2, afpf.ad, "NextOffsetIndex mismatch", new Exception());
                return;
            }
            b.a(i);
            return;
        }
        vii.k("onIndexOffset()");
    }

    public final void a(String str, vis vis) {
        a(str, vis, true);
    }

    private final void a(String str, vis vis, boolean z) {
        vik vik = (vik) this.i.get(str);
        if (vik == null) {
            vii.k("getNextAdToScheduleRequest()");
            vis.a(null);
            return;
        }
        if (wcf.c(this.h)) {
            l(str);
        }
        vio a = vik.a();
        vir b = vik.b();
        if (b == null) {
            vis.a(null);
        } else if (vik.a && vik.d != -1) {
            anjf.a(b.a, 3000, TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f).a(new vil(this, b, vik, a, vis, z), this.g);
        } else {
            b.a(0);
            a((vio) b.get(0), vik, a, vis, z);
        }
    }

    public final void a(vio vio, vik vik, vio vio2, vis vis, boolean z) {
        if (vio == null) {
            if (z) {
                vik.a(null);
            }
        } else if (vio.c().a() != vip.NOT_STARTED) {
            String valueOf = String.valueOf(vio.c().a());
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 67);
            stringBuilder.append("Received adUnitState with stage=");
            stringBuilder.append(valueOf);
            stringBuilder.append(" while looking for next ad to play.");
            xtl.c(stringBuilder.toString());
            vio.c().b(vip.COMPLETE);
        } else {
            vra vra = vio2 != null ? vio2.a : null;
            int i = 0;
            Object obj = (vra == vra.USER_SKIPPED && this.e.d) ? 1 : null;
            if (vio.a().a(vra) && obj == null) {
                if (z) {
                    vik.a(vio);
                    xak.a();
                    vio.c().b(vip.STARTED);
                }
                vis.a(vio.a());
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = vik.d + 1; i2 < vik.b.size(); i2++) {
                arrayList.add((List) vik.b.get(i2));
            }
            int size = arrayList.size();
            while (i < size) {
                int i3;
                Iterator it = ((List) arrayList.get(i)).iterator();
                while (true) {
                    i3 = i + 1;
                    if (!it.hasNext()) {
                        break;
                    }
                    ((vio) it.next()).c().b(vip.COMPLETE);
                }
                i = i3;
            }
        }
        vis.a(null);
    }

    public final void b(String str, vis vis) {
        a(str, vis, false);
    }

    public final List d(String str) {
        vik vik = (vik) this.i.get(str);
        if (vik == null) {
            vii.k("getLiveAds()");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (List<vio> it : vik.b) {
            for (vio vio : it) {
                if (vio.d()) {
                    arrayList.add(vio.a());
                }
            }
        }
        return arrayList;
    }

    public final void e(String str) {
        vik vik = (vik) this.i.get(str);
        if (vik == null) {
            vii.k("clearAds()");
            return;
        }
        vik.b.clear();
        vik.a(null);
    }

    public final void a() {
        this.i.clear();
    }

    public final boolean f(String str) {
        List emptyList;
        vik vik = (vik) this.i.get(str);
        if (vik == null) {
            vii.k("getAdUnitStateSequences()");
            emptyList = Collections.emptyList();
        } else {
            emptyList = vik.b;
        }
        return emptyList.isEmpty();
    }

    private static void k(String str) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 32);
        stringBuilder.append("AdRepository retrieve in ");
        stringBuilder.append(str);
        stringBuilder.append(" failed");
        xtl.c(stringBuilder.toString());
    }

    public final void g(String str) {
        vik vik = (vik) this.i.get(str);
        if (vik == null) {
            vii.k("clearAdPromise()");
            return;
        }
        vik.f = null;
        vik.e = false;
    }

    public final void h(String str) {
        vik vik = (vik) this.i.get(str);
        if (vik == null) {
            vii.k("createAdPromiseIfNeeded()");
            return;
        }
        wxf wxf = vik.f;
        if (wxf == null) {
            wxf = wxf.a();
        }
        vik.f = wxf;
    }

    public final boolean i(String str) {
        vik vik = (vik) this.i.get(str);
        if (vik == null) {
            vii.k("hasAdPromise()");
            return false;
        } else if (vik.f != null) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean j(String str) {
        vik vik = (vik) this.i.get(str);
        if (vik == null) {
            vii.k("hasPopulatedRawAdData()");
            return false;
        }
        wxf wxf = vik.f;
        if (wxf == null || !wxf.isDone()) {
            return false;
        }
        return true;
    }

    private final List l(String str) {
        vik vik = (vik) this.i.get(str);
        if (vik == null) {
            vii.k("getRawAdDataBlocking()");
            return amul.g();
        }
        wxf wxf = vik.f;
        if (wxf != null) {
            try {
                return (List) wxf.get((long) this.j, TimeUnit.MILLISECONDS);
            } catch (ExecutionException e) {
                xtl.a("Error loading ads", e);
            } catch (TimeoutException e2) {
                xtl.a("Timeout loading ads", e2);
                return null;
            }
        }
        return null;
    }

    public final boolean a(String str, String str2, List list, @Deprecated vka vka) {
        Object obj;
        Object obj2;
        vik vik = (vik) this.i.get(str);
        boolean z = false;
        if (vik == null) {
            vii.k("fillAdPromise");
            return false;
        }
        if (wcf.c(this.h)) {
            synchronized (vik) {
                if (vik.e) {
                    return false;
                }
                if (list != null) {
                    try {
                        if (!list.isEmpty()) {
                            int i;
                            for (aaga aaga : list) {
                                if (a(((vse) aaga).a, vka, vik)) {
                                    i = 1;
                                }
                            }
                            z = i ^ true;
                        }
                    } finally {
                        obj = 1;
                        vik.e = true;
                        obj2 = this.d;
                        obj = new vpg();
                        obj2.d(obj);
                    }
                }
                vik.e = true;
                this.d.d(new vpg());
                return true;
            }
        }
        h(str);
        wxf wxf = vik.f;
        if (wxf != null) {
            wxf.a(obj2, obj);
        }
        return z;
    }

    /* JADX WARNING: Missing block: B:31:0x009c, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:41:0x00c8, code skipped:
            return;
     */
    @java.lang.Deprecated
    public final void a(defpackage.vka r6) {
        /*
        r5 = this;
        r0 = r5.i;
        r1 = r6.a;
        r0 = r0.get(r1);
        r0 = (defpackage.vik) r0;
        if (r0 != 0) goto L_0x0012;
    L_0x000c:
        r6 = "processAdBreakStateBlocking()";
        defpackage.vii.k(r6);
        return;
    L_0x0012:
        monitor-enter(r0);
        r1 = r0.e;	 Catch:{ all -> 0x00ee }
        if (r1 == 0) goto L_0x0019;
    L_0x0017:
        monitor-exit(r0);	 Catch:{ all -> 0x00ee }
        return;
    L_0x0019:
        r1 = 1;
        r2 = r6.d;	 Catch:{ all -> 0x00c9 }
        r3 = defpackage.vjy.REQUESTED;	 Catch:{ all -> 0x00c9 }
        r2 = r2.a();	 Catch:{ all -> 0x00c9 }
        if (r2 != r3) goto L_0x0042;
    L_0x0024:
        r2 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x00c9 }
        r3 = r2.length();	 Catch:{ all -> 0x00c9 }
        r3 = r3 + 32;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c9 }
        r4.<init>(r3);	 Catch:{ all -> 0x00c9 }
        r3 = "Ad stage was not supposed to be ";
        r4.append(r3);	 Catch:{ all -> 0x00c9 }
        r4.append(r2);	 Catch:{ all -> 0x00c9 }
        r2 = r4.toString();	 Catch:{ all -> 0x00c9 }
        defpackage.xtl.c(r2);	 Catch:{ all -> 0x00c9 }
    L_0x0042:
        r2 = r6.a;	 Catch:{ all -> 0x00c9 }
        r2 = r5.l(r2);	 Catch:{ all -> 0x00c9 }
        if (r2 == 0) goto L_0x009d;
    L_0x004a:
        r3 = r2.isEmpty();	 Catch:{ all -> 0x00c9 }
        if (r3 != 0) goto L_0x009d;
    L_0x0050:
        r2 = r2.iterator();	 Catch:{ all -> 0x00c9 }
        r3 = 0;
    L_0x0055:
        r4 = r2.hasNext();	 Catch:{ all -> 0x00c9 }
        if (r4 == 0) goto L_0x006e;
    L_0x005b:
        r4 = r2.next();	 Catch:{ all -> 0x00c9 }
        r4 = (defpackage.aaga) r4;	 Catch:{ all -> 0x00c9 }
        r4 = (defpackage.vse) r4;	 Catch:{ all -> 0x00c9 }
        r4 = r4.a;	 Catch:{ all -> 0x00c9 }
        r4 = r5.a(r4, r6, r0);	 Catch:{ all -> 0x00c9 }
        if (r4 != 0) goto L_0x006c;
    L_0x006b:
        goto L_0x0055;
    L_0x006c:
        r3 = 1;
        goto L_0x0055;
    L_0x006e:
        if (r3 == 0) goto L_0x0071;
    L_0x0070:
        goto L_0x0078;
    L_0x0071:
        r2 = r6.d;	 Catch:{ all -> 0x00c9 }
        r3 = defpackage.vjy.COMPLETE;	 Catch:{ all -> 0x00c9 }
        r2.b(r3);	 Catch:{ all -> 0x00c9 }
    L_0x0078:
        r0.e = r1;	 Catch:{ all -> 0x00ee }
        r2 = r5.d;	 Catch:{ all -> 0x00ee }
        r3 = new vpg;	 Catch:{ all -> 0x00ee }
        r3.<init>();	 Catch:{ all -> 0x00ee }
        r2.d(r3);	 Catch:{ all -> 0x00ee }
        r6 = r6.b;	 Catch:{ all -> 0x00ee }
        r2 = defpackage.vsm.PRE_ROLL;	 Catch:{ all -> 0x00ee }
        if (r6 != r2) goto L_0x009b;
    L_0x008a:
        r6 = r0.c;	 Catch:{ all -> 0x00ee }
        r6 = r6.isDone();	 Catch:{ all -> 0x00ee }
        if (r6 != 0) goto L_0x009b;
    L_0x0092:
        r6 = r0.c;	 Catch:{ all -> 0x00ee }
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ all -> 0x00ee }
        r6.a_(r1);	 Catch:{ all -> 0x00ee }
    L_0x009b:
        monitor-exit(r0);	 Catch:{ all -> 0x00ee }
        return;
    L_0x009d:
        r2 = r6.d;	 Catch:{ all -> 0x00c9 }
        r3 = defpackage.vjy.COMPLETE;	 Catch:{ all -> 0x00c9 }
        r2.b(r3);	 Catch:{ all -> 0x00c9 }
        r0.e = r1;	 Catch:{ all -> 0x00ee }
        r2 = r5.d;	 Catch:{ all -> 0x00ee }
        r3 = new vpg;	 Catch:{ all -> 0x00ee }
        r3.<init>();	 Catch:{ all -> 0x00ee }
        r2.d(r3);	 Catch:{ all -> 0x00ee }
        r6 = r6.b;	 Catch:{ all -> 0x00ee }
        r2 = defpackage.vsm.PRE_ROLL;	 Catch:{ all -> 0x00ee }
        if (r6 != r2) goto L_0x00c7;
    L_0x00b6:
        r6 = r0.c;	 Catch:{ all -> 0x00ee }
        r6 = r6.isDone();	 Catch:{ all -> 0x00ee }
        if (r6 != 0) goto L_0x00c7;
    L_0x00be:
        r6 = r0.c;	 Catch:{ all -> 0x00ee }
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ all -> 0x00ee }
        r6.a_(r1);	 Catch:{ all -> 0x00ee }
    L_0x00c7:
        monitor-exit(r0);	 Catch:{ all -> 0x00ee }
        return;
    L_0x00c9:
        r2 = move-exception;
        r0.e = r1;	 Catch:{ all -> 0x00ee }
        r3 = r5.d;	 Catch:{ all -> 0x00ee }
        r4 = new vpg;	 Catch:{ all -> 0x00ee }
        r4.<init>();	 Catch:{ all -> 0x00ee }
        r3.d(r4);	 Catch:{ all -> 0x00ee }
        r6 = r6.b;	 Catch:{ all -> 0x00ee }
        r3 = defpackage.vsm.PRE_ROLL;	 Catch:{ all -> 0x00ee }
        if (r6 != r3) goto L_0x00ed;
    L_0x00dc:
        r6 = r0.c;	 Catch:{ all -> 0x00ee }
        r6 = r6.isDone();	 Catch:{ all -> 0x00ee }
        if (r6 != 0) goto L_0x00ed;
    L_0x00e4:
        r6 = r0.c;	 Catch:{ all -> 0x00ee }
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ all -> 0x00ee }
        r6.a_(r1);	 Catch:{ all -> 0x00ee }
    L_0x00ed:
        throw r2;	 Catch:{ all -> 0x00ee }
    L_0x00ee:
        r6 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00ee }
        goto L_0x00f2;
    L_0x00f1:
        throw r6;
    L_0x00f2:
        goto L_0x00f1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vii.a(vka):void");
    }

    public final vrs b(String str, String str2) {
        vik vik = (vik) this.i.get(str);
        if (vik == null) {
            vii.k("getBroadcasterAdMetadata()");
            return null;
        }
        if (d(str).isEmpty()) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (List<vio> it : vik.b) {
                for (vio vio : it) {
                    if (vio.a() instanceof vtk) {
                        i3++;
                        i2 = (int) (((long) i2) + TimeUnit.SECONDS.toMillis((long) vio.a().f()));
                        break;
                    }
                }
            }
            for (List<vio> it2 : vik.b) {
                for (vio vio2 : it2) {
                    if (vio2.a().h()) {
                        if (vio2.a() instanceof vtk) {
                            i++;
                            i2 = (int) (((long) i2) - TimeUnit.SECONDS.toMillis((long) vio2.a().f()));
                        }
                        if (TextUtils.equals(vio2.a().j, str2)) {
                            vrd a;
                            if (vio2.a().g()) {
                                a = vrd.a(i, i3, i2);
                            } else {
                                a = vrd.a;
                            }
                            return new vro(vio2.a(), a);
                        }
                    }
                }
            }
        }
        return null;
    }

    private final boolean a(vso vso, vka vka, vik vik) {
        String valueOf;
        if (vso.a(this.c)) {
            if (this.e.a) {
                valueOf = String.valueOf(vka.b);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 72);
                stringBuilder.append("AdBreakRenderer path ad is dropped because of expiration: break type is ");
                stringBuilder.append(valueOf);
                valueOf = stringBuilder.toString();
                xtl.c(valueOf);
                afpc.a(1, afpf.ad, valueOf);
            }
            return false;
        }
        vio vio;
        List list = vik.b;
        vqy c = vka.c();
        aakj aakj = vka.f;
        boolean a = vka.a();
        ArrayList arrayList = new ArrayList();
        aakj = ((vfk) this.a.get()).a(c, aakj);
        vio vio2 = null;
        if (aakj == null || aakj.c == null) {
            vio = null;
        } else {
            vio = vio.a(new vrc((vsd) c, this.b.a(), aakj), aakj, new vim(), a);
        }
        if (vio != null) {
            arrayList.add(new vir(Arrays.asList(new vio[]{vio})));
        }
        vio = vso.m() != null ? vio.a(new vrj(vso, this.b.a()), null, new vim(), a) : null;
        if (vso instanceof vtk) {
            vio2 = vio.a(vso, vsn.a(vso), new vim(), a);
        } else if ((vso instanceof vsk) || (vso instanceof vrx) || (vso instanceof vta)) {
            vio2 = vio.a(vso, null, new vim(), a);
        } else if (vso.m() == null) {
            valueOf = String.valueOf(vso);
            StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 45);
            stringBuilder2.append("Received unsupported ad type in AdRepository:");
            stringBuilder2.append(valueOf);
            afpc.a(2, afpf.ad, stringBuilder2.toString());
        }
        if (vio2 != null) {
            arrayList.add(new vir(Arrays.asList(new vio[]{vio2})));
        }
        if (vio != null) {
            arrayList.add(new vir(Arrays.asList(new vio[]{vio})));
        }
        list.addAll(arrayList);
        return true;
    }
}
