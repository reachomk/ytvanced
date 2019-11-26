package defpackage;

import android.view.View;

/* renamed from: ibu */
public final class ibu extends iba implements aimd {
    public boolean a;
    public boolean b;
    public boolean c;
    private final View d;
    private final ails e;

    public ibu(View view, ibw ibw, ails ails) {
        this.d = view;
        this.e = ails;
        view.setOnClickListener(new ibt(ibw));
        ails.d.a(this);
    }

    public final void a(float f, boolean z) {
    }

    /* Access modifiers changed, original: protected|final */
    public final void d(boolean z) {
        this.d.setVisibility(0);
    }

    /* Access modifiers changed, original: protected|final */
    public final void e(boolean z) {
        this.d.setVisibility(8);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean f(boolean z) {
        return (this.e.d.f() || !this.e.d.a()) && !this.a && !this.c && this.b;
    }

    public final void a(int i, int i2, int i3) {
        a();
    }
}
