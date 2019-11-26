package defpackage;

import android.text.TextUtils;

/* renamed from: aatm */
public final class aatm extends aaml {
    public String a;

    public aatm(aamd aamd, afpt afpt) {
        super("connections/get_contact_menu", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(TextUtils.isEmpty(this.a) ^ 1);
    }

    public final /* synthetic */ anzd c() {
        asha asha = (asha) ashb.d.createBuilder();
        String str = this.a;
        asha.copyOnWrite();
        ashb ashb = (ashb) asha.instance;
        if (str != null) {
            ashb.a |= 2;
            ashb.c = str;
            return asha;
        }
        throw new NullPointerException();
    }
}
