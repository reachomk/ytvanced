package defpackage;

import android.view.View;

/* renamed from: aie */
final class aie extends abv {
    private boolean a = false;
    private int b = 0;
    private final /* synthetic */ aif c;

    aie(aif aif) {
        this.c = aif;
    }

    public final void a() {
        if (!this.a) {
            this.a = true;
            abs abs = this.c.b;
            if (abs != null) {
                abs.a();
            }
        }
    }

    public final void a(View view) {
        int i = this.b + 1;
        this.b = i;
        if (i == this.c.a.size()) {
            abs abs = this.c.b;
            if (abs != null) {
                abs.a(null);
            }
            this.b = 0;
            this.a = false;
            this.c.c = false;
        }
    }
}
