package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vrx */
public final class vrx extends vso {
    public static final Creator CREATOR = new vrw();
    public static final vsr b = new vrz();
    public final arku a;

    public vrx(vsd vsd, aajj aajj, String str, long j, arku arku) {
        vsd vsd2 = vsd;
        String str2 = vsd2.f;
        byte[] bArr = vsd2.i;
        String str3 = vsd2.h;
        String str4 = vsd2.g;
        boolean z = vsd2.e;
        this(str2, bArr, str3, str4, z, aajj, str, j, arku);
    }

    public final int f() {
        return 0;
    }

    public final boolean g() {
        return false;
    }

    public final boolean h() {
        return false;
    }

    private vrx(String str, byte[] bArr, String str2, String str3, boolean z, aajj aajj, String str4, long j, arku arku) {
        long j2 = z ? j + m : Long.MAX_VALUE;
        aojw aojw = (aojw) aojx.w.createBuilder();
        anyd anyd = arku.a;
        aojw.copyOnWrite();
        aojx aojx = (aojx) aojw.instance;
        if (!aojx.a.a()) {
            aojx.a = anxl.mutableCopy(aojx.a);
        }
        anvf.addAll(anyd, aojx.a);
        vtp vtp = new vtp((aojx) ((anxl) aojw.build()));
        super(str, bArr, str2, str3, z, aajj, str4, j2, vtp);
        this.a = (arku) amqw.a((Object) arku);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vrx) {
            vrx vrx = (vrx) obj;
            if (super.equals(vrx) && amqq.a(this.a, vrx.a)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        xup.a(this.a, parcel);
    }

    public final /* synthetic */ afns c() {
        return new vrz(this);
    }

    /* synthetic */ vrx(String str, byte[] bArr, String str2, String str3, boolean z, aajj aajj, String str4, long j, arku arku, byte b) {
        this(str, bArr, str2, str3, z, aajj, str4, j, arku);
    }
}
