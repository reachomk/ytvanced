package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: abwl */
public final class abwl {
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

    public abwl(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12, bcaa bcaa13, bcaa bcaa14, bcaa bcaa15) {
        bcaa bcaa16 = bcaa;
        this.a = (bcaa) abwl.a((Object) bcaa, 1);
        bcaa16 = bcaa2;
        this.b = (bcaa) abwl.a((Object) bcaa2, 2);
        bcaa16 = bcaa3;
        this.c = (bcaa) abwl.a((Object) bcaa3, 3);
        bcaa16 = bcaa4;
        this.d = (bcaa) abwl.a((Object) bcaa4, 4);
        bcaa16 = bcaa5;
        this.e = (bcaa) abwl.a((Object) bcaa5, 5);
        bcaa16 = bcaa6;
        this.f = (bcaa) abwl.a((Object) bcaa6, 6);
        bcaa16 = bcaa7;
        this.g = (bcaa) abwl.a((Object) bcaa7, 7);
        bcaa16 = bcaa8;
        this.h = (bcaa) abwl.a((Object) bcaa8, 8);
        bcaa16 = bcaa9;
        this.i = (bcaa) abwl.a((Object) bcaa9, 9);
        bcaa16 = bcaa10;
        this.j = (bcaa) abwl.a((Object) bcaa10, 10);
        bcaa16 = bcaa11;
        this.k = (bcaa) abwl.a((Object) bcaa11, 11);
        bcaa16 = bcaa12;
        this.l = (bcaa) abwl.a((Object) bcaa12, 12);
        this.m = (bcaa) abwl.a((Object) bcaa13, 13);
        this.n = (bcaa) abwl.a((Object) bcaa14, 14);
        this.o = (bcaa) abwl.a((Object) bcaa15, 15);
    }

    public final abwi a(View view, boolean z) {
        boolean z2 = z;
        Context context = (Context) abwl.a((Context) this.a.get(), 1);
        akkq akkq = (akkq) abwl.a((akkq) this.b.get(), 2);
        akvz akvz = (akvz) abwl.a((akvz) this.c.get(), 3);
        akvp akvp = (akvp) abwl.a((akvp) this.d.get(), 4);
        aaas aaas = (aaas) abwl.a((aaas) this.e.get(), 5);
        acwa acwa = (acwa) abwl.a((acwa) this.f.get(), 6);
        abrq abrq = (abrq) abwl.a((abrq) this.g.get(), 7);
        abru abru = (abru) abwl.a((abru) this.h.get(), 8);
        abwl.a((abrj) this.i.get(), 9);
        return new abwi(context, akkq, akvz, akvp, aaas, acwa, abrq, abru, (abrf) abwl.a((abrf) this.j.get(), 10), (akti) abwl.a((akti) this.k.get(), 11), (abqz) abwl.a((abqz) this.l.get(), 12), (xwb) abwl.a((xwb) this.m.get(), 13), (akpi) abwl.a((akpi) this.n.get(), 14), (alck) abwl.a((alck) this.o.get(), 15), (View) abwl.a((Object) view, 16), z2, true);
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
