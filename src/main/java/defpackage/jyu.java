package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: jyu */
final class jyu implements OnLayoutChangeListener {
    private final /* synthetic */ jyi a;

    jyu(jyi jyi) {
        this.a = jyi;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.p.removeOnLayoutChangeListener(this);
        jyi jyi = this.a;
        boolean z = true;
        if (abe.g(jyi.p) != 1) {
            z = false;
        }
        jyi.b(z);
    }
}
