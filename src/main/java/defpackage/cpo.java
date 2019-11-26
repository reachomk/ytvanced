package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: cpo */
public final class cpo extends ThreadPoolExecutor {
    public cpo(int i, int i2, int i3) {
        super(i, i2, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(), new cpk(i3));
    }
}
