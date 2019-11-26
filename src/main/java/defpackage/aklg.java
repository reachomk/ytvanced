package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: aklg */
final class aklg implements OnLayoutChangeListener {
    public boolean a;
    private xni b;
    private final /* synthetic */ akle c;

    aklg(akle akle, boolean z) {
        this.c = akle;
        a(z);
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        akle akle = this.c;
        akle.a(this.b, !this.a ? akle.d : null);
    }

    public final void a(boolean z) {
        if (this.a != z) {
            this.a = z;
            if (z) {
                a(null);
            } else if (this.b == null) {
                this.c.a.removeOnLayoutChangeListener(this);
            }
        }
    }

    public final void a(xni xni) {
        this.b = xni;
        this.c.a.addOnLayoutChangeListener(this);
    }

    public final void a() {
        if (!this.a) {
            this.c.a.removeOnLayoutChangeListener(this);
        }
        this.b = null;
    }
}
