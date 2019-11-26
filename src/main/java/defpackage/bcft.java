package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bcft */
public final class bcft {
    public String a;
    public String b;
    public String c;
    public String d;
    private final bcfx e;
    private final String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private final Uri k;
    private String l;
    private String m;
    private Map n = new HashMap();

    public bcft(bcfx bcfx, String str, String str2, Uri uri) {
        this.e = (bcfx) bcgg.a((Object) bcfx, (Object) "configuration cannot be null");
        this.f = bcgg.a(str, (Object) "client ID cannot be null or empty");
        d(str2);
        this.k = (Uri) bcgg.a((Object) uri, (Object) "redirect URI cannot be null or empty");
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        e(Base64.encodeToString(bArr, 11));
        f(bcfy.a());
    }

    public final bcft a(String str) {
        this.g = bcgg.b(str, "display must be null or not empty");
        return this;
    }

    public final bcft b(String str) {
        this.h = bcgg.b(str, "login hint must be null or not empty");
        return this;
    }

    public final bcft c(String str) {
        this.i = bcgg.b(str, "prompt must be null or non-empty");
        return this;
    }

    public final bcft d(String str) {
        this.j = bcgg.a(str, (Object) "expected response type cannot be null or empty");
        return this;
    }

    public final bcft a(Iterable iterable) {
        this.a = bcfm.a(iterable);
        return this;
    }

    public final bcft e(String str) {
        this.l = bcgg.b(str, "state cannot be empty if defined");
        return this;
    }

    public final bcft f(String str) {
        if (str != null) {
            bcfy.a(str);
            this.b = str;
            this.c = bcfy.b(str);
            this.d = bcfy.b();
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
        }
        return this;
    }

    public final bcft g(String str) {
        bcgg.b(str, "responseMode must not be empty");
        this.m = str;
        return this;
    }

    public final bcft a(Map map) {
        this.n = bcfh.a(map, bcfr.a);
        return this;
    }

    public final bcfr a() {
        return new bcfr(this.e, this.f, this.j, this.k, this.g, this.h, this.i, this.a, this.l, this.b, this.c, this.d, this.m, Collections.unmodifiableMap(new HashMap(this.n)));
    }
}
