package defpackage;

import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ycw */
public final class ycw implements akmw {
    public final List a;
    public final List b;
    public final int c;
    public final CharSequence d;
    public final boolean e;
    public final List f;
    public final long g;
    public final aqir h;
    public int i;
    private final Long j;

    public static List a(aqpd aqpd) {
        ArrayList arrayList = new ArrayList();
        if (aqpd.f.size() != 0) {
            for (aqph aqph : aqpd.f) {
                int i = aqph.a;
                Object obj;
                if ((i & 1) != 0) {
                    obj = aqph.b;
                    if (obj == null) {
                        obj = avkc.f;
                    }
                    arrayList.add(ajtj.a(obj));
                } else if ((i & 2) != 0) {
                    obj = aqph.c;
                    if (obj == null) {
                        obj = atuj.f;
                    }
                    arrayList.add(ajtj.a(obj));
                } else if ((i & 4) != 0) {
                    obj = aqph.d;
                    if (obj == null) {
                        obj = awzv.d;
                    }
                    arrayList.add(ajtj.a(obj));
                }
            }
        }
        return arrayList;
    }

    public ycw(aqpd aqpd) {
        arml arml;
        aqir aqir;
        amul a = zde.a(aqpd);
        amul b = zde.b(aqpd);
        int i = aqpd.g;
        if ((aqpd.a & 8) != 0) {
            arml = aqpd.h;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a2 = ajqy.a(arml);
        List a3 = ycw.a(aqpd);
        aqpj aqpj = aqpd.d;
        if (aqpj == null) {
            aqpj = aqpj.c;
        }
        if ((aqpj.a & 1) == 0) {
            aqir = null;
        } else {
            aqpj = aqpd.d;
            if (aqpj == null) {
                aqpj = aqpj.c;
            }
            aqir aqir2 = aqpj.b;
            if (aqir2 == null) {
                aqir2 = aqir.m;
            }
            aqir = aqir2;
        }
        this(a, b, i, a2, false, a3, aqir, aqpd.e, 0);
    }

    public ycw(List list, List list2, int i, CharSequence charSequence, boolean z, List list3, aqir aqir, int i2, long j) {
        this.a = (List) amqw.a((Object) list);
        this.b = (List) amqw.a((Object) list2);
        this.c = i;
        this.d = charSequence;
        this.e = z;
        this.f = (List) amqw.a((Object) list3);
        atuj atuj = (atuj) ajtj.a(a(), atuj.class);
        Long l = null;
        if (!(atuj == null || (atuj.a & 1) == 0)) {
            atun atun = atuj.b;
            if (atun == null) {
                atun = atun.g;
            }
            l = Long.valueOf(atun.e);
        }
        this.j = l;
        this.h = aqir;
        this.i = i2;
        this.g = j;
    }

    public final akmw a(akmw akmw) {
        ycw ycw = (ycw) akmw;
        Long l = this.j;
        if (l == null) {
            return ycw;
        }
        if (ycw.j == null || l.longValue() > ycw.j.longValue()) {
            return this;
        }
        return new ycw(ycw.a, ycw.b, ycw.c, ycw.d, ycw.j.longValue() <= this.j.longValue() ? this.e : false, ycw.f, ycw.h, ycw.i, ycw.g);
    }

    public final ajtf a() {
        return a(ajti.INVALIDATION);
    }

    public final ajtf a(ajti ajti) {
        for (ajtf ajtf : this.f) {
            if (ajtf.c() == ajti) {
                return ajtf;
            }
        }
        return null;
    }
}
