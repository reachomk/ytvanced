package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.google.android.youtube.R;

/* renamed from: ejq */
public final class ejq {
    public static Bitmap a(Resources resources, Bitmap bitmap) {
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int fraction = (int) (((float) width) / resources.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1));
        float dimensionPixelSize = ((float) resources.getDimensionPixelSize(R.dimen.notification_icon_size)) / ((float) fraction);
        Matrix matrix = new Matrix();
        matrix.setScale(dimensionPixelSize, dimensionPixelSize, 0.0f, 0.0f);
        return Bitmap.createBitmap(bitmap, (width - fraction) / 2, (height - fraction) / 2, fraction, fraction, matrix, false);
    }
}
