package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: gow */
final /* synthetic */ class gow implements OnClickListener {
    private final Runnable a;

    gow(Runnable runnable) {
        this.a = runnable;
    }

    public final void onClick(View view) {
        this.a.run();
    }
}
