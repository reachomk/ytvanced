package defpackage;

import android.net.Uri;

/* renamed from: ueg */
public final class ueg {
    public final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final amqd i;

    public ueg(String str) {
        this(str, null, "", "", false, false, false, false, null);
    }

    public ueg(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, amqd amqd) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = amqd;
    }

    public final ueg a(String str) {
        if (this.e) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new ueg(this.a, this.b, str, this.d, false, this.f, this.g, this.h, this.i);
    }

    public final ueg b(String str) {
        return new ueg(this.a, this.b, this.c, str, this.e, this.f, this.g, this.h, this.i);
    }

    public final ueg a() {
        return new ueg(this.a, this.b, this.c, this.d, this.e, this.f, true, this.h, this.i);
    }
}
