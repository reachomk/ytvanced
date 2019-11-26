package defpackage;

import android.view.View;
import java.util.ArrayList;

/* renamed from: pf */
final class pf implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ ArrayList b;
    private final /* synthetic */ ArrayList c;
    private final /* synthetic */ ArrayList d;
    private final /* synthetic */ ArrayList e;

    pf(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
    }

    public final void run() {
        for (int i = 0; i < this.a; i++) {
            abe.a((View) this.b.get(i), (String) this.c.get(i));
            abe.a((View) this.d.get(i), (String) this.e.get(i));
        }
    }
}
