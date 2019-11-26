package defpackage;

import android.content.Context;

/* renamed from: tnk */
final class tnk implements tnl {
    tnk() {
    }

    public final void a(Context context) {
        try {
            rxs.a(context);
        } catch (psg e) {
            throw new tej(e.a, e);
        } catch (psj e2) {
            int i = e2.a;
            String message = e2.getMessage();
            e2.a();
            throw new tei(i, message, e2);
        }
    }
}
