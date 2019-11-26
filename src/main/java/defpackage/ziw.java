package defpackage;

import android.net.Uri;

/* renamed from: ziw */
final class ziw extends zix {
    private final long a;
    private final Uri b;
    private final String c;
    private final String d;
    private final long e;
    private final long f;
    private final long g;
    private final int h;

    public final long a() {
        return this.a;
    }

    public final Uri b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public final long f() {
        return this.f;
    }

    public final long g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        String str2 = this.d;
        long j2 = this.e;
        long j3 = this.f;
        long j4 = this.g;
        int i = this.h;
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 191) + String.valueOf(str).length()) + String.valueOf(str2).length());
        stringBuilder.append("DeviceLocalFile{id=");
        stringBuilder.append(j);
        stringBuilder.append(", uri=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", displayName=");
        stringBuilder.append(str);
        stringBuilder.append(", directory=");
        stringBuilder.append(str2);
        stringBuilder.append(", size=");
        stringBuilder.append(j2);
        stringBuilder.append(", duration=");
        stringBuilder.append(j3);
        stringBuilder.append(", lastModifiedTime=");
        stringBuilder.append(j4);
        stringBuilder.append(", fileType=");
        stringBuilder.append(i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zix) {
            zix zix = (zix) obj;
            if (this.a == zix.a() && this.b.equals(zix.b()) && this.c.equals(zix.c())) {
                String str = this.d;
                if (str == null ? zix.d() == null : str.equals(zix.d())) {
                    return this.e == zix.e() && this.f == zix.f() && this.g == zix.g() && this.h == zix.h();
                }
            }
        }
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j2 = this.e;
        long j3 = this.f;
        long j4 = this.g;
        return this.h ^ ((((((((hashCode ^ hashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003);
    }

    /* synthetic */ ziw(long j, Uri uri, String str, String str2, long j2, long j3, long j4, int i) {
        this.a = j;
        this.b = uri;
        this.c = str;
        this.d = str2;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = i;
    }
}
