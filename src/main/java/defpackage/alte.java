package defpackage;

import android.util.Base64;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: alte */
public final class alte {
    public final byte[] a;
    public final String b;
    public final String c;
    public final boolean d;
    private final String e;

    public alte(byte[] bArr, String str, String str2, String str3, boolean z) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
        this.e = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alte) {
            alte alte = (alte) obj;
            return Arrays.equals(this.a, alte.a) && amqq.a(this.b, alte.b) && amqq.a(this.c, alte.c) && amqq.a(this.e, alte.e) && amqq.a(Boolean.valueOf(this.d), Boolean.valueOf(alte.d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c, this.e, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        return String.format(Locale.US, "cs: %s, fqdn: %s, deviceId: %s, venueId: %s, ui: %s", new Object[]{Base64.encodeToString(this.a, 2), this.b, this.c, this.e, Boolean.valueOf(this.d)});
    }
}
