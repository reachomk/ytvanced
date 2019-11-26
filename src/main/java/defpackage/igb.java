package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: igb */
final class igb implements OnLayoutChangeListener {
    private final /* synthetic */ igc a;

    igb(igc igc) {
        this.a = igc;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        i8 -= i6;
        i3 -= i;
        i4 -= i2;
        if (i7 - i5 != i3 || i8 != i4) {
            boolean isInMultiWindowMode = this.a.a.isInMultiWindowMode();
            igc igc = this.a;
            ibv ibv = igc.b;
            boolean z = true;
            if (i4 <= i3 && !isInMultiWindowMode) {
                z = false;
            }
            isInMultiWindowMode = igc.c.a();
            wad wad = ibv.i;
            ((vzk) wad.c).a(z, ((vyg) wad.b).k(), ((vyg) wad.b).j(), isInMultiWindowMode);
        }
    }
}
