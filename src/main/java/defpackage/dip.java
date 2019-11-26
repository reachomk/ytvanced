package defpackage;

/* renamed from: dip */
public final class dip {
    public final long a;
    public final long b;
    public final String c;

    public dip(long j, long j2, String str) {
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        String str = this.c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 42);
        stringBuilder.append(j);
        String str2 = " ";
        stringBuilder.append(str2);
        stringBuilder.append(j2);
        stringBuilder.append(str2);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
