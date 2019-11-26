package defpackage;

import java.util.ArrayList;

/* renamed from: avn */
public final class avn {
    private static final ThreadLocal e = new ThreadLocal();
    public final aac a = new aac();
    public final ArrayList b = new ArrayList();
    public long c = 0;
    public boolean d = false;
    private final avm f = new avm(this);
    private avo g;

    avn() {
    }

    public static avn a() {
        if (e.get() == null) {
            e.set(new avn());
        }
        return (avn) e.get();
    }

    public final avo b() {
        if (this.g == null) {
            this.g = new avr(this.f);
        }
        return this.g;
    }
}
