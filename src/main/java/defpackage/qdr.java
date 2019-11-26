package defpackage;

import android.os.Bundle;

/* renamed from: qdr */
public final class qdr implements qdo {
    private static final String b = qdq.a("FamilyApiMessage");
    public final Bundle a = new Bundle(10);

    public qdr(String str, String str2) {
        pzr.a(str);
        pzr.a(str2);
        this.a.putString(b, "CreateFamilyV2");
        this.a.putString("accountName", str);
        this.a.putString("appId", str2);
    }
}
