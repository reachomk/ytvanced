package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: yeg */
final /* synthetic */ class yeg implements OnClickListener {
    private final yee a;
    private final aqmx b;

    yeg(yee yee, aqmx aqmx) {
        this.a = yee;
        this.b = aqmx;
    }

    public final void onClick(View view) {
        apxu apxu;
        yee yee = this.a;
        aqmx aqmx = this.b;
        aaas aaas = yee.g;
        if ((aqmx.a & 1048576) != 0) {
            apxu = aqmx.q;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        aaas.a(apxu, null);
    }
}
