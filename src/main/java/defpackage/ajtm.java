package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: ajtm */
public final class ajtm implements ajtf {
    public final Object a;
    private final String b;
    private final byte[] c;
    private final ajti d;

    public final String a() {
        return this.b;
    }

    public final byte[] b() {
        return this.c;
    }

    public final ajti c() {
        return this.d;
    }

    public final String toString() {
        String str = this.b;
        String arrays = Arrays.toString(this.c);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.a);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(arrays).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 85) + length2) + valueOf.length()) + valueOf2.length());
        stringBuilder.append("ContinuationWrapper{continuationToken=");
        stringBuilder.append(str);
        stringBuilder.append(", requestTrackingParams=");
        stringBuilder.append(arrays);
        stringBuilder.append(", type=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", continuation=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajtm) {
            ajtm ajtm = (ajtm) obj;
            return TextUtils.equals(this.b, ajtm.b) && Arrays.equals(this.c, ajtm.c) && this.d.equals(ajtm.d) && this.a.equals(ajtm.a);
        }
    }

    public final int hashCode() {
        String str = this.b;
        return ((((((str != null ? str.hashCode() ^ 1000003 : 1000003) * 1000003) ^ Arrays.hashCode(this.c)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.a.hashCode();
    }

    /* synthetic */ ajtm(String str, byte[] bArr, ajti ajti, Object obj) {
        this.b = str;
        this.c = bArr;
        this.d = ajti;
        this.a = obj;
    }
}
