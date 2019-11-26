package defpackage;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: aezh */
final class aezh implements aezp {
    private final Set a;
    private final aezd b;

    aezh(Set set, aezd aezd) {
        this.a = set;
        this.b = aezd;
    }

    public final void a(String str, String str2) {
        if (this.a.isEmpty() || this.a.contains(str)) {
            try {
                HashMap hashMap = new HashMap();
                Object c = amqu.c("[\\r\\n]+");
                amqw.a(c.a("").a() ^ 1, "The pattern may not match the empty string: %s", c);
                for (String c2 : new amqz(new amrg(c)).a((CharSequence) str2)) {
                    List c3 = amqz.a(": ").c(c2);
                    if (c3.size() >= 2) {
                        hashMap.put((String) c3.get(0), (String) c3.get(1));
                    }
                }
                this.b.a(new afip(hashMap));
            } catch (IOException | InterruptedException e) {
                this.b.a(e);
            }
        }
    }
}
