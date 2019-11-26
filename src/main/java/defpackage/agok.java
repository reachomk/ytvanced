package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: agok */
public final class agok {
    private final HashMap a;

    public agok(HashMap hashMap) {
        this.a = hashMap;
    }

    public final List a(String str) {
        if (this.a.containsKey(str)) {
            return amul.a((Collection) this.a.get(str));
        }
        return Collections.emptyList();
    }

    public final amqp a(int i) {
        for (agoh agoh : a("uuid")) {
            if (agoh.f() == i) {
                return amqp.b(agoh);
            }
        }
        return ampo.a;
    }
}
