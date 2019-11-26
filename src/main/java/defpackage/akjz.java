package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;

/* renamed from: akjz */
public final class akjz implements afnw {
    private final int a;
    private final Config b;

    public akjz() {
        this.a = 0;
        this.b = Config.ARGB_8888;
    }

    public akjz(int i, Config config) {
        amqw.a(i > 0, (Object) "desiredWidth must be > 0");
        this.a = i;
        this.b = config;
    }

    public final Bitmap a(byte[] bArr) {
        Bitmap decodeByteArray;
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (options.outWidth >= 0) {
            int i;
            int i2 = this.a;
            if (i2 != 0) {
                int i3 = options.outWidth;
                i = 1;
                while (true) {
                    i3 >>= 1;
                    if (i3 < i2) {
                        break;
                    }
                    i += i;
                }
            } else {
                i = 1;
            }
            options.inSampleSize = i;
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = this.b;
            options.inPurgeable = true;
            options.inInputShareable = false;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            decodeByteArray = null;
        }
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        throw new xwd("failed to decode bitmap");
    }
}
