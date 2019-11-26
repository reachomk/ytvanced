package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: ezf */
final /* synthetic */ class ezf implements OnLayoutChangeListener {
    private final ezd a;

    ezf(ezd ezd) {
        this.a = ezd;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ezd ezd = this.a;
        if (ezd.b.getLineCount() != ezd.e) {
            ezd.e = ezd.b.getLineCount();
            if (!ezd.a.isRunning()) {
                ezd.a.setIntValues(new int[]{ezd.c, ezd.d()});
            }
        }
    }
}
