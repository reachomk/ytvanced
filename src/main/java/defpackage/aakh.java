package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aakh */
public final class aakh implements Parcelable {
    public static final Creator CREATOR = new aakg();
    private static final Set l;
    private static final Set m;
    public final aakm a;
    public final aakm b;
    public final aakm c;
    public final aakm d;
    public final aakb e;
    public final aakm f;
    public final List g;
    public final List h;
    public final int i;
    public final int[] j;
    public final atdx k;

    public aakh() {
        this(null);
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0161 A:{LOOP_END, LOOP:0: B:108:0x015b->B:110:0x0161} */
    public aakh(defpackage.atdx r6) {
        /*
        r5 = this;
        r5.<init>();
        if (r6 != 0) goto L_0x0007;
    L_0x0005:
        r6 = defpackage.atdx.p;
    L_0x0007:
        r5.k = r6;
        r0 = 0;
        if (r6 != 0) goto L_0x000e;
    L_0x000c:
        r1 = r0;
        goto L_0x001f;
    L_0x000e:
        r1 = r6.a;
        r1 = r1 & 1;
        if (r1 == 0) goto L_0x000c;
    L_0x0014:
        r1 = new aakm;
        r2 = r6.b;
        if (r2 != 0) goto L_0x001c;
    L_0x001a:
        r2 = defpackage.aulg.e;
    L_0x001c:
        r1.<init>(r2);
    L_0x001f:
        r5.b = r1;
        if (r6 != 0) goto L_0x0025;
    L_0x0023:
        r1 = r0;
        goto L_0x0036;
    L_0x0025:
        r1 = r6.a;
        r1 = r1 & 2;
        if (r1 == 0) goto L_0x0023;
    L_0x002b:
        r1 = new aakm;
        r2 = r6.c;
        if (r2 != 0) goto L_0x0033;
    L_0x0031:
        r2 = defpackage.aulg.e;
    L_0x0033:
        r1.<init>(r2);
    L_0x0036:
        r5.c = r1;
        if (r6 != 0) goto L_0x003c;
    L_0x003a:
        r1 = r0;
        goto L_0x004d;
    L_0x003c:
        r1 = r6.a;
        r1 = r1 & 4;
        if (r1 == 0) goto L_0x003a;
    L_0x0042:
        r1 = new aakm;
        r2 = r6.d;
        if (r2 != 0) goto L_0x004a;
    L_0x0048:
        r2 = defpackage.aulg.e;
    L_0x004a:
        r1.<init>(r2);
    L_0x004d:
        r5.d = r1;
        if (r6 != 0) goto L_0x0053;
    L_0x0051:
        r1 = r0;
        goto L_0x0066;
    L_0x0053:
        r1 = r6.a;
        r2 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r1 = r1 & r2;
        if (r1 == 0) goto L_0x0051;
    L_0x005b:
        r1 = new aakb;
        r2 = r6.n;
        if (r2 != 0) goto L_0x0063;
    L_0x0061:
        r2 = defpackage.aule.d;
    L_0x0063:
        r1.<init>(r2);
    L_0x0066:
        r5.e = r1;
        if (r6 != 0) goto L_0x006c;
    L_0x006a:
        r1 = r0;
        goto L_0x007d;
    L_0x006c:
        r1 = r6.a;
        r1 = r1 & 32;
        if (r1 == 0) goto L_0x006a;
    L_0x0072:
        r1 = new aakm;
        r2 = r6.h;
        if (r2 != 0) goto L_0x007a;
    L_0x0078:
        r2 = defpackage.aulg.e;
    L_0x007a:
        r1.<init>(r2);
    L_0x007d:
        r5.f = r1;
        if (r6 != 0) goto L_0x0083;
    L_0x0081:
        r1 = r0;
        goto L_0x0094;
    L_0x0083:
        r1 = r6.a;
        r1 = r1 & 16384;
        if (r1 == 0) goto L_0x0081;
    L_0x0089:
        r1 = new aakm;
        r2 = r6.m;
        if (r2 != 0) goto L_0x0091;
    L_0x008f:
        r2 = defpackage.aulg.e;
    L_0x0091:
        r1.<init>(r2);
    L_0x0094:
        r5.a = r1;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r5.g = r1;
        if (r6 != 0) goto L_0x00a0;
    L_0x009f:
        goto L_0x00b8;
    L_0x00a0:
        r1 = r6.a;
        r1 = r1 & 16;
        if (r1 == 0) goto L_0x00b8;
    L_0x00a6:
        r1 = r5.g;
        r2 = new aakm;
        r3 = r6.g;
        if (r3 != 0) goto L_0x00b0;
    L_0x00ae:
        r3 = defpackage.aulg.e;
    L_0x00b0:
        r4 = l;
        r2.<init>(r3, r4);
        r1.add(r2);
    L_0x00b8:
        if (r6 != 0) goto L_0x00bb;
    L_0x00ba:
        goto L_0x00d3;
    L_0x00bb:
        r1 = r6.a;
        r1 = r1 & 64;
        if (r1 == 0) goto L_0x00d3;
    L_0x00c1:
        r1 = r5.g;
        r2 = new aakm;
        r3 = r6.i;
        if (r3 != 0) goto L_0x00cb;
    L_0x00c9:
        r3 = defpackage.aulg.e;
    L_0x00cb:
        r4 = m;
        r2.<init>(r3, r4);
        r1.add(r2);
    L_0x00d3:
        if (r6 != 0) goto L_0x00d6;
    L_0x00d5:
        goto L_0x00ee;
    L_0x00d6:
        r1 = r6.a;
        r1 = r1 & 128;
        if (r1 == 0) goto L_0x00ee;
    L_0x00dc:
        r1 = r5.g;
        r2 = new aakm;
        r3 = r6.j;
        if (r3 != 0) goto L_0x00e6;
    L_0x00e4:
        r3 = defpackage.aulg.e;
    L_0x00e6:
        r4 = m;
        r2.<init>(r3, r4);
        r1.add(r2);
    L_0x00ee:
        if (r6 != 0) goto L_0x00f1;
    L_0x00f0:
        goto L_0x0107;
    L_0x00f1:
        r1 = r6.a;
        r1 = r1 & 256;
        if (r1 == 0) goto L_0x0107;
    L_0x00f7:
        r1 = r5.g;
        r2 = new aakm;
        r3 = r6.k;
        if (r3 != 0) goto L_0x0101;
    L_0x00ff:
        r3 = defpackage.aulg.e;
    L_0x0101:
        r2.<init>(r3);
        r1.add(r2);
    L_0x0107:
        if (r6 != 0) goto L_0x010a;
    L_0x0109:
        goto L_0x0120;
    L_0x010a:
        r1 = r6.a;
        r1 = r1 & 512;
        if (r1 == 0) goto L_0x0120;
    L_0x0110:
        r1 = r5.g;
        r2 = new aakm;
        r3 = r6.l;
        if (r3 != 0) goto L_0x011a;
    L_0x0118:
        r3 = defpackage.aulg.e;
    L_0x011a:
        r2.<init>(r3);
        r1.add(r2);
    L_0x0120:
        if (r6 != 0) goto L_0x0123;
    L_0x0122:
        goto L_0x0134;
    L_0x0123:
        r1 = r6.e;
        r1 = r1.size();
        if (r1 == 0) goto L_0x0134;
    L_0x012b:
        r0 = r6.e;
        r0 = defpackage.anhe.a(r0);
        r5.j = r0;
        goto L_0x0136;
    L_0x0134:
        r5.j = r0;
    L_0x0136:
        if (r6 != 0) goto L_0x0139;
    L_0x0138:
        goto L_0x0140;
    L_0x0139:
        r0 = r6.f;
        if (r0 <= 0) goto L_0x0140;
    L_0x013d:
        r5.i = r0;
        goto L_0x0143;
    L_0x0140:
        r0 = 0;
        r5.i = r0;
    L_0x0143:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r5.h = r0;
        if (r6 != 0) goto L_0x014d;
    L_0x014c:
        goto L_0x0172;
    L_0x014d:
        r0 = r6.o;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0172;
    L_0x0155:
        r6 = r6.o;
        r6 = r6.iterator();
    L_0x015b:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x0172;
    L_0x0161:
        r0 = r6.next();
        r0 = (defpackage.awek) r0;
        r1 = r5.h;
        r2 = new aakf;
        r2.<init>(r0);
        r1.add(r2);
        goto L_0x015b;
    L_0x0172:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aakh.<init>(atdx):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] toByteArray = this.k.toByteArray();
        parcel.writeInt(toByteArray.length);
        parcel.writeByteArray(toByteArray);
    }

    public static aakh a(byte[] bArr) {
        if (bArr != null) {
            try {
                return new aakh((atdx) anxl.parseFrom(atdx.p, bArr));
            } catch (anyg unused) {
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aakh) {
            aakh aakh = (aakh) obj;
            if (amqq.a(this.b, aakh.b) && amqq.a(this.c, aakh.c) && amqq.a(this.d, aakh.d) && amqq.a(this.e, aakh.e) && amqq.a(this.f, aakh.f) && amqq.a(this.g, aakh.g) && amqq.a(this.h, aakh.h) && amqq.a(this.a, aakh.a) && this.i == aakh.i && Arrays.equals(this.j, aakh.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        aakm aakm = this.b;
        int i = 0;
        int hashCode = ((aakm != null ? aakm.hashCode() : 0) + 31) * 31;
        aakm aakm2 = this.c;
        hashCode = (hashCode + (aakm2 != null ? aakm2.hashCode() : 0)) * 31;
        aakm2 = this.d;
        hashCode = (hashCode + (aakm2 != null ? aakm2.hashCode() : 0)) * 31;
        aakb aakb = this.e;
        hashCode = (hashCode + (aakb != null ? aakb.hashCode() : 0)) * 31;
        aakm2 = this.f;
        hashCode = (hashCode + (aakm2 != null ? aakm2.hashCode() : 0)) * 31;
        aakm2 = this.a;
        hashCode = (hashCode + (aakm2 != null ? aakm2.hashCode() : 0)) * 31;
        List list = this.g;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.h;
        if (list != null) {
            i = list.hashCode();
        }
        return (hashCode + i) * 31;
    }

    static {
        HashSet hashSet = new HashSet();
        l = hashSet;
        hashSet.add(aako.CPN);
        hashSet = new HashSet();
        m = hashSet;
        hashSet.add(aako.MS);
    }
}
