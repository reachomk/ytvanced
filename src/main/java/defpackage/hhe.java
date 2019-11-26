package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: hhe */
public final class hhe extends afyl implements xcp {
    private static final avsi i = avsi.SD;
    public final SharedPreferences a;
    public final xci b;
    public final bapu c;
    public final bapu d;
    public final bapu e;
    public final acum f;
    public final hhg g = new hhg(this);
    private final xsc j;
    private final afym k;
    private final zzl l;

    public hhe(xsc xsc, xry xry, aapg aapg, afym afym, agwa agwa, zzl zzl, SharedPreferences sharedPreferences, xci xci, bapu bapu, bapu bapu2, bapu bapu3, acum acum, agee agee) {
        super(xsc, xry, aapg, afym, agwa, agee);
        this.j = xsc;
        this.k = afym;
        this.l = zzl;
        this.a = sharedPreferences;
        this.b = xci;
        this.c = bapu;
        this.d = bapu2;
        this.e = bapu3;
        this.f = acum;
    }

    public final synchronized int a(String str, agvz agvz) {
        if (((hgy) this.c.get()).b()) {
            return super.a(str, agvz);
        }
        this.k.c(str);
        return 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final asas a(agvz agvz, agqr agqr) {
        asas a = super.a(agvz, agqr);
        if (a == null || !hpr.a.equals(agqr.a)) {
            return a;
        }
        long toSeconds;
        asav asav = (asav) ((anxo) a.toBuilder());
        SharedPreferences sharedPreferences = this.a;
        String str = ebn.AUTO_OFFLINE_VIDEOS_PAGE_LAST_VISITED;
        if (sharedPreferences.contains(str)) {
            toSeconds = TimeUnit.MILLISECONDS.toSeconds(this.j.a() - this.a.getLong(str, 0));
        } else {
            toSeconds = 0;
        }
        if (toSeconds >= 0 && ((long) a.c) > toSeconds) {
            asav.a((int) toSeconds);
        }
        arvt b = this.l.b();
        if (b != null) {
            aume aume = b.e;
            if (aume == null) {
                aume = aume.af;
            }
            if (aume.r) {
                avsq avsq;
                LinkedList linkedList = new LinkedList();
                for (agqy agqy : ((hpr) this.e.get()).a()) {
                    avst avst = (avst) avsq.d.createBuilder();
                    String a2 = agqy.a();
                    avst.copyOnWrite();
                    avsq avsq2 = (avsq) avst.instance;
                    if (a2 != null) {
                        avsq2.a |= 1;
                        avsq2.b = a2;
                        long j = agqy.i;
                        avst.copyOnWrite();
                        avsq = (avsq) avst.instance;
                        avsq.a |= 2;
                        avsq.c = j;
                        linkedList.add((avsq) ((anxl) avst.build()));
                    } else {
                        throw new NullPointerException();
                    }
                }
                if (!linkedList.isEmpty()) {
                    asav.copyOnWrite();
                    ((asas) asav.instance).d = anxl.emptyProtobufList();
                    int i = 0;
                    while (i < linkedList.size()) {
                        avsq = (avsq) linkedList.get(i);
                        avsv avsv = (avsv) avss.c.createBuilder();
                        avsv.copyOnWrite();
                        avss avss = (avss) avsv.instance;
                        if (avsq != null) {
                            avss.b = avsq;
                            avss.a |= 1;
                            avss avss2 = (avss) ((anxl) avsv.build());
                            asav.copyOnWrite();
                            asas asas = (asas) asav.instance;
                            if (avss2 != null) {
                                if (!asas.d.a()) {
                                    asas.d = anxl.mutableCopy(asas.d);
                                }
                                asas.d.add(avss2);
                                i++;
                            } else {
                                throw new NullPointerException();
                            }
                        }
                        throw new NullPointerException();
                    }
                }
            }
        }
        return (asas) ((anxl) asav.build());
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(agvz agvz, asaz asaz, Set set) {
        asaz asaz2 = asaz;
        String a = agqr.a(asaz.b());
        agwf o = agvz.o();
        if (!hpr.a.equals(a) || o.g(a) == null) {
            Set set2 = set;
            super.a(agvz, asaz, set);
            return;
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
        avrp a2 = avrp.a(((asaw) asaz2.instance).f);
        if (a2 == null) {
            a2 = avrp.OFFLINE_VIDEO_SELECTION_STRATEGY_UNKNOWN;
        }
        o.a(a, arrayList, a2, ((hpr) this.e.get()).a(asaz.c()), i, agqq.OFFLINE_IMMEDIATELY, 33602, zzp.b, (int) Math.floor((double) (((asaw) asaz2.instance).d * 100.0f)));
        this.a.edit().putLong(ebn.AUTO_OFFLINE_LAST_SYNC_MINIMUM_UNUSED_BYTES, asaz.c()).apply();
        set.add(a);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afqf.class};
        } else if (i == 0) {
            ((hhb) this.d.get()).a();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
