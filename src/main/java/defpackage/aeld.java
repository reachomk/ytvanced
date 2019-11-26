package defpackage;

/* renamed from: aeld */
final class aeld extends aetw {
    private final long d;

    aeld(String str, long j) {
        super(str);
        this.d = j;
    }

    public final String a(long j) {
        long j2 = this.d;
        String str = this.c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 23);
        stringBuilder.append("t.");
        stringBuilder.append(j2 - j);
        stringBuilder.append(";");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
