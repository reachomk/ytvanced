package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: vrc */
public final class vrc extends vsl {
    public static final Creator CREATOR = new vrf();
    public static final vsr b = new vre();
    public final aakj a;

    public vrc(vsd vsd, String str, aakj aakj) {
        this(vsd.f, vsd.i, vsd.h, vsd.g, vsd.e, str, Long.MAX_VALUE, aakj);
    }

    public final boolean g() {
        return false;
    }

    public final boolean h() {
        return false;
    }

    protected vrc(String str, byte[] bArr, String str2, String str3, boolean z, String str4, long j, aakj aakj) {
        super(str, bArr, str2, str3, z, aakj.n(), str4, j, new vtp(aojx.w));
        this.a = (aakj) amqw.a((Object) aakj);
    }

    public final String d() {
        return this.a.b();
    }

    public final String e() {
        return this.a.z();
    }

    public final int f() {
        return this.a.h();
    }

    public final aakj i() {
        return this.a;
    }

    public final aajs j() {
        return this.a.c;
    }

    public final aakh k() {
        return this.a.m();
    }

    public final Uri l() {
        if (j() != null) {
            List list = j().l;
            if (list != null) {
                if (!list.isEmpty()) {
                    return ((aahr) list.get(0)).d;
                }
                afpc.a(1, afpf.ad, "Received non-null videoStreamingData object with empty list of format streams");
                return null;
            }
        }
        return null;
    }

    public final aolc m() {
        return this.a.o();
    }

    public final ajwf n() {
        ajwj ajwj = this.a.a.m;
        return ajwj != null ? ajwj.a : null;
    }

    public final String o() {
        return aagr.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vrc) {
            vrc vrc = (vrc) obj;
            if (super.equals(vrc) && amqq.a(this.a, vrc.a)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
    }

    public final /* synthetic */ afns c() {
        return new vre(this);
    }
}
