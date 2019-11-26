package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build.VERSION;
import java.io.IOException;

/* renamed from: ccv */
public final class ccv implements bsp {
    public static final bsl a = bsl.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", Long.valueOf(-1), new ccy());
    private static final bsl b = bsl.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", Integer.valueOf(2), new ccx());
    private static final ccz c = new ccz();
    private final cdc d;
    private final bwd e;

    public ccv(bwd bwd, cdc cdc) {
        this.e = bwd;
        this.d = cdc;
    }

    public final boolean a(Object obj, bsq bsq) {
        return true;
    }

    public final bvw a(Object obj, int i, int i2, bsq bsq) {
        int i3 = i;
        int i4 = i2;
        bsq bsq2 = bsq;
        long longValue = ((Long) bsq2.a(a)).longValue();
        if (longValue < 0 && longValue != -1) {
            StringBuilder stringBuilder = new StringBuilder(83);
            stringBuilder.append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
            stringBuilder.append(longValue);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        Integer num = (Integer) bsq2.a(b);
        if (num == null) {
            num = Integer.valueOf(2);
        }
        cbw cbw = (cbw) bsq2.a(cbw.f);
        if (cbw == null) {
            cbw = cbw.e;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.d.a(mediaMetadataRetriever, obj);
            int intValue = num.intValue();
            Bitmap bitmap = null;
            if (VERSION.SDK_INT >= 27) {
                if (i3 != aocf.UNSET_ENUM_VALUE) {
                    if (!(i4 == aocf.UNSET_ENUM_VALUE || cbw == cbw.d)) {
                        try {
                            float a;
                            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                            if (parseInt3 != 90) {
                                if (parseInt3 != 270) {
                                    a = cbw.a(parseInt, parseInt2, i3, i4);
                                    bitmap = mediaMetadataRetriever.getScaledFrameAtTime(longValue, intValue, Math.round(((float) parseInt) * a), Math.round(a * ((float) parseInt2)));
                                }
                            }
                            int i5 = parseInt2;
                            parseInt2 = parseInt;
                            parseInt = i5;
                            a = cbw.a(parseInt, parseInt2, i3, i4);
                            bitmap = mediaMetadataRetriever.getScaledFrameAtTime(longValue, intValue, Math.round(((float) parseInt) * a), Math.round(a * ((float) parseInt2)));
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            if (bitmap == null) {
                bitmap = mediaMetadataRetriever.getFrameAtTime(longValue, intValue);
            }
            mediaMetadataRetriever.release();
            return cbj.a(bitmap, this.e);
        } catch (RuntimeException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
        }
    }
}
