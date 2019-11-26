package defpackage;

import android.support.design.behavior.SwipeDismissBehavior;
import android.view.View;

/* renamed from: ew */
public final class ew implements Runnable {
    private final View a;
    private final boolean b;
    private final /* synthetic */ SwipeDismissBehavior c;

    ew(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.c = swipeDismissBehavior;
        this.a = view;
        this.b = z;
    }

    public final void run() {
        ado ado = this.c.a;
        if (ado != null && ado.b()) {
            abe.a(this.a, (Runnable) this);
        } else if (this.b) {
            eu euVar = this.c.b;
            if (euVar != null) {
                euVar.a(this.a);
            }
        }
    }
}
