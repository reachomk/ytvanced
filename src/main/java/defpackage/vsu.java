package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: vsu */
public final class vsu extends vsk implements aagi {
    public static final Creator CREATOR = new vsx();
    public static final vsr b = new vsw();
    public final axzh a;
    private final aybu c;
    private final amul n;

    public vsu(vsd vsd, aajj aajj, String str, axzh axzh) {
        this(vsd.f, vsd.i, vsd.h, vsd.g, vsd.e, aajj, str, axzh);
    }

    public final boolean g() {
        return false;
    }

    public final boolean h() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    private vsu(java.lang.String r12, byte[] r13, java.lang.String r14, java.lang.String r15, boolean r16, defpackage.aajj r17, java.lang.String r18, defpackage.axzh r19) {
        /*
        r11 = this;
        r9 = r11;
        r10 = r19;
        r8 = new vtp;
        r0 = r10.b;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x002f;
    L_0x000d:
        r0 = r10.b;
        r1 = 0;
        r0 = r0.get(r1);
        r0 = (defpackage.axzl) r0;
        r1 = r0.a;
        r1 = r1 & 1;
        if (r1 == 0) goto L_0x002f;
    L_0x001c:
        r0 = r0.b;
        if (r0 != 0) goto L_0x0022;
    L_0x0020:
        r0 = defpackage.axzf.g;
    L_0x0022:
        r0 = r0.f;
        if (r0 != 0) goto L_0x0028;
    L_0x0026:
        r0 = defpackage.axzj.f;
    L_0x0028:
        r0 = r0.e;
        if (r0 != 0) goto L_0x0031;
    L_0x002c:
        r0 = defpackage.aojx.w;
        goto L_0x0031;
    L_0x002f:
        r0 = defpackage.aojx.w;
    L_0x0031:
        r8.<init>(r0);
        r0 = r11;
        r1 = r12;
        r2 = r13;
        r3 = r14;
        r4 = r15;
        r5 = r16;
        r6 = r17;
        r7 = r18;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r0 = defpackage.amqw.a(r19);
        r0 = (defpackage.axzh) r0;
        r9.a = r0;
        r0 = r10.a;
        r0 = r0 & 2;
        if (r0 == 0) goto L_0x0057;
    L_0x0050:
        r0 = r10.d;
        if (r0 != 0) goto L_0x0058;
    L_0x0054:
        r0 = defpackage.axak.a;
        goto L_0x0058;
    L_0x0057:
        r0 = 0;
    L_0x0058:
        r0 = defpackage.ajzv.a(r0);
        r1 = defpackage.aybu.class;
        r0 = defpackage.ajzv.a(r0, r1);
        r0 = (defpackage.aybu) r0;
        r9.c = r0;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r10.b;
        r1 = r1.iterator();
    L_0x0071:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0092;
    L_0x0077:
        r2 = r1.next();
        r2 = (defpackage.axzl) r2;
        r3 = r2.a;
        r3 = r3 & 1;
        if (r3 == 0) goto L_0x0071;
    L_0x0083:
        r3 = new vsz;
        r2 = r2.b;
        if (r2 != 0) goto L_0x008b;
    L_0x0089:
        r2 = defpackage.axzf.g;
    L_0x008b:
        r3.<init>(r2);
        r0.add(r3);
        goto L_0x0071;
    L_0x0092:
        r0 = defpackage.amul.a(r0);
        r9.n = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vsu.<init>(java.lang.String, byte[], java.lang.String, java.lang.String, boolean, aajj, java.lang.String, axzh):void");
    }

    public final int f() {
        return !this.n.isEmpty() ? ae().b() : 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final int V() {
        return ae().c() * 1000;
    }

    public final List X() {
        return this.n;
    }

    private final vsz ae() {
        if (this.n.size() > 0) {
            return (vsz) this.n.get(0);
        }
        xtl.d("Trying to retrieve question that is out of range.");
        return null;
    }

    public final apxu Y() {
        axzh axzh = this.a;
        if ((axzh.a & 1) == 0) {
            return null;
        }
        apxu apxu = axzh.c;
        if (apxu == null) {
            apxu = apxu.d;
        }
        return apxu;
    }

    public final aybu Z() {
        return this.c;
    }

    public final apxu aa() {
        axzh axzh = this.a;
        if ((axzh.a & 4) == 0) {
            return null;
        }
        apxu apxu = axzh.e;
        if (apxu == null) {
            apxu = apxu.d;
        }
        return apxu;
    }

    public final int ab() {
        return !this.n.isEmpty() ? ae().c() : 5;
    }

    public final boolean ac() {
        return this.a.f;
    }

    public final aojz I() {
        aojz aojz = this.a.g;
        return aojz == null ? aojz.s : aojz;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vsu) {
            vsu vsu = (vsu) obj;
            if (super.equals(vsu) && amqq.a(this.a, vsu.a)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        anze anze = this.a;
        if (anze != null) {
            xup.a(anze, parcel);
        }
    }

    public final /* synthetic */ afns c() {
        return new vsw(this);
    }

    public final /* synthetic */ aago ad() {
        return ae();
    }

    /* synthetic */ vsu(String str, byte[] bArr, String str2, String str3, boolean z, aajj aajj, String str4, axzh axzh, byte b) {
        this(str, bArr, str2, str3, z, aajj, str4, axzh);
    }
}
