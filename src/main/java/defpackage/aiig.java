package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: aiig */
final class aiig implements OnLayoutChangeListener {
    private final /* synthetic */ aiic a;

    aiig(aiic aiic) {
        this.a = aiic;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        aiic aiic = this.a;
        aiic.a(aiic.a, false);
        this.a.removeOnLayoutChangeListener(this);
    }
}
