package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;

/* renamed from: ziy */
public final class ziy {
    public static Bitmap a(String str, int i, int i2) {
        Options options = new Options();
        int i3 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        if (i4 > i2 || i5 > i) {
            i4 /= 2;
            i5 /= 2;
            while (i4 / i3 >= i2 && i5 / i3 >= i) {
                i3 += i3;
            }
        }
        options.inSampleSize = i3;
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }
}
