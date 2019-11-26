package defpackage;

import java.util.Arrays;

/* renamed from: anll */
public final class anll {
    public final String a;
    public final String b;
    private final String c = null;
    private final String d = null;
    private final String e = null;
    private final String f;
    private final String g;

    public final boolean equals(Object obj) {
        if (obj instanceof anll) {
            anll anll = (anll) obj;
            if (pzj.a(this.a, anll.a) && pzj.a(null, null) && pzj.a(null, null) && pzj.a(null, null) && pzj.a(this.b, anll.b) && pzj.a(null, null) && pzj.a(this.g, anll.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null, null, null, this.b, null, this.g});
    }

    public final String toString() {
        pzi a = pzj.a(this);
        a.a("applicationId", this.a);
        a.a("apiKey", null);
        a.a("databaseUrl", null);
        a.a("gcmSenderId", this.b);
        a.a("storageBucket", null);
        a.a("projectId", this.g);
        return a.toString();
    }

    public /* synthetic */ anll(String str, String str2, String str3) {
        pzr.a(qbh.a(str) ^ 1, (Object) "ApplicationId must be set.");
        this.a = str;
        this.b = str2;
        this.f = null;
        this.g = str3;
    }
}
