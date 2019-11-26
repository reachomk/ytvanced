package defpackage;

import android.view.View;
import java.util.ArrayList;

/* renamed from: ov */
final class ov implements Runnable {
    private final /* synthetic */ Object a;
    private final /* synthetic */ pc b;
    private final /* synthetic */ View c;
    private final /* synthetic */ nf d;
    private final /* synthetic */ ArrayList e;
    private final /* synthetic */ ArrayList f;
    private final /* synthetic */ ArrayList g;
    private final /* synthetic */ Object h;

    ov(Object obj, pc pcVar, View view, nf nfVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.a = obj;
        this.b = pcVar;
        this.c = view;
        this.d = nfVar;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = obj2;
    }

    public final void run() {
        Object obj = this.a;
        if (obj != null) {
            this.b.c(obj, this.c);
            this.f.addAll(ot.a(this.b, this.a, this.d, this.e, this.c));
        }
        if (this.g != null) {
            if (this.h != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.c);
                this.b.b(this.h, this.g, arrayList);
            }
            this.g.clear();
            this.g.add(this.c);
        }
    }
}
