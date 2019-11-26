package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: aeyg */
final class aeyg extends oct {
    private aewi k = aewi.a;

    aeyg(Context context, odw odw, obs obs, Handler handler, aeya aeya) {
        super(context, aeya, odw, handler, obs);
    }

    public final void a(int i, Object obj) {
        if (i == 10001) {
            aewi aewi = (aewi) obj;
            if (aewi == null) {
                aewi = aewi.a;
            }
            this.k = aewi;
            return;
        }
        super.a(i, obj);
    }

    public final void p() {
        super.p();
        this.k.b();
    }

    public final boolean u() {
        if (!super.u()) {
            return false;
        }
        this.k.a();
        return true;
    }
}
