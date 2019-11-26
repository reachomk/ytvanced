package defpackage;

import android.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: bajb */
public final class bajb extends bajj {
    private final WeakReference a;

    public bajb(bajd bajd) {
        this.a = new WeakReference(bajd);
    }

    public final int a() {
        return 25;
    }

    public final baim b() {
        bajd bajd = (bajd) this.a.get();
        return bajd != null ? bajd.b : null;
    }

    public final void a(int i, int i2) {
        bajd bajd = (bajd) this.a.get();
        if (bajd != null) {
            bajd.a.onControllerStateChanged(i, i2);
        }
    }

    public final void a(baig baig) {
        bajd bajd = (bajd) this.a.get();
        if (bajd != null) {
            baig.a(bajd.c);
            bajd.a.onControllerEventPacket(baig);
            baig.b();
        }
    }

    public final void a(baii baii) {
        bajd bajd = (bajd) this.a.get();
        if (bajd != null) {
            if (baii.r != 0) {
                long c = baii.c() - baii.r;
                if (c > 300) {
                    StringBuilder stringBuilder = new StringBuilder(afy.av);
                    stringBuilder.append("Experiencing large controller packet delivery time between service and  client: timestamp diff in ms: ");
                    stringBuilder.append(c);
                    Log.w("VrCtl.ServiceBridge", stringBuilder.toString());
                }
            }
            baii.a(bajd.c);
            bajd.a.onControllerEventPacket2(baii);
            baii.b();
        }
    }

    public final void a(baio baio) {
        bajd bajd = (bajd) this.a.get();
        if (bajd != null) {
            baio.e = bajd.c;
            bajd.a.onControllerRecentered(baio);
        }
    }
}
