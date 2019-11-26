package defpackage;

import com.google.android.libraries.youtube.edit.camera.CameraView;

/* renamed from: zhc */
public final /* synthetic */ class zhc implements xsd {
    private final CameraView a;
    private final xsd b;

    public zhc(CameraView cameraView, xsd xsd) {
        this.a = cameraView;
        this.b = xsd;
    }

    public final void a(Object obj) {
        CameraView cameraView = this.a;
        cameraView.post(new zhi(cameraView, this.b, (zit) obj));
    }
}
