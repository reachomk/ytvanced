package defpackage;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import java.util.ArrayList;

/* renamed from: boo */
public final class boo implements box {
    private int a;

    public boo(int i) {
        this.a = i;
    }

    public final /* synthetic */ Object a(JsonReader jsonReader, float f) {
        int i;
        double floatValue;
        ArrayList arrayList = new ArrayList();
        JsonToken peek = jsonReader.peek();
        JsonToken jsonToken = JsonToken.BEGIN_ARRAY;
        if (peek == jsonToken) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (peek == jsonToken) {
            jsonReader.endArray();
        }
        int i2 = this.a;
        if (i2 == -1) {
            i2 = arrayList.size() / 4;
            this.a = i2;
        }
        float[] fArr = new float[i2];
        int[] iArr = new int[i2];
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < (this.a << 2); i5++) {
            i = i5 / 4;
            floatValue = (double) ((Float) arrayList.get(i5)).floatValue();
            int i6 = i5 % 4;
            if (i6 == 0) {
                fArr[i] = (float) floatValue;
            } else if (i6 == 1) {
                Double.isNaN(floatValue);
                i4 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                Double.isNaN(floatValue);
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                Double.isNaN(floatValue);
                iArr[i] = Color.argb(255, i4, i3, (int) (floatValue * 255.0d));
            }
        }
        bnb bnb = new bnb(fArr, iArr);
        i2 = this.a << 2;
        if (arrayList.size() > i2) {
            int size = (arrayList.size() - i2) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            i3 = 0;
            while (i2 < arrayList.size()) {
                if (i2 % 2 == 0) {
                    dArr[i3] = (double) ((Float) arrayList.get(i2)).floatValue();
                } else {
                    dArr2[i3] = (double) ((Float) arrayList.get(i2)).floatValue();
                    i3++;
                }
                i2++;
            }
            for (int i7 = 0; i7 < bnb.a(); i7++) {
                i2 = bnb.b[i7];
                double d = (double) bnb.a[i7];
                for (i = 1; i < dArr.length; i++) {
                    int i8 = i - 1;
                    floatValue = dArr[i8];
                    double d2 = dArr[i];
                    if (d2 >= d) {
                        double d3 = dArr2[i8];
                        double d4 = dArr2[i];
                        Double.isNaN(d);
                        d = bpd.a(d3, d4, (d - floatValue) / (d2 - floatValue));
                        break;
                    }
                }
                d = dArr2[dArr2.length - 1];
                bnb.b[i7] = Color.argb((int) (d * 255.0d), Color.red(i2), Color.green(i2), Color.blue(i2));
            }
        }
        return bnb;
    }
}
