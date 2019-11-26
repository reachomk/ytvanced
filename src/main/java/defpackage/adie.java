package defpackage;

import android.net.Uri;

/* renamed from: adie */
final class adie extends adiq {
    public final Uri a;
    public final Uri b;
    public final String c;
    public final adjg d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final boolean j;

    public final Uri a() {
        return this.a;
    }

    public final Uri bu_() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final adjg d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }

    public final int i() {
        return this.i;
    }

    public final boolean j() {
        return this.j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        String valueOf3 = String.valueOf(this.d);
        String str2 = this.e;
        String str3 = this.f;
        String str4 = this.g;
        String str5 = this.h;
        int i = this.i;
        boolean z = this.j;
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = String.valueOf(str).length();
        int length4 = valueOf3.length();
        int length5 = String.valueOf(str2).length();
        int length6 = String.valueOf(str3).length();
        StringBuilder stringBuilder = new StringBuilder((((((((length + 172) + length2) + length3) + length4) + length5) + length6) + String.valueOf(str4).length()) + String.valueOf(str5).length());
        stringBuilder.append("MdxDialScreen{dialAppUri=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", dialBaseUri=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", deviceName=");
        stringBuilder.append(str);
        stringBuilder.append(", ssdpId=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", manufacturer=");
        stringBuilder.append(str2);
        stringBuilder.append(", modelName=");
        stringBuilder.append(str3);
        stringBuilder.append(", deviceVersion=");
        stringBuilder.append(str4);
        stringBuilder.append(", wakeOnLanMac=");
        stringBuilder.append(str5);
        stringBuilder.append(", wakeOnLanTimeout=");
        stringBuilder.append(i);
        stringBuilder.append(", hasDialSupport=");
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adiq) {
            adiq adiq = (adiq) obj;
            Uri uri = this.a;
            if (uri == null ? adiq.a() != null : !uri.equals(adiq.a())) {
                uri = this.b;
                if (uri == null ? adiq.bu_() != null : !uri.equals(adiq.bu_())) {
                    if (this.c.equals(adiq.c()) && this.d.equals(adiq.d())) {
                        String str = this.e;
                        if (str == null ? adiq.e() != null : !str.equals(adiq.e())) {
                            str = this.f;
                            if (str == null ? adiq.f() != null : !str.equals(adiq.f())) {
                                str = this.g;
                                if (str == null ? adiq.g() != null : !str.equals(adiq.g())) {
                                    str = this.h;
                                    if (str == null ? adiq.h() == null : str.equals(adiq.h())) {
                                        return this.i == adiq.i() && this.j == adiq.j();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        Uri uri = this.a;
        int i = 0;
        int hashCode = ((uri != null ? uri.hashCode() : 0) ^ 1000003) * 1000003;
        Uri uri2 = this.b;
        hashCode = (((((hashCode ^ (uri2 != null ? uri2.hashCode() : 0)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        String str = this.e;
        hashCode = (hashCode ^ (str != null ? str.hashCode() : 0)) * 1000003;
        str = this.f;
        hashCode = (hashCode ^ (str != null ? str.hashCode() : 0)) * 1000003;
        str = this.g;
        hashCode = (hashCode ^ (str != null ? str.hashCode() : 0)) * 1000003;
        str = this.h;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((hashCode ^ i) * 1000003) ^ this.i) * 1000003) ^ (!this.j ? 1237 : 1231);
    }

    /* Access modifiers changed, original: final */
    public final adip k() {
        return new adid(this);
    }

    /* synthetic */ adie(Uri uri, Uri uri2, String str, adjg adjg, String str2, String str3, String str4, String str5, int i, boolean z) {
        this.a = uri;
        this.b = uri2;
        this.c = str;
        this.d = adjg;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = i;
        this.j = z;
    }
}
