package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.acll;
import defpackage.amqw;
import defpackage.xtl;
import defpackage.xvd;

public class CropView extends FrameLayout {
    public Uri a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Pair f;
    public int g;
    public int h;
    public Matrix i;
    public ImageView j;
    private int k;
    private int l;
    private int m;
    private CharSequence n;
    private Rect o;
    private View p;
    private View q;
    private View r;
    private Matrix s;
    private PointF t = new PointF();
    private PointF u = new PointF();
    private double v = 1.0d;
    private float[] w = new float[9];
    private boolean x;
    private boolean y;
    private int z;

    private static double a(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return Math.sqrt((double) ((x * x) + (y * y)));
    }

    public CropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = true;
        this.x = true;
        this.y = true;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.lc_view_crop, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, acll.b);
        try {
            this.b = obtainStyledAttributes.getInteger(0, 0);
            this.c = obtainStyledAttributes.getInteger(1, 0);
            this.d = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
            this.e = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            this.k = obtainStyledAttributes.getInteger(4, this.b);
            this.l = obtainStyledAttributes.getInteger(5, this.c);
            this.m = obtainStyledAttributes.getInteger(6, this.k);
            this.n = xvd.a(obtainStyledAttributes.getText(7));
            int i = this.b;
            amqw.a(i > 0, "Width ratio must be positive. Was %s.", i);
            i = this.c;
            amqw.a(i > 0, "Height ratio must be positive. Was %s.", i);
            i = this.m;
            int i2 = this.k;
            amqw.a(i <= i2, "A double mask width ratio must be smaller or equal to a single mask width ratio. %s > %s", i, i2);
            i = this.d;
            if (i != 0) {
                i2 = this.e;
                if (!(i2 == 0 || (i * this.c) - (i2 * this.b) == 0)) {
                    z = false;
                }
            }
            amqw.a(z, (Object) "Min width and height must match the given width and height ratio");
            this.i = new Matrix();
            this.s = new Matrix();
            this.z = 0;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.j = (ImageView) findViewById(R.id.image);
        this.p = findViewById(R.id.crop_rectangle);
        this.q = findViewById(R.id.crop_left_mask);
        this.r = findViewById(R.id.crop_right_mask);
        CharSequence charSequence = this.n;
        if (charSequence != null && charSequence.length() > 0) {
            TextView textView = (TextView) findViewById(R.id.crop_info);
            textView.setVisibility(0);
            textView.setText(this.n);
        }
    }

    /* JADX WARNING: Missing block: B:9:0x0015, code skipped:
            if (r0 != 6) goto L_0x00cc;
     */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        r8 = this;
        r0 = r9.getAction();
        r0 = r0 & 255;
        r1 = 1;
        if (r0 == 0) goto L_0x00b6;
    L_0x0009:
        r2 = 0;
        if (r0 == r1) goto L_0x00ae;
    L_0x000c:
        r3 = 4621819117588971520; // 0x4024000000000000 float:0.0 double:10.0;
        r5 = 2;
        if (r0 == r5) goto L_0x0049;
    L_0x0011:
        r6 = 5;
        if (r0 == r6) goto L_0x0019;
    L_0x0014:
        r9 = 6;
        if (r0 == r9) goto L_0x00ae;
    L_0x0017:
        goto L_0x00cc;
    L_0x0019:
        r6 = a(r9);
        r8.v = r6;
        r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x00cc;
    L_0x0023:
        r0 = r8.s;
        r3 = r8.i;
        r0.set(r3);
        r0 = r8.u;
        r3 = r9.getX(r2);
        r4 = r9.getX(r1);
        r3 = r3 + r4;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = r3 / r4;
        r2 = r9.getY(r2);
        r9 = r9.getY(r1);
        r2 = r2 + r9;
        r2 = r2 / r4;
        r0.set(r3, r2);
        r8.z = r5;
        goto L_0x00cc;
    L_0x0049:
        r0 = r8.z;
        if (r0 != r1) goto L_0x006c;
    L_0x004d:
        r0 = r8.i;
        r2 = r8.s;
        r0.set(r2);
        r0 = r8.i;
        r2 = r9.getX();
        r3 = r8.t;
        r3 = r3.x;
        r2 = r2 - r3;
        r9 = r9.getY();
        r3 = r8.t;
        r3 = r3.y;
        r9 = r9 - r3;
        r0.postTranslate(r2, r9);
        goto L_0x00aa;
    L_0x006c:
        if (r0 != r5) goto L_0x00aa;
    L_0x006e:
        r5 = a(r9);
        r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r9 <= 0) goto L_0x00aa;
    L_0x0076:
        r2 = r8.v;
        r5 = r5 / r2;
        r2 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r9 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r9 >= 0) goto L_0x0084;
    L_0x007f:
        r9 = r8.x;
        if (r9 == 0) goto L_0x0084;
    L_0x0083:
        goto L_0x008c;
    L_0x0084:
        r9 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r9 <= 0) goto L_0x00aa;
    L_0x0088:
        r9 = r8.y;
        if (r9 == 0) goto L_0x00aa;
    L_0x008c:
        r9 = r8.i;
        r0 = r8.s;
        r9.set(r0);
        r9 = (float) r5;
        r0 = r8.i;
        r4 = r8.u;
        r4 = r4.x;
        r7 = r8.u;
        r7 = r7.y;
        r0.postScale(r9, r9, r4, r7);
        r9 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r9 < 0) goto L_0x00a8;
    L_0x00a5:
        r8.x = r1;
        goto L_0x00aa;
    L_0x00a8:
        r8.y = r1;
    L_0x00aa:
        r8.b();
        goto L_0x00cc;
    L_0x00ae:
        r8.z = r2;
        r9 = r8.j;
        r9.performClick();
        goto L_0x00cc;
    L_0x00b6:
        r0 = r8.s;
        r2 = r8.i;
        r0.set(r2);
        r0 = r8.t;
        r2 = r9.getX();
        r9 = r9.getY();
        r0.set(r2, r9);
        r8.z = r1;
    L_0x00cc:
        r9 = r8.j;
        r0 = r8.i;
        r9.setImageMatrix(r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.livecreation.ui.view.CropView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onMeasure(int i, int i2) {
        Rect rect = new Rect(0, 0, MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
        rect.sort();
        int dimension = (int) getResources().getDimension(R.dimen.lc_crop_rectangle_margin);
        int width = rect.width() - dimension;
        int height = rect.height() - dimension;
        if (width > 0 && height > 0) {
            double d = (double) width;
            double d2 = (double) height;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            double d4 = (double) this.k;
            double d5 = (double) this.l;
            Double.isNaN(d4);
            Double.isNaN(d5);
            d4 /= d5;
            if (d3 > d4) {
                Double.isNaN(d2);
                width = (int) (d2 * d4);
            } else if (d3 < d4) {
                Double.isNaN(d);
                height = (int) (d / d4);
            }
            LayoutParams layoutParams = this.p.getLayoutParams();
            layoutParams.height = height;
            layoutParams.width = width;
            this.p.setLayoutParams(layoutParams);
            this.p.setVisibility(0);
            dimension = this.m;
            if (((float) dimension) > 0.0f && this.k > dimension) {
                dimension = (width - ((dimension * height) / this.l)) / 2;
                LayoutParams layoutParams2 = this.q.getLayoutParams();
                layoutParams2.width = dimension;
                this.q.setLayoutParams(layoutParams2);
                this.q.setVisibility(0);
                layoutParams2 = this.r.getLayoutParams();
                layoutParams2.width = dimension;
                this.r.setLayoutParams(layoutParams2);
                this.r.setVisibility(0);
            }
            dimension = this.b;
            int i3 = this.c;
            d = (double) dimension;
            d2 = (double) i3;
            Double.isNaN(d);
            Double.isNaN(d2);
            d /= d2;
            if (d > d4) {
                width = (dimension * height) / i3;
            } else if (d < d4) {
                height = (i3 * width) / dimension;
            }
            width /= 2;
            height /= 2;
            this.o = new Rect(rect.centerX() - width, rect.centerY() - height, rect.centerX() + width, rect.centerY() + height);
            if (this.a != null) {
                b();
                this.j.setImageMatrix(this.i);
            }
        } else {
            xtl.c("Crop rectangle width and height must be positive.");
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0100 A:{SKIP} */
    private final void b() {
        /*
        r13 = this;
        r0 = r13.c();
        r1 = r13.d;
        r2 = 0;
        r3 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        if (r1 > 0) goto L_0x000f;
    L_0x000b:
        r1 = r13.e;
        if (r1 <= 0) goto L_0x005c;
    L_0x000f:
        r1 = r13.a();
        r5 = r13.d;
        r6 = r1.width();
        if (r5 < r6) goto L_0x002d;
    L_0x001b:
        r5 = r13.d;
        r5 = (double) r5;
        r7 = r1.width();
        r7 = (double) r7;
        java.lang.Double.isNaN(r5);
        java.lang.Double.isNaN(r7);
        r5 = r5 / r7;
        r13.y = r2;
        goto L_0x002e;
    L_0x002d:
        r5 = r3;
    L_0x002e:
        r7 = r13.e;
        r8 = r1.height();
        if (r7 < r8) goto L_0x004b;
    L_0x0036:
        r7 = r13.e;
        r7 = (double) r7;
        r1 = r1.height();
        r9 = (double) r1;
        java.lang.Double.isNaN(r7);
        java.lang.Double.isNaN(r9);
        r7 = r7 / r9;
        r5 = java.lang.Math.min(r5, r7);
        r13.y = r2;
    L_0x004b:
        r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r1 >= 0) goto L_0x005c;
    L_0x004f:
        r1 = r13.x;
        if (r1 == 0) goto L_0x005c;
    L_0x0053:
        r0 = r13.i;
        a(r0, r5);
        r0 = r13.c();
    L_0x005c:
        r1 = r13.o;
        r1 = r1.width();
        r5 = r0.width();
        r6 = 1;
        if (r1 < r5) goto L_0x007f;
    L_0x0069:
        r1 = r13.o;
        r1 = r1.width();
        r7 = (double) r1;
        r1 = r0.width();
        r9 = (double) r1;
        java.lang.Double.isNaN(r7);
        java.lang.Double.isNaN(r9);
        r7 = r7 / r9;
        r13.x = r6;
        goto L_0x0080;
    L_0x007f:
        r7 = r3;
    L_0x0080:
        r1 = r13.o;
        r1 = r1.height();
        r5 = r0.height();
        if (r1 < r5) goto L_0x00a5;
    L_0x008c:
        r1 = r13.o;
        r1 = r1.height();
        r9 = (double) r1;
        r1 = r0.height();
        r11 = (double) r1;
        java.lang.Double.isNaN(r9);
        java.lang.Double.isNaN(r11);
        r9 = r9 / r11;
        r7 = java.lang.Math.max(r7, r9);
        r13.x = r6;
    L_0x00a5:
        r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r1 <= 0) goto L_0x00b6;
    L_0x00a9:
        r1 = r13.y;
        if (r1 == 0) goto L_0x00b6;
    L_0x00ad:
        r0 = r13.i;
        a(r0, r7);
        r0 = r13.c();
    L_0x00b6:
        r1 = r13.o;
        r1 = r0.contains(r1);
        if (r1 != 0) goto L_0x0109;
    L_0x00be:
        r1 = r13.o;
        r1 = r1.left;
        r3 = r0.left;
        if (r1 >= r3) goto L_0x00ce;
    L_0x00c6:
        r1 = r13.o;
        r1 = r1.left;
        r3 = r0.left;
    L_0x00cc:
        r1 = r1 - r3;
        goto L_0x00de;
    L_0x00ce:
        r1 = r13.o;
        r1 = r1.right;
        r3 = r0.right;
        if (r1 <= r3) goto L_0x00dd;
    L_0x00d6:
        r1 = r13.o;
        r1 = r1.right;
        r3 = r0.right;
        goto L_0x00cc;
    L_0x00dd:
        r1 = 0;
    L_0x00de:
        r3 = r13.o;
        r3 = r3.top;
        r4 = r0.top;
        if (r3 >= r4) goto L_0x00ee;
    L_0x00e6:
        r2 = r13.o;
        r2 = r2.top;
        r0 = r0.top;
    L_0x00ec:
        r2 = r2 - r0;
        goto L_0x00fd;
    L_0x00ee:
        r3 = r13.o;
        r3 = r3.bottom;
        r4 = r0.bottom;
        if (r3 <= r4) goto L_0x00fd;
    L_0x00f6:
        r2 = r13.o;
        r2 = r2.bottom;
        r0 = r0.bottom;
        goto L_0x00ec;
    L_0x00fd:
        if (r1 == 0) goto L_0x0100;
    L_0x00ff:
        goto L_0x0102;
    L_0x0100:
        if (r2 == 0) goto L_0x0109;
    L_0x0102:
        r0 = r13.i;
        r1 = (float) r1;
        r2 = (float) r2;
        r0.postTranslate(r1, r2);
    L_0x0109:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.livecreation.ui.view.CropView.b():void");
    }

    private final Rect c() {
        this.i.getValues(this.w);
        int ceil = (int) Math.ceil((double) this.w[2]);
        int ceil2 = (int) Math.ceil((double) this.w[5]);
        float[] fArr = this.w;
        double floor = Math.floor((double) ((fArr[0] * ((float) this.g)) + (fArr[3] * ((float) this.h))));
        float[] fArr2 = this.w;
        Rect rect = new Rect(ceil, ceil2, ((int) floor) + ceil, ((int) Math.floor((double) ((fArr2[4] * ((float) this.h)) + (fArr2[1] * ((float) this.g))))) + ceil2);
        rect.sort();
        return rect;
    }

    public final Rect a() {
        Rect rect = new Rect(this.o);
        Rect c = c();
        rect.offset(-c.left, -c.top);
        double intValue = (double) ((Integer) this.f.first).intValue();
        double width = (double) c.width();
        Double.isNaN(intValue);
        Double.isNaN(width);
        intValue /= width;
        width = (double) rect.left;
        Double.isNaN(width);
        int i = (int) (width * intValue);
        width = (double) rect.top;
        Double.isNaN(width);
        int i2 = (int) (width * intValue);
        double width2 = (double) rect.width();
        Double.isNaN(width2);
        int max = Math.max(1, (int) (width2 * intValue)) + i;
        double height = (double) rect.height();
        Double.isNaN(height);
        rect.set(i, i2, max, Math.max(1, (int) (height * intValue)) + i2);
        return rect;
    }

    private static void a(Matrix matrix, double d) {
        float f = (float) d;
        matrix.postScale(f, f);
    }
}
