package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: bagv */
final class bagv implements OnClickListener {
    private final /* synthetic */ bagn a;

    bagv(bagn bagn) {
        this.a = bagn;
    }

    public final void onClick(View view) {
        Runnable runnable = this.a.k;
        if (runnable != null) {
            runnable.run();
        }
    }
}
