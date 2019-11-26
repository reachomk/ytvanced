package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ammv */
public final class ammv implements ammy {
    private final Map a = new HashMap();
    private boolean b;
    private boolean c = true;

    protected ammv() {
    }

    public final ammw a() {
        if (!this.a.isEmpty()) {
            return new ammw(new HashMap(this.a), this.b, (byte) 0);
        }
        return !this.b ? ammw.a : ammw.b;
    }

    public final ammv a(int i, ammw ammw) {
        Object ammw2;
        if (this.b) {
            ammw2 = ammw2.c();
        }
        if (ammw.a.equals(ammw2)) {
            this.a.remove(Integer.valueOf(i));
        } else {
            this.a.put(Integer.valueOf(i), ammw2);
        }
        this.c = false;
        return this;
    }

    public final ammv a(ammx ammx) {
        boolean z = ammx.c;
        if (this.c) {
            this.b = z;
            for (Integer intValue : ammx.b) {
                this.a.put(Integer.valueOf(intValue.intValue()), ammw.b);
            }
            for (ammz ammz : ammx.a) {
                Map map = this.a;
                Integer valueOf = Integer.valueOf(ammz.a);
                ammx ammx2 = ammz.b;
                if (ammx2 == null) {
                    ammx2 = ammx.d;
                }
                ammv b = ammw.b();
                b.a(ammx2);
                map.put(valueOf, b.a());
            }
            return this;
        }
        throw new IllegalStateException("setInverted cannot be called on a builder that has fields.");
    }
}
