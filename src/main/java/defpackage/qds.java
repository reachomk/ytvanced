package defpackage;

import android.os.Bundle;

/* renamed from: qds */
public final class qds implements qdt {
    private static final String b = qdq.a("FamilyApiMessage");
    public final Bundle a = new Bundle(12);

    public qds(String str, String str2) {
        pzr.a(str);
        pzr.a(str2);
        this.a.putString(b, "ManageFamilyV2");
        this.a.putString("accountName", str);
        this.a.putString("appId", str2);
    }
}
