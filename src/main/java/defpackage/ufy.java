package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ufy */
final /* synthetic */ class ufy implements Callable {
    private final String a;

    ufy(String str) {
        this.a = str;
    }

    public final Object call() {
        String str = this.a;
        return ufv.a(ufv.a.invoke(ufv.c, new Object[]{str}));
    }
}
