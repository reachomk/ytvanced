package defpackage;

import java.util.List;

/* renamed from: adpq */
final class adpq extends adpv {
    private String a;
    private List b;
    private Long c;
    private ajis d;
    private String e;
    private Integer f;
    private String g;
    private String h;
    private Boolean i;
    private byte[] j;

    adpq() {
    }

    public final adpv a(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        throw new NullPointerException("Null videoId");
    }

    /* Access modifiers changed, original: final */
    public final amqp a() {
        String str = this.a;
        if (str != null) {
            return amqp.b(str);
        }
        return ampo.a;
    }

    public final adpv a(List list) {
        this.b = list;
        return this;
    }

    public final adpv a(long j) {
        this.c = Long.valueOf(j);
        return this;
    }

    public final adpv a(ajis ajis) {
        this.d = ajis;
        return this;
    }

    public final adpv b(String str) {
        if (str != null) {
            this.e = str;
            return this;
        }
        throw new NullPointerException("Null playlistId");
    }

    /* Access modifiers changed, original: final */
    public final amqp b() {
        String str = this.e;
        if (str != null) {
            return amqp.b(str);
        }
        return ampo.a;
    }

    public final adpv a(int i) {
        this.f = Integer.valueOf(i);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final int c() {
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"playlistIndex\" has not been set");
    }

    public final adpv c(String str) {
        this.g = str;
        return this;
    }

    public final adpv d(String str) {
        this.h = str;
        return this;
    }

    public final adpv a(boolean z) {
        this.i = Boolean.valueOf(z);
        return this;
    }

    public final adpv a(byte[] bArr) {
        this.j = bArr;
        return this;
    }

    /* Access modifiers changed, original: final */
    public final adpw d() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" videoId");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" currentPositionMillis");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" playlistId");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" playlistIndex");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" forceReloadPlayback");
        }
        if (str.isEmpty()) {
            return new adpn(this.a, this.b, this.c.longValue(), this.d, this.e, this.f.intValue(), this.g, this.h, this.i.booleanValue(), this.j);
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    /* synthetic */ adpq(adpw adpw) {
        adpn adpn = (adpn) adpw;
        this.a = adpn.a;
        this.b = adpn.b;
        this.c = Long.valueOf(adpn.c);
        this.d = adpn.d;
        this.e = adpn.e;
        this.f = Integer.valueOf(adpn.f);
        this.g = adpn.g;
        this.h = adpn.h;
        this.i = Boolean.valueOf(adpn.i);
        this.j = adpn.j;
    }
}
