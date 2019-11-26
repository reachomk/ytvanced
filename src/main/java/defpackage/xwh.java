package defpackage;

import java.util.HashMap;

/* renamed from: xwh */
public final class xwh {
    private final HashMap a = new HashMap();

    public final xwh a(String str, xwo xwo) {
        this.a.put(str, xwo);
        return this;
    }

    public final xwi a() {
        return new xwi(this.a);
    }
}
