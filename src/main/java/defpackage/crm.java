package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: crm */
public final class crm implements cpe {
    private static ThreadPoolExecutor a;

    public crm(cuo cuo) {
        if (a == null) {
            a = new cpo(cuo.a(), cuo.b(), cuo.c());
        }
    }

    public final boolean post(Runnable runnable) {
        try {
            a.execute(runnable);
            return true;
        } catch (RejectedExecutionException e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 40);
            stringBuilder.append("Cannot execute layout calculation task; ");
            stringBuilder.append(valueOf);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public final void removeCallbacks(Runnable runnable) {
        a.remove(runnable);
    }
}
