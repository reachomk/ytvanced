package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketCallback;

/* renamed from: wgh */
final class wgh implements PacketCallback {
    public final /* synthetic */ wgj a;

    wgh(wgj wgj) {
        this.a = wgj;
    }

    public final void process(Packet packet) {
        new Handler(Looper.getMainLooper()).post(new wgk(this, anus.a(packet)));
    }
}
