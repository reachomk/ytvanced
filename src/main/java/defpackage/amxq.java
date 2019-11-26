package defpackage;

import java.util.logging.Level;

/* renamed from: amxq */
public abstract class amxq {
    public final amyr a;

    protected amxq(amyr amyr) {
        this.a = (amyr) anad.a(amyr, "backend");
    }

    public abstract amyh a(Level level);

    public final amyh a() {
        return a(Level.SEVERE);
    }

    public final amyh b() {
        return a(Level.WARNING);
    }

    public final amyh c() {
        return a(Level.INFO);
    }
}
