package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: olu */
public final class olu implements oll {
    public static final Creator CREATOR = new olx();
    public final int a;
    public final int b;
    private final String c;
    private final String d;
    private final String e;
    private final boolean f;

    /* JADX WARNING: Removed duplicated region for block: B:65:0x010c A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010c A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010c A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010c A:{RETURN} */
    public static defpackage.olu a(java.util.Map r13) {
        /*
        r0 = "Invalid metadata interval: ";
        r1 = "icy-br";
        r1 = r13.get(r1);
        r1 = (java.util.List) r1;
        r2 = "IcyHeaders";
        r3 = 1;
        r4 = -1;
        r5 = 0;
        if (r1 == 0) goto L_0x005b;
    L_0x0011:
        r1 = r1.get(r5);
        r1 = (java.lang.String) r1;
        r6 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x003e }
        r6 = r6 * 1000;
        if (r6 > 0) goto L_0x003b;
    L_0x001f:
        r7 = "Invalid bitrate: ";
        r8 = java.lang.String.valueOf(r1);	 Catch:{ NumberFormatException -> 0x003f }
        r9 = r8.length();	 Catch:{ NumberFormatException -> 0x003f }
        if (r9 != 0) goto L_0x0031;
    L_0x002b:
        r8 = new java.lang.String;	 Catch:{ NumberFormatException -> 0x003f }
        r8.<init>(r7);	 Catch:{ NumberFormatException -> 0x003f }
        goto L_0x0035;
    L_0x0031:
        r8 = r7.concat(r8);	 Catch:{ NumberFormatException -> 0x003f }
    L_0x0035:
        defpackage.oyp.a(r2, r8);	 Catch:{ NumberFormatException -> 0x003f }
        r1 = 0;
        r6 = -1;
        goto L_0x003c;
    L_0x003b:
        r1 = 1;
    L_0x003c:
        r7 = r6;
        goto L_0x005d;
    L_0x003e:
        r6 = -1;
    L_0x003f:
        r1 = java.lang.String.valueOf(r1);
        r7 = "Invalid bitrate header: ";
        r8 = r1.length();
        if (r8 != 0) goto L_0x0051;
    L_0x004b:
        r1 = new java.lang.String;
        r1.<init>(r7);
        goto L_0x0055;
    L_0x0051:
        r1 = r7.concat(r1);
    L_0x0055:
        defpackage.oyp.a(r2, r1);
        r7 = r6;
        r1 = 0;
        goto L_0x005d;
    L_0x005b:
        r1 = 0;
        r7 = -1;
    L_0x005d:
        r6 = "icy-genre";
        r6 = r13.get(r6);
        r6 = (java.util.List) r6;
        r8 = 0;
        if (r6 == 0) goto L_0x0071;
    L_0x0068:
        r1 = r6.get(r5);
        r1 = (java.lang.String) r1;
        r9 = r1;
        r1 = 1;
        goto L_0x0072;
    L_0x0071:
        r9 = r8;
    L_0x0072:
        r6 = "icy-name";
        r6 = r13.get(r6);
        r6 = (java.util.List) r6;
        if (r6 == 0) goto L_0x0085;
    L_0x007c:
        r1 = r6.get(r5);
        r1 = (java.lang.String) r1;
        r10 = r1;
        r1 = 1;
        goto L_0x0086;
    L_0x0085:
        r10 = r8;
    L_0x0086:
        r6 = "icy-url";
        r6 = r13.get(r6);
        r6 = (java.util.List) r6;
        if (r6 == 0) goto L_0x0099;
    L_0x0090:
        r1 = r6.get(r5);
        r1 = (java.lang.String) r1;
        r11 = r1;
        r1 = 1;
        goto L_0x009a;
    L_0x0099:
        r11 = r8;
    L_0x009a:
        r6 = "icy-pub";
        r6 = r13.get(r6);
        r6 = (java.util.List) r6;
        if (r6 == 0) goto L_0x00b3;
    L_0x00a4:
        r1 = r6.get(r5);
        r1 = (java.lang.String) r1;
        r6 = "1";
        r1 = r1.equals(r6);
        r12 = r1;
        r1 = 1;
        goto L_0x00b4;
    L_0x00b3:
        r12 = 0;
    L_0x00b4:
        r6 = "icy-metaint";
        r13 = r13.get(r6);
        r13 = (java.util.List) r13;
        if (r13 == 0) goto L_0x00fe;
    L_0x00be:
        r13 = r13.get(r5);
        r13 = (java.lang.String) r13;
        r5 = java.lang.Integer.parseInt(r13);	 Catch:{ NumberFormatException -> 0x00e7 }
        if (r5 > 0) goto L_0x00e4;
    L_0x00ca:
        r3 = java.lang.String.valueOf(r13);	 Catch:{ NumberFormatException -> 0x00e2 }
        r6 = r3.length();	 Catch:{ NumberFormatException -> 0x00e2 }
        if (r6 != 0) goto L_0x00da;
    L_0x00d4:
        r3 = new java.lang.String;	 Catch:{ NumberFormatException -> 0x00e2 }
        r3.<init>(r0);	 Catch:{ NumberFormatException -> 0x00e2 }
        goto L_0x00de;
    L_0x00da:
        r3 = r0.concat(r3);	 Catch:{ NumberFormatException -> 0x00e2 }
    L_0x00de:
        defpackage.oyp.a(r2, r3);	 Catch:{ NumberFormatException -> 0x00e2 }
        goto L_0x00fe;
    L_0x00e2:
        r4 = r5;
        goto L_0x00e7;
    L_0x00e4:
        r4 = r5;
        r1 = 1;
        goto L_0x00fe;
    L_0x00e7:
        r13 = java.lang.String.valueOf(r13);
        r3 = r13.length();
        if (r3 != 0) goto L_0x00f7;
    L_0x00f1:
        r13 = new java.lang.String;
        r13.<init>(r0);
        goto L_0x00fb;
    L_0x00f7:
        r13 = r0.concat(r13);
    L_0x00fb:
        defpackage.oyp.a(r2, r13);
    L_0x00fe:
        if (r1 == 0) goto L_0x010c;
    L_0x0100:
        r13 = new olu;
        r6 = r13;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r12 = r4;
        r6.<init>(r7, r8, r9, r10, r11, r12);
        return r13;
    L_0x010c:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.olu.a(java.util.Map):olu");
    }

    public final int describeContents() {
        return 0;
    }

    private olu(int i, String str, String str2, String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        oxz.a(z2);
        this.a = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.b = i2;
    }

    olu(Parcel parcel) {
        this.a = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = ozp.a(parcel);
        this.b = parcel.readInt();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            olu olu = (olu) obj;
            return this.a == olu.a && ozp.a(this.c, olu.c) && ozp.a(this.d, olu.d) && ozp.a(this.e, olu.e) && this.f == olu.f && this.b == olu.b;
        }
    }

    public final int hashCode() {
        int i = (this.a + 527) * 31;
        String str = this.c;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((((i + i2) * 31) + this.f) * 31) + this.b;
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.c;
        int i = this.a;
        int i2 = this.b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 80) + String.valueOf(str2).length());
        stringBuilder.append("IcyHeaders: name=\"");
        stringBuilder.append(str);
        stringBuilder.append("\", genre=\"");
        stringBuilder.append(str2);
        stringBuilder.append("\", bitrate=");
        stringBuilder.append(i);
        stringBuilder.append(", metadataInterval=");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        ozp.a(parcel, this.f);
        parcel.writeInt(this.b);
    }
}
