package defpackage;

import java.io.Serializable;

/* renamed from: uex */
public final class uex implements Serializable {
    public static final long serialVersionUID = 1;
    public int a = 0;
    public long b = 0;
    public boolean c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    private final String i;
    private final String j;
    private final int k;

    public uex() {
        String str = "";
        this.d = str;
        this.f = false;
        this.h = 1;
        this.i = str;
        this.j = str;
        this.k = 5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uex) {
            uex uex = (uex) obj;
            if (uex != null && (this == uex || (this.a == uex.a && this.b == uex.b && this.d.equals(uex.d) && this.f == uex.f && this.h == uex.h && this.i.equals(uex.i) && this.k == uex.k && this.j.equals(uex.j)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.a + 2173) * 53) + Long.valueOf(this.b).hashCode()) * 53) + this.d.hashCode()) * 53) + (!this.f ? 1237 : 1231)) * 53) + this.h) * 53) + this.i.hashCode()) * 53;
        int i = this.k;
        if (i != 0) {
            return ((((hashCode + i) * 53) + this.j.hashCode()) * 53) + 1237;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Country Code: ");
        stringBuilder.append(this.a);
        stringBuilder.append(" National Number: ");
        stringBuilder.append(this.b);
        if (this.e && this.f) {
            stringBuilder.append(" Leading Zero(s): true");
        }
        if (this.g) {
            stringBuilder.append(" Number of leading zeros: ");
            stringBuilder.append(this.h);
        }
        if (this.c) {
            stringBuilder.append(" Extension: ");
            stringBuilder.append(this.d);
        }
        return stringBuilder.toString();
    }
}
