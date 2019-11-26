package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: yfa */
final /* synthetic */ class yfa implements OnClickListener {
    private final yey a;
    private final aqnx b;

    yfa(yey yey, aqnx aqnx) {
        this.a = yey;
        this.b = aqnx;
    }

    public final void onClick(View view) {
        yey yey = this.a;
        aqnx aqnx = this.b;
        aaas aaas = yey.g;
        apxu apxu = aqnx.r;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
