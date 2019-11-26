package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: llg */
public final class llg implements lli {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public int b = 0;

    public final boolean a(int i) {
        if (this.b == i) {
            return false;
        }
        this.b = i;
        for (llf aG_ : this.a) {
            aG_.aG_();
        }
        return true;
    }

    public final boolean aF_() {
        return this.b == 0;
    }

    public final boolean b() {
        return this.b == 2;
    }

    public final boolean c() {
        return this.b == 1;
    }
}
