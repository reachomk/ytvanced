package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;

/* renamed from: fcg */
public final class fcg extends fat implements albh {
    private final akkq a;
    private final eif b;
    private final lux c;
    private final feg d;
    private fcl e;
    private Context f;

    public fcg(fbp fbp, Handler handler, akkq akkq, eif eif, lux lux, feg feg) {
        super(fbp, handler, fcf.a, fci.a);
        this.a = akkq;
        this.b = eif;
        this.d = feg;
        this.c = lux;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ boolean c(albf albf) {
        albg albg = (albg) albf;
        boolean z = false;
        if (!(TextUtils.isEmpty(albg.g()) && TextUtils.isEmpty(albg.i()))) {
            if (!TextUtils.isEmpty(albg.e())) {
                z = true;
            } else if (TextUtils.isEmpty(albg.f())) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }

    public final /* synthetic */ void b(albg albg) {
        super.a((albf) albg);
    }

    public final /* synthetic */ albj b() {
        return (albj) super.a();
    }
}
