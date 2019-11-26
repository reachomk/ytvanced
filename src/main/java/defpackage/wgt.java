package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wgt */
final class wgt implements OnClickListener {
    private final /* synthetic */ wgq a;

    wgt(wgq wgq) {
        this.a = wgq;
    }

    public final void onClick(View view) {
        this.a.p().onBackPressed();
    }
}
