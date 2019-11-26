package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ltl */
final /* synthetic */ class ltl implements OnClickListener {
    private final ltm a;

    ltl(ltm ltm) {
        this.a = ltm;
    }

    public final void onClick(View view) {
        xoy xoy = this.a.a;
        if (xoy != null) {
            xoy.bf_();
        }
    }
}
