package defpackage;

import android.app.Dialog;

/* renamed from: gyw */
final class gyw implements afqd {
    private final /* synthetic */ gyl b;

    gyw(gyl gyl) {
        this.b = gyl;
    }

    public final void a() {
        Dialog dialog = this.b.c;
        if (dialog != null) {
            dialog.show();
            this.b.W();
        }
    }

    public final void a(Exception exception) {
        this.b.af.c(exception);
        this.b.f();
    }

    public final void b() {
        this.b.f();
    }
}
