package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: azt */
final class azt implements OnClickListener {
    private final /* synthetic */ azl a;

    azt(azl azl) {
        this.a = azl;
    }

    public final void onClick(View view) {
        azl azl = this.a;
        int i = azl.M ^ 1;
        azl.M = i;
        if (i != 0) {
            azl.m.setVisibility(0);
        }
        this.a.g();
        this.a.d(true);
    }
}
