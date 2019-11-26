package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;

/* renamed from: hrj */
final /* synthetic */ class hrj implements OnClickListener {
    private final hrf a;
    private final apxx b;
    private final HashMap c;

    hrj(hrf hrf, apxx apxx, HashMap hashMap) {
        this.a = hrf;
        this.b = apxx;
        this.c = hashMap;
    }

    public final void onClick(View view) {
        hrf hrf = this.a;
        apxx apxx = this.b;
        ((aaas) hrf.f.get()).a((apxu) ((anxl) apxx.build()), this.c);
    }
}
