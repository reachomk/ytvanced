package defpackage;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: xjz */
final /* synthetic */ class xjz implements xkl {
    private final aosr a;

    xjz(aosr aosr) {
        this.a = aosr;
    }

    public final ThreadPoolExecutor a(xkj xkj) {
        aosr aosr = this.a;
        if (((xjo) xkj).c == 1 || !aosr.c) {
            return xkj.w();
        }
        return new ThreadPoolExecutor(aosr.e, aosr.f, (long) aosr.d, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new xaf(0, "cronetPrio"));
    }
}
