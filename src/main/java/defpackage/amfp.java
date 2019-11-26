package defpackage;

import com.google.android.youtube.R;

/* renamed from: amfp */
public final class amfp {
    public static int a(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            return R.string.upload_quality_value_360p;
        } else {
            if (i2 == 2) {
                return R.string.upload_quality_value_480p;
            }
            if (i2 != 3) {
                return i2 != 4 ? R.string.upload_quality_value_original : R.string.upload_quality_value_1080p;
            } else {
                return R.string.upload_quality_value_720p;
            }
        }
    }
}
