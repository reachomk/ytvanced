package defpackage;

import android.os.Bundle;

/* renamed from: pvj */
final class pvj implements pte, pth {
    private final /* synthetic */ puy a;

    public final void a(int i) {
    }

    public final void a(Bundle bundle) {
        puy puy = this.a;
        puy.e.a(new pvh(puy));
    }

    public final void a(psa psa) {
        this.a.b.lock();
        try {
            if (this.a.a(psa)) {
                this.a.f();
                this.a.e();
            } else {
                this.a.b(psa);
            }
            this.a.b.unlock();
        } catch (Throwable th) {
            this.a.b.unlock();
        }
    }

    /* synthetic */ pvj(puy puy) {
        this.a = puy;
    }
}
