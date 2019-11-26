package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wkw */
final /* synthetic */ class wkw implements OnClickListener {
    private final wkt a;

    wkw(wkt wkt) {
        this.a = wkt;
    }

    public final void onClick(View view) {
        Runnable runnable = this.a.p;
        if (runnable != null) {
            runnable.run();
        }
    }
}
