package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.os.AsyncTask;
import java.io.IOException;

/* renamed from: zgq */
final class zgq extends AsyncTask {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;
    private final /* synthetic */ int d;
    private final /* synthetic */ zgr e;

    zgq(zgr zgr, int i, int i2, int i3, int i4) {
        this.e = zgr;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        synchronized (this.e.j) {
            int i = 0;
            Camera camera = null;
            int i2 = 0;
            loop0:
            while (true) {
                if (camera == null) {
                    if (i2 <= zgr.a.length) {
                        if (this.e.h != 3) {
                            if (!isCancelled()) {
                                if (this.e.h == 4) {
                                    xtl.c("Camera has already failed.");
                                    break loop0;
                                }
                                try {
                                    camera = Camera.open(this.a);
                                } catch (Exception e) {
                                    if (i2 >= zgr.a.length) {
                                        xtl.a("Failed to open camera.", e);
                                        i = this.e;
                                        i.b(4);
                                    }
                                } finally {
                                    break;
                                }
                                if (camera != null) {
                                    i2++;
                                } else {
                                    if (i2 < zgr.a.length) {
                                        try {
                                            this.e.j.wait((long) zgr.a[i2]);
                                        } catch (InterruptedException unused) {
                                        }
                                    }
                                    i2++;
                                }
                            }
                        }
                        xtl.e("Camera already released while trying to start camera.");
                        this.e.b(4);
                        break;
                    }
                }
                try {
                    i2 = this.e;
                    SurfaceTexture surfaceTexture = i2.e;
                    if (surfaceTexture == null) {
                        i2 = i2.f;
                        if (i2 != 0) {
                            camera.setPreviewDisplay(i2);
                        }
                    } else {
                        camera.setPreviewTexture(surfaceTexture);
                    }
                    zgr zgr = this.e;
                    zgr.b = camera;
                    Parameters parameters = zgr.b.getParameters();
                    parameters.setRecordingHint(true);
                    String a = zgr.a(parameters.getSupportedFocusModes());
                    if (a != null) {
                        parameters.setFocusMode(a);
                    }
                    Size a2 = zgr.a(this.b, this.c, parameters.getSupportedPreviewSizes());
                    parameters.setPreviewSize(a2.width, a2.height);
                    int[] a3 = zgr.a(this.d * 1000, parameters.getSupportedPreviewFpsRange());
                    parameters.setPreviewFpsRange(a3[i], a3[1]);
                    this.e.b.setParameters(parameters);
                    this.e.d();
                    this.e.b.startPreview();
                    this.e.b(2);
                    zgr zgr2 = this.e;
                    zgt zgt = zgr2.i;
                    if (zgt != null) {
                        zgt.a(zgr2.b);
                    }
                } catch (IOException e2) {
                    xtl.a("Error setting preview display.", e2);
                    camera.release();
                    this.e.b(4);
                }
            }
        }
        return null;
    }
}
