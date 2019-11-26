package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: alfm */
final class alfm implements OnLayoutChangeListener {
    private final /* synthetic */ View a;
    private final /* synthetic */ aruh b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ alfk d;

    alfm(alfk alfk, View view, aruh aruh, Object obj) {
        this.d = alfk;
        this.a = view;
        this.b = aruh;
        this.c = obj;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.d.a(this.a)) {
            this.d.a(this.b, this.a, this.c);
            this.a.removeOnLayoutChangeListener(this);
        }
    }
}
