package defpackage;

import android.net.Uri;

/* renamed from: gru */
final class gru extends grw {
    public final Uri a;
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final Boolean g;
    public final axxd h;
    public final axxl i;
    public final aphv j;

    public final Uri a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean f() {
        return this.f;
    }

    public final Boolean g() {
        return this.g;
    }

    public final axxd h() {
        return this.h;
    }

    public final axxl i() {
        return this.i;
    }

    public final aphv j() {
        return this.j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        long j = this.c;
        long j2 = this.d;
        boolean z = this.e;
        boolean z2 = this.f;
        String valueOf2 = String.valueOf(this.g);
        String valueOf3 = String.valueOf(this.h);
        String valueOf4 = String.valueOf(this.i);
        String valueOf5 = String.valueOf(this.j);
        int length = valueOf.length();
        int length2 = String.valueOf(str).length();
        int length3 = valueOf2.length();
        int length4 = valueOf3.length();
        StringBuilder stringBuilder = new StringBuilder((((((length + 300) + length2) + length3) + length4) + valueOf4.length()) + valueOf5.length());
        stringBuilder.append("SubscribeButtonStateModel{uri=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", channelId=");
        stringBuilder.append(str);
        stringBuilder.append(", serverTimestamp=");
        stringBuilder.append(j);
        stringBuilder.append(", clientTimestamp=");
        stringBuilder.append(j2);
        stringBuilder.append(", subscriptionStateChanged=");
        stringBuilder.append(z);
        stringBuilder.append(", didRequireSignIn=");
        stringBuilder.append(z2);
        stringBuilder.append(", subscribed=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", subscriptionNotificationToggleButtonRenderer=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", subscriptionNotificationOptionsRenderer=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", toggleButtonRenderer=");
        stringBuilder.append(valueOf5);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof grw) {
            grw grw = (grw) obj;
            if (this.a.equals(grw.a()) && this.b.equals(grw.b()) && this.c == grw.c() && this.d == grw.d() && this.e == grw.e() && this.f == grw.f()) {
                Boolean bool = this.g;
                if (bool == null ? grw.g() != null : !bool.equals(grw.g())) {
                    axxd axxd = this.h;
                    if (axxd == null ? grw.h() != null : !axxd.equals(grw.h())) {
                        axxl axxl = this.i;
                        if (axxl == null ? grw.i() != null : !axxl.equals(grw.i())) {
                            aphv aphv = this.j;
                            if (aphv == null ? grw.j() == null : aphv.equals(grw.j())) {
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
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        long j = this.c;
        long j2 = this.d;
        hashCode = (((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        int i = 1237;
        hashCode = (hashCode ^ (!this.e ? 1237 : 1231)) * 1000003;
        if (this.f) {
            i = 1231;
        }
        hashCode = (hashCode ^ i) * 1000003;
        Boolean bool = this.g;
        i = 0;
        hashCode = (hashCode ^ (bool != null ? bool.hashCode() : 0)) * 1000003;
        axxd axxd = this.h;
        hashCode = (hashCode ^ (axxd != null ? axxd.hashCode() : 0)) * 1000003;
        axxl axxl = this.i;
        hashCode = (hashCode ^ (axxl != null ? axxl.hashCode() : 0)) * 1000003;
        aphv aphv = this.j;
        if (aphv != null) {
            i = aphv.hashCode();
        }
        return hashCode ^ i;
    }

    public final grz k() {
        return new grx(this);
    }

    /* synthetic */ gru(Uri uri, String str, long j, long j2, boolean z, boolean z2, Boolean bool, axxd axxd, axxl axxl, aphv aphv) {
        this.a = uri;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = z2;
        this.g = bool;
        this.h = axxd;
        this.i = axxl;
        this.j = aphv;
    }
}
