package defpackage;

import java.security.PrivilegedAction;

/* renamed from: bk */
final class bk implements PrivilegedAction {
    private final /* synthetic */ String a;

    bk(String str) {
        this.a = str;
    }

    public final /* synthetic */ Object run() {
        return System.getProperty(this.a);
    }
}
