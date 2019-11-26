package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: zvr */
final class zvr implements OnClickListener {
    private final /* synthetic */ zvs a;

    zvr(zvs zvs) {
        this.a = zvs;
    }

    public final void onClick(View view) {
        zvw zvw = this.a.b;
        if (zvw != null) {
            zvw.c();
        }
    }
}
