package defpackage;

import java.util.Objects;

/* renamed from: tps */
public final class tps {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public static tpv a() {
        return new tpv();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            tps tps = (tps) obj;
            return Objects.equals(this.a, tps.a) && Objects.equals(this.b, tps.b) && Objects.equals(this.c, tps.c) && Objects.equals(this.d, tps.d) && Objects.equals(this.e, tps.e);
        }
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    /* synthetic */ tps(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }
}
