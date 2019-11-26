package defpackage;

import java.util.Arrays;

/* renamed from: ahcv */
final class ahcv extends ahdi {
    private final String a;
    private final String b;
    private final byte[] c;
    private final int d;
    private final byte[] e;
    private final int f;
    private final int g;

    /* Access modifiers changed, original: final */
    public final String a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final String b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final byte[] c() {
        return this.c;
    }

    /* Access modifiers changed, original: final */
    public final int d() {
        return this.d;
    }

    /* Access modifiers changed, original: final */
    public final byte[] e() {
        return this.e;
    }

    public final String toString() {
        Object obj;
        String str = this.a;
        String str2 = this.b;
        int i = this.f;
        Object obj2 = "null";
        if (i == 0) {
            obj = obj2;
        } else if (i == 0) {
            throw null;
        } else if (i != 0) {
            obj = Integer.toString(i - 1);
        } else {
            throw null;
        }
        String valueOf = String.valueOf(obj);
        int i2 = this.g;
        if (i2 != 0) {
            obj2 = avod.c(i2);
        }
        String valueOf2 = String.valueOf(obj2);
        String arrays = Arrays.toString(this.c);
        int i3 = this.d;
        String arrays2 = Arrays.toString(this.e);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = valueOf.length();
        int length4 = valueOf2.length();
        StringBuilder stringBuilder = new StringBuilder((((((length + 167) + length2) + length3) + length4) + String.valueOf(arrays).length()) + String.valueOf(arrays2).length());
        stringBuilder.append("OfflinePlayerRequestParams{identityId=");
        stringBuilder.append(str);
        stringBuilder.append(", videoId=");
        stringBuilder.append(str2);
        stringBuilder.append(", offlineModeType=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", offlineStorageFormat=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", trackingParams=");
        stringBuilder.append(arrays);
        stringBuilder.append(", offlineSourceVeType=");
        stringBuilder.append(i3);
        stringBuilder.append(", offlineSharingWrappedKey=");
        stringBuilder.append(arrays2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahdi) {
            ahdi ahdi = (ahdi) obj;
            if (this.a.equals(ahdi.a()) && this.b.equals(ahdi.b())) {
                int i = this.f;
                int f = ahdi.f();
                if (i == 0) {
                    throw null;
                } else if (i == f) {
                    i = this.g;
                    f = ahdi.g();
                    if (i == 0) {
                        throw null;
                    } else if (i == f) {
                        byte[] bArr;
                        byte[] bArr2 = this.c;
                        boolean z = ahdi instanceof ahcv;
                        if (z) {
                            bArr = ((ahcv) ahdi).c;
                        } else {
                            bArr = ahdi.c();
                        }
                        if (Arrays.equals(bArr2, bArr) && this.d == ahdi.d()) {
                            if (Arrays.equals(this.e, z ? ((ahcv) ahdi).e : ahdi.e())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        int i = this.f;
        if (i != 0) {
            return ((((((((hashCode ^ i) * 1000003) ^ avod.a(this.g)) * 1000003) ^ Arrays.hashCode(this.c)) * 1000003) ^ this.d) * 1000003) ^ Arrays.hashCode(this.e);
        }
        throw null;
    }

    ahcv(String str, String str2, int i, int i2, byte[] bArr, int i3, byte[] bArr2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (i != 0) {
                    this.f = i;
                    if (i2 != 0) {
                        this.g = i2;
                        this.c = bArr;
                        this.d = i3;
                        this.e = bArr2;
                        return;
                    }
                    throw new NullPointerException("Null offlineStorageFormat");
                }
                throw new NullPointerException("Null offlineModeType");
            }
            throw new NullPointerException("Null videoId");
        }
        throw new NullPointerException("Null identityId");
    }

    /* Access modifiers changed, original: final */
    public final int f() {
        return this.f;
    }

    /* Access modifiers changed, original: final */
    public final int g() {
        return this.g;
    }
}
