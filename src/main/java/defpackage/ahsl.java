package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: ahsl */
public final class ahsl {
    private static final Boolean a = Boolean.valueOf(false);

    public static float a(float f) {
        return f * 0.1f;
    }

    public static void a() {
        String str;
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            str = "GL error ";
            if (glGetError == 0) {
                break;
            }
            String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            xtl.c(valueOf);
            if (i == 0) {
                i = glGetError;
            }
        }
        if (i != 0) {
            String valueOf2 = String.valueOf(GLU.gluErrorString(i));
            throw new ahsj(valueOf2.length() == 0 ? new String(str) : str.concat(valueOf2));
        }
    }

    public static int b(float f) {
        return (int) (f / 0.1f);
    }

    public static void b() {
    }

    public static float c(float f) {
        float f2 = 200.0f;
        if (f >= 200.0f) {
            f2 = 10000.0f;
            if (f <= 10000.0f) {
                return f;
            }
        }
        return f2;
    }

    public static void a(int i) {
        if (!a.booleanValue() && i == 0) {
            while (true) {
                i = GLES20.glGetError();
                if (i != 0) {
                    String valueOf = String.valueOf(GLU.gluErrorString(i));
                    String str = "GL error ";
                    xtl.c(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
                } else {
                    throw new ahsj("Invalid GL object");
                }
            }
        }
    }

    @Deprecated
    public static void a(Bitmap bitmap, String str) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, Mode.CLEAR);
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(-1);
        textPaint.setTextSize(20.0f);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        new StaticLayout(str, textPaint, bitmap.getWidth(), Alignment.ALIGN_CENTER, 1.0f, 0.0f, true).draw(canvas);
    }

    public static Bitmap a(Resources resources, int i) {
        Options options = new Options();
        options.inScaled = false;
        return BitmapFactory.decodeResource(resources, i, options);
    }

    public static Bitmap c() {
        return Bitmap.createBitmap(80, 30, Config.ARGB_8888);
    }

    public static void a(float[] fArr, float[] fArr2) {
        if (fArr.length >= 3) {
            float atan2;
            float atan22;
            float asin = (float) Math.asin((double) fArr2[6]);
            float f = fArr2[6];
            if (Math.sqrt((double) (1.0f - (f * f))) >= 0.009999999776482582d) {
                atan2 = (float) Math.atan2((double) (-fArr2[2]), (double) fArr2[10]);
                atan22 = (float) Math.atan2((double) (-fArr2[4]), (double) fArr2[5]);
            } else {
                atan22 = (float) Math.atan2((double) fArr2[1], (double) fArr2[0]);
                atan2 = 0.0f;
            }
            fArr[0] = -asin;
            fArr[1] = -atan2;
            fArr[2] = -atan22;
            return;
        }
        throw new IllegalArgumentException("Not enough space to write the result");
    }

    public static FloatBuffer a(float[] fArr) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr).position(0);
        return asFloatBuffer;
    }

    public static boolean a(float f, float f2, float f3) {
        return Math.abs(f - f2) < f3;
    }
}
