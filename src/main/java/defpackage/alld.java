package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: alld */
public final class alld {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public avyy f;
    public avzi g;
    public avyi h;
    public azfa i;

    public alld(long j, String str, String str2, String str3, Uri uri) {
        this.a = j;
        this.b = xvd.a(str);
        this.c = str2;
        this.d = str3;
        this.e = uri;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof alld) {
            alld alld = (alld) obj;
            if (amqq.a(alld.a(this.b), alld.a(alld.b)) && amqq.a(this.c, alld.c) && amqq.a(this.d, alld.d) && amqq.a(this.e, alld.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{alld.a(this.b), this.c, this.d, this.e});
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("androidContactId", this.a);
        a.a("phoneNumber", this.b);
        a.a("contactName", this.c);
        a.a("phoneType", this.d);
        a.a("thumbnailUri", this.e);
        return a.toString();
    }

    private static String a(String str) {
        return str.replaceAll("[^\\d]", "");
    }
}
