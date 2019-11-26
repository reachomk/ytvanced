package defpackage;

import android.os.Parcelable.Creator;

/* renamed from: vta */
public final class vta extends vso {
    public static final Creator CREATOR = new vtd();
    public static final vta a = new vta("throttled", new byte[0], "", "throttled", false, aajj.b, "", Long.MAX_VALUE);

    private vta(String str, byte[] bArr, String str2, String str3, boolean z, aajj aajj, String str4, long j) {
        super(str, bArr, str2, str3, z, aajj, str4, j, new vtp(aojx.w));
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

    public final boolean equals(Object obj) {
        return obj instanceof vta ? super.equals((vta) obj) : false;
    }

    public final /* synthetic */ afns c() {
        return new vtc(this);
    }

    /* synthetic */ vta(String str, byte[] bArr, String str2, String str3, boolean z, aajj aajj, String str4, long j, byte b) {
        this(str, bArr, str2, str3, z, aajj, str4, j);
    }

    static {
        vtc vtc = new vtc();
    }
}
