package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: det */
final class det implements ThreadFactory {
    private final /* synthetic */ deq a;

    det(deq deq) {
        this.a = deq;
    }

    public final Thread newThread(Runnable runnable) {
        String name = this.a.getClass().getName();
        String str = "FJD.JobService ";
        return new Thread(runnable, name.length() == 0 ? new String(str) : str.concat(name));
    }
}
