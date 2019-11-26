package defpackage;

import android.view.TextureView;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketCallback;
import com.google.mediapipe.framework.PacketGetter;

/* renamed from: zlf */
final /* synthetic */ class zlf implements PacketCallback {
    private final zld a;
    private final String b;

    zlf(zld zld, String str) {
        this.a = zld;
        this.b = str;
    }

    public final void process(Packet packet) {
        zld zld = this.a;
        for (TextureView textureView : zld.b(this.b)) {
            if (textureView != null && textureView.isAvailable()) {
                zld.i.b.post(new zlq(zld, PacketGetter.d(packet), textureView));
            }
            znl znl = (znl) zld.e.remove(textureView);
            if (znl != null) {
                znl.c.a(znl.a);
            }
        }
    }
}
