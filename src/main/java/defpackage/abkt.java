package defpackage;

import android.text.TextUtils;

/* renamed from: abkt */
public final class abkt extends aaml {
    public String a = "";

    public abkt(aamd aamd, afpt afpt) {
        super("ypc/get_fix_instrument_params", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(TextUtils.isEmpty(this.a) ^ 1);
    }

    public final /* synthetic */ anzd c() {
        asra asra = (asra) asqx.d.createBuilder();
        String str = this.a;
        asra.copyOnWrite();
        asqx asqx = (asqx) asra.instance;
        if (str != null) {
            asqx.a |= 2;
            asqx.c = str;
            return asra;
        }
        throw new NullPointerException();
    }
}
