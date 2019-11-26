package defpackage;

import android.os.Parcelable.Creator;

/* renamed from: vtg */
public final class vtg extends vso {
    public static final Creator CREATOR = new vtj();
    public static final vtg a = new vtg("placeholder", new byte[0], "", "placeholder", false, aajj.b, "", Long.MAX_VALUE);

    private vtg(String str, byte[] bArr, String str2, String str3, boolean z, aajj aajj, String str4, long j) {
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
        return obj instanceof vtg ? super.equals((vtg) obj) : false;
    }

    public final /* synthetic */ afns c() {
        return new vti(this);
    }

    /* synthetic */ vtg(String str, byte[] bArr, String str2, String str3, boolean z, aajj aajj, String str4, long j, byte b) {
        this(str, bArr, str2, str3, z, aajj, str4, j);
    }

    static {
        vti vti = new vti();
    }
}
