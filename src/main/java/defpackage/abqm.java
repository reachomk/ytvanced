package defpackage;

import android.app.Activity;
import java.util.Map;

/* renamed from: abqm */
public final class abqm implements aaap {
    private final Activity a;
    private final afpu b;
    private final afqe c;

    public abqm(Activity activity, afpu afpu, afqe afqe) {
        this.a = activity;
        this.b = afpu;
        this.c = afqe;
    }

    public final void a(apxu apxu, Map map) {
        if (this.b.a()) {
            nt f = ((nn) this.a).f();
            String str = "purchase_dialog_fragment";
            nf a = f.a(str);
            if (a == null) {
                absj.a(apxu, null).a(f, str);
                return;
            } else {
                ((absj) a).j(absj.b(apxu, null));
                return;
            }
        }
        this.c.a(this.a, null, null);
    }
}
