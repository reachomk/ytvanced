package defpackage;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Parameters;

/* renamed from: abyg */
final /* synthetic */ class abyg implements AutoFocusCallback {
    public static final AutoFocusCallback a = new abyg();

    private abyg() {
    }

    public final void onAutoFocus(boolean z, Camera camera) {
        try {
            Parameters parameters = camera.getParameters();
            abyh.a(parameters);
            camera.setParameters(parameters);
        } catch (Exception e) {
            xtl.a("Error while resetting camera parameters.", e);
        }
    }
}
