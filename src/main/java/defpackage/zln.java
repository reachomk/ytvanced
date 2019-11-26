package defpackage;

import com.google.mediapipe.framework.TextureFrame;

/* renamed from: zln */
final /* synthetic */ class zln implements Runnable {
    private final zld a;
    private final TextureFrame b;

    zln(zld zld, TextureFrame textureFrame) {
        this.a = zld;
        this.b = textureFrame;
    }

    public final void run() {
        zld zld = this.a;
        TextureFrame textureFrame = this.b;
        zkd zkd = zld.i.z;
        if (zld.i.c && zkd != null) {
            ayx a = ayx.a(textureFrame.getTextureName());
            zkk zkk = zld.i;
            zld.a(a, zkd, zkk.A, zkk.B);
            zkk.a(a);
            textureFrame.release();
            zld.i.a();
            return;
        }
        textureFrame.release();
    }
}
