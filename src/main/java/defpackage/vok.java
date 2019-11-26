package defpackage;

import android.content.SharedPreferences;

/* renamed from: vok */
public final class vok implements baqa {
    private final bcaa a;

    private vok(bcaa bcaa) {
        this.a = bcaa;
    }

    public static vok a(bcaa bcaa) {
        return new vok(bcaa);
    }

    public final /* synthetic */ Object get() {
        return new voe((SharedPreferences) this.a.get());
    }
}
