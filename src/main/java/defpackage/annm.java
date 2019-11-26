package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: annm */
public final class annm {
    public int a;
    private final Set b = new HashSet();
    private final Set c = new HashSet();
    private annq d;
    private Set e;

    public final annm a(annr annr) {
        pzr.a((Object) annr, (Object) "Null dependency");
        pzr.b(this.b.contains(annr.a) ^ 1, "Components are not allowed to depend on interfaces they themselves provide.");
        this.c.add(annr);
        return this;
    }

    public final annm a(annq annq) {
        this.d = (annq) pzr.a((Object) annq, (Object) "Null factory");
        return this;
    }

    public final annn a() {
        pzr.a(this.d != null, (Object) "Missing required property: factory.");
        return new annn(new HashSet(this.b), new HashSet(this.c), this.a, this.d, this.e);
    }

    /* synthetic */ annm(Class cls, Class[] clsArr) {
        int i = 0;
        this.a = 0;
        this.e = new HashSet();
        Object obj = "Null interface";
        pzr.a((Object) cls, obj);
        this.b.add(cls);
        int length = clsArr.length;
        while (i < length) {
            pzr.a(clsArr[i], obj);
            i++;
        }
        Collections.addAll(this.b, clsArr);
    }
}
