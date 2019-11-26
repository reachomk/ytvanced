package defpackage;

import android.net.Uri;

/* renamed from: adid */
final class adid extends adip {
    private Uri b;
    private Uri c;
    private String d;
    private adjg e;
    private String f;
    private String g;
    private String h;
    private String i;
    private Integer j;
    private Boolean k;

    adid() {
    }

    public final adip a(Uri uri) {
        this.b = uri;
        return this;
    }

    public final adip b(Uri uri) {
        this.c = uri;
        return this;
    }

    public final adip a(String str) {
        if (str != null) {
            this.d = str;
            return this;
        }
        throw new NullPointerException("Null deviceName");
    }

    public final adip a(adjg adjg) {
        if (adjg != null) {
            this.e = adjg;
            return this;
        }
        throw new NullPointerException("Null ssdpId");
    }

    public final adip b(String str) {
        this.f = str;
        return this;
    }

    public final adip c(String str) {
        this.g = str;
        return this;
    }

    public final adip d(String str) {
        this.h = str;
        return this;
    }

    public final adip e(String str) {
        this.i = str;
        return this;
    }

    public final adip a(int i) {
        this.j = Integer.valueOf(i);
        return this;
    }

    public final adip a(boolean z) {
        this.k = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final adiq a() {
        String str = "";
        if (this.d == null) {
            str = str.concat(" deviceName");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" ssdpId");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" wakeOnLanTimeout");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" hasDialSupport");
        }
        if (str.isEmpty()) {
            return new adie(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j.intValue(), this.k.booleanValue());
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    /* synthetic */ adid(adiq adiq) {
        adie adie = (adie) adiq;
        this.b = adie.a;
        this.c = adie.b;
        this.d = adie.c;
        this.e = adie.d;
        this.f = adie.e;
        this.g = adie.f;
        this.h = adie.g;
        this.i = adie.h;
        this.j = Integer.valueOf(adie.i);
        this.k = Boolean.valueOf(adie.j);
    }
}
