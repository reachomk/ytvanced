package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bcfl */
public final class bcfl extends Exception {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final Uri e;

    public static bcfl a(int i, String str) {
        return new bcfl(0, i, null, str, null);
    }

    public static bcfl b(int i, String str) {
        return new bcfl(1, i, str, null, null);
    }

    public static bcfl c(int i, String str) {
        return new bcfl(2, i, str, null, null);
    }

    public static bcfl d(int i, String str) {
        return new bcfl(4, i, str, null, null);
    }

    public static Map a(bcfl... bcflArr) {
        zj zjVar = new zj(r0);
        for (bcfl bcfl : bcflArr) {
            String str = bcfl.c;
            if (str != null) {
                zjVar.put(str, bcfl);
            }
        }
        return Collections.unmodifiableMap(zjVar);
    }

    public bcfl(int i, int i2, String str, String str2, Uri uri) {
        super(str2, null);
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = uri;
    }

    private final String b() {
        Object jSONObject = new JSONObject();
        bcgb.a((JSONObject) jSONObject, "type", this.a);
        bcgb.a((JSONObject) jSONObject, "code", this.b);
        bcgb.b(jSONObject, "error", this.c);
        bcgb.b(jSONObject, "errorDescription", this.d);
        Uri uri = this.e;
        bcgg.a(jSONObject, (Object) "json must not be null");
        Object obj = "errorUri";
        bcgg.a(obj, (Object) "field must not be null");
        if (uri != null) {
            try {
                jSONObject.put(obj, uri.toString());
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        }
        return jSONObject.toString();
    }

    public final Intent a() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationException", b());
        return intent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof bcfl)) {
            bcfl bcfl = (bcfl) obj;
            return this.a == bcfl.a && this.b == bcfl.b;
        }
    }

    public final int hashCode() {
        return ((this.a + 31) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AuthorizationException: ");
        stringBuilder.append(b());
        return stringBuilder.toString();
    }
}
