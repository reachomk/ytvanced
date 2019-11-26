package defpackage;

import android.net.Uri;
import java.io.IOException;

/* renamed from: amhe */
public final class amhe extends amgh {
    private final afpu a;
    private final ambh c;
    private final alys d;
    private final amch e;
    private final amez f;
    private final atlx h;

    public amhe(afpu afpu, ambh ambh, amch amch, alys alys, amez amez, atlx atlx, ambw ambw) {
        super(30, ambw);
        this.a = afpu;
        this.c = ambh;
        this.d = alys;
        this.e = amch;
        this.f = amez;
        this.h = atlx;
    }

    public final String a() {
        return "ProcessVideoTask";
    }

    public final boolean d() {
        return true;
    }

    public final amec a(amea amea) {
        amec amec = amea.O;
        return amec == null ? amec.g : amec;
    }

    public final bbnr c() {
        return amhd.a;
    }

    public final amcj b() {
        return this.e;
    }

    public final anjv a(String str, amea amea) {
        afpt a = this.a.a(amea.c);
        if (a != null) {
            atlc atlc = (atlc) atkz.g.createBuilder();
            String str2 = amea.g;
            atlc.copyOnWrite();
            atkz atkz = (atkz) atlc.instance;
            if (str2 != null) {
                atkz.a |= 2;
                atkz.c = str2;
                str2 = amea.G;
                atlc.copyOnWrite();
                atkz = (atkz) atlc.instance;
                if (str2 != null) {
                    amdr amdr;
                    atkz.a |= 4;
                    atkz.d = str2;
                    if ((amea.b & 512) != 0) {
                        amdr = amea.S;
                        if (amdr == null) {
                            amdr = amdr.r;
                        }
                    } else {
                        amdr = null;
                    }
                    apwu a2 = amdi.a(amdr);
                    if (a2 != null) {
                        atlc.copyOnWrite();
                        atkz atkz2 = (atkz) atlc.instance;
                        atkz2.f = a2;
                        atkz2.a |= 32;
                    }
                    ayuo a3 = this.f.a(Uri.parse(amea.d), null).a(amea.q, amea.P);
                    atlc.copyOnWrite();
                    atkz = (atkz) atlc.instance;
                    if (a3 != null) {
                        atkz.e = a3;
                        atkz.a |= 8;
                        ambh ambh = this.c;
                        atkz atkz3 = (atkz) ((anxl) atlc.build());
                        aang aang = ambh.j;
                        amat amat = new amat(ambh.c, a, (atlc) ((anxo) atkz3.toBuilder()));
                        amat.h = ambh.k.p();
                        amat.g();
                        int a4 = atld.a(((atlb) aang.b(amat)).c);
                        if (a4 == 0) {
                            a4 = 1;
                        }
                        a4--;
                        if (a4 == 1) {
                            return anjf.a(a(amjq.a(), true));
                        }
                        if (a4 == 2) {
                            return anjf.a(a(amjq.a(5), true));
                        }
                        if (a4 != 3) {
                            this.d.a("ProcessVideoTask".concat("Unknown processVideo response status."));
                            return anjf.a(a(amjq.a(1), true));
                        }
                        Object obj = amea.O;
                        if (obj == null) {
                            obj = amec.g;
                        }
                        return anjf.a(a(amjq.a(5, (amec) amqw.a(obj), this.h.v, this.d), true));
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new amgj();
    }

    /* Access modifiers changed, original: final */
    public final alzf a(Throwable th, amea amea, boolean z) {
        int i = 1;
        String str = "ProcessVideoTask";
        alys alys;
        if (th instanceof IOException) {
            alys = this.d;
            str = str.concat(" Source Failed");
            int a = amek.a(amea.h);
            if (a == 0) {
                a = 1;
            }
            alys.a(str, th, a);
            return a(amjq.a(3), z);
        } else if (th instanceof aanq) {
            Object obj = amea.O;
            if (obj == null) {
                obj = amec.g;
            }
            return a(amjq.a(5, (amec) amqw.a(obj), this.h.v, this.d), z);
        } else {
            alys = this.d;
            str = str.concat(" Throwable");
            int a2 = amek.a(amea.h);
            if (a2 != 0) {
                i = a2;
            }
            alys.a(str, th, i);
            return super.a(th, amea, z);
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean b(amea amea) {
        int i = amea.a;
        boolean z = false;
        if (!((536870912 & i) == 0 || (65536 & i) == 0 || (i & 32768) == 0)) {
            i = amek.a(amea.h);
            if (i == 0 || i != 5) {
                z = true;
            } else {
                amec amec = amea.w;
                if (amec == null) {
                    amec = amec.g;
                }
                int a = amee.a(amec.b);
                if (a == 0 || a != 2) {
                    return z;
                }
                return true;
            }
        }
        return z;
    }
}
