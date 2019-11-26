package defpackage;

import android.content.Intent;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bcfs */
public final class bcfs {
    public static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"token_type", "state", "code", "access_token", "expires_in", "id_token", "scope"})));
    public final bcfr b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;
    public final String h;
    public final String i;
    public final Map j;

    public static bcfs a(Intent intent) {
        String str = "request";
        bcgg.a((Object) intent, (Object) "dataIntent must not be null");
        String str2 = "net.openid.appauth.AuthorizationResponse";
        Long l = null;
        if (!intent.hasExtra(str2)) {
            return null;
        }
        try {
            Object jSONObject = new JSONObject(intent.getStringExtra(str2));
            if (jSONObject.has(str)) {
                bcfv bcfv = new bcfv(bcfr.a(jSONObject.getJSONObject(str)));
                bcfv.b(bcgb.b(jSONObject, "token_type"));
                bcfv.d(bcgb.b(jSONObject, "access_token"));
                bcfv.c(bcgb.b(jSONObject, "code"));
                bcfv.e(bcgb.b(jSONObject, "id_token"));
                bcfv.f(bcgb.b(jSONObject, "scope"));
                bcfv.a(bcgb.b(jSONObject, "state"));
                Object obj = "expires_at";
                bcgg.a(jSONObject, (Object) "json must not be null");
                bcgg.a(obj, (Object) "field must not be null");
                if (jSONObject.has(obj)) {
                    l = Long.valueOf(jSONObject.getLong(obj));
                }
                bcfv.a = l;
                bcfv.a(bcgb.e(jSONObject, "additional_parameters"));
                return bcfv.a();
            }
            throw new IllegalArgumentException("authorization request not provided and not found in JSON");
        } catch (JSONException e) {
            throw new IllegalArgumentException("Intent contains malformed auth response", e);
        }
    }

    /* synthetic */ bcfs(bcfr bcfr, String str, String str2, String str3, String str4, Long l, String str5, String str6, Map map) {
        this.b = bcfr;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = l;
        this.h = str5;
        this.i = str6;
        this.j = map;
    }
}
