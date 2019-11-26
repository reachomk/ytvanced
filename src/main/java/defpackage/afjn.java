package defpackage;

import android.media.MediaCodecInfo.CodecProfileLevel;
import java.util.List;
import java.util.Set;

/* renamed from: afjn */
abstract class afjn {
    public final Object a(String str, boolean z, Set set, Set set2, int i) {
        boolean equalsIgnoreCase = "video/avc".equalsIgnoreCase(str);
        int i2 = !equalsIgnoreCase ? 0 : 64;
        if (equalsIgnoreCase) {
            i = 2;
        }
        for (Object next : a(str, z)) {
            String b = b(next);
            if (!(set.contains(b) || set2.contains(b))) {
                if (i <= 0 && i2 <= 0) {
                    return next;
                }
                for (CodecProfileLevel codecProfileLevel : a(next)) {
                    if ((i <= 0 || codecProfileLevel.profile == i) && (i2 <= 0 || codecProfileLevel.level >= i2)) {
                        return next;
                    }
                }
                continue;
            }
        }
        return null;
    }

    public abstract List a(String str, boolean z);

    public abstract CodecProfileLevel[] a(Object obj);

    public abstract String b(Object obj);

    /* synthetic */ afjn() {
    }
}
