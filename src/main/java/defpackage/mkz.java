package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: mkz */
final /* synthetic */ class mkz implements OnClickListener {
    private final mla a;

    mkz(mla mla) {
        this.a = mla;
    }

    public final void onClick(View view) {
        mla mla = this.a;
        azgc azgc = mla.a;
        if (azgc != null) {
            axak axak = azgc.d;
            if (axak == null) {
                axak = axak.a;
            }
            mla.a(axak);
        }
    }
}
