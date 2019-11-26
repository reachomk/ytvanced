package defpackage;

/* renamed from: agqz */
public final class agqz {
    public final String a;
    public final agrc b;
    public final int c;
    public final long d;
    public final long e;
    public final agpw f;
    public final agpw g;
    public final String h;

    public agqz(String str, agrc agrc, int i, long j, long j2, agpw agpw, agpw agpw2, String str2) {
        this.a = xvd.a(str);
        this.b = (agrc) amqw.a((Object) agrc);
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = (agpw) amqw.a((Object) agpw);
        this.g = (agpw) amqw.a((Object) agpw2);
        this.h = str2;
    }

    public final int a() {
        long j = this.e;
        long j2 = 0;
        if (j != 0) {
            j2 = (this.d * 100) / j;
        }
        return (int) j2;
    }

    public final boolean b() {
        return (this.b == agrc.COMPLETED || this.b == agrc.FAILED) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof agqz)) {
            return false;
        }
        return this.a.equals(((agqz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 13);
        stringBuilder.append("{transferId=");
        stringBuilder.append(str);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
