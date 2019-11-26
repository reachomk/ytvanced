package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: ph */
final class ph implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ Map b;

    ph(ArrayList arrayList, Map map) {
        this.a = arrayList;
        this.b = map;
    }

    public final void run() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.a.get(i);
            abe.a(view, (String) this.b.get(abe.s(view)));
        }
    }
}
