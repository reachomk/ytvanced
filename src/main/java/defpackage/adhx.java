package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: adhx */
final class adhx extends adhw {
    private final int a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final Uri e;
    private final adjb f;
    private final String g;
    private final Map h;

    public final int b() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.d;
    }

    /* Access modifiers changed, original: final */
    public final Uri f() {
        return this.e;
    }

    public final adjb g() {
        return this.f;
    }

    public final String h() {
        return this.g;
    }

    public final Map i() {
        return this.h;
    }

    public final String toString() {
        int i = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
        String str = this.g;
        String valueOf3 = String.valueOf(this.h);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder stringBuilder = new StringBuilder((((length + 148) + length2) + String.valueOf(str).length()) + valueOf3.length());
        stringBuilder.append("AppStatus{status=");
        stringBuilder.append(i);
        stringBuilder.append(", stopAllowed=");
        stringBuilder.append(z);
        stringBuilder.append(", inAppDial=");
        stringBuilder.append(z2);
        stringBuilder.append(", castSupported=");
        stringBuilder.append(z3);
        stringBuilder.append(", installUrl=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", screenId=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", runningPathSegment=");
        stringBuilder.append(str);
        stringBuilder.append(", additionalData=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adhw) {
            adhw adhw = (adhw) obj;
            if (this.a == adhw.b() && this.b == adhw.c() && this.c == adhw.d() && this.d == adhw.e()) {
                Uri uri = this.e;
                if (uri == null ? adhw.f() != null : !uri.equals(adhw.f())) {
                    adjb adjb = this.f;
                    if (adjb == null ? adhw.g() != null : !adjb.equals(adhw.g())) {
                        String str = this.g;
                        if (str == null ? adhw.h() == null : str.equals(adhw.h())) {
                            if (this.h.equals(adhw.i())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = (((((this.a ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231)) * 1000003) ^ (!this.c ? 1237 : 1231)) * 1000003;
        if (this.d) {
            i = 1231;
        }
        i2 = (i2 ^ i) * 1000003;
        Uri uri = this.e;
        i = 0;
        i2 = (i2 ^ (uri != null ? uri.hashCode() : 0)) * 1000003;
        adjb adjb = this.f;
        i2 = (i2 ^ (adjb != null ? adjb.hashCode() : 0)) * 1000003;
        String str = this.g;
        if (str != null) {
            i = str.hashCode();
        }
        return ((i2 ^ i) * 1000003) ^ this.h.hashCode();
    }

    /* synthetic */ adhx(int i, boolean z, boolean z2, boolean z3, Uri uri, adjb adjb, String str, Map map) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = uri;
        this.f = adjb;
        this.g = str;
        this.h = map;
    }
}
