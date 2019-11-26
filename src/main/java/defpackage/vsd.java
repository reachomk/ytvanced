package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: vsd */
public final class vsd implements afnt, vqy {
    public static final Creator CREATOR = new vsc();
    public static final vsf j = new vsf();
    public final aafx c;
    public final int d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final byte[] i;

    public vsd(aafx aafx, int i, boolean z, String str, String str2, String str3, byte[] bArr) {
        this.c = (aafx) amqw.a((Object) aafx);
        this.d = i;
        this.e = z;
        this.f = xvd.a(str);
        this.g = xvd.a(str2);
        if (e() != vsm.PRE_ROLL) {
            str3 = null;
        } else if (z) {
            str3 = "";
        }
        this.h = str3;
        if (bArr == null) {
            bArr = zzp.b;
        }
        this.i = bArr;
    }

    public final Pattern bc_() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final List j() {
        return null;
    }

    public final List m() {
        return this.c.a.c;
    }

    public final long a() {
        aafx aafx = this.c;
        int a = aogh.a(aafx.a.d);
        if (a != 0 && a == 4) {
            return -1;
        }
        return (long) Math.max(aafx.a.b, 0);
    }

    public final Map b() {
        return a;
    }

    public final String d() {
        return this.f;
    }

    public final String h() {
        return this.g;
    }

    public final vsm e() {
        int b = this.c.b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i == 1) {
            return vsm.PRE_ROLL;
        } else {
            if (i != 2) {
                if (i == 3) {
                    return vsm.POST_ROLL;
                }
                if (i != 6) {
                    return null;
                }
            }
            return vsm.MID_ROLL;
        }
    }

    public final int f() {
        return e().d;
    }

    public final boolean g() {
        return this.e;
    }

    public final List k() {
        return this.c.a.f;
    }

    public final List l() {
        return this.c.a.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Integer.valueOf(this.d), this.f, Integer.valueOf(Arrays.hashCode(this.i))});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vsd) {
            vsd vsd = (vsd) obj;
            if (amqq.a(this.c, vsd.c) && amqq.a(Integer.valueOf(this.d), Integer.valueOf(vsd.d)) && amqq.a(this.f, vsd.f) && amqq.a(this.h, vsd.h) && Arrays.equals(this.i, vsd.i)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("InstreamAdBreak: [breakType:%s, adBreakIndex:%s, offset:%s, originalVideoId:%s]", new Object[]{e(), Integer.valueOf(this.d), Long.valueOf(a()), this.f});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i.length);
        parcel.writeByteArray(this.i);
    }

    public final /* synthetic */ Enum i() {
        int b = this.c.b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i == 1) {
            return vsp.PRE_ROLL;
        } else {
            if (i == 2) {
                return a() <= 0 ? vsp.UNKNOWN : vsp.TIME;
            } else {
                if (i != 3) {
                    return vsp.UNKNOWN;
                }
                return vsp.POST_ROLL;
            }
        }
    }

    public final /* synthetic */ afns c() {
        return new vsf(this);
    }
}
