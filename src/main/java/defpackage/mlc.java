package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: mlc */
final /* synthetic */ class mlc implements OnClickListener {
    private final mla a;

    mlc(mla mla) {
        this.a = mla;
    }

    public final void onClick(View view) {
        mla mla = this.a;
        azgc azgc = mla.a;
        if (azgc != null) {
            axak axak = azgc.e;
            if (axak == null) {
                axak = axak.a;
            }
            mla.a(axak);
        }
    }
}
