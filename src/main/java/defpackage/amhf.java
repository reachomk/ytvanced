package defpackage;

import android.text.TextUtils;

/* renamed from: amhf */
public final class amhf extends amgh {
    public final xsc a;
    private final afpu c;
    private final atlx d;
    private final ambh e;
    private final alys f;
    private final amch h;
    private final amdg i;

    public amhf(xsc xsc, afpu afpu, atlx atlx, ambh ambh, amch amch, alys alys, amdg amdg, ambw ambw) {
        super(29, ambw);
        this.a = xsc;
        this.c = afpu;
        this.d = atlx;
        this.e = ambh;
        this.f = alys;
        this.h = amch;
        this.i = amdg;
    }

    public final String a() {
        return "RegisterVideoTask";
    }

    public final boolean d() {
        return true;
    }

    public final amec a(amea amea) {
        amec amec = amea.v;
        return amec == null ? amec.g : amec;
    }

    public final bbnr c() {
        return amhi.a;
    }

    public final amcj b() {
        return this.h;
    }

    public final anjv a(String str, amea amea) {
        atli atli = (atli) atlf.h.createBuilder();
        String str2 = amea.g;
        atli.copyOnWrite();
        atlf atlf = (atlf) atli.instance;
        if (str2 != null) {
            atlf.a |= 2;
            atlf.c = str2;
            int a = amek.a(amea.h);
            if (a == 0) {
                a = 1;
            }
            a--;
            if (a == 0) {
                a = 1;
            } else if (a == 1) {
                a = 2;
            } else if (a == 4) {
                a = 3;
            } else {
                StringBuilder stringBuilder = new StringBuilder(35);
                stringBuilder.append("Unsupported upload type:");
                stringBuilder.append(a);
                throw new AssertionError(stringBuilder.toString());
            }
            atli.copyOnWrite();
            atlf atlf2 = (atlf) atli.instance;
            atlf2.a = 4 | atlf2.a;
            atlf2.d = a - 1;
            boolean z = amea.T;
            atli.copyOnWrite();
            atlf atlf3 = (atlf) atli.instance;
            atlf3.a |= 32;
            atlf3.g = z;
            if ((amea.a & 134217728) != 0) {
                azaz azaz = amea.E;
                if (azaz == null) {
                    azaz = azaz.b;
                }
                atli.copyOnWrite();
                atlf3 = (atlf) atli.instance;
                if (azaz != null) {
                    atlf3.f = azaz;
                    atlf3.a |= 16;
                } else {
                    throw new NullPointerException();
                }
            }
            avak a2 = this.i.a(amea.g);
            if (a2 != null) {
                atli.copyOnWrite();
                atlf3 = (atlf) atli.instance;
                atlf3.e = a2;
                atlf3.a |= 8;
            }
            atlf atlf4 = (atlf) ((anxl) atli.build());
            afpt a3 = this.c.a(amea.c);
            if (a3 != null) {
                ambh ambh = this.e;
                aanl aanl = ambh.i;
                amaw amaw = new amaw(ambh.c, a3, (atli) ((anxo) atlf4.toBuilder()));
                amaw.g();
                amaw.h = ambh.k.p();
                ajzr ajzr = (ajzr) aanl.b(amaw);
                a = ajzr.c;
                int i = a - 1;
                if (a != 0) {
                    str2 = "RegisterVideoTask";
                    if (i == 1) {
                        if (!TextUtils.isEmpty(ajzr.a)) {
                            ajzu ajzu = ajzr.b;
                            if (ajzu != null) {
                                aqra aqra = ajzu.a;
                                if (!(aqra == null || aqra.b.size() == 0)) {
                                    for (aqrc aqrc : ajzr.b.a.b) {
                                        if ((aqrc.a & 1) != 0) {
                                            ayhc ayhc = aqrc.b;
                                            if (ayhc == null) {
                                                ayhc = ayhc.e;
                                            }
                                            if ((ayhc.c.isEmpty() ^ 1) != 0) {
                                                return anjf.a(a(amjq.a(), true, new amhh(this, ajzr)));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        this.f.a(str2.concat(" Invalid registerVideoResponse."));
                        return anjf.a(a(amjq.a(5), true));
                    } else if (i == 2) {
                        return anjf.a(a(amjq.a(5), true));
                    } else {
                        if (i != 3) {
                            this.f.a(str2.concat(" Unknown registerVideo response status."));
                            return anjf.a(a(amjq.a(1), true));
                        }
                        Object obj = amea.v;
                        if (obj == null) {
                            obj = amec.g;
                        }
                        return anjf.a(a(amjq.a(5, (amec) amqw.a(obj), this.d.o, this.f), true));
                    }
                }
                throw null;
            }
            throw new amgj();
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: final */
    public final alzf a(Throwable th, amea amea, boolean z) {
        if (th instanceof aanq) {
            Object obj = amea.v;
            if (obj == null) {
                obj = amec.g;
            }
            return a(amjq.a(5, (amec) amqw.a(obj), this.d.o, this.f), z);
        }
        alys alys = this.f;
        String concat = "RegisterVideoTask".concat(" Throwable");
        int a = amek.a(amea.h);
        if (a == 0) {
            a = 1;
        }
        alys.a(concat, th, a);
        return super.a(th, amea, z);
    }

    /* Access modifiers changed, original: final */
    public final boolean b(amea amea) {
        return (amea.a & 1) != 0;
    }
}
