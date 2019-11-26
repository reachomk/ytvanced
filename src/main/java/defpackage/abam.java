package defpackage;

import android.text.TextUtils;

/* renamed from: abam */
public final class abam extends aaml {
    public String a;
    public ayyw b;

    public abam(aamd aamd, afpt afpt) {
        super("live/get_confirm_broadcast_setup", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final /* synthetic */ anzd c() {
        asqr asqr;
        asqu asqu = (asqu) asqr.e.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            asqu.copyOnWrite();
            asqr = (asqr) asqu.instance;
            if (str != null) {
                asqr.a |= 4;
                asqr.d = str;
            } else {
                throw new NullPointerException();
            }
        }
        ayyw ayyw = this.b;
        if (ayyw != null) {
            asqu.copyOnWrite();
            asqr = (asqr) asqu.instance;
            asqr.c = ayyw;
            asqr.a |= 2;
        }
        return asqu;
    }
}
