package defpackage;

import android.net.Uri;

/* renamed from: aahs */
public final class aahs {
    public final xvo a;

    private aahs(Uri uri) {
        this.a = xvo.a(uri);
    }

    public static aahs a(Uri uri) {
        return new aahs(uri);
    }

    public final aahs a(String str) {
        String str2 = "cpn";
        if (str != null) {
            this.a.a(str2, str);
        } else {
            this.a.a(str2);
        }
        return this;
    }

    public final aahs a(long j) {
        String str = "mpr";
        if (j > 0) {
            this.a.a(str, Long.toString(j));
        } else {
            this.a.a(str);
        }
        return this;
    }

    public final aahs b(long j) {
        this.a.a("sq", Long.toString(j));
        return this;
    }

    public final aahs a(int i) {
        this.a.a("headm", Integer.toString(i));
        return this;
    }

    public final Uri a() {
        return this.a.a();
    }
}
