package defpackage;

import android.os.Bundle;

/* renamed from: lxb */
final class lxb extends lyx {
    private final Boolean a;
    private final Bundle b;
    private final Bundle c;
    private final Bundle d;
    private final Bundle e;
    private final Bundle f;

    lxb(Boolean bool, Bundle bundle, Bundle bundle2, Bundle bundle3, Bundle bundle4, Bundle bundle5) {
        this.a = bool;
        this.b = bundle;
        this.c = bundle2;
        this.d = bundle3;
        this.e = bundle4;
        this.f = bundle5;
    }

    public final Boolean a() {
        return this.a;
    }

    public final Bundle b() {
        return this.b;
    }

    public final Bundle c() {
        return this.c;
    }

    public final Bundle d() {
        return this.d;
    }

    public final Bundle e() {
        return this.e;
    }

    public final Bundle f() {
        return this.f;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int length4 = valueOf4.length();
        StringBuilder stringBuilder = new StringBuilder((((((length + 167) + length2) + length3) + length4) + valueOf5.length()) + valueOf6.length());
        stringBuilder.append("IcicleState{instanceIsInOfflineMode=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", infoCardsBundle=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", paneNavigationControllerBundle=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", backHandlerBundle=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", swipeToCameraBundle=");
        stringBuilder.append(valueOf5);
        stringBuilder.append(", powerSaveModeThemeControllerBundle=");
        stringBuilder.append(valueOf6);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lyx) {
            lyx lyx = (lyx) obj;
            Boolean bool = this.a;
            if (bool == null ? lyx.a() != null : !bool.equals(lyx.a())) {
                Bundle bundle = this.b;
                if (bundle == null ? lyx.b() != null : !bundle.equals(lyx.b())) {
                    bundle = this.c;
                    if (bundle == null ? lyx.c() != null : !bundle.equals(lyx.c())) {
                        bundle = this.d;
                        if (bundle == null ? lyx.d() != null : !bundle.equals(lyx.d())) {
                            bundle = this.e;
                            if (bundle == null ? lyx.e() != null : !bundle.equals(lyx.e())) {
                                bundle = this.f;
                                if (bundle == null ? lyx.f() == null : bundle.equals(lyx.f())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int i = 0;
        int hashCode = ((bool != null ? bool.hashCode() : 0) ^ 1000003) * 1000003;
        Bundle bundle = this.b;
        hashCode = (hashCode ^ (bundle != null ? bundle.hashCode() : 0)) * 1000003;
        bundle = this.c;
        hashCode = (hashCode ^ (bundle != null ? bundle.hashCode() : 0)) * 1000003;
        bundle = this.d;
        hashCode = (hashCode ^ (bundle != null ? bundle.hashCode() : 0)) * 1000003;
        bundle = this.e;
        hashCode = (hashCode ^ (bundle != null ? bundle.hashCode() : 0)) * 1000003;
        Bundle bundle2 = this.f;
        if (bundle2 != null) {
            i = bundle2.hashCode();
        }
        return hashCode ^ i;
    }
}
