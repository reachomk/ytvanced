package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: gos */
final class gos implements OnLayoutChangeListener {
    private final /* synthetic */ gop a;

    gos(gop gop) {
        this.a = gop;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.c.setY((float) i4);
    }
}
