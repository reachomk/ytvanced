package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bcfr */
public final class bcfr {
    public static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"client_id", "code_challenge", "code_challenge_method", "display", "login_hint", "prompt", "redirect_uri", "response_mode", "response_type", "scope", "state"})));
    public final bcfx b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Uri h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final Map o;

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        bcfx bcfx = this.b;
        JSONObject jSONObject2 = new JSONObject();
        bcgb.a(jSONObject2, "authorizationEndpoint", bcfx.a.toString());
        bcgb.a(jSONObject2, "tokenEndpoint", bcfx.b.toString());
        Uri uri = bcfx.c;
        if (uri != null) {
            bcgb.a(jSONObject2, "registrationEndpoint", uri.toString());
        }
        bcfw bcfw = bcfx.d;
        if (bcfw != null) {
            bcgb.a(jSONObject2, "discoveryDoc", bcfw.d);
        }
        bcgb.a(jSONObject, "configuration", jSONObject2);
        bcgb.a(jSONObject, "clientId", this.c);
        bcgb.a(jSONObject, "responseType", this.g);
        bcgb.a(jSONObject, "redirectUri", this.h.toString());
        bcgb.b(jSONObject, "display", this.d);
        bcgb.b(jSONObject, "login_hint", this.e);
        bcgb.b(jSONObject, "scope", this.i);
        bcgb.b(jSONObject, "prompt", this.f);
        bcgb.b(jSONObject, "state", this.j);
        bcgb.b(jSONObject, "codeVerifier", this.k);
        bcgb.b(jSONObject, "codeVerifierChallenge", this.l);
        bcgb.b(jSONObject, "codeVerifierChallengeMethod", this.m);
        bcgb.b(jSONObject, "responseMode", this.n);
        bcgb.a(jSONObject, "additionalParameters", bcgb.a(this.o));
        return jSONObject;
    }

    public final String b() {
        return a().toString();
    }

    public static bcfr a(JSONObject jSONObject) {
        bcfx bcfx;
        String str;
        bcgg.a((Object) jSONObject, (Object) "json cannot be null");
        Object jSONObject2 = jSONObject.getJSONObject("configuration");
        bcgg.a(jSONObject2, (Object) "json object cannot be null");
        String str2 = "discoveryDoc";
        if (jSONObject2.has(str2)) {
            try {
                bcfx = new bcfx(new bcfw(jSONObject2.optJSONObject(str2)));
            } catch (bcfz e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Missing required field in discovery doc: ");
                stringBuilder.append(e.a);
                throw new JSONException(stringBuilder.toString());
            }
        }
        str2 = "authorizationEndpoint";
        bcgg.a(jSONObject2.has(str2), (Object) "missing authorizationEndpoint");
        str = "tokenEndpoint";
        bcgg.a(jSONObject2.has(str), (Object) "missing tokenEndpoint");
        bcfx = new bcfx(bcgb.c(jSONObject2, str2), bcgb.c(jSONObject2, str), bcgb.d(jSONObject2, "registrationEndpoint"));
        bcft bcft = new bcft(bcfx, bcgb.a(jSONObject, "clientId"), bcgb.a(jSONObject, "responseType"), bcgb.c(jSONObject, "redirectUri"));
        bcft.a(bcgb.b(jSONObject, "display"));
        bcft.b(bcgb.b(jSONObject, "login_hint"));
        bcft.c(bcgb.b(jSONObject, "prompt"));
        bcft.e(bcgb.b(jSONObject, "state"));
        String b = bcgb.b(jSONObject, "codeVerifier");
        str2 = bcgb.b(jSONObject, "codeVerifierChallenge");
        str = bcgb.b(jSONObject, "codeVerifierChallengeMethod");
        if (b == null) {
            boolean z = true;
            bcgg.a(str2 == null, (Object) "code verifier challenge must be null if verifier is null");
            if (str != null) {
                z = false;
            }
            bcgg.a(z, (Object) "code verifier challenge method must be null if verifier is null");
        } else {
            bcfy.a(b);
            bcgg.a(str2, (Object) "code verifier challenge cannot be null or empty if verifier is set");
            bcgg.a(str, (Object) "code verifier challenge method cannot be null or empty if verifier is set");
        }
        bcft.b = b;
        bcft.c = str2;
        bcft.d = str;
        bcft.g(bcgb.b(jSONObject, "responseMode"));
        bcft.a(bcgb.e(jSONObject, "additionalParameters"));
        b = "scope";
        if (jSONObject.has(b)) {
            Iterable linkedHashSet;
            String a = bcgb.a(jSONObject, b);
            if (a != null) {
                List asList = Arrays.asList(TextUtils.split(a, " "));
                linkedHashSet = new LinkedHashSet(asList.size());
                linkedHashSet.addAll(asList);
            } else {
                linkedHashSet = null;
            }
            bcft.a(linkedHashSet);
        }
        return bcft.a();
    }

    public static bcfr a(String str) {
        bcgg.a((Object) str, (Object) "json string cannot be null");
        return bcfr.a(new JSONObject(str));
    }

    /* synthetic */ bcfr(bcfx bcfx, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Map map) {
        this.b = bcfx;
        this.c = str;
        this.g = str2;
        this.h = uri;
        this.o = map;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = str10;
        this.n = str11;
    }
}
