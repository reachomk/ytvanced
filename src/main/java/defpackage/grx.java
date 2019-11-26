package defpackage;

import android.net.Uri;

/* renamed from: grx */
final class grx extends grz {
    public Uri a;
    public String b;
    private Long d;
    private Long e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private axxd i;
    private axxl j;
    private aphv k;

    grx() {
    }

    public final grz a(long j) {
        this.d = Long.valueOf(j);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final grz b(long j) {
        this.e = Long.valueOf(j);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final long a() {
        Long l = this.e;
        if (l != null) {
            return l.longValue();
        }
        throw new IllegalStateException("Property \"clientTimestamp\" has not been set");
    }

    public final grz a(boolean z) {
        this.f = Boolean.valueOf(z);
        return this;
    }

    public final grz b(boolean z) {
        this.g = Boolean.valueOf(z);
        return this;
    }

    public final grz a(Boolean bool) {
        this.h = bool;
        return this;
    }

    public final grz a(axxd axxd) {
        this.i = axxd;
        return this;
    }

    public final grz a(axxl axxl) {
        this.j = axxl;
        return this;
    }

    public final grz a(aphv aphv) {
        this.k = aphv;
        return this;
    }

    /* Access modifiers changed, original: final */
    public final grw b() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" uri");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" channelId");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" serverTimestamp");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" clientTimestamp");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" subscriptionStateChanged");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" didRequireSignIn");
        }
        if (str.isEmpty()) {
            return new gru(this.a, this.b, this.d.longValue(), this.e.longValue(), this.f.booleanValue(), this.g.booleanValue(), this.h, this.i, this.j, this.k);
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }

    /* synthetic */ grx(grw grw) {
        gru gru = (gru) grw;
        this.a = gru.a;
        this.b = gru.b;
        this.d = Long.valueOf(gru.c);
        this.e = Long.valueOf(gru.d);
        this.f = Boolean.valueOf(gru.e);
        this.g = Boolean.valueOf(gru.f);
        this.h = gru.g;
        this.i = gru.h;
        this.j = gru.i;
        this.k = gru.j;
    }
}
