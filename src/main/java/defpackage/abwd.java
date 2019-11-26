package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: abwd */
final /* synthetic */ class abwd implements OnLayoutChangeListener {
    private final abwb a;

    abwd(abwb abwb) {
        this.a = abwb;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        abwb abwb = this.a;
        if (i4 - i2 != i8 - i6) {
            abwb.e();
        }
    }
}
