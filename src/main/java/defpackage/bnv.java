package defpackage;

import java.util.List;
import java.util.Locale;

/* renamed from: bnv */
public final class bnv {
    public final List a;
    public final bjj b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final List g;
    public final bmy h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final float m;
    public final int n;
    public final int o;
    public final bmw p;
    public final bmv q;
    public final bmo r;
    public final List s;
    public final boolean t;
    public final int u;
    public final int v;

    public final String toString() {
        return a("");
    }

    public final String a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(this.c);
        String str2 = "\n";
        stringBuilder.append(str2);
        bnv a = this.b.a(this.e);
        if (a != null) {
            stringBuilder.append("\t\tParents: ");
            stringBuilder.append(a.c);
            a = this.b.a(a.e);
            while (a != null) {
                stringBuilder.append("->");
                stringBuilder.append(a.c);
                a = this.b.a(a.e);
            }
            stringBuilder.append(str);
            stringBuilder.append(str2);
        }
        if (!this.g.isEmpty()) {
            stringBuilder.append(str);
            stringBuilder.append("\tMasks: ");
            stringBuilder.append(this.g.size());
            stringBuilder.append(str2);
        }
        if (!(this.i == 0 || this.j == 0)) {
            stringBuilder.append(str);
            stringBuilder.append("\tBackground: ");
            stringBuilder.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k)}));
        }
        if (!this.a.isEmpty()) {
            stringBuilder.append(str);
            stringBuilder.append("\tShapes:\n");
            for (Object next : this.a) {
                stringBuilder.append(str);
                stringBuilder.append("\t\t");
                stringBuilder.append(next);
                stringBuilder.append(str2);
            }
        }
        return stringBuilder.toString();
    }

    public bnv(List list, bjj bjj, String str, long j, int i, long j2, String str2, List list2, bmy bmy, int i2, int i3, int i4, float f, float f2, int i5, int i6, bmw bmw, bmv bmv, List list3, int i7, bmo bmo, boolean z) {
        this.a = list;
        this.b = bjj;
        this.c = str;
        this.d = j;
        this.u = i;
        this.e = j2;
        this.f = str2;
        this.g = list2;
        this.h = bmy;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = f;
        this.m = f2;
        this.n = i5;
        this.o = i6;
        this.p = bmw;
        this.q = bmv;
        this.s = list3;
        this.v = i7;
        this.r = bmo;
        this.t = z;
    }
}
