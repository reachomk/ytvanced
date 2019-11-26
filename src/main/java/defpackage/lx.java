package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: lx */
public final class lx implements Interpolator {
    private float[] a;
    private float[] b;

    public lx(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = sd.a(context.getResources(), context.getTheme(), attributeSet, lm.l);
        String str = "pathData";
        if (sd.a(xmlPullParser, str)) {
            str = sd.b(a, xmlPullParser, str, 4);
            Path a2 = se.a(str);
            if (a2 != null) {
                a(a2);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("The path is null, which is created from ");
                stringBuilder.append(str);
                throw new InflateException(stringBuilder.toString());
            }
        }
        str = "controlX1";
        if (sd.a(xmlPullParser, str)) {
            String str2 = "controlY1";
            if (sd.a(xmlPullParser, str2)) {
                float a3 = sd.a(a, xmlPullParser, str, 0, 0.0f);
                float a4 = sd.a(a, xmlPullParser, str2, 1, 0.0f);
                str = "controlX2";
                boolean a5 = sd.a(xmlPullParser, str);
                String str3 = "controlY2";
                Path path;
                if (a5 != sd.a(xmlPullParser, str3)) {
                    throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
                } else if (a5) {
                    float a6 = sd.a(a, xmlPullParser, str, 2, 0.0f);
                    float a7 = sd.a(a, xmlPullParser, str3, 3, 0.0f);
                    path = new Path();
                    path.moveTo(0.0f, 0.0f);
                    path.cubicTo(a3, a4, a6, a7, 1.0f, 1.0f);
                    a(path);
                } else {
                    path = new Path();
                    path.moveTo(0.0f, 0.0f);
                    path.quadTo(a3, a4, 1.0f, 1.0f);
                    a(path);
                }
            } else {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
        }
        throw new InflateException("pathInterpolator requires the controlX1 attribute");
        a.recycle();
    }

    private final void a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        StringBuilder stringBuilder;
        if (min > 0) {
            int i2;
            this.a = new float[min];
            this.b = new float[min];
            float[] fArr = new float[2];
            for (i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, null);
                this.a[i2] = fArr[0];
                this.b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.a[0])) <= 1.0E-5d && ((double) Math.abs(this.b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.a[i3] - 4.0f)) <= 1.0E-5d && ((double) Math.abs(this.b[i3] - 4.0f)) <= 1.0E-5d) {
                    i3 = 0;
                    float f = 0.0f;
                    while (i < min) {
                        fArr = this.a;
                        i2 = i3 + 1;
                        length = fArr[i3];
                        if (length >= f) {
                            fArr[i] = length;
                            i++;
                            f = length;
                            i3 = i2;
                        } else {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("The Path cannot loop back on itself, x :");
                            stringBuilder.append(length);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("The Path must start at (0,0) and end at (1,1) start: ");
            stringBuilder2.append(this.a[0]);
            String str = ",";
            stringBuilder2.append(str);
            stringBuilder2.append(this.b[0]);
            stringBuilder2.append(" end:");
            min--;
            stringBuilder2.append(this.a[min]);
            stringBuilder2.append(str);
            stringBuilder2.append(this.b[min]);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("The Path has a invalid length ");
        stringBuilder.append(length);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        float f2;
        int length = this.a.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            f2 = this.a[i2];
            if (f < f2) {
                length = i2;
            }
            if (f >= f2) {
                i = i2;
            }
        }
        float[] fArr = this.a;
        f2 = fArr[length];
        float f3 = fArr[i];
        f2 -= f3;
        if (f2 == 0.0f) {
            return this.b[i];
        }
        float[] fArr2 = this.b;
        float f4 = fArr2[i];
        return f4 + (((f - f3) / f2) * (fArr2[length] - f4));
    }
}
