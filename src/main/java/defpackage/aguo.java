package defpackage;

import java.util.Arrays;

/* renamed from: aguo */
public final class aguo {
    public final String a;
    public final long b;
    public final String[] c;
    public final long d;

    public aguo(String str, long j, String[] strArr, long j2) {
        this.a = (String) amqw.a((Object) str);
        this.b = j;
        this.c = (String[]) amqw.a((Object) strArr);
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aguo) {
            aguo aguo = (aguo) obj;
            if (amqq.a(this.a, aguo.a) && this.b == aguo.b && this.d == aguo.d && Arrays.equals(this.c, aguo.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Long.valueOf(this.d)});
    }
}
