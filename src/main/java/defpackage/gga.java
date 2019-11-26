package defpackage;

import android.graphics.Bitmap;

/* renamed from: gga */
public final class gga {
    public static Bitmap a(Bitmap bitmap) {
        if (bitmap == null) {
            bitmap = null;
        } else {
            double width = (double) bitmap.getWidth();
            double height = (double) bitmap.getHeight();
            Double.isNaN(width);
            Double.isNaN(height);
            width /= height;
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            if (Math.abs(-0.5625d + width) >= 0.001d) {
                int max;
                if (width > 0.5625d) {
                    width = (double) height2;
                    Double.isNaN(width);
                    max = Math.max((int) Math.round(width * 0.5625d), 2);
                    bitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - max) / 2, 0, max, height2);
                } else {
                    width = (double) width2;
                    Double.isNaN(width);
                    max = Math.max((int) Math.round(width / 0.5625d), 2);
                    bitmap = Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() - max) / 2, width2, max);
                }
            }
        }
        return (bitmap.getHeight() <= 1280 || bitmap.getWidth() <= 720) ? bitmap : Bitmap.createScaledBitmap(bitmap, 720, 1280, true);
    }
}
