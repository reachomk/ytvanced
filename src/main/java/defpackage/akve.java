package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: akve */
public class akve implements akvj {
    private final Set a;
    public int c;

    public akve(int i) {
        amqw.a(i > 0);
        this.c = i;
        this.a = Collections.newSetFromMap(new WeakHashMap());
    }

    public int b() {
        return this.c;
    }

    public final void a(akvi akvi) {
        this.a.add(akvi);
    }

    public final void b(akvi akvi) {
        this.a.remove(akvi);
    }

    public void a(int i) {
        amqw.a(i > 0);
        if (this.c != i) {
            this.c = i;
            for (akvi a : this.a) {
                a.a(i);
            }
        }
    }
}
