package defpackage;

import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;

/* renamed from: pag */
final class pag implements DisplayListener {
    public final DisplayManager a;
    private final /* synthetic */ pad b;

    public pag(pad pad, DisplayManager displayManager) {
        this.b = pad;
        this.a = displayManager;
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayRemoved(int i) {
    }

    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.b.a();
        }
    }
}
