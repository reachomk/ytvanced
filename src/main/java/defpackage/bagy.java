package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: bagy */
final class bagy implements OnClickListener {
    private final /* synthetic */ bagn a;

    bagy(bagn bagn) {
        this.a = bagn;
    }

    public final void onClick(View view) {
        Runnable runnable = this.a.l;
        Runnable runnable2 = this.a.k;
        if (runnable2 != null) {
            runnable2.run();
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
