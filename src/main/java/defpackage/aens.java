package defpackage;

/* renamed from: aens */
public final class aens {
    public final String a;
    public final int b;
    public final String c;
    private final long d;
    private final long e;
    private final boolean f;

    public aens(String str, int i, long j, long j2, String str2, boolean z) {
        this.a = (String) amqw.a((Object) str);
        this.b = i;
        this.d = j;
        this.e = j2;
        this.c = str2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof aens)) {
                return false;
            }
            aens aens = (aens) obj;
            if (!this.a.equals(aens.a) || this.b != aens.b || this.d != aens.d) {
                return false;
            }
            if ((this.f && this.e != aens.e) || !this.c.equals(aens.c)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.c.hashCode();
        int i = this.b;
        long j = this.d;
        hashCode = ((((((hashCode + 527) * 31) + hashCode2) * 31) + i) * 31) + ((int) (j ^ (j >>> 32)));
        if (!this.f) {
            return hashCode;
        }
        long j2 = this.e;
        return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }
}
