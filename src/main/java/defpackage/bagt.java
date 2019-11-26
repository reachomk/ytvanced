package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: bagt */
final class bagt implements OnClickListener {
    private final /* synthetic */ bagn a;

    bagt(bagn bagn) {
        this.a = bagn;
    }

    public final void onClick(View view) {
        Runnable runnable = this.a.k;
        if (runnable != null) {
            runnable.run();
        }
    }
}
