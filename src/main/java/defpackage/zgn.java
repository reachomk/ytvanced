package defpackage;

import android.media.CamcorderProfile;

/* renamed from: zgn */
public final class zgn {
    public static CamcorderProfile a(int i, int i2, int i3) {
        int[] iArr = new int[]{6, 5, 4, 0};
        int i4 = 0;
        while (i4 < 4 && iArr[i4] != i3) {
            i4++;
        }
        if (i4 != 4) {
            while (i4 < 4) {
                if (CamcorderProfile.hasProfile(i, iArr[i4])) {
                    CamcorderProfile camcorderProfile = CamcorderProfile.get(i, iArr[i4]);
                    if (camcorderProfile != null && camcorderProfile.videoFrameRate >= i2) {
                        return camcorderProfile;
                    }
                }
                i4++;
            }
            if (i2 <= 0) {
                return null;
            }
            return zgn.a(i, 0, i3);
        }
        throw new IllegalStateException("Unexpected targetQuality specified.");
    }
}
