package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: abwx */
public final class abwx {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;
    private final bcaa i;
    private final bcaa j;
    private final bcaa k;
    private final bcaa l;
    private final bcaa m;
    private final bcaa n;
    private final bcaa o;
    private final bcaa p;

    public abwx(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12, bcaa bcaa13, bcaa bcaa14, bcaa bcaa15, bcaa bcaa16) {
        bcaa bcaa17 = bcaa;
        this.a = (bcaa) abwx.a((Object) bcaa, 1);
        bcaa17 = bcaa2;
        this.b = (bcaa) abwx.a((Object) bcaa2, 2);
        bcaa17 = bcaa3;
        this.c = (bcaa) abwx.a((Object) bcaa3, 3);
        bcaa17 = bcaa4;
        this.d = (bcaa) abwx.a((Object) bcaa4, 4);
        bcaa17 = bcaa5;
        this.e = (bcaa) abwx.a((Object) bcaa5, 5);
        bcaa17 = bcaa6;
        this.f = (bcaa) abwx.a((Object) bcaa6, 6);
        bcaa17 = bcaa7;
        this.g = (bcaa) abwx.a((Object) bcaa7, 7);
        bcaa17 = bcaa8;
        this.h = (bcaa) abwx.a((Object) bcaa8, 8);
        bcaa17 = bcaa9;
        this.i = (bcaa) abwx.a((Object) bcaa9, 9);
        bcaa17 = bcaa10;
        this.j = (bcaa) abwx.a((Object) bcaa10, 10);
        bcaa17 = bcaa11;
        this.k = (bcaa) abwx.a((Object) bcaa11, 11);
        bcaa17 = bcaa12;
        this.l = (bcaa) abwx.a((Object) bcaa12, 12);
        this.m = (bcaa) abwx.a((Object) bcaa13, 13);
        this.n = (bcaa) abwx.a((Object) bcaa14, 14);
        this.o = (bcaa) abwx.a((Object) bcaa15, 15);
        this.p = (bcaa) abwx.a((Object) bcaa16, 16);
    }

    public final abwv a(View view, boolean z) {
        return new abwv((Context) abwx.a((Context) this.a.get(), 1), (akkq) abwx.a((akkq) this.b.get(), 2), (akvz) abwx.a((akvz) this.c.get(), 3), (akvp) abwx.a((akvp) this.d.get(), 4), (aaas) abwx.a((aaas) this.e.get(), 5), (acwa) abwx.a((acwa) this.f.get(), 6), (abrq) abwx.a((abrq) this.g.get(), 7), (abru) abwx.a((abru) this.h.get(), 8), (abrj) abwx.a((abrj) this.i.get(), 9), (abrf) abwx.a((abrf) this.j.get(), 10), (xwb) abwx.a((xwb) this.k.get(), 11), (akti) abwx.a((akti) this.l.get(), 12), (abqz) abwx.a((abqz) this.m.get(), 13), (abwt) abwx.a((abwt) this.n.get(), 14), (akpi) abwx.a((akpi) this.o.get(), 15), (alck) abwx.a((alck) this.p.get(), 16), (View) abwx.a((Object) view, 17), z);
    }

    private static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
