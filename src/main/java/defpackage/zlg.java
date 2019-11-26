package defpackage;

import com.google.mediapipe.framework.GraphTextureFrame;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketCallback;
import com.google.mediapipe.framework.PacketGetter;

/* renamed from: zlg */
final /* synthetic */ class zlg implements PacketCallback {
    private final zld a;

    zlg(zld zld) {
        this.a = zld;
    }

    public final void process(Packet packet) {
        zld zld = this.a;
        if (packet.a() > zld.h) {
            GraphTextureFrame d = PacketGetter.d(packet);
            zld.h = packet.a();
            zld.i.b.post(new zln(zld, d));
        }
    }
}
