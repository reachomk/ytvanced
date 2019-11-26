package defpackage;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Set;

/* renamed from: lkt */
public class lkt implements lky {
    private final Set a;
    private final lkx b = new lkw(this);
    private lky c;

    public lkt(lky lky) {
        this.c = lky;
        this.a = new HashSet();
    }

    public final void a(lky lky) {
        lky lky2 = this.c;
        if (lky2 != lky) {
            lky2.b(this.b);
            this.c = lky;
            lky.a(this.b);
            f();
        }
    }

    public final Rect a(Rect rect) {
        return this.c.a(rect);
    }

    public final void a(lkx lkx) {
        this.a.add(lkx);
    }

    public final void b(lkx lkx) {
        this.a.remove(lkx);
    }

    public final void f() {
        for (lkx a : this.a) {
            a.a();
        }
    }
}
