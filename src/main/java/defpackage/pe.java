package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: pe */
final class pe implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ Map b;

    pe(ArrayList arrayList, Map map) {
        this.a = arrayList;
        this.b = map;
    }

    public final void run() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.a.get(i);
            String s = abe.s(view);
            if (s != null) {
                for (Entry entry : this.b.entrySet()) {
                    if (s.equals(entry.getValue())) {
                        s = (String) entry.getKey();
                        break;
                    }
                }
                s = null;
                abe.a(view, s);
            }
        }
    }
}
