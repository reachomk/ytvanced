package defpackage;

import android.view.ViewGroup;

/* renamed from: bft */
final class bft extends bhc {
    private boolean a = false;
    private final /* synthetic */ ViewGroup b;

    bft(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    public final void a() {
        bhr.a(this.b, false);
        this.a = true;
    }

    public final void a(bgx bgx) {
        if (!this.a) {
            bhr.a(this.b, false);
        }
        bgx.b((bhd) this);
    }

    public final void b() {
        bhr.a(this.b, false);
    }

    public final void c() {
        bhr.a(this.b, true);
    }
}
