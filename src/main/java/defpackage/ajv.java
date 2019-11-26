package defpackage;

import android.view.View;

/* renamed from: ajv */
public final class ajv implements abs {
    private boolean a = false;
    private int b;
    private final /* synthetic */ ajw c;

    protected ajv(ajw ajw) {
        this.c = ajw;
    }

    public final ajv a(abr abr, int i) {
        this.c.f = abr;
        this.b = i;
        return this;
    }

    public final void a() {
        super.setVisibility(0);
        this.a = false;
    }

    public final void a(View view) {
        if (!this.a) {
            ajw ajw = this.c;
            ajw.f = null;
            super.setVisibility(this.b);
        }
    }

    public final void b() {
        this.a = true;
    }
}
