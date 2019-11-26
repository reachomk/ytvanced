package defpackage;

import android.view.View;
import android.view.View.OnFocusChangeListener;

/* renamed from: abtf */
final /* synthetic */ class abtf implements OnFocusChangeListener {
    private final abta a;
    private final int b;
    private final int c;

    abtf(abta abta, int i, int i2) {
        this.a = abta;
        this.b = i;
        this.c = i2;
    }

    public final void onFocusChange(View view, boolean z) {
        this.a.a(z, this.b, this.c);
    }
}
