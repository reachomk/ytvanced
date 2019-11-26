package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: adsm */
final class adsm extends Handler {
    private final WeakReference a;

    public final void handleMessage(Message message) {
        adsg adsg = (adsg) this.a.get();
        if (adsg != null && adsg.f) {
            int i = message.what;
            if (i == 0) {
                adsg.e();
                if (!hasMessages(0)) {
                    sendEmptyMessageDelayed(0, 5000);
                }
            } else if (i == 1) {
                adsg.d();
                if (!hasMessages(1)) {
                    sendEmptyMessageDelayed(1, 10000);
                }
            } else if (i == 2) {
                Set<adiq> set = (Set) message.obj;
                if (!set.isEmpty()) {
                    for (adiq adiq : set) {
                        if (adiq.j()) {
                            adjg d = adiq.d();
                            Integer num = (Integer) adsg.e.get(d);
                            adqe c = ((adqf) adsg.c.get()).c();
                            if (num == null || num.intValue() >= 5 || c == null || !c.h().equals(adiq)) {
                                Object a = adiq.a();
                                if (a != null) {
                                    String.valueOf(adiq.c()).length();
                                    adsg.d.a(a, adsg.c(adiq));
                                } else {
                                    adsg.c(adiq).a(adhw.a(-2));
                                }
                            } else {
                                String c2 = adiq.c();
                                num.intValue();
                                String.valueOf(c2).length();
                                adsg.e.put(d, Integer.valueOf(num.intValue() + 1));
                            }
                        }
                    }
                }
            }
        }
    }

    /* synthetic */ adsm(adsg adsg) {
        super(Looper.getMainLooper());
        this.a = new WeakReference(adsg);
    }
}
