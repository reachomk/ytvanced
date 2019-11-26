package defpackage;

import android.app.Activity;

/* renamed from: uqu */
final class uqu implements uyf {
    private final /* synthetic */ Activity a;
    private final /* synthetic */ apxu b;
    private final /* synthetic */ uqr c;

    uqu(uqr uqr, Activity activity, apxu apxu) {
        this.c = uqr;
        this.a = activity;
        this.b = apxu;
    }

    public final void a(aanv aanv) {
        this.c.a.a(aanv, null, afqd.a);
    }

    public final void a() {
        uqr uqr = this.c;
        Activity activity = this.a;
        apxu apxu = this.b;
        uqr.c = true;
        nt f = ((nn) activity).f();
        String str = "modal-app-start-sign-in-flow-fragment";
        uqv uqv = (uqv) f.a(str);
        or a = f.a();
        if (uqv == null) {
            a.a(uqv.a(apxu), str);
        } else {
            uqv.ak = apxu;
            if (!uqv.v()) {
                a.c(uqv);
            }
        }
        a.b();
    }

    public final void a(Exception exception) {
        this.c.b.d(new uyw(uyz.CANCELLED, true));
    }
}
