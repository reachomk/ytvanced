package defpackage;

import java.util.Arrays;

/* renamed from: agpr */
final class agpr extends agqd {
    private final String a;
    private final int b;
    private final String c;
    private final int d;
    private final int e;
    private final byte[] f;
    private final byte[] g;
    private final boolean h;

    agpr(String str, int i, String str2, int i2, int i3, byte[] bArr, byte[] bArr2, boolean z) {
        if (str != null) {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = i2;
            this.e = i3;
            this.f = bArr;
            this.g = bArr2;
            this.h = z;
            return;
        }
        throw new NullPointerException("Null videoId");
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final byte[] f() {
        return this.f;
    }

    public final byte[] g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        int i2 = this.d;
        int i3 = this.e;
        String arrays = Arrays.toString(this.f);
        String arrays2 = Arrays.toString(this.g);
        boolean z = this.h;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 147) + length2) + String.valueOf(arrays).length()) + String.valueOf(arrays2).length());
        stringBuilder.append("OfflineHash{videoId=");
        stringBuilder.append(str);
        stringBuilder.append(", itag=");
        stringBuilder.append(i);
        stringBuilder.append(", storageId=");
        stringBuilder.append(str2);
        stringBuilder.append(", merkleLevel=");
        stringBuilder.append(i2);
        stringBuilder.append(", blockIndex=");
        stringBuilder.append(i3);
        stringBuilder.append(", digest=");
        stringBuilder.append(arrays);
        stringBuilder.append(", hashState=");
        stringBuilder.append(arrays2);
        stringBuilder.append(", matchesBytesOnDisk=");
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agqd) {
            agqd agqd = (agqd) obj;
            if (this.a.equals(agqd.a()) && this.b == agqd.b()) {
                String str = this.c;
                if (str == null ? agqd.c() == null : str.equals(agqd.c())) {
                    if (this.d == agqd.d() && this.e == agqd.e()) {
                        byte[] bArr;
                        byte[] bArr2 = this.f;
                        boolean z = agqd instanceof agpr;
                        if (z) {
                            bArr = ((agpr) agqd).f;
                        } else {
                            bArr = agqd.f();
                        }
                        if (Arrays.equals(bArr2, bArr)) {
                            byte[] bArr3;
                            bArr2 = this.g;
                            if (z) {
                                bArr3 = ((agpr) agqd).g;
                            } else {
                                bArr3 = agqd.g();
                            }
                            return Arrays.equals(bArr2, bArr3) && this.h == agqd.h();
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        String str = this.c;
        return ((((((((((hashCode ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ Arrays.hashCode(this.f)) * 1000003) ^ Arrays.hashCode(this.g)) * 1000003) ^ (!this.h ? 1237 : 1231);
    }
}
