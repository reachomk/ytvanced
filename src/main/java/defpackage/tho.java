package defpackage;

import android.os.Bundle;

/* renamed from: tho */
public final class tho implements thf {
    private final qds a;

    public tho(String str, String str2) {
        this.a = new qds(str, str2);
    }

    public final thf a(String str) {
        qds qds = this.a;
        pzr.a(str);
        qds.a.putString("predefinedTheme", str);
        return this;
    }

    public final Bundle a() {
        return new Bundle(this.a.a);
    }
}
