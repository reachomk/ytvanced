package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: eyt */
public class eyt extends ans {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    public eyt(Context context) {
    }

    public eyt() {
        super(1, false);
    }

    public int b(int i, apw apw, aqh aqh) {
        int b = super.b(i, apw, aqh);
        if (!this.a.isEmpty()) {
            i -= b;
            Integer valueOf = i < 0 ? Integer.valueOf(0) : i > 0 ? Integer.valueOf(1) : null;
            if (valueOf != null) {
                for (eys a : this.a) {
                    a.a(valueOf.intValue());
                }
            }
        }
        return b;
    }

    public final int a(int i, apw apw, aqh aqh) {
        int a = super.a(i, apw, aqh);
        if (!this.a.isEmpty()) {
            i -= a;
            Integer valueOf = i < 0 ? Integer.valueOf(2) : i > 0 ? Integer.valueOf(3) : null;
            if (valueOf != null) {
                for (eys a2 : this.a) {
                    a2.a(valueOf.intValue());
                }
            }
        }
        return a;
    }

    public final void a(RecyclerView recyclerView) {
        this.a.clear();
    }
}
