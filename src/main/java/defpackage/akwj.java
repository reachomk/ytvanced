package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: akwj */
final class akwj extends akuz {
    akwj(aana aana, akvz akvz, xci xci, xoi xoi, acvx acvx, ajwr ajwr) {
        akvz.get();
        super(aana, xci, xoi, acvx);
        akvz.a(ajwr.class);
        akwg akwg = new akwg();
        akwg.a = (CharSequence) amqw.a(ajqy.a(ajwr.b));
        b(akwg);
        ajwu[] ajwuArr = ajwr.a;
        if (ajwuArr == null) {
            a(Collections.EMPTY_LIST);
        } else {
            Collection arrayList = new ArrayList(r4);
            for (ajwu ajwu : ajwuArr) {
                Object obj = null;
                if (ajwu != null) {
                    ajtc ajtc = ajwu.b;
                    if (ajtc != null) {
                        obj = ajtc;
                    }
                }
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            a(arrayList);
        }
        if (this.k) {
            this.k = false;
            a(this.j);
        }
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ Object a(ajtk ajtk) {
        return ajtk;
    }
}
