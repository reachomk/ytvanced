package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: affy */
public final class affy implements nls, noo {
    private final afev a;
    private final affr b;

    public affy(afev afev, affr affr) {
        this.a = afev;
        this.b = affr;
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void a(aevh aevh) {
        this.a.a(aevh);
    }

    public final void a(int i, Object obj) {
        if (i == 0 && (obj instanceof afjs)) {
            this.a.a((afjs) obj);
        } else if (i == 1 && (obj instanceof afgq)) {
            this.a.a((afgq) obj);
        } else if (i == 4) {
            this.a.a(((Float) obj).floatValue());
        } else if (i == 2) {
            this.a.a();
        } else if (i == 3) {
            this.a.a(((Boolean) obj).booleanValue());
        }
    }

    public final void a(List list, long j, nom[] nomArr, non non) {
        List list2 = list;
        nom[] nomArr2 = nomArr;
        non non2 = non;
        int i = non2.a;
        int i2 = non2.b;
        nom nom = non2.c;
        afeu afeu = new afeu(i, i2, nom != null ? new afgb(nom) : null);
        long a = !list.isEmpty() ? affy.a((nos) list2.get(list.size() - 1)) - j : 0;
        afev afev = this.a;
        ArrayList arrayList = new ArrayList(list.size());
        for (nos nos : list) {
            long h;
            nom nom2 = nos.f;
            afex afgb = nom2 != null ? new afgb(nom2) : null;
            if (nos instanceof aevx) {
                h = ((aevx) nos).h();
            } else {
                h = nos.j;
            }
            long a2 = affy.a(nos);
            nvq nvq = nos.g;
            long j2 = nvq != null ? nvq.e : 0;
            afew afew = r14;
            afew afew2 = new afew(afgb, h, a2, j2, nos.g());
            arrayList.add(afew);
        }
        afgb[] afgbArr = new afgb[nomArr2.length];
        for (i2 = 0; i2 < nomArr2.length; i2++) {
            nom = nomArr2[i2];
            if (nom != null) {
                afgbArr[i2] = new afgb(nom);
            }
        }
        afev.a(arrayList, j, a, afgbArr, afeu);
        non2.a = afeu.a;
        non2.b = afeu.b;
        afex afex = afeu.c;
        non2.c = afex instanceof afgb ? ((afgb) afex).a : null;
        this.b.a(list2, afeu.a, afeu.d, afeu.e);
    }

    private static long a(nos nos) {
        if (nos instanceof aevx) {
            return ((aevx) nos).i();
        }
        return nos.k;
    }
}
