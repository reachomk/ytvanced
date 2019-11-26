package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;

/* renamed from: ox */
final class ox implements Runnable {
    private final /* synthetic */ pc a;
    private final /* synthetic */ zj b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ ow d;
    private final /* synthetic */ ArrayList e;
    private final /* synthetic */ View f;
    private final /* synthetic */ nf g;
    private final /* synthetic */ nf h;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ ArrayList j;
    private final /* synthetic */ Object k;
    private final /* synthetic */ Rect l;

    ox(pc pcVar, zj zjVar, Object obj, ow owVar, ArrayList arrayList, View view, nf nfVar, nf nfVar2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.a = pcVar;
        this.b = zjVar;
        this.c = obj;
        this.d = owVar;
        this.e = arrayList;
        this.f = view;
        this.g = nfVar;
        this.h = nfVar2;
        this.i = z;
        this.j = arrayList2;
        this.k = obj2;
        this.l = rect;
    }

    public final void run() {
        zj a = ot.a(this.a, this.b, this.c, this.d);
        if (a != null) {
            this.e.addAll(a.values());
            this.e.add(this.f);
        }
        ot.a(this.g, this.h, this.i, a);
        Object obj = this.c;
        if (obj != null) {
            this.a.a(obj, this.j, this.e);
            View a2 = ot.a(a, this.d, this.k, this.i);
            if (a2 != null) {
                pc.a(a2, this.l);
            }
        }
    }
}
