package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ccr */
public final class ccr {
    public static final Lock a;
    private static final Paint b = new Paint(6);
    private static final Paint c = new Paint(7);
    private static final Paint d;

    public static int a(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static Bitmap a(bwd bwd, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        float height;
        float width;
        Matrix matrix = new Matrix();
        float f = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            height = ((float) i2) / ((float) bitmap.getHeight());
            width = (((float) i) - (((float) bitmap.getWidth()) * height)) * 0.5f;
        } else {
            height = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * height)) * 0.5f;
            width = 0.0f;
        }
        matrix.setScale(height, height);
        matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap a = bwd.a(i, i2, ccr.a(bitmap));
        ccr.a(bitmap, a);
        ccr.a(bitmap, a, matrix);
        return a;
    }

    public static boolean b(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap b(bwd bwd, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        i2 = Math.round(((float) bitmap.getWidth()) * min);
        int round = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == round) {
            return bitmap;
        }
        Bitmap a = bwd.a((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), ccr.a(bitmap));
        ccr.a(bitmap, a);
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        ccr.a(bitmap, a, matrix);
        return a;
    }

    public static Bitmap c(bwd bwd, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            return ccr.b(bwd, bitmap, i, i2);
        }
        return bitmap;
    }

    private static void a(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    public static Bitmap d(bwd bwd, Bitmap bitmap, int i, int i2) {
        i = Math.min(i, i2);
        float f = (float) i;
        float f2 = f / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        width *= max;
        max *= height;
        height = (f - width) / 2.0f;
        f = (f - max) / 2.0f;
        RectF rectF = new RectF(height, f, width + height, max + f);
        Bitmap a = ccr.a(bwd, bitmap);
        Bitmap a2 = bwd.a(i, i, ccr.b(bitmap));
        a2.setHasAlpha(true);
        a.lock();
        Object bitmap2;
        try {
            Canvas canvas = new Canvas(a2);
            canvas.drawCircle(f2, f2, f2, c);
            canvas.drawBitmap(a, null, rectF, d);
            ccr.a(canvas);
            if (!a.equals(bitmap2)) {
                bwd.a(a);
            }
            return a2;
        } finally {
            bitmap2 = a;
            bitmap2.unlock();
        }
    }

    private static Bitmap a(bwd bwd, Bitmap bitmap) {
        Config b = ccr.b(bitmap);
        if (b.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap a = bwd.a(bitmap.getWidth(), bitmap.getHeight(), b);
        new Canvas(a).drawBitmap(bitmap, 0.0f, 0.0f, null);
        return a;
    }

    private static Config b(Bitmap bitmap) {
        if (VERSION.SDK_INT < 26 || !Config.RGBA_F16.equals(bitmap.getConfig())) {
            return Config.ARGB_8888;
        }
        return Config.RGBA_F16;
    }

    public static Bitmap a(bwd bwd, Bitmap bitmap, int i) {
        chw.a(i > 0, "roundingRadius must be greater than 0.");
        Config b = ccr.b(bitmap);
        Bitmap a = ccr.a(bwd, bitmap);
        Bitmap a2 = bwd.a(a.getWidth(), a.getHeight(), b);
        a2.setHasAlpha(true);
        BitmapShader bitmapShader = new BitmapShader(a, TileMode.CLAMP, TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, (float) a2.getWidth(), (float) a2.getHeight());
        a.lock();
        Object bitmap2;
        try {
            Canvas canvas = new Canvas(a2);
            canvas.drawColor(0, Mode.CLEAR);
            float f = (float) i;
            canvas.drawRoundRect(rectF, f, f, paint);
            ccr.a(canvas);
            if (!a.equals(bitmap2)) {
                bwd.a(a);
            }
            return a2;
        } finally {
            bitmap2 = a;
            bitmap2.unlock();
        }
    }

    private static void a(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Config a(Bitmap bitmap) {
        return bitmap.getConfig() == null ? Config.ARGB_8888 : bitmap.getConfig();
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        a.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, b);
            ccr.a(canvas);
        } finally {
            a.unlock();
        }
    }

    static {
        Lock reentrantLock;
        if (new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"})).contains(Build.MODEL)) {
            reentrantLock = new ReentrantLock();
        } else {
            reentrantLock = new ccu();
        }
        a = reentrantLock;
        Paint paint = new Paint(7);
        d = paint;
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
    }
}
