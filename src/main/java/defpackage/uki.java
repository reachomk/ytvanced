package defpackage;

import android.media.MediaCodec;
import java.io.IOException;

/* renamed from: uki */
final class uki implements ukf {
    uki() {
    }

    public final ukj a(String str, boolean z) {
        uhy.b(true);
        try {
            MediaCodec createEncoderByType;
            if (z) {
                createEncoderByType = MediaCodec.createEncoderByType(str);
            } else {
                createEncoderByType = MediaCodec.createDecoderByType(str);
            }
            return new ukn(createEncoderByType);
        } catch (IOException e) {
            str = String.valueOf(str);
            String str2 = "Failed to create media decoder for mime type: ";
            ujo.a(str.length() == 0 ? new String(str2) : str2.concat(str), e);
            return null;
        }
    }
}
