package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: zkw */
public final class zkw {
    public static void a(Context context, Bitmap bitmap, zkv zkv) {
        int height = bitmap.getHeight() + 2;
        double width = (double) (bitmap.getWidth() + 2);
        Double.isNaN(width);
        int ceil = ((int) Math.ceil(width / 4.0d)) << 2;
        new Canvas(Bitmap.createBitmap(ceil, height, Config.ARGB_8888)).drawBitmap(bitmap, (float) ((ceil - bitmap.getWidth()) / 2), (float) ((height - bitmap.getHeight()) / 2), new Paint(2));
        new zkx(zkw.a(context.getApplicationContext()), zkv).execute(new Bitmap[]{r3});
    }

    public static zjj a(Context context) {
        return new zjj(context, 1, zjz.c, zjz.g, new xvf());
    }
}
