package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: bcfv */
public final class bcfv {
    public Long a;
    private final bcfr b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private Map i = new LinkedHashMap();

    public bcfv(bcfr bcfr) {
        this.b = (bcfr) bcgg.a((Object) bcfr, (Object) "authorization request cannot be null");
    }

    public final bcfv a(String str) {
        bcgg.b(str, "state must not be empty");
        this.c = str;
        return this;
    }

    public final bcfv b(String str) {
        bcgg.b(str, "tokenType must not be empty");
        this.d = str;
        return this;
    }

    public final bcfv c(String str) {
        bcgg.b(str, "authorizationCode must not be empty");
        this.e = str;
        return this;
    }

    public final bcfv d(String str) {
        bcgg.b(str, "accessToken must not be empty");
        this.f = str;
        return this;
    }

    public final bcfv e(String str) {
        bcgg.b(str, "idToken cannot be empty");
        this.g = str;
        return this;
    }

    public final bcfv f(String str) {
        if (TextUtils.isEmpty(str)) {
            this.h = null;
        } else {
            String[] split = str.split(" +");
            if (split == null) {
                this.h = null;
            } else {
                this.h = bcfm.a(Arrays.asList(split));
            }
        }
        return this;
    }

    public final bcfv a(Map map) {
        this.i = bcfh.a(map, bcfs.a);
        return this;
    }

    public final bcfs a() {
        return new bcfs(this.b, this.c, this.d, this.e, this.f, this.a, this.g, this.h, Collections.unmodifiableMap(this.i));
    }
}
