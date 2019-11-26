package defpackage;

import android.view.View;

/* renamed from: asl */
final class asl extends abv {
    private boolean a = false;
    private final /* synthetic */ int b;
    private final /* synthetic */ asj c;

    asl(asj asj, int i) {
        this.c = asj;
        this.b = i;
    }

    public final void a() {
        this.c.a.setVisibility(0);
    }

    public final void a(View view) {
        if (!this.a) {
            this.c.a.setVisibility(this.b);
        }
    }

    public final void b() {
        this.a = true;
    }
}
