package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: ukh */
final class ukh implements ukf {
    private Map c;

    ukh() {
    }

    public final ukj a(String str, boolean z) {
        uhy.b(true);
        try {
            MediaCodec createByCodecName;
            String a = ukh.a(str);
            String a2 = ukh.a(a);
            if (this.c == null) {
                this.c = new HashMap();
                for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                    if (z == codecInfoAt.isEncoder()) {
                        for (String a3 : codecInfoAt.getSupportedTypes()) {
                            String a32 = ukh.a(a32);
                            if (!this.c.containsKey(a32)) {
                                this.c.put(a32, new ArrayList());
                            }
                            ((List) this.c.get(a32)).add(codecInfoAt);
                        }
                    }
                }
            }
            List list = (List) this.c.get(a2);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (MediaCodecInfo name : list) {
                String name2 = name.getName();
                if (name2.startsWith("OMX.google.")) {
                    createByCodecName = MediaCodec.createByCodecName(name2);
                    break;
                }
            }
            if (z) {
                createByCodecName = MediaCodec.createEncoderByType(a);
            } else {
                createByCodecName = MediaCodec.createDecoderByType(a);
            }
            return new ukn(createByCodecName);
        } catch (IOException e) {
            str = String.valueOf(str);
            String str2 = "Failed to create media decoder for mime type: ";
            ujo.a(str.length() == 0 ? new String(str2) : str2.concat(str), e);
            return null;
        }
    }

    private static String a(String str) {
        return str.toLowerCase(Locale.US);
    }
}
