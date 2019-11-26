package defpackage;

import android.content.Context;

/* renamed from: hny */
public final class hny extends hnn {
    private final Context a;
    private final bcaa b;
    private final bcaa c;
    private final xsc d;

    public hny(Context context, bcaa bcaa, bcaa bcaa2, xsc xsc) {
        super(agqk.class, avmq.class);
        this.a = context;
        this.b = bcaa;
        this.c = bcaa2;
        this.d = xsc;
    }

    private static avmo a(agqi agqi) {
        if (agqi != null) {
            avoq avoq = agqi.i;
            if (!(avoq == null || avoq.i.size() == 0)) {
                for (avoo avoo : avoq.i) {
                    if ((avoo.a & 2) != 0) {
                        avmo avmo = avoo.b;
                        if (avmo == null) {
                            avmo = avmo.d;
                        }
                        return avmo;
                    }
                }
            }
        }
        return null;
    }

    public final /* synthetic */ Object a(Object obj, amur amur) {
        agqk agqk = (agqk) obj;
        agqi agqi = agqk.a;
        avmt avmt = (avmt) avmq.k.createBuilder();
        String[] strArr = new String[1];
        int i = 0;
        strArr[0] = agqi.b;
        arml a = ajqy.a(strArr);
        avmt.copyOnWrite();
        avmq avmq = (avmq) avmt.instance;
        if (a != null) {
            avmq.b = a;
            avmq.a |= 1;
            a = ajqy.a(hsv.a(this.a, agqk.a));
            avmt.copyOnWrite();
            avmq = (avmq) avmt.instance;
            if (a != null) {
                if (!avmq.d.a()) {
                    avmq.d = anxl.mutableCopy(avmq.d);
                }
                avmq.d.add(a);
                a = ajqy.a(hsv.a(this.a.getResources(), this.d, agqi.h.getTime()));
                avmt.copyOnWrite();
                avmq = (avmq) avmt.instance;
                if (a != null) {
                    avmq.c = a;
                    avmq.a |= 2;
                    apxu a2 = ekc.a(agqi.a);
                    avmt.copyOnWrite();
                    avmq = (avmq) avmt.instance;
                    if (a2 != null) {
                        avmq.f = a2;
                        avmq.a |= 4;
                        String str = agqi.a;
                        avmt.copyOnWrite();
                        avmq = (avmq) avmt.instance;
                        if (str != null) {
                            apgw apgw;
                            avmq.a |= 8;
                            avmq.g = str;
                            avmo a3 = hny.a(agqi);
                            if (a3 == null || (a3.a & 1) == 0) {
                                apgw = apgw.BUNDLE_ITEM_STYLE_UNSPECIFIED;
                            } else {
                                apgw = apgw.a(a3.b);
                                if (apgw == null) {
                                    apgw = apgw.BUNDLE_ITEM_STYLE_UNSPECIFIED;
                                }
                            }
                            avmt.copyOnWrite();
                            avmq = (avmq) avmt.instance;
                            if (apgw != null) {
                                avmq.a |= 16;
                                avmq.h = apgw.d;
                                auvu auvu = (auvu) auvr.c.createBuilder();
                                auvq auvq = (auvq) auvn.l.createBuilder();
                                auvm auvm = (auvm) auvj.j.createBuilder();
                                auvm.a(((hoc) this.c.get()).a(agqk));
                                auvq.copyOnWrite();
                                auvn auvn = (auvn) auvq.instance;
                                auvn.a();
                                auvn.b.add((auvj) ((anxl) auvm.build()));
                                auvu.copyOnWrite();
                                auvr auvr = (auvr) auvu.instance;
                                auvr.b = (auvn) ((anxl) auvq.build());
                                auvr.a |= 1;
                                avmt.copyOnWrite();
                                avmq = (avmq) avmt.instance;
                                avmq.j = (auvr) ((anxl) auvu.build());
                                avmq.a |= 64;
                                aygk d = agqi.d.d();
                                if (d == null || d.b.size() <= 0 || (1 & ((aygm) d.b.get(0)).a) == 0 || !((aygm) d.b.get(0)).b.startsWith("file://")) {
                                    avmo a4 = hny.a(agqi);
                                    if (a4 == null || (a4.a & 2) == 0) {
                                        d = null;
                                    } else {
                                        d = a4.c;
                                        if (d == null) {
                                            d = aygk.f;
                                        }
                                    }
                                }
                                if (d != null) {
                                    avmt.copyOnWrite();
                                    avmq avmq2 = (avmq) avmt.instance;
                                    avmq2.i = d;
                                    avmq2.a |= 32;
                                }
                                agwh k = ((agwc) this.b.get()).b().k();
                                for (String a5 : agqk.b) {
                                    agqy a6 = k.a(a5);
                                    if (a6 != null) {
                                        aygk e = a6.e();
                                        if (e != null) {
                                            avmt.copyOnWrite();
                                            avmq avmq3 = (avmq) avmt.instance;
                                            if (!avmq3.e.a()) {
                                                avmq3.e = anxl.mutableCopy(avmq3.e);
                                            }
                                            avmq3.e.add(e);
                                            i++;
                                            if (i >= 4) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                return (avmq) ((anxl) avmt.build());
                            }
                            throw new NullPointerException();
                        }
                        throw new NullPointerException();
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
