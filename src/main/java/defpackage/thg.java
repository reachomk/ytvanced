package defpackage;

import android.os.Bundle;

/* renamed from: thg */
public final class thg implements tha {
    private final qdr a;

    public thg(String str, String str2) {
        this.a = new qdr(str, str2);
    }

    public final tha a(String str) {
        qdr qdr = this.a;
        pzr.a(str);
        qdr.a.putString("predefinedTheme", str);
        return this;
    }

    public final tha b(String str) {
        qdr qdr = this.a;
        pzr.a(str);
        qdr.a.putString("referencePcid", str);
        return this;
    }

    public final Bundle a() {
        return new Bundle(this.a.a);
    }
}
