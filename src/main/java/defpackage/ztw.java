package defpackage;

import android.text.TextUtils;

/* renamed from: ztw */
final class ztw extends aaml {
    private final String a;

    protected ztw(aamd aamd, afpt afpt, String str, boolean z, String str2) {
        super("update_account_link_button", aamd, afpt, aall.DISABLED, false, str, Boolean.valueOf(z));
        this.a = str2;
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(TextUtils.isEmpty(this.a) ^ 1);
    }

    public final /* synthetic */ anzd c() {
        ayrk ayrk = (ayrk) ayrl.d.createBuilder();
        String str = this.a;
        ayrk.copyOnWrite();
        ayrl ayrl = (ayrl) ayrk.instance;
        if (str != null) {
            ayrl.a |= 2;
            ayrl.c = str;
            return ayrk;
        }
        throw new NullPointerException();
    }
}
