package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: batp */
public final class batp {
    private static final AtomicLong b = new AtomicLong();
    public final long a;
    private final String c;
    private final String d;

    public static batp a(Class cls, String str) {
        String simpleName = ((Class) amqw.a((Object) cls, (Object) "type")).getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return batp.a(simpleName, str);
    }

    public static batp a(String str, String str2) {
        return new batp(str, str2, b.incrementAndGet());
    }

    private batp(String str, String str2, long j) {
        amqw.a((Object) str, (Object) "typeName");
        amqw.a(str.isEmpty() ^ 1, (Object) "empty type");
        this.c = str;
        this.d = str2;
        this.a = j;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String str = this.c;
        long j = this.a;
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 22);
        stringBuilder2.append(str);
        stringBuilder2.append("<");
        stringBuilder2.append(j);
        stringBuilder2.append(">");
        stringBuilder.append(stringBuilder2.toString());
        if (this.d != null) {
            stringBuilder.append(": (");
            stringBuilder.append(this.d);
            stringBuilder.append(')');
        }
        return stringBuilder.toString();
    }
}
