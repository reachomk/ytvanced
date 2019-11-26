package defpackage;

import java.util.ArrayList;

/* renamed from: amga */
public final class amga extends amgh {
    private final afpu a;
    private final abgv c;
    private final alys d;
    private final amch e;
    private final atlx f;

    public amga(afpu afpu, abgv abgv, amch amch, alys alys, atlx atlx, ambw ambw) {
        super(7, ambw);
        this.a = afpu;
        this.c = abgv;
        this.d = alys;
        this.e = amch;
        this.f = atlx;
    }

    public final String a() {
        return "CreateReelItemsTask";
    }

    public final boolean d() {
        return true;
    }

    public final amec a(amea amea) {
        amec amec = amea.w;
        return amec == null ? amec.g : amec;
    }

    public final bbnr c() {
        return amfz.a;
    }

    public final amcj b() {
        return this.e;
    }

    public final anjv a(String str, amea amea) {
        afpt a = this.a.a(amea.c);
        if (a != null) {
            askh askh = (askh) aske.g.createBuilder();
            String str2 = amea.G;
            askh.copyOnWrite();
            aske aske = (aske) askh.instance;
            if (str2 != null) {
                amec a2;
                aske.a |= 2;
                aske.c = str2;
                anyd anyd = amea.x;
                askh.copyOnWrite();
                aske = (aske) askh.instance;
                if (!aske.d.a()) {
                    aske.d = anxl.mutableCopy(aske.d);
                }
                anvf.addAll(anyd, aske.d);
                if (!amea.A.isEmpty()) {
                    askj askj = (askj) askg.c.createBuilder();
                    String str3 = amea.A;
                    askj.copyOnWrite();
                    askg askg = (askg) askj.instance;
                    if (str3 != null) {
                        askg.a |= 1;
                        askg.b = str3;
                        askh.copyOnWrite();
                        aske aske2 = (aske) askh.instance;
                        aske2.f = (askg) ((anxl) askj.build());
                        aske2.a |= 8;
                    } else {
                        throw new NullPointerException();
                    }
                }
                if ((amea.a & 8388608) != 0) {
                    amdp amdp = amea.z;
                    if (amdp == null) {
                        amdp = amdp.c;
                    }
                    if (!amdp.b.isEmpty()) {
                        askp askp = (askp) askm.c.createBuilder();
                        amdp amdp2 = amea.z;
                        if (amdp2 == null) {
                            amdp2 = amdp.c;
                        }
                        askp.a(amdp2.b);
                        askh.copyOnWrite();
                        aske aske3 = (aske) askh.instance;
                        aske3.e = (askm) ((anxl) askp.build());
                        aske3.a |= 4;
                    }
                }
                abgv abgv = this.c;
                aang aang = abgv.a;
                abgr abgr = new abgr(abgv.c, a, askh);
                abgr.h = abgv.j.p();
                abgr.g();
                aski aski = (aski) aang.b(abgr);
                int a3 = awxd.a(aski.c);
                if (a3 == 0) {
                    a3 = 1;
                }
                int i = 5;
                switch (a3 - 1) {
                    case 1:
                        a3 = 2;
                        i = 1;
                        break;
                    case 2:
                        a3 = 3;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        this.d.a("CreateReelItemsTask".concat(" Unknown createReelItems response status."));
                        break;
                }
                a3 = 4;
                ArrayList arrayList = new ArrayList();
                for (askk askk : aski.d) {
                    int a4 = awxg.a(askk.c);
                    if (a4 == 0 || a4 != 2) {
                        a4 = awxg.a(askk.c);
                        if (a4 != 0) {
                            if (a4 != 4) {
                            }
                        }
                    }
                    arrayList.add(askk.b);
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                if (a3 == 2) {
                    a2 = amjq.a();
                } else if (a3 != 3) {
                    a2 = amjq.a(i);
                } else {
                    Object obj = amea.w;
                    if (obj == null) {
                        obj = amec.g;
                    }
                    a2 = amjq.a(i, (amec) amqw.a(obj), this.f.u, this.d);
                }
                return anjf.a(a(a2, true, new amgc(strArr)));
            }
            throw new NullPointerException();
        }
        throw new amgj();
    }

    /* Access modifiers changed, original: final */
    public final alzf a(Throwable th, amea amea, boolean z) {
        int i = 1;
        String str = "CreateReelItemsTask";
        alys alys;
        int a;
        if (th instanceof aanq) {
            alys = this.d;
            str = str.concat(" InnerTube service failed for");
            a = amek.a(amea.h);
            if (a != 0) {
                i = a;
            }
            alys.a(str, th, i);
            Object obj = amea.w;
            if (obj == null) {
                obj = amec.g;
            }
            return a(amjq.a(5, (amec) amqw.a(obj), this.f.u, this.d), z);
        }
        alys = this.d;
        str = str.concat(" Throwable");
        a = amek.a(amea.h);
        if (a != 0) {
            i = a;
        }
        alys.a(str, th, i);
        return super.a(th, amea, z);
    }

    /* Access modifiers changed, original: final */
    public final boolean b(amea amea) {
        return (amea.a & 536870912) != 0;
    }
}
