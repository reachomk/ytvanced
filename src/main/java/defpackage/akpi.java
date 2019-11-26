package defpackage;

import android.view.View;
import java.util.HashSet;
import java.util.Set;

/* renamed from: akpi */
public final class akpi {
    public final Set a = new HashSet();

    public final void a(Object obj, View view) {
        if (!this.a.isEmpty()) {
            for (akpj a : this.a) {
                a.a(obj, view);
            }
        }
    }
}
