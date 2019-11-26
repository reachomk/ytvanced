package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: aibi */
final /* synthetic */ class aibi implements Runnable {
    private final aibf a;

    aibi(aibf aibf) {
        this.a = aibf;
    }

    public final void run() {
        aahr[] aahrArr;
        aibf aibf = this.a;
        synchronized (aibf.a.x) {
            aahrArr = aibf.a.y;
        }
        if (aahrArr != null) {
            long j = -1;
            for (aahr a : aahrArr) {
                long a2 = aibf.a.e.a(a, TimeUnit.MILLISECONDS.toMicros(aibf.a.s));
                j = j >= 0 ? Math.min(j, a2) : a2;
            }
            aibf.a.w = TimeUnit.MICROSECONDS.toMillis(j);
            aibd aibd = aibf.a;
            aibd.g.execute(new aibh(aibd));
            aibd = aibf.a;
            if (aibd.w >= aibd.u) {
                aibf.b();
            }
            return;
        }
        aibf.b();
    }
}
