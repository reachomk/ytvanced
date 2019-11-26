package defpackage;

import java.util.Arrays;

/* renamed from: aahn */
public final class aahn implements Comparable {
    public final String a;
    public final String b;
    public final boolean c;

    public aahn(String str, String str2, boolean z) {
        this.a = xvd.a(str);
        this.b = xvd.a(str2);
        this.c = z;
    }

    public aahn(String str, String str2) {
        this(str, str2, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aahn) {
            aahn aahn = (aahn) obj;
            if (this.a.equals(aahn.a) && this.b.equals(aahn.b) && this.c == aahn.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c)});
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        aahn aahn = (aahn) obj;
        return aahn != null ? this.b.compareTo(aahn.b) : 1;
    }
}
