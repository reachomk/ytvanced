package defpackage;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pkl */
public final class pkl extends qou {
    public static final Creator CREATOR = new pqr();
    public float a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i;
    public int j;
    public int k;
    public JSONObject l;
    private String m;

    pkl(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, int i9, String str2) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = str;
        this.j = i8;
        this.k = i9;
        this.m = str2;
        String str3 = this.m;
        if (str3 != null) {
            try {
                this.l = new JSONObject(str3);
                return;
            } catch (JSONException unused) {
                this.l = null;
                this.m = null;
                return;
            }
        }
        this.l = null;
    }

    public pkl() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }

    public final void a(int i) {
        if (i < 0 || i > 4) {
            throw new IllegalArgumentException("invalid edgeType");
        }
        this.d = i;
    }

    public final void b(int i) {
        if (i < 0 || i > 6) {
            throw new IllegalArgumentException("invalid fontGenericFamily");
        }
        this.j = i;
    }

    public final org.json.JSONObject a() {
        /*
        r8 = this;
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = "fontScale";
        r2 = r8.a;	 Catch:{ JSONException -> 0x00fb }
        r2 = (double) r2;	 Catch:{ JSONException -> 0x00fb }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x00fb }
        r1 = r8.b;	 Catch:{ JSONException -> 0x00fb }
        if (r1 == 0) goto L_0x001a;
    L_0x0011:
        r2 = "foregroundColor";
        r1 = defpackage.pkl.c(r1);	 Catch:{ JSONException -> 0x00fb }
        r0.put(r2, r1);	 Catch:{ JSONException -> 0x00fb }
    L_0x001a:
        r1 = r8.c;	 Catch:{ JSONException -> 0x00fb }
        if (r1 == 0) goto L_0x0027;
    L_0x001e:
        r2 = "backgroundColor";
        r1 = defpackage.pkl.c(r1);	 Catch:{ JSONException -> 0x00fb }
        r0.put(r2, r1);	 Catch:{ JSONException -> 0x00fb }
    L_0x0027:
        r1 = r8.d;	 Catch:{ JSONException -> 0x00fb }
        r2 = "NONE";
        r3 = 3;
        r4 = 1;
        r5 = 2;
        r6 = "edgeType";
        if (r1 == 0) goto L_0x0054;
    L_0x0032:
        if (r1 == r4) goto L_0x004e;
    L_0x0034:
        if (r1 == r5) goto L_0x0048;
    L_0x0036:
        if (r1 == r3) goto L_0x0042;
    L_0x0038:
        r7 = 4;
        if (r1 == r7) goto L_0x003c;
    L_0x003b:
        goto L_0x0057;
    L_0x003c:
        r1 = "DEPRESSED";
        r0.put(r6, r1);	 Catch:{ JSONException -> 0x00fb }
        goto L_0x0057;
    L_0x0042:
        r1 = "RAISED";
        r0.put(r6, r1);	 Catch:{ JSONException -> 0x00fb }
        goto L_0x0057;
    L_0x0048:
        r1 = "DROP_SHADOW";
        r0.put(r6, r1);	 Catch:{ JSONException -> 0x00fb }
        goto L_0x0057;
    L_0x004e:
        r1 = "OUTLINE";
        r0.put(r6, r1);	 Catch:{ JSONException -> 0x00fb }
        goto L_0x0057;
    L_0x0054:
        r0.put(r6, r2);	 Catch:{ JSONException -> 0x00fb }
    L_0x0057:
        r1 = r8.e;	 Catch:{ JSONException -> 0x00fb }
        if (r1 == 0) goto L_0x0064;
    L_0x005b:
        r6 = "edgeColor";
        r1 = defpackage.pkl.c(r1);	 Catch:{ JSONException -> 0x00fb }
        r0.put(r6, r1);	 Catch:{ JSONException -> 0x00fb }
    L_0x0064:
        r1 = r8.f;	 Catch:{ JSONException -> 0x00fb }
        r6 = "NORMAL";
        r7 = "windowType";
        if (r1 == 0) goto L_0x007b;
    L_0x006c:
        if (r1 == r4) goto L_0x0077;
    L_0x006e:
        if (r1 == r5) goto L_0x0071;
    L_0x0070:
        goto L_0x007e;
    L_0x0071:
        r1 = "ROUNDED_CORNERS";
        r0.put(r7, r1);	 Catch:{ JSONException -> 0x00fb }
        goto L_0x007e;
    L_0x0077:
        r0.put(r7, r6);	 Catch:{ JSONException -> 0x00fb }
        goto L_0x007e;
    L_0x007b:
        r0.put(r7, r2);	 Catch:{ JSONException -> 0x00fb }
    L_0x007e:
        r1 = r8.g;	 Catch:{ JSONException -> 0x00fb }
        if (r1 == 0) goto L_0x008b;
    L_0x0082:
        r2 = "windowColor";
        r1 = defpackage.pkl.c(r1);	 Catch:{ JSONException -> 0x00fb }
        r0.put(r2, r1);	 Catch:{ JSONException -> 0x00fb }
    L_0x008b:
        r1 = r8.f;	 Catch:{ JSONException -> 0x00fb }
        if (r1 != r5) goto L_0x0096;
    L_0x008f:
        r1 = "windowRoundedCornerRadius";
        r2 = r8.h;	 Catch:{ JSONException -> 0x00fb }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x00fb }
    L_0x0096:
        r1 = r8.i;	 Catch:{ JSONException -> 0x00fb }
        if (r1 == 0) goto L_0x009f;
    L_0x009a:
        r2 = "fontFamily";
        r0.put(r2, r1);	 Catch:{ JSONException -> 0x00fb }
    L_0x009f:
        r1 = r8.j;	 Catch:{ JSONException -> 0x00fb }
        r2 = "fontGenericFamily";
        switch(r1) {
            case 0: goto L_0x00cb;
            case 1: goto L_0x00c5;
            case 2: goto L_0x00bf;
            case 3: goto L_0x00b9;
            case 4: goto L_0x00b3;
            case 5: goto L_0x00ad;
            case 6: goto L_0x00a7;
            default: goto L_0x00a6;
        };
    L_0x00a6:
        goto L_0x00d0;
    L_0x00a7:
        r1 = "SMALL_CAPITALS";
        r0.put(r2, r1);	 Catch:{ JSONException -> 0x00fb }
        goto L_0x00d0;
    L_0x00ad:
        r1 = "CURSIVE";
        r0.put(r2, r1);	 Catch:{ JSONException -> 0x00fb }
        goto L_0x00d0;
    L_0x00b3:
        r1 = "CASUAL";
        r0.put(r2, r1);	 Catch:{ JSONException -> 0x00fb }
        goto L_0x00d0;
    L_0x00b9:
        r1 = "MONOSPACED_SERIF";
        r0.put(r2, r1);	 Catch:{ JSONException -> 0x00fb }
        goto L_0x00d0;
    L_0x00bf:
        r1 = "SERIF";
        r0.put(r2, r1);	 Catch:{ JSONException -> 0x00fb }
        goto L_0x00d0;
    L_0x00c5:
        r1 = "MONOSPACED_SANS_SERIF";
        r0.put(r2, r1);	 Catch:{ JSONException -> 0x00fb }
        goto L_0x00d0;
    L_0x00cb:
        r1 = "SANS_SERIF";
        r0.put(r2, r1);	 Catch:{ JSONException -> 0x00fb }
    L_0x00d0:
        r1 = r8.k;	 Catch:{ JSONException -> 0x00fb }
        r2 = "fontStyle";
        if (r1 == 0) goto L_0x00ef;
    L_0x00d6:
        if (r1 == r4) goto L_0x00e9;
    L_0x00d8:
        if (r1 == r5) goto L_0x00e3;
    L_0x00da:
        if (r1 == r3) goto L_0x00dd;
    L_0x00dc:
        goto L_0x00f2;
    L_0x00dd:
        r1 = "BOLD_ITALIC";
        r0.put(r2, r1);	 Catch:{ JSONException -> 0x00fb }
        goto L_0x00f2;
    L_0x00e3:
        r1 = "ITALIC";
        r0.put(r2, r1);	 Catch:{ JSONException -> 0x00fb }
        goto L_0x00f2;
    L_0x00e9:
        r1 = "BOLD";
        r0.put(r2, r1);	 Catch:{ JSONException -> 0x00fb }
        goto L_0x00f2;
    L_0x00ef:
        r0.put(r2, r6);	 Catch:{ JSONException -> 0x00fb }
    L_0x00f2:
        r1 = r8.l;	 Catch:{ JSONException -> 0x00fb }
        if (r1 == 0) goto L_0x00fb;
    L_0x00f6:
        r2 = "customData";
        r0.put(r2, r1);	 Catch:{ JSONException -> 0x00fb }
    L_0x00fb:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pkl.a():org.json.JSONObject");
    }

    private static String c(int i) {
        return String.format("#%02X%02X%02X%02X", new Object[]{Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i))});
    }

    public static int a(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pkl) {
            pkl pkl = (pkl) obj;
            JSONObject jSONObject = this.l;
            Object obj2 = jSONObject != null ? null : 1;
            JSONObject jSONObject2 = pkl.l;
            return obj2 == (jSONObject2 != null ? null : 1) && ((jSONObject == null || jSONObject2 == null || qbg.a(jSONObject, jSONObject2)) && this.a == pkl.a && this.b == pkl.b && this.c == pkl.c && this.d == pkl.d && this.e == pkl.e && this.f == pkl.f && this.h == pkl.h && ppj.a(this.i, pkl.i) && this.j == pkl.j && this.k == pkl.k);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), this.i, Integer.valueOf(this.j), Integer.valueOf(this.k), String.valueOf(this.l)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.l;
        this.m = jSONObject != null ? jSONObject.toString() : null;
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.b(parcel, 3, this.b);
        qov.b(parcel, 4, this.c);
        qov.b(parcel, 5, this.d);
        qov.b(parcel, 6, this.e);
        qov.b(parcel, 7, this.f);
        qov.b(parcel, 8, this.g);
        qov.b(parcel, 9, this.h);
        qov.a(parcel, 10, this.i);
        qov.b(parcel, 11, this.j);
        qov.b(parcel, 12, this.k);
        qov.a(parcel, 13, this.m);
        qov.a(parcel, i);
    }
}
