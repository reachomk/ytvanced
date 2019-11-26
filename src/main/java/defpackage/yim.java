package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: yim */
public final class yim implements yij {
    public final Map a = new ConcurrentHashMap();
    public int b;

    public final yij a(String str, yij yij) {
        yij yij2 = (yij) this.a.put(str, yij);
        a(yij);
        if (yij2 != null && this.b == 2) {
            yij2.bl_();
        }
        return yij2;
    }

    public final yij a(String str) {
        yij yij = (yij) this.a.remove(str);
        if (yij != null && this.b == 2) {
            yij.bl_();
        }
        return yij;
    }

    public final void bk_() {
        this.b = 2;
        for (yij bk_ : this.a.values()) {
            bk_.bk_();
        }
    }

    public final void bl_() {
        this.b = 3;
        for (yij bl_ : this.a.values()) {
            bl_.bl_();
        }
    }

    private final void a(yij yij) {
        int i = this.b;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                yij.bk_();
            } else if (i2 == 2) {
                yij.bl_();
                return;
            }
            return;
        }
        throw null;
    }

    yim(int i) {
        int i2 = i != 0 ? i : 1;
        if (i == 0) {
            i = 0;
        }
        this.b = i2;
        if (i != 0) {
            a((yij) this);
        }
    }
}
