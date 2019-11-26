package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: sjj */
public class sjj implements sir {
    public six a;
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final sjk c;
    private final String d;

    protected sjj(String str, sjk sjk) {
        this.d = str;
        this.c = sjk;
    }

    public final siw c() {
        return null;
    }

    public final bauk a(String str, int i) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 12);
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(i);
        String stringBuilder2 = stringBuilder.toString();
        bauk bauk = (bauk) this.b.get(stringBuilder2);
        if (bauk != null && !bauk.c()) {
            return bauk;
        }
        bauk a = this.c.a(str, i);
        this.b.put(stringBuilder2, a);
        return a;
    }

    public final siv a() {
        return this.a.a();
    }

    public final String b() {
        return this.d;
    }
}
