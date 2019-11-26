package defpackage;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Parameters;

/* renamed from: zhh */
public final class zhh implements AutoFocusCallback {
    private final /* synthetic */ String a;

    public zhh(String str) {
        this.a = str;
    }

    public final void onAutoFocus(boolean z, Camera camera) {
        try {
            Parameters parameters = camera.getParameters();
            parameters.setFocusMode(this.a);
            camera.setParameters(parameters);
        } catch (RuntimeException unused) {
            xtl.c("Camera is used after being released.");
        }
    }
}
