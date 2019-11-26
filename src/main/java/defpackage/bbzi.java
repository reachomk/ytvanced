package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: bbzi */
public final class bbzi {
    public static final bbmn a;
    public static final bbmn b;
    public static final bbmn c;
    public static final bbmn d = bbyd.a;

    public static bbmn a(Executor executor) {
        return new bbxk(executor);
    }

    static {
        Callable bbzq = new bbzq();
        String str = "Scheduler Callable can't be null";
        bbow.a((Object) bbzq, str);
        a = bbzf.a(bbzq);
        bbzq = new bbzk();
        bbow.a((Object) bbzq, str);
        b = bbzf.a(bbzq);
        bbzq = new bbzj();
        bbow.a((Object) bbzq, str);
        c = bbzf.a(bbzq);
        bbzq = new bbzo();
        bbow.a((Object) bbzq, str);
        bbzf.a(bbzq);
    }
}
