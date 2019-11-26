package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import java.util.ArrayList;

/* renamed from: bof */
public final class bof {
    public static bmp a(JsonReader jsonReader, bjj bjj) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(new blr(bjj, bos.a(jsonReader, bjj, bpg.a(), bot.a, jsonReader.peek() == JsonToken.BEGIN_OBJECT)));
            }
            jsonReader.endArray();
            bor.a(arrayList);
        } else {
            arrayList.add(new bpf(boq.b(jsonReader, bpg.a())));
        }
        return new bmp(arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    static defpackage.bmx b(android.util.JsonReader r10, defpackage.bjj r11) {
        /*
        r10.beginObject();
        r0 = 0;
        r1 = 0;
        r2 = r1;
        r3 = r2;
        r4 = r3;
        r1 = 0;
    L_0x0009:
        r5 = r10.peek();
        r6 = android.util.JsonToken.END_OBJECT;
        if (r5 == r6) goto L_0x0079;
    L_0x0011:
        r5 = r10.nextName();
        r6 = r5.hashCode();
        r7 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r8 = 2;
        r9 = 1;
        if (r6 == r7) goto L_0x003c;
    L_0x001f:
        r7 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        if (r6 == r7) goto L_0x0032;
    L_0x0023:
        r7 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        if (r6 == r7) goto L_0x0028;
    L_0x0027:
        goto L_0x0046;
    L_0x0028:
        r6 = "y";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0046;
    L_0x0030:
        r5 = 2;
        goto L_0x0047;
    L_0x0032:
        r6 = "x";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0046;
    L_0x003a:
        r5 = 1;
        goto L_0x0047;
    L_0x003c:
        r6 = "k";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0046;
    L_0x0044:
        r5 = 0;
        goto L_0x0047;
    L_0x0046:
        r5 = -1;
    L_0x0047:
        if (r5 == 0) goto L_0x0074;
    L_0x0049:
        if (r5 == r9) goto L_0x0062;
    L_0x004b:
        if (r5 == r8) goto L_0x0051;
    L_0x004d:
        r10.skipValue();
        goto L_0x0009;
    L_0x0051:
        r5 = r10.peek();
        r6 = android.util.JsonToken.STRING;
        if (r5 != r6) goto L_0x005d;
    L_0x0059:
        r10.skipValue();
        goto L_0x006d;
    L_0x005d:
        r4 = defpackage.boh.a(r10, r11);
        goto L_0x0009;
    L_0x0062:
        r5 = r10.peek();
        r6 = android.util.JsonToken.STRING;
        if (r5 != r6) goto L_0x006f;
    L_0x006a:
        r10.skipValue();
    L_0x006d:
        r1 = 1;
        goto L_0x0009;
    L_0x006f:
        r3 = defpackage.boh.a(r10, r11);
        goto L_0x0009;
    L_0x0074:
        r2 = defpackage.bof.a(r10, r11);
        goto L_0x0009;
    L_0x0079:
        r10.endObject();
        if (r1 == 0) goto L_0x0083;
    L_0x007e:
        r10 = "Lottie doesn't support expressions.";
        r11.a(r10);
    L_0x0083:
        if (r2 != 0) goto L_0x008b;
    L_0x0085:
        r10 = new bmt;
        r10.<init>(r3, r4);
        return r10;
    L_0x008b:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bof.b(android.util.JsonReader, bjj):bmx");
    }
}
