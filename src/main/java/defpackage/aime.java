package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: aime */
public final class aime {
    public int a;
    public float b;
    public boolean c;
    public final Set d = Collections.newSetFromMap(new WeakHashMap());
    private final aims e;

    public aime(aims aims) {
        this.e = (aims) amqw.a((Object) aims);
    }

    public final void a(aimd aimd) {
        this.d.add(aimd);
    }

    public final void b(aimd aimd) {
        this.d.remove(aimd);
    }

    /* Access modifiers changed, original: final */
    public final void a(float f, boolean z) {
        this.b = f;
        for (aimd a : this.d) {
            a.a(f, z);
        }
    }

    public final boolean a() {
        return this.a == 2;
    }

    public final boolean b() {
        return this.a == 1;
    }

    public final boolean c() {
        return this.a == 0;
    }

    public final boolean d() {
        return b() || a();
    }

    public final int e() {
        if (this.e.a()) {
            return this.c ? 2 : 0;
        } else {
            return 1;
        }
    }

    public final boolean f() {
        return this.a == e();
    }
}
