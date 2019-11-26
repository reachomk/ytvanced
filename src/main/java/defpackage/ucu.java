package defpackage;

import android.content.Context;
import android.os.Process;

/* renamed from: ucu */
public final class ucu {
    public static bcdf a(Context context) {
        return ucu.a(null, context);
    }

    static bcdf a(String str, Context context) {
        bcdi bcdi = (bcdi) bcdf.f.createBuilder();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        bcdi.copyOnWrite();
        bcdf bcdf = (bcdf) bcdi.instance;
        bcdf.a |= 1;
        bcdf.b = elapsedCpuTime;
        boolean b = ucv.b(context);
        bcdi.copyOnWrite();
        bcdf bcdf2 = (bcdf) bcdi.instance;
        bcdf2.a |= 2;
        bcdf2.c = b;
        int activeCount = Thread.activeCount();
        bcdi.copyOnWrite();
        bcdf2 = (bcdf) bcdi.instance;
        bcdf2.a |= 4;
        bcdf2.d = activeCount;
        return (bcdf) ((anxl) bcdi.build());
    }
}
