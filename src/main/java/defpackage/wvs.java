package defpackage;

import android.content.Context;

/* renamed from: wvs */
final /* synthetic */ class wvs implements amro {
    private final Context a;

    wvs(Context context) {
        this.a = context;
    }

    public final Object get() {
        Object packageName = this.a.getPackageName();
        return packageName == null ? "" : packageName;
    }
}
