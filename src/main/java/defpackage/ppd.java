package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: ppd */
final class ppd implements pjd {
    private final Status a;
    private final pjb b;
    private final String c;
    private final String d;
    private final boolean e;

    public ppd(Status status, pjb pjb, String str, String str2, boolean z) {
        this.a = status;
        this.b = pjb;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public ppd(Status status) {
        this(status, null, null, null, false);
    }

    public final Status a() {
        return this.a;
    }

    public final pjb b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }
}
