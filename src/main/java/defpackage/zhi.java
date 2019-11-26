package defpackage;

import com.google.android.libraries.youtube.edit.camera.CameraView;

/* renamed from: zhi */
final /* synthetic */ class zhi implements Runnable {
    private final CameraView a;
    private final boolean b = false;
    private final xsd c;
    private final zit d;

    zhi(CameraView cameraView, xsd xsd, zit zit) {
        this.a = cameraView;
        this.c = xsd;
        this.d = zit;
    }

    public final void run() {
        CameraView cameraView = this.a;
        xsd xsd = this.c;
        zit zit = this.d;
        cameraView.b(false);
        xsd.a(zit);
    }
}
