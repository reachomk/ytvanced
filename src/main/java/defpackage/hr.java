package defpackage;

import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;

/* renamed from: hr */
public final class hr {
    public static final int[] g = new int[3];
    public static final float[] h = new float[]{0.0f, 0.5f, 1.0f};
    public static final int[] i = new int[4];
    public static final float[] j = new float[]{0.0f, 0.0f, 0.5f, 1.0f};
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public int d;
    public int e;
    public int f;
    public final Path k = new Path();

    public hr() {
        a(-16777216);
        this.b = new Paint(4);
        this.b.setStyle(Style.FILL);
        this.a = new Paint();
        this.a.setColor(this.d);
        this.c = new Paint(this.b);
    }

    public final void a(int i) {
        this.d = sc.c(i, 68);
        this.e = sc.c(i, 20);
        this.f = sc.c(i, 0);
    }
}
