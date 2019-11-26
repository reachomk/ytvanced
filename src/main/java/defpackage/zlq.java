package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.google.mediapipe.framework.TextureFrame;

/* renamed from: zlq */
final /* synthetic */ class zlq implements Runnable {
    private final zld a;
    private final TextureFrame b;
    private final TextureView c;

    zlq(zld zld, TextureFrame textureFrame, TextureView textureView) {
        this.a = zld;
        this.b = textureFrame;
        this.c = textureView;
    }

    public final void run() {
        zld zld = this.a;
        TextureFrame textureFrame = this.b;
        TextureView textureView = this.c;
        if (zld.i.c) {
            SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
            if (surfaceTexture == null) {
                xtl.d("renderGpuPacketToTexture: null textureView Surface");
            } else {
                zkd zkd = (zkd) zld.j.get(surfaceTexture);
                if (zkd == null) {
                    synchronized (zld.j) {
                        try {
                            zkd = zkd.a().a(surfaceTexture);
                            zld.j.put(surfaceTexture, zkd);
                        } catch (RuntimeException e) {
                            xtl.a("renderGpuPacketToTexture: forSurfaceTexture failed: ", e);
                        }
                    }
                }
                ayx a = ayx.a(textureFrame.getTextureName());
                if (zkd != null) {
                    zld.a(a, zkd, textureView.getWidth(), textureView.getHeight());
                }
                zkk.a(a);
            }
            textureFrame.release();
            return;
        }
        textureFrame.release();
    }
}
