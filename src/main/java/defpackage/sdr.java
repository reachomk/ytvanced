package defpackage;

import android.app.PendingIntent;

/* renamed from: sdr */
abstract class sdr extends seo {
    public final PendingIntent a;
    public final boolean b;
    public final String c;
    public final int d;
    public final sem e;
    public final boolean f;

    sdr(PendingIntent pendingIntent, boolean z, String str, int i, sem sem, boolean z2) {
        this.a = pendingIntent;
        this.b = z;
        if (str != null) {
            this.c = str;
            this.d = i;
            this.e = sem;
            this.f = z2;
            return;
        }
        throw new NullPointerException("Null focusClientId");
    }

    public final PendingIntent a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final sem e() {
        return this.e;
    }

    public final boolean f() {
        return this.f;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String str = this.c;
        int i = this.d;
        String valueOf2 = String.valueOf(this.e);
        boolean z2 = this.f;
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 167) + String.valueOf(str).length()) + valueOf2.length());
        stringBuilder.append("ClientFlowConfiguration{resultIntent=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", fullFlowEnabled=");
        stringBuilder.append(z);
        stringBuilder.append(", focusClientId=");
        stringBuilder.append(str);
        stringBuilder.append(", socialClientId=");
        stringBuilder.append(i);
        stringBuilder.append(", chromeCustomTabsOptions=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", appFlipSupportedByCallingApp=");
        stringBuilder.append(z2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof seo) {
            seo seo = (seo) obj;
            PendingIntent pendingIntent = this.a;
            if (pendingIntent == null ? seo.a() != null : !pendingIntent.equals(seo.a())) {
                if (this.b == seo.b() && this.c.equals(seo.c()) && this.d == seo.d()) {
                    sem sem = this.e;
                    if (sem == null ? seo.e() == null : sem.equals(seo.e())) {
                        if (this.f == seo.f()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.a;
        int i = 0;
        int i2 = 1237;
        int hashCode = ((((((((pendingIntent != null ? pendingIntent.hashCode() : 0) ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003;
        sem sem = this.e;
        if (sem != null) {
            i = sem.hashCode();
        }
        hashCode = (hashCode ^ i) * 1000003;
        if (this.f) {
            i2 = 1231;
        }
        return hashCode ^ i2;
    }
}
