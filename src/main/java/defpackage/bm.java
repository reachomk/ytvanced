package defpackage;

import java.security.PrivilegedAction;

/* renamed from: bm */
final class bm implements PrivilegedAction {
    private final /* synthetic */ Class a;
    private final /* synthetic */ String b;

    bm(Class cls, String str) {
        this.a = cls;
        this.b = str;
    }

    public final /* synthetic */ Object run() {
        return this.a.getResourceAsStream(this.b);
    }
}
