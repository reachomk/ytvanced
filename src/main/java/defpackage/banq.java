package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: banq */
public final class banq {
    public byte[] a = new byte[0];
    public baoa[] b = null;

    public final int a() {
        int length = this.a.length;
        baoa[] baoaArr = this.b;
        if (baoaArr == null) {
            return length;
        }
        int length2 = baoaArr.length;
        return length2 > 0 ? (length + 2) + (length2 * 6) : length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            banq banq = (banq) obj;
            if (new BigInteger(this.a).equals(new BigInteger(banq.a))) {
                baoa[] baoaArr = this.b;
                baoa[] baoaArr2 = banq.b;
                return baoaArr == null ? baoaArr2 == null : Arrays.equals(baoaArr, baoaArr2);
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = this.a;
        int i = 0;
        int hashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        baoa[] baoaArr = this.b;
        if (baoaArr != null) {
            i = Arrays.hashCode(baoaArr);
        }
        return hashCode + i;
    }

    public final String toString() {
        String a = cim.a(this.a);
        String arrays = Arrays.toString(this.b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 18) + String.valueOf(arrays).length());
        stringBuilder.append("Entry{iv=");
        stringBuilder.append(a);
        stringBuilder.append(", pairs=");
        stringBuilder.append(arrays);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
