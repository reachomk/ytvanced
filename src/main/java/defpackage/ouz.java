package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: ouz */
public abstract class ouz implements ovi {
    private final boolean a;
    private final ArrayList b = new ArrayList(1);
    private int c;
    private ovm d;

    protected ouz(boolean z) {
        this.a = z;
    }

    public final void a(owt owt) {
        if (!this.b.contains(owt)) {
            this.b.add(owt);
            this.c++;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ovm ovm) {
        for (int i = 0; i < this.c; i++) {
            ((owt) this.b.get(i)).a(this, ovm, this.a);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(ovm ovm) {
        this.d = ovm;
        for (int i = 0; i < this.c; i++) {
            ((owt) this.b.get(i)).b(this, ovm, this.a);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i) {
        ovm ovm = (ovm) ozp.a(this.d);
        for (int i2 = 0; i2 < this.c; i2++) {
            ((owt) this.b.get(i2)).a(this, ovm, this.a, i);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void f() {
        ovm ovm = (ovm) ozp.a(this.d);
        for (int i = 0; i < this.c; i++) {
            ((owt) this.b.get(i)).c(this, ovm, this.a);
        }
        this.d = null;
    }

    public Map c() {
        return Collections.emptyMap();
    }
}
