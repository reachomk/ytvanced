package defpackage;

import android.text.TextUtils;
import java.io.IOException;

/* renamed from: afwm */
final /* synthetic */ class afwm implements Runnable {
    private final afwk a;

    afwm(afwk afwk) {
        this.a = afwk;
    }

    public final void run() {
        afwk afwk = this.a;
        if (TextUtils.isEmpty(afwk.b)) {
            xtl.d("Can't get GCM registration token because the apiary project ID is missing.");
            return;
        }
        try {
            afwk.d = afwk.a.a(afwk.b, "GCM");
            afwk.c.execute(new afwo(afwk));
        } catch (IOException e) {
            xtl.a("Unexpected exception while attempting to get the GCM registration token", e);
        }
    }
}
