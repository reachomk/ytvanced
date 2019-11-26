package defpackage;

import java.util.Arrays;

/* renamed from: adns */
final class adns {
    private final aikr a;
    private final int b;

    adns(aikr aikr, int i) {
        this.a = aikr;
        this.b = i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.c()});
    }

    public final boolean equals(Object obj) {
        return (obj instanceof adns) && amqq.a(this.a.c(), ((adns) obj).a.c());
    }

    public final String toString() {
        int i = this.b;
        String c = this.a.c();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(c).length() + 14);
        stringBuilder.append("{");
        stringBuilder.append(i);
        stringBuilder.append(",");
        stringBuilder.append(c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
