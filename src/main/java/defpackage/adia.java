package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: adia */
final class adia extends adhy {
    private Integer a;
    private Boolean b;
    private Boolean c;
    private Boolean d;
    private Uri e;
    private adjb f;
    private String g;
    private Map h;

    adia() {
    }

    public final adhy a(int i) {
        this.a = Integer.valueOf(i);
        return this;
    }

    public final adhy a(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    public final adhy b(boolean z) {
        this.c = Boolean.valueOf(z);
        return this;
    }

    public final adhy c(boolean z) {
        this.d = Boolean.valueOf(z);
        return this;
    }

    public final adhy a(Uri uri) {
        this.e = uri;
        return this;
    }

    public final adhy a(adjb adjb) {
        this.f = adjb;
        return this;
    }

    public final adhy a(String str) {
        this.g = str;
        return this;
    }

    public final adhy a(Map map) {
        if (map != null) {
            this.h = map;
            return this;
        }
        throw new NullPointerException("Null additionalData");
    }

    public final adhw a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" status");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" stopAllowed");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" inAppDial");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" castSupported");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" additionalData");
        }
        if (str.isEmpty()) {
            return new adhx(this.a.intValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e, this.f, this.g, this.h);
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }
}
