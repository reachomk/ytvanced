package defpackage;

import android.view.View;

/* renamed from: eq */
final class eq {
    public int a;
    public int b;
    private final View c;
    private int d;
    private final boolean e = true;

    public eq(View view) {
        this.c = view;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.a = this.c.getTop();
        this.d = this.c.getLeft();
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        View view = this.c;
        abe.d(view, this.b - (view.getTop() - this.a));
        view = this.c;
        abe.e(view, -(view.getLeft() - this.d));
    }

    public final boolean a(int i) {
        if (!this.e || this.b == i) {
            return false;
        }
        this.b = i;
        b();
        return true;
    }
}
