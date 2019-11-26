package defpackage;

import android.view.View;

/* renamed from: asq */
final class asq {
    private final ass a;
    private final ast b = new ast();

    asq(ass ass) {
        this.a = ass;
    }

    /* Access modifiers changed, original: final */
    public final View a(int i, int i2, int i3, int i4) {
        int a = this.a.a();
        int b = this.a.b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.a.a(i);
            this.b.a(a, b, this.a.a(a2), this.a.b(a2));
            this.b.a();
            this.b.a(i3);
            if (this.b.b()) {
                return a2;
            }
            if (i4 != 0) {
                this.b.a();
                this.b.a(i4);
                if (this.b.b()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(View view) {
        this.b.a(this.a.a(), this.a.b(), this.a.a(view), this.a.b(view));
        this.b.a();
        this.b.a(24579);
        return this.b.b();
    }
}
