package defpackage;

import android.hardware.display.DisplayManager.DisplayListener;

/* renamed from: zgx */
final class zgx implements DisplayListener {
    private final /* synthetic */ zgu a;

    zgx(zgu zgu) {
        this.a = zgu;
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayRemoved(int i) {
    }

    public final void onDisplayChanged(int i) {
        zgu zgu = this.a;
        nn p = zgu.p();
        if (zgu.p() != null) {
            int b = zgu.b(p);
            if (zgu.a != null && Math.abs(zgu.b - b) == 180) {
                zgu.a.a(b);
            }
            zgu.b = b;
        }
    }
}
