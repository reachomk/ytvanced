package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout.LayoutParams;

/* renamed from: gpw */
final /* synthetic */ class gpw implements OnGlobalLayoutListener {
    private final gpt a;
    private final View b;

    gpw(gpt gpt, View view) {
        this.a = gpt;
        this.b = view;
    }

    public final void onGlobalLayout() {
        gpt gpt = this.a;
        View view = this.b;
        gpt.f.getViewTreeObserver().removeOnGlobalLayoutListener(gpt.h);
        gpt.j = view.getWidth();
        gpt.k = view.getHeight();
        gpt.f.removeView(view);
        for (awgc awgc : gpt.g.a) {
            if (gpt.a(awgc) != null) {
                gpt.a(awgc.e);
                for (azbf azbf : awgc.b) {
                    int measuredWidth = gpt.f.getMeasuredWidth();
                    int measuredHeight = gpt.f.getMeasuredHeight();
                    float[] fArr = new float[azbf.a.size()];
                    amqw.b(fArr.length == 9);
                    int i = 0;
                    for (Float floatValue : azbf.a) {
                        int i2 = i + 1;
                        fArr[i] = floatValue.floatValue();
                        i = i2;
                    }
                    float f = (float) measuredWidth;
                    float f2 = f / 0.5625f;
                    Matrix matrix = new Matrix();
                    matrix.setValues(fArr);
                    Matrix matrix2 = new Matrix();
                    matrix2.setScale(f, f2);
                    Matrix matrix3 = new Matrix();
                    matrix3.setTranslate(0.0f, (((float) measuredHeight) - f2) / 2.0f);
                    matrix.postConcat(matrix2);
                    matrix.postConcat(matrix3);
                    float[] fArr2 = new float[9];
                    matrix.getValues(fArr2);
                    View view2 = new View(gpt.c);
                    view2.setTranslationX(fArr2[2]);
                    view2.setTranslationY(fArr2[5]);
                    view2.setPivotX(0.0f);
                    view2.setPivotY(0.0f);
                    view2.setRotation((float) (Math.atan2((double) fArr2[3], (double) fArr2[0]) * 57.29577951308232d));
                    view2.setLayoutParams(new LayoutParams(Math.round((float) Math.hypot((double) fArr2[0], (double) fArr2[3])), Math.round((float) Math.hypot((double) fArr2[4], (double) fArr2[1]))));
                    view2.setOnClickListener(new gpv(gpt, awgc));
                    if (gpt.e.b() != null) {
                        azaa azaa = gpt.e.b().s;
                        if (azaa == null) {
                            azaa = azaa.j;
                        }
                        if (azaa.e) {
                            view2.setBackgroundColor(1358888960);
                        }
                    }
                    view2.setContentDescription(awgc.d);
                    gpt.f.addView(view2);
                }
            }
        }
    }
}
