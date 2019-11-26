package defpackage;

import android.util.Base64;
import java.util.List;

/* renamed from: yg */
public final class yg {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final int e;
    public final String f;

    public yg(String str, String str2, String str3, List list) {
        this.a = (String) aad.a((Object) str);
        this.b = (String) aad.a((Object) str2);
        this.c = (String) aad.a((Object) str3);
        this.d = (List) aad.a((Object) list);
        this.e = 0;
        StringBuilder stringBuilder = new StringBuilder(this.a);
        str2 = "-";
        stringBuilder.append(str2);
        stringBuilder.append(this.b);
        stringBuilder.append(str2);
        stringBuilder.append(this.c);
        this.f = stringBuilder.toString();
    }

    public yg(String str, String str2, String str3, int i) {
        this.a = (String) aad.a((Object) str);
        this.b = (String) aad.a((Object) str2);
        this.c = (String) aad.a((Object) str3);
        this.d = null;
        this.e = i;
        StringBuilder stringBuilder = new StringBuilder(this.a);
        str2 = "-";
        stringBuilder.append(str2);
        stringBuilder.append(this.b);
        stringBuilder.append(str2);
        stringBuilder.append(this.c);
        this.f = stringBuilder.toString();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("FontRequest {mProviderAuthority: ");
        stringBuilder2.append(this.a);
        stringBuilder2.append(", mProviderPackage: ");
        stringBuilder2.append(this.b);
        stringBuilder2.append(", mQuery: ");
        stringBuilder2.append(this.c);
        stringBuilder2.append(", mCertificates:");
        stringBuilder.append(stringBuilder2.toString());
        for (int i = 0; i < this.d.size(); i++) {
            stringBuilder.append(" [");
            List list = (List) this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                stringBuilder.append(" \"");
                stringBuilder.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                stringBuilder.append("\"");
            }
            stringBuilder.append(" ]");
        }
        stringBuilder.append("}");
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("mCertificatesArray: ");
        stringBuilder2.append(this.e);
        stringBuilder.append(stringBuilder2.toString());
        return stringBuilder.toString();
    }
}
