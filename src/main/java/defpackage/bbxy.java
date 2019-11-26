package defpackage;

import java.util.concurrent.Callable;

/* renamed from: bbxy */
public final class bbxy extends bbxe implements Callable {
    public static final long serialVersionUID = 1811839108042568751L;

    public bbxy(Runnable runnable) {
        super(runnable);
    }

    public final /* synthetic */ Object call() {
        this.b = Thread.currentThread();
        try {
            this.a.run();
            return null;
        } finally {
            lazySet(c);
            this.b = null;
        }
    }
}
