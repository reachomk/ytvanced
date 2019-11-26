package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: abtt */
final /* synthetic */ class abtt implements OnClickListener {
    private final abtq a;

    abtt(abtq abtq) {
        this.a = abtq;
    }

    public final void onClick(View view) {
        abtq abtq = this.a;
        if (abtq.r) {
            abtq.r = false;
        } else {
            abtq.a(view);
        }
    }
}
