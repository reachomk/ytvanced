package defpackage;

import android.view.View.MeasureSpec;
import com.facebook.yoga.YogaMeasureMode;

/* renamed from: crc */
public final class crc {
    public static int a(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        if (mode == aocf.UNSET_ENUM_VALUE) {
            return Math.min(MeasureSpec.getSize(i), i2);
        }
        if (mode == 0) {
            return i2;
        }
        if (mode == 1073741824) {
            return MeasureSpec.getSize(i);
        }
        i = MeasureSpec.getMode(i);
        StringBuilder stringBuilder = new StringBuilder(33);
        stringBuilder.append("Unexpected size mode: ");
        stringBuilder.append(i);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public static int a(float f, YogaMeasureMode yogaMeasureMode) {
        int ordinal = yogaMeasureMode.ordinal();
        if (ordinal == 0) {
            return MeasureSpec.makeMeasureSpec(0, 0);
        }
        if (ordinal == 1) {
            return MeasureSpec.makeMeasureSpec(con.a(f), 1073741824);
        }
        if (ordinal == 2) {
            return MeasureSpec.makeMeasureSpec(con.a(f), aocf.UNSET_ENUM_VALUE);
        }
        String valueOf = String.valueOf(yogaMeasureMode);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 28);
        stringBuilder.append("Unexpected YogaMeasureMode: ");
        stringBuilder.append(valueOf);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
