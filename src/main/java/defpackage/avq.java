package defpackage;

import android.os.SystemClock;
import android.view.Choreographer.FrameCallback;

/* renamed from: avq */
final class avq implements FrameCallback {
    private final /* synthetic */ avr a;

    avq(avr avr) {
        this.a = avr;
    }

    public final void doFrame(long j) {
        avm avm = this.a.a;
        avm.a.c = SystemClock.uptimeMillis();
        avn avn = avm.a;
        long j2 = avn.c;
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < avn.b.size(); i++) {
            avp avp = (avp) avn.b.get(i);
            if (avp != null) {
                Long l = (Long) avn.a.get(avp);
                if (l != null) {
                    if (l.longValue() < uptimeMillis) {
                        avn.a.remove(avp);
                    }
                }
                avp.a(j2);
            }
        }
        if (avn.d) {
            int size = avn.b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (avn.b.get(size) == null) {
                    avn.b.remove(size);
                }
            }
            avn.d = false;
        }
        if (avm.a.b.size() > 0) {
            avm.a.b().a();
        }
    }
}
