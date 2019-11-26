package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: bzc */
public final class bzc implements bsm {
    public URL b;
    private final bzb c;
    private final URL d;
    private final String e;
    private String f;
    private volatile byte[] g;
    private int h;

    public bzc(URL url) {
        Object obj = bzb.a;
        this.d = (URL) chw.a((Object) url);
        this.e = null;
        this.c = (bzb) chw.a(obj);
    }

    public bzc(String str) {
        Object obj = bzb.a;
        this.d = null;
        this.e = chw.a(str);
        this.c = (bzb) chw.a(obj);
    }

    public final String a() {
        if (TextUtils.isEmpty(this.f)) {
            String str = this.e;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) chw.a(this.d)).toString();
            }
            this.f = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f;
    }

    public final Map b() {
        return this.c.a();
    }

    private final String c() {
        String str = this.e;
        return str == null ? ((URL) chw.a(this.d)).toString() : str;
    }

    public final String toString() {
        return c();
    }

    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(a);
        }
        messageDigest.update(this.g);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bzc) {
            bzc bzc = (bzc) obj;
            if (c().equals(bzc.c()) && this.c.equals(bzc.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        i = c().hashCode();
        this.h = i;
        i = (i * 31) + this.c.hashCode();
        this.h = i;
        return i;
    }
}
