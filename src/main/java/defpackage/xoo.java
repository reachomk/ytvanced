package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import java.util.Arrays;

/* renamed from: xoo */
public final class xoo {
    private final float[] a;
    private final Bitmap b;
    private final Canvas c = new Canvas(this.b);
    private final Paint d = new Paint();
    private final int[] e;
    private final Paint f;
    private int g;

    public xoo(int i, int i2, float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        this.d.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        this.e = iArr;
        this.f = new Paint();
    }

    public final Bitmap a(float f) {
        int binarySearch = Arrays.binarySearch(this.a, f);
        if (binarySearch != -1) {
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            a(this.e[binarySearch], 1.0f);
            int i = binarySearch + 1;
            float[] fArr = this.a;
            if (i != fArr.length) {
                float f2 = fArr[binarySearch];
                a(this.e[i], (f - f2) / (fArr[i] - f2));
            }
        }
        int i2 = this.g + 1;
        this.g = i2;
        i2 %= this.b.getWidth();
        this.c.drawRect((float) i2, 0.0f, (float) (i2 + 1), (float) this.b.getHeight(), this.d);
        return this.b;
    }

    private final void a(int i, float f) {
        this.f.setColor(i);
        int width = this.g % this.b.getWidth();
        float height = (float) this.b.getHeight();
        this.c.drawRect((float) width, (1.0f - f) * height, (float) (width + 1), height, this.f);
    }
}
