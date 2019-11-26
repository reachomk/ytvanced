package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: agpu */
final class agpu extends agql {
    private final aahr b;
    private final boolean c;
    private final long d;
    private final int e;
    private final long f;
    private final long g;
    private final long h;
    private final byte[] i;
    private final byte[] j;
    private final azxz k;
    private final String l;
    private final int m;
    private final String n;
    private final boolean o;
    private final Uri p;
    private final int q;

    public final aahr a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final long c() {
        return this.d;
    }

    public final int d() {
        return this.e;
    }

    public final long e() {
        return this.f;
    }

    public final long f() {
        return this.g;
    }

    public final long g() {
        return this.h;
    }

    public final byte[] h() {
        return this.i;
    }

    public final byte[] i() {
        return this.j;
    }

    public final azxz j() {
        return this.k;
    }

    public final String k() {
        return this.l;
    }

    public final int l() {
        return this.m;
    }

    public final String m() {
        return this.n;
    }

    public final boolean n() {
        return this.o;
    }

    public final Uri o() {
        return this.p;
    }

    public final String toString() {
        Object obj;
        String valueOf = String.valueOf(this.b);
        boolean z = this.c;
        long j = this.d;
        int i = this.e;
        long j2 = this.f;
        long j3 = this.g;
        long j4 = this.h;
        int i2 = this.q;
        if (i2 == 0) {
            obj = "null";
        } else {
            obj = avod.c(i2);
        }
        String valueOf2 = String.valueOf(obj);
        String arrays = Arrays.toString(this.i);
        String arrays2 = Arrays.toString(this.j);
        String valueOf3 = String.valueOf(this.k);
        long j5 = j4;
        String str = this.l;
        int i3 = this.m;
        String str2 = this.n;
        long j6 = j3;
        boolean z2 = this.o;
        String valueOf4 = String.valueOf(this.p);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = String.valueOf(arrays).length();
        int length4 = String.valueOf(arrays2).length();
        int length5 = valueOf3.length();
        int length6 = String.valueOf(str).length();
        String str3 = valueOf4;
        StringBuilder stringBuilder = new StringBuilder((((((((length + 402) + length2) + length3) + length4) + length5) + length6) + String.valueOf(str2).length()) + valueOf4.length());
        stringBuilder.append("OfflineStream{formatStream=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", audioOnly=");
        stringBuilder.append(z);
        stringBuilder.append(", bytesTransferred=");
        stringBuilder.append(j);
        stringBuilder.append(", streamStatus=");
        stringBuilder.append(i);
        stringBuilder.append(", streamStatusTimestamp=");
        stringBuilder.append(j2);
        stringBuilder.append(", transferStartedTimestamp=");
        stringBuilder.append(j6);
        stringBuilder.append(", transferCompletedTimestamp=");
        stringBuilder.append(j5);
        stringBuilder.append(", offlineStorageFormat=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", wrappedKey=");
        stringBuilder.append(arrays);
        stringBuilder.append(", discoKeyIv=");
        stringBuilder.append(arrays2);
        stringBuilder.append(", discoKey=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", discoNonce=");
        stringBuilder.append(str);
        stringBuilder.append(", streamEncryptionKeyType=");
        stringBuilder.append(i3);
        stringBuilder.append(", storageId=");
        stringBuilder.append(str2);
        stringBuilder.append(", streamExpired=");
        stringBuilder.append(z2);
        stringBuilder.append(", ytbUri=");
        stringBuilder.append(str3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agql) {
            agql agql = (agql) obj;
            if (this.b.equals(agql.a()) && this.c == agql.b() && this.d == agql.c() && this.e == agql.d() && this.f == agql.e() && this.g == agql.f() && this.h == agql.g()) {
                int i = this.q;
                int p = agql.p();
                if (i == 0) {
                    throw null;
                } else if (i == p) {
                    boolean z = agql instanceof agpu;
                    if (Arrays.equals(this.i, z ? ((agpu) agql).i : agql.h())) {
                        byte[] bArr;
                        byte[] bArr2 = this.j;
                        if (z) {
                            bArr = ((agpu) agql).j;
                        } else {
                            bArr = agql.i();
                        }
                        if (Arrays.equals(bArr2, bArr)) {
                            azxz azxz = this.k;
                            if (azxz == null ? agql.j() != null : !azxz.equals(agql.j())) {
                                String str = this.l;
                                if (str == null ? agql.k() != null : !str.equals(agql.k())) {
                                    if (this.m == agql.l()) {
                                        str = this.n;
                                        if (str == null ? agql.m() != null : !str.equals(agql.m())) {
                                            if (this.o == agql.n()) {
                                                Uri uri = this.p;
                                                if (uri == null ? agql.o() == null : uri.equals(agql.o())) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        int i = 1237;
        int i2 = !this.c ? 1237 : 1231;
        long j = this.d;
        int i3 = this.e;
        long j2 = this.f;
        long j3 = this.g;
        long j4 = this.h;
        hashCode = (((((((((((((((((hashCode ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i3) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ avod.a(this.q)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.j)) * 1000003;
        azxz azxz = this.k;
        int i4 = 0;
        hashCode = (hashCode ^ (azxz != null ? azxz.hashCode() : 0)) * 1000003;
        String str = this.l;
        hashCode = (((hashCode ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.m) * 1000003;
        str = this.n;
        hashCode = (hashCode ^ (str != null ? str.hashCode() : 0)) * 1000003;
        if (this.o) {
            i = 1231;
        }
        hashCode = (hashCode ^ i) * 1000003;
        Uri uri = this.p;
        if (uri != null) {
            i4 = uri.hashCode();
        }
        return hashCode ^ i4;
    }

    public final int p() {
        return this.q;
    }

    /* synthetic */ agpu(aahr aahr, boolean z, long j, int i, long j2, long j3, long j4, int i2, byte[] bArr, byte[] bArr2, azxz azxz, String str, int i3, String str2, boolean z2, Uri uri) {
        this.b = aahr;
        this.c = z;
        this.d = j;
        this.e = i;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.q = i2;
        this.i = bArr;
        this.j = bArr2;
        this.k = azxz;
        this.l = str;
        this.m = i3;
        this.n = str2;
        this.o = z2;
        this.p = uri;
    }
}
