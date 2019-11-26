package defpackage;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: boq */
final class boq {
    static int a(JsonReader jsonReader) {
        jsonReader.beginArray();
        int nextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(255, nextDouble, nextDouble2, nextDouble3);
    }

    static List a(JsonReader jsonReader, float f) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(boq.b(jsonReader, f));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    static android.graphics.PointF b(android.util.JsonReader r6, float r7) {
        /*
        r0 = defpackage.bop.a;
        r1 = r6.peek();
        r1 = r1.ordinal();
        r0 = r0[r1];
        r1 = 1;
        if (r0 == r1) goto L_0x00a6;
    L_0x000f:
        r2 = 2;
        if (r0 == r2) goto L_0x0080;
    L_0x0012:
        r2 = 3;
        if (r0 != r2) goto L_0x0065;
    L_0x0015:
        r6.beginObject();
        r0 = 0;
        r2 = 0;
    L_0x001a:
        r3 = r6.hasNext();
        if (r3 == 0) goto L_0x0058;
    L_0x0020:
        r3 = r6.nextName();
        r4 = r3.hashCode();
        r5 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        if (r4 == r5) goto L_0x003b;
    L_0x002c:
        r5 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        if (r4 == r5) goto L_0x0031;
    L_0x0030:
        goto L_0x0045;
    L_0x0031:
        r4 = "y";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0045;
    L_0x0039:
        r3 = 1;
        goto L_0x0046;
    L_0x003b:
        r4 = "x";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0045;
    L_0x0043:
        r3 = 0;
        goto L_0x0046;
    L_0x0045:
        r3 = -1;
    L_0x0046:
        if (r3 == 0) goto L_0x0053;
    L_0x0048:
        if (r3 == r1) goto L_0x004e;
    L_0x004a:
        r6.skipValue();
        goto L_0x001a;
    L_0x004e:
        r2 = defpackage.boq.b(r6);
        goto L_0x001a;
    L_0x0053:
        r0 = defpackage.boq.b(r6);
        goto L_0x001a;
    L_0x0058:
        r6.endObject();
        r6 = new android.graphics.PointF;
        r0 = r0 * r7;
        r2 = r2 * r7;
        r6.<init>(r0, r2);
        return r6;
    L_0x0065:
        r7 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Unknown point starts with ";
        r0.append(r1);
        r6 = r6.peek();
        r0.append(r6);
        r6 = r0.toString();
        r7.<init>(r6);
        throw r7;
    L_0x0080:
        r6.beginArray();
        r0 = r6.nextDouble();
        r0 = (float) r0;
        r1 = r6.nextDouble();
        r1 = (float) r1;
    L_0x008d:
        r2 = r6.peek();
        r3 = android.util.JsonToken.END_ARRAY;
        if (r2 == r3) goto L_0x0099;
    L_0x0095:
        r6.skipValue();
        goto L_0x008d;
    L_0x0099:
        r6.endArray();
        r6 = new android.graphics.PointF;
        r0 = r0 * r7;
        r1 = r1 * r7;
        r6.<init>(r0, r1);
        return r6;
    L_0x00a6:
        r0 = r6.nextDouble();
        r0 = (float) r0;
        r1 = r6.nextDouble();
        r1 = (float) r1;
    L_0x00b0:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x00ba;
    L_0x00b6:
        r6.skipValue();
        goto L_0x00b0;
    L_0x00ba:
        r6 = new android.graphics.PointF;
        r0 = r0 * r7;
        r1 = r1 * r7;
        r6.<init>(r0, r1);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boq.b(android.util.JsonReader, float):android.graphics.PointF");
    }

    static float b(JsonReader jsonReader) {
        JsonToken peek = jsonReader.peek();
        int i = bop.a[peek.ordinal()];
        if (i == 1) {
            return (float) jsonReader.nextDouble();
        }
        if (i == 2) {
            jsonReader.beginArray();
            float nextDouble = (float) jsonReader.nextDouble();
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            jsonReader.endArray();
            return nextDouble;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown value for token of type ");
        stringBuilder.append(peek);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
