package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: adpn */
final class adpn extends adpw {
    public final String a;
    public final List b;
    public final long c;
    public final ajis d;
    public final String e;
    public final int f;
    public final String g;
    public final String h;
    public final boolean i;
    public final byte[] j;

    public final String a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final ajis d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final int f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }

    public final boolean i() {
        return this.i;
    }

    public final byte[] j() {
        return this.j;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        long j = this.c;
        String valueOf2 = String.valueOf(this.d);
        String str2 = this.e;
        int i = this.f;
        String str3 = this.g;
        String str4 = this.h;
        boolean z = this.i;
        String arrays = Arrays.toString(this.j);
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        int length4 = String.valueOf(str2).length();
        int length5 = String.valueOf(str3).length();
        StringBuilder stringBuilder = new StringBuilder(((((((length + 220) + length2) + length3) + length4) + length5) + String.valueOf(str4).length()) + String.valueOf(arrays).length());
        stringBuilder.append("MdxPlaybackDescriptor{videoId=");
        stringBuilder.append(str);
        stringBuilder.append(", videoIds=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", currentPositionMillis=");
        stringBuilder.append(j);
        stringBuilder.append(", subtitleTrack=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", playlistId=");
        stringBuilder.append(str2);
        stringBuilder.append(", playlistIndex=");
        stringBuilder.append(i);
        stringBuilder.append(", watchParams=");
        stringBuilder.append(str3);
        stringBuilder.append(", playerParams=");
        stringBuilder.append(str4);
        stringBuilder.append(", forceReloadPlayback=");
        stringBuilder.append(z);
        stringBuilder.append(", clickTrackingParams=");
        stringBuilder.append(arrays);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final adpv k() {
        return new adpq(this);
    }

    /* synthetic */ adpn(String str, List list, long j, ajis ajis, String str2, int i, String str3, String str4, boolean z, byte[] bArr) {
        this.a = str;
        this.b = list;
        this.c = j;
        this.d = ajis;
        this.e = str2;
        this.f = i;
        this.g = str3;
        this.h = str4;
        this.i = z;
        this.j = bArr;
    }
}
