package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vrj */
public final class vrj extends vsk {
    public static final Creator CREATOR = new vri();
    public static final vsr c = new vrl();
    public final aolc a;
    public final vso b;

    public vrj(vso vso, String str) {
        super(vso.d, vso.e, vso.f, vso.g, vso.h, vso.i, str, vso.l);
        this.a = (aolc) amqw.a(vso.m());
        this.b = (vso) amqw.a((Object) vso);
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

    public final aolc m() {
        return this.a;
    }

    public final boolean a(vra vra) {
        return vra == vra.VIDEO_ENDED;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vrj) {
            vrj vrj = (vrj) obj;
            if (super.equals(vrj) && amqq.a(this.a, vrj.a)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        xup.a(this.a, parcel);
        parcel.writeParcelable(this.b, 0);
    }

    public final /* synthetic */ afns c() {
        return new vrl(this);
    }

    /* synthetic */ vrj(String str, byte[] bArr, String str2, String str3, boolean z, aajj aajj, String str4, aolc aolc, vso vso) {
        super(str, bArr, str2, str3, z, aajj, str4, new vtp(aojx.w));
        this.a = (aolc) amqw.a((Object) aolc);
        this.b = (vso) amqw.a((Object) vso);
    }
}
