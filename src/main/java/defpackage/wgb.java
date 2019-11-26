package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wgb */
final /* synthetic */ class wgb implements OnClickListener {
    private final wfz a;

    wgb(wfz wfz) {
        this.a = wfz;
    }

    public final void onClick(View view) {
        this.a.p().onBackPressed();
    }
}
