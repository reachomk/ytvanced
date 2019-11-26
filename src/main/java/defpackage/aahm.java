package defpackage;

import java.util.Arrays;
import java.util.Map;

/* renamed from: aahm */
public final class aahm extends aajg {
    private final String a;
    private final Map b;
    private final byte[] c;
    private final String d;

    public aahm(String str, Map map, byte[] bArr, String str2) {
        if (str != null) {
            this.a = str;
            if (map != null) {
                this.b = map;
                if (bArr != null) {
                    this.c = bArr;
                    if (str2 != null) {
                        this.d = str2;
                        return;
                    }
                    throw new NullPointerException("Null userAgent");
                }
                throw new NullPointerException("Null body");
            }
            throw new NullPointerException("Null headers");
        }
        throw new NullPointerException("Null url");
    }

    public final String a() {
        return this.a;
    }

    public final Map b() {
        return this.b;
    }

    public final byte[] c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String arrays = Arrays.toString(this.c);
        String str2 = this.d;
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder((((length + 53) + length2) + String.valueOf(arrays).length()) + String.valueOf(str2).length());
        stringBuilder.append("InnerPlayerRequest{url=");
        stringBuilder.append(str);
        stringBuilder.append(", headers=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", body=");
        stringBuilder.append(arrays);
        stringBuilder.append(", userAgent=");
        stringBuilder.append(str2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aajg) {
            aajg aajg = (aajg) obj;
            if (this.a.equals(aajg.a()) && this.b.equals(aajg.b())) {
                byte[] bArr;
                byte[] bArr2 = this.c;
                if (aajg instanceof aahm) {
                    bArr = ((aahm) aajg).c;
                } else {
                    bArr = aajg.c();
                }
                return Arrays.equals(bArr2, bArr) && this.d.equals(aajg.d());
            }
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ Arrays.hashCode(this.c)) * 1000003) ^ this.d.hashCode();
    }
}
