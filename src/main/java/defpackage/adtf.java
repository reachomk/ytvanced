package defpackage;

import android.net.Uri;

/* renamed from: adtf */
public final class adtf extends adqx {
    public static final String j = xtl.b("MDX.DialRecoverer");
    public final adcu k;
    public adti l;

    public adtf(bbb bbb, baz baz, adgw adgw, xhv xhv, adcu adcu, xci xci) {
        super(bbb, baz, adgw, xhv, xci, 3, true);
        this.k = adcu;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bbs bbs) {
        if (adhn.c(bbs)) {
            if (adiq.a(bbs.r) == null) {
                xtl.b(j, "dial app uri is null");
                return;
            }
            adti adti = this.l;
            if (adti != null) {
                adti.cancel(true);
                xtl.c(j, "cancelling running app status task and retrying");
            }
            this.l = (adti) new adti(this, bbs).execute(new Uri[]{r0});
            return;
        }
        xtl.b(j, "Non DIAL route was passed in for recovery.");
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        adti adti = this.l;
        if (adti != null) {
            adti.cancel(true);
            this.l = null;
        }
    }
}
