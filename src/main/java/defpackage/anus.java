package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketGetter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: anus */
public final class anus {
    private static final amxs a = amxs.a("com/google/mediapipe/framework/AndroidPacketGetter");

    public static Bitmap a(Packet packet) {
        int b = PacketGetter.b(packet);
        int c = PacketGetter.c(packet);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((b * c) << 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        if (PacketGetter.a(packet, allocateDirect)) {
            Bitmap createBitmap = Bitmap.createBitmap(b, c, Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(allocateDirect);
            return createBitmap;
        }
        ((amxr) ((amxr) a.a()).a("com/google/mediapipe/framework/AndroidPacketGetter", "getBitmapFromRgba", 58, "AndroidPacketGetter.java")).a("Got error from getImageData, returning null Bitmap. Image width %d, height %d", b, c);
        return null;
    }
}
