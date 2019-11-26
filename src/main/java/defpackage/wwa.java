package defpackage;

import android.content.Context;

/* renamed from: wwa */
public final class wwa implements baqa {
    private final bcaa a;

    private wwa(bcaa bcaa) {
        this.a = bcaa;
    }

    public static wwa a(bcaa bcaa) {
        return new wwa(bcaa);
    }

    public static String a(Context context) {
        return (String) baqd.a(xsl.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return wwa.a((Context) this.a.get());
    }
}
