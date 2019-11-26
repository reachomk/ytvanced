package defpackage;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: xka */
final /* synthetic */ class xka implements xkl {
    private final aosr a;

    xka(aosr aosr) {
        this.a = aosr;
    }

    public final ThreadPoolExecutor a(xkj xkj) {
        aosr aosr = this.a;
        int i = ((xjo) xkj).c;
        return new ThreadPoolExecutor(i != 1 ? aosr.g : 1, i != 1 ? aosr.h : 1, i != 1 ? (long) aosr.d : 0, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new xaf(10, "cronet"));
    }
}
