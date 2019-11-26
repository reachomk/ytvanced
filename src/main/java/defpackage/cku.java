package defpackage;

/* renamed from: cku */
public final class cku {
    public long a;
    public long b;
    public ckn c;
    public long d;

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        String valueOf = String.valueOf(this.c);
        long j3 = this.d;
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 108);
        stringBuilder.append("Entry{duration=");
        stringBuilder.append(j);
        stringBuilder.append(", size=");
        stringBuilder.append(j2);
        stringBuilder.append(", dlags=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", compTimeOffset=");
        stringBuilder.append(j3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
