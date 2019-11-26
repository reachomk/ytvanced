package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: acwp */
public final class acwp implements Parcelable {
    public static final Creator CREATOR = new acws();
    public final String a;
    public final String b;
    public final String c;
    public final azfa d;
    public final acwl e;
    public final Map f;
    public final Map g;
    public final Set h;
    public final Set i;
    public int j;
    private atrr k;

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0114  */
    public acwp(defpackage.xuu r8, defpackage.apxu r9, defpackage.acwl r10) {
        /*
        r7 = this;
        r0 = defpackage.acwp.a(r9);
        r1 = 1;
        if (r0 == 0) goto L_0x005c;
    L_0x0007:
        r0 = defpackage.avjd.b;
        r0 = defpackage.anxl.checkIsLite(r0);
        r9.a(r0);
        r2 = r9.h;
        r3 = r0.d;
        r2 = r2.b(r3);
        if (r2 != 0) goto L_0x001d;
    L_0x001a:
        r0 = r0.b;
        goto L_0x0021;
    L_0x001d:
        r0 = r0.a(r2);
    L_0x0021:
        r0 = (defpackage.avjf) r0;
        r2 = r0.c;
        r3 = defpackage.acwl.aG;
        r3 = r3.get(r2);
        if (r3 != 0) goto L_0x003f;
    L_0x002d:
        r3 = defpackage.acwc.values();
        r4 = r3.length;
        r5 = 0;
    L_0x0033:
        if (r5 >= r4) goto L_0x005c;
    L_0x0035:
        r6 = r3[r5];
        r6 = r6.dU;
        if (r6 != r2) goto L_0x003c;
    L_0x003b:
        goto L_0x003f;
    L_0x003c:
        r5 = r5 + 1;
        goto L_0x0033;
    L_0x003f:
        r2 = r0.c;
        r0 = r0.d;
        r3 = defpackage.azfa.h;
        r3 = r3.createBuilder();
        r3 = (defpackage.azfd) r3;
        r3.a(r2);
        if (r0 < 0) goto L_0x0053;
    L_0x0050:
        r3.c(r0);
    L_0x0053:
        r0 = r3.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.azfa) r0;
        goto L_0x0081;
    L_0x005c:
        r0 = defpackage.azfa.h;
        r0 = r0.createBuilder();
        r0 = (defpackage.azfd) r0;
        if (r9 != 0) goto L_0x0067;
    L_0x0066:
        goto L_0x0079;
    L_0x0067:
        r2 = r9.a;
        r2 = r2 & r1;
        if (r2 == 0) goto L_0x0079;
    L_0x006c:
        r2 = r9.b;
        r2 = r2.d();
        r2 = defpackage.anvu.a(r2);
        r0.a(r2);
    L_0x0079:
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.azfa) r0;
    L_0x0081:
        r2 = defpackage.acwp.a(r9);
        r3 = 0;
        if (r2 == 0) goto L_0x00ac;
    L_0x0088:
        r2 = defpackage.avjd.b;
        r2 = defpackage.anxl.checkIsLite(r2);
        r9.a(r2);
        r4 = r9.h;
        r5 = r2.d;
        r4 = r4.b(r5);
        if (r4 != 0) goto L_0x009e;
    L_0x009b:
        r2 = r2.b;
        goto L_0x00a2;
    L_0x009e:
        r2 = r2.a(r4);
    L_0x00a2:
        r2 = (defpackage.avjf) r2;
        r4 = r2.a;
        r4 = r4 & r1;
        if (r4 == 0) goto L_0x00ac;
    L_0x00a9:
        r2 = r2.b;
        goto L_0x00ad;
    L_0x00ac:
        r2 = r3;
    L_0x00ad:
        r4 = defpackage.acwp.a(r9);
        if (r4 == 0) goto L_0x00d7;
    L_0x00b3:
        r4 = defpackage.avjd.b;
        r4 = defpackage.anxl.checkIsLite(r4);
        r9.a(r4);
        r9 = r9.h;
        r5 = r4.d;
        r9 = r9.b(r5);
        if (r9 != 0) goto L_0x00c9;
    L_0x00c6:
        r9 = r4.b;
        goto L_0x00cd;
    L_0x00c9:
        r9 = r4.a(r9);
    L_0x00cd:
        r9 = (defpackage.avjf) r9;
        r4 = r9.a;
        r4 = r4 & 32;
        if (r4 == 0) goto L_0x00d7;
    L_0x00d5:
        r3 = r9.e;
    L_0x00d7:
        r7.<init>();
        r7.j = r1;
        defpackage.amqw.a(r10);
        defpackage.amqw.a(r0);
        r8 = defpackage.amqw.a(r8);
        r8 = (defpackage.xuu) r8;
        r9 = 16;
        r8 = r8.a(r9);
        r7.a = r8;
        r8 = new java.util.HashMap;
        r8.<init>();
        r7.f = r8;
        r8 = new java.util.HashSet;
        r8.<init>();
        r7.i = r8;
        r8 = new java.util.HashMap;
        r8.<init>();
        r7.g = r8;
        r8 = new java.util.HashSet;
        r8.<init>();
        r7.h = r8;
        r7.e = r10;
        r7.b = r2;
        r7.c = r3;
        if (r0 != 0) goto L_0x0116;
    L_0x0114:
        r0 = defpackage.azfa.h;
    L_0x0116:
        r7.d = r0;
        r8 = defpackage.atrr.d;
        r7.k = r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acwp.<init>(xuu, apxu, acwl):void");
    }

    public final int describeContents() {
        return 0;
    }

    acwp(Parcel parcel) {
        int i;
        this.j = 1;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = (azfa) xup.a(parcel, azfa.h);
        this.k = (atrr) xup.a(parcel, atrr.d);
        this.e = acwl.a(parcel.readInt());
        int readInt = parcel.readInt();
        HashMap hashMap = new HashMap();
        for (i = 0; i < readInt; i++) {
            hashMap.put((azfa) xup.a(parcel, azfa.h), (acvr) parcel.readParcelable(acvr.class.getClassLoader()));
        }
        this.f = hashMap;
        int readInt2 = parcel.readInt();
        HashMap hashMap2 = new HashMap();
        for (readInt = 0; readInt < readInt2; readInt++) {
            hashMap2.put((azfa) xup.a(parcel, azfa.h), (azfa) xup.a(parcel, azfa.h));
        }
        this.g = hashMap2;
        readInt = parcel.readInt();
        HashSet hashSet = new HashSet();
        for (i = 0; i < readInt; i++) {
            hashSet.add(parcel.readString());
        }
        this.h = hashSet;
        readInt = parcel.readInt();
        this.i = new HashSet();
        for (int i2 = 0; i2 < readInt; i2++) {
            this.i.add((acwc) parcel.readSerializable());
        }
        this.j = parcel.readInt();
    }

    private static boolean a(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(avjd.b);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(azfa azfa) {
        return acwp.c(azfa) ? this.g.containsKey(azfa) : false;
    }

    public final void a(azfa azfa, azfa azfa2) {
        if (acwp.c(azfa)) {
            this.g.put(azfa, azfa2);
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean b(azfa azfa) {
        int i;
        if (acwp.c(azfa)) {
            acvr acvr = (acvr) this.f.get(azfa);
            if (acvr != null) {
                i = acvr.f;
                if (i != 2 || i == 5) {
                    return true;
                }
                return false;
            }
        }
        i = 1;
        if (i != 2) {
        }
        return true;
    }

    /* Access modifiers changed, original: final */
    public final void a(acvr acvr) {
        if (acwp.c(acvr.d)) {
            this.f.put(acvr.d, acvr);
        }
    }

    private static boolean c(azfa azfa) {
        return (azfa != null && azfa.b.b() > 0) || (azfa != null && azfa.c > 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        xup.a(this.d, parcel);
        xup.a(this.k, parcel);
        parcel.writeInt(this.e.aH);
        Map map = this.f;
        parcel.writeInt(map.size());
        for (Entry entry : map.entrySet()) {
            xup.a((anze) entry.getKey(), parcel);
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
        Map map2 = this.g;
        parcel.writeInt(map2.size());
        for (Entry entry2 : map2.entrySet()) {
            xup.a((anze) entry2.getKey(), parcel);
            xup.a((anze) entry2.getValue(), parcel);
        }
        Set<String> set = this.h;
        parcel.writeInt(set.size());
        for (String writeString : set) {
            parcel.writeString(writeString);
        }
        parcel.writeInt(this.i.size());
        for (acwc writeSerializable : this.i) {
            parcel.writeSerializable(writeSerializable);
        }
        parcel.writeInt(this.j);
    }
}
