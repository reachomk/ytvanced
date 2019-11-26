package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: aafv */
public final class aafv implements ajth, Parcelable {
    public static final Creator CREATOR = new aafu();
    public final akcb a;
    public final String b;
    public final apxu c;
    public final List d;
    public aafn e;
    public akap f;
    public axip g;
    public ajya h;
    public aafl i;
    public ajxs j;
    private List k;
    private akbr l;
    private akbu m;
    private Object n;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01da  */
    public aafv(defpackage.akcb r13) {
        /*
        r12 = this;
        r12.<init>();
        r0 = defpackage.amqw.a(r13);
        r0 = (defpackage.akcb) r0;
        r12.a = r0;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r12.d = r0;
        r0 = r13.c;
        r12.c = r0;
        r0 = r12.c;
        r1 = 0;
        if (r0 == 0) goto L_0x0086;
    L_0x001b:
        r2 = com.google.protos.youtube.api.innertube.WatchEndpointOuterClass.watchEndpoint;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r0 = r0.h;
        r2 = r2.d;
        r0 = r0.a(r2);
        if (r0 != 0) goto L_0x0065;
    L_0x002e:
        r0 = r12.c;
        r2 = com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass.offlineWatchEndpoint;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r0 = r0.h;
        r2 = r2.d;
        r0 = r0.a(r2);
        if (r0 != 0) goto L_0x0044;
    L_0x0043:
        goto L_0x0086;
    L_0x0044:
        r0 = r12.c;
        r2 = com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass.offlineWatchEndpoint;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r0 = r0.h;
        r3 = r2.d;
        r0 = r0.b(r3);
        if (r0 != 0) goto L_0x005c;
    L_0x0059:
        r0 = r2.b;
        goto L_0x0060;
    L_0x005c:
        r0 = r2.a(r0);
    L_0x0060:
        r0 = (defpackage.avsc) r0;
        r0 = r0.b;
        goto L_0x0087;
    L_0x0065:
        r0 = r12.c;
        r2 = com.google.protos.youtube.api.innertube.WatchEndpointOuterClass.watchEndpoint;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r0 = r0.h;
        r3 = r2.d;
        r0 = r0.b(r3);
        if (r0 != 0) goto L_0x007d;
    L_0x007a:
        r0 = r2.b;
        goto L_0x0081;
    L_0x007d:
        r0 = r2.a(r0);
    L_0x0081:
        r0 = (defpackage.azje) r0;
        r0 = r0.b;
        goto L_0x0087;
    L_0x0086:
        r0 = r1;
    L_0x0087:
        r12.b = r0;
        r0 = r12.a;
        r0 = r0.a;
        if (r0 == 0) goto L_0x0093;
    L_0x008f:
        r0 = r0.a;
        r12.f = r0;
    L_0x0093:
        r0 = r12.f;
        r2 = 0;
        if (r0 != 0) goto L_0x009a;
    L_0x0098:
        goto L_0x0183;
    L_0x009a:
        r0 = r0.a;
        if (r0 == 0) goto L_0x0183;
    L_0x009e:
        r3 = r0.a;
        r0 = r0.b;
        r4 = new java.util.ArrayList;
        r4.<init>();
        r12.k = r4;
        if (r3 == 0) goto L_0x00fb;
    L_0x00ab:
        r0 = new aafn;
        r0.<init>(r3);
        r12.e = r0;
        r0 = r3.b;
        r3 = r0.length;
        r4 = 0;
    L_0x00b6:
        if (r4 >= r3) goto L_0x0183;
    L_0x00b8:
        r5 = r0[r4];
        r5 = r5.c;
        if (r5 == 0) goto L_0x00f8;
    L_0x00be:
        r5 = r5.b;
        r6 = r5.length;
        r7 = 0;
    L_0x00c2:
        if (r7 >= r6) goto L_0x00f8;
    L_0x00c4:
        r8 = r5[r7];
        r9 = r12.l;
        if (r9 != 0) goto L_0x00d1;
    L_0x00ca:
        r9 = r8.k;
        if (r9 == 0) goto L_0x00d1;
    L_0x00ce:
        r12.l = r9;
        goto L_0x00e6;
    L_0x00d1:
        r9 = r12.m;
        if (r9 != 0) goto L_0x00dc;
    L_0x00d5:
        r9 = r8.j;
        if (r9 == 0) goto L_0x00dc;
    L_0x00d9:
        r12.m = r9;
        goto L_0x00e6;
    L_0x00dc:
        r9 = r12.g;
        if (r9 != 0) goto L_0x00f5;
    L_0x00e0:
        r8 = r8.D;
        if (r8 == 0) goto L_0x00f5;
    L_0x00e4:
        r12.g = r8;
    L_0x00e6:
        r8 = r12.l;
        if (r8 != 0) goto L_0x00eb;
    L_0x00ea:
        goto L_0x00f5;
    L_0x00eb:
        r8 = r12.m;
        if (r8 == 0) goto L_0x00f5;
    L_0x00ef:
        r8 = r12.g;
        if (r8 == 0) goto L_0x00f5;
    L_0x00f3:
        goto L_0x0183;
    L_0x00f5:
        r7 = r7 + 1;
        goto L_0x00c2;
    L_0x00f8:
        r4 = r4 + 1;
        goto L_0x00b6;
    L_0x00fb:
        if (r0 == 0) goto L_0x0183;
    L_0x00fd:
        r0 = r0.a;
        r3 = r0.length;
        r4 = 0;
    L_0x0101:
        if (r4 >= r3) goto L_0x0183;
    L_0x0103:
        r5 = r0[r4];
        r6 = r5.b;
        if (r6 == 0) goto L_0x017f;
    L_0x0109:
        r7 = new aafp;
        r7.<init>(r6);
        r6 = r12.k;
        r6.add(r7);
        r6 = r7.a();
        if (r6 == 0) goto L_0x017f;
    L_0x0119:
        r6 = r7.a();
        r6 = r6.a();
        r6 = r6.iterator();
    L_0x0125:
        r7 = r6.hasNext();
        if (r7 == 0) goto L_0x0159;
    L_0x012b:
        r7 = r6.next();
        r8 = r7 instanceof defpackage.aafj;
        if (r8 == 0) goto L_0x0125;
    L_0x0133:
        r7 = (defpackage.aafj) r7;
        r7 = r7.a();
        r7 = r7.iterator();
    L_0x013d:
        r8 = r7.hasNext();
        if (r8 == 0) goto L_0x0125;
    L_0x0143:
        r8 = r7.next();
        r9 = r8 instanceof defpackage.akbr;
        if (r9 == 0) goto L_0x0150;
    L_0x014b:
        r9 = r8;
        r9 = (defpackage.akbr) r9;
        r12.l = r9;
    L_0x0150:
        r9 = r8 instanceof defpackage.akbu;
        if (r9 == 0) goto L_0x013d;
    L_0x0154:
        r8 = (defpackage.akbu) r8;
        r12.m = r8;
        goto L_0x013d;
    L_0x0159:
        r5 = r5.b;
        r5 = r5.d;
        r5 = r5.a;
        r5 = r5.b;
        r6 = r5.length;
        r7 = 0;
    L_0x0163:
        if (r7 >= r6) goto L_0x017f;
    L_0x0165:
        r8 = r5[r7];
        r8 = r8.c;
        if (r8 == 0) goto L_0x017c;
    L_0x016b:
        r8 = r8.b;
        r9 = r8.length;
        r10 = 0;
    L_0x016f:
        if (r10 >= r9) goto L_0x017c;
    L_0x0171:
        r11 = r8[r10];
        r11 = r11.D;
        if (r11 != 0) goto L_0x017a;
    L_0x0177:
        r10 = r10 + 1;
        goto L_0x016f;
    L_0x017a:
        r12.g = r11;
    L_0x017c:
        r7 = r7 + 1;
        goto L_0x0163;
    L_0x017f:
        r4 = r4 + 1;
        goto L_0x0101;
    L_0x0183:
        r0 = r12.f;
        if (r0 != 0) goto L_0x0188;
    L_0x0187:
        goto L_0x01a8;
    L_0x0188:
        r0 = r0.b;
        if (r0 == 0) goto L_0x01a8;
    L_0x018c:
        r0 = r0.a;
        if (r0 == 0) goto L_0x0192;
    L_0x0190:
        r12.h = r0;
    L_0x0192:
        r0 = r12.b;
        if (r0 == 0) goto L_0x0199;
    L_0x0196:
        r0.hashCode();
    L_0x0199:
        r0 = r12.h;
        if (r0 == 0) goto L_0x01a8;
    L_0x019d:
        r3 = r0.e;
        r3.hashCode();
        r3 = r0.d;
        r3 = r0.f;
        r0 = r0.p;
    L_0x01a8:
        r0 = r12.f;
        r3 = defpackage.amqg.a;
        if (r0 == 0) goto L_0x01c3;
    L_0x01ae:
        r0 = r0.c;
        if (r0 != 0) goto L_0x01b3;
    L_0x01b2:
        goto L_0x01c3;
    L_0x01b3:
        r4 = r0.a;
        r5 = 46659098; // 0x2c7f61a float:2.9381677E-37 double:2.30526574E-316;
        if (r4 != r5) goto L_0x01c3;
    L_0x01ba:
        r1 = new aafl;
        r0 = r0.b;
        r0 = (defpackage.aozg) r0;
        r1.<init>(r0, r3);
    L_0x01c3:
        r12.i = r1;
        r0 = r13.j;
        if (r0 == 0) goto L_0x01d6;
    L_0x01c9:
        r1 = r0.length;
    L_0x01ca:
        if (r2 >= r1) goto L_0x01d6;
    L_0x01cc:
        r3 = r0[r2];
        r4 = r12.d;
        r4.add(r3);
        r2 = r2 + 1;
        goto L_0x01ca;
    L_0x01d6:
        r13 = r13.e;
        if (r13 == 0) goto L_0x01de;
    L_0x01da:
        r13 = r13.b;
        r12.j = r13;
    L_0x01de:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aafv.<init>(akcb):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        xup.a(parcel, this.a);
    }

    public final ajtk a() {
        return this.a.b;
    }

    public final byte[] b() {
        return this.a.d;
    }

    public final void a(Object obj) {
        this.n = obj;
    }

    public final Object c() {
        return this.n;
    }
}
