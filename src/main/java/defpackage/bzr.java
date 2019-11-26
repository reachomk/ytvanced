package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: bzr */
public final class bzr {
    private final bzy a;
    private final bzu b = new bzu();

    public bzr(zy zyVar) {
        bzy bzy = new bzy(zyVar);
        this.a = bzy;
    }

    public final synchronized void a(Class cls, Class cls2, bzs bzs) {
        this.a.a(cls, cls2, bzs);
        this.b.a();
    }

    public final synchronized void b(Class cls, Class cls2, bzs bzs) {
        this.a.b(cls, cls2, bzs);
        this.b.a();
    }

    public final synchronized void c(Class cls, Class cls2, bzs bzs) {
        for (bzs a : this.a.c(cls, cls2, bzs)) {
            a.a();
        }
        this.b.a();
    }

    public final synchronized List a(Class cls) {
        return this.a.b(cls);
    }

    public final synchronized List b(Class cls) {
        bzt bzt = (bzt) this.b.a.get(cls);
        List list = bzt != null ? bzt.a : null;
        if (list != null) {
            return list;
        }
        list = Collections.unmodifiableList(this.a.a(cls));
        if (((bzt) this.b.a.put(cls, new bzt(list))) == null) {
            return list;
        }
        String valueOf = String.valueOf(cls);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 34);
        stringBuilder.append("Already cached loaders for model: ");
        stringBuilder.append(valueOf);
        throw new IllegalStateException(stringBuilder.toString());
    }
}
