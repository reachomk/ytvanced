package defpackage;

import android.content.Context;
import java.util.Set;

/* renamed from: gvc */
public final class gvc {
    public final xoi a;
    public final kmc b;
    public final acwa c;
    public final fnh d;
    public final Set e;
    public final fni f;
    private final Context g;
    private final kyp h;
    private final fcb i;
    private final fcs j;
    private final alcb k;
    private final aaas l;
    private final eig m;

    gvc(Context context, xoi xoi, kyp kyp, kmc kmc, fcb fcb, fcs fcs, acwa acwa, alcb alcb, fnh fnh, aaas aaas, fni fni, eig eig, Set set, lci lci) {
        this.g = context;
        this.a = xoi;
        this.h = kyp;
        this.b = kmc;
        this.i = fcb;
        this.j = fcs;
        this.c = acwa;
        this.k = alcb;
        this.d = fnh;
        this.l = aaas;
        this.m = eig;
        this.e = set;
        this.f = fni;
        fni.b = lci;
    }

    public final void a(ajrr ajrr) {
        ajrs ajrs = ajrr.f;
        arno arno = null;
        Object obj = ajrs != null ? ajrs.e : null;
        if (obj != null) {
            String a = this.d.a(obj);
            this.e.add(a);
            alcb alcb = this.k;
            gvf gvf = new gvf(this);
            boolean z = (a.equals("music_app_button") || a.equals("youtube_originals_button")) ? false : true;
            alcb.a(obj, gvf, z);
        }
        if (!this.m.e()) {
            ajrs = ajrr.f;
            ajwn ajwn = ajrs != null ? ajrs.b : null;
            if (ajwn != null) {
                kyp kyp = this.h;
                kyp.a();
                kyp.i.a(ajwn);
                kyp.a.a(kyp.i);
            } else {
                asbq asbq = ajrr.e;
                if (asbq != null) {
                    aybe aybe;
                    if (asbq.a == 84469052) {
                        aybe = (aybe) asbq.b;
                    } else {
                        aybe = aybe.g;
                    }
                    if ((aybe.a & 16) != 0) {
                        aybe aybe2;
                        fcb fcb = this.i;
                        asbq asbq2 = ajrr.e;
                        if (asbq2.a == 84469052) {
                            aybe2 = (aybe) asbq2.b;
                        } else {
                            aybe2 = aybe.g;
                        }
                        aybc aybc = aybe2.e;
                        if (aybc == null) {
                            aybc = aybc.f;
                        }
                        fcb.a(aybc);
                        return;
                    }
                }
                ajrs = ajrr.f;
                auuc auuc = ajrs != null ? ajrs.c : null;
                if (auuc != null) {
                    this.j.a(auuc, this.c.t());
                    return;
                }
                ajru ajru = ajrr.a;
                akbi akbi = ajru != null ? ajru.c : null;
                if (akbi == null && ajrs != null) {
                    akbi = ajrs.d;
                }
                if (akbi != null) {
                    kmc kmc = this.b;
                    acvx t = this.c.t();
                    ejd c = kmc.a.c();
                    if (c.c() || c.e()) {
                        if (kmc.c()) {
                            kmc.b();
                        }
                    } else if (!kmc.a(akbi)) {
                        if (!kmc.c()) {
                            if (kmc.f == null) {
                                kmc.a();
                            }
                            kmc.a(akbi, t);
                            kmc.d = false;
                        }
                    }
                }
                ajrs ajrs2 = ajrr.f;
                aqhy aqhy = ajrs2 != null ? ajrs2.a : null;
                if (aqhy != null) {
                    akcq.a(this.g, aqhy, this.l, this.c.t(), null);
                    return;
                }
                if (ajrs2 != null) {
                    arno = ajrs2.f;
                }
                a(arno);
            }
        }
    }

    public final boolean a(arno arno) {
        if (arno == null || (arno.a & 1) == 0) {
            return false;
        }
        this.f.a(arno);
        return true;
    }
}
