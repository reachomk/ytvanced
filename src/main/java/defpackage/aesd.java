package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: aesd */
public final class aesd {
    public final byte[] a;
    public final String b;
    public final byte[] c;
    public final Uri d;
    public final long e;
    public final List f;
    public final String g;

    public aesd(String str, byte[] bArr, String str2, byte[] bArr2, Uri uri, long j, List list, String str3) {
        xvd.a(str);
        this.a = (byte[]) amqw.a((Object) bArr);
        this.b = xvd.a(str2);
        this.c = (byte[]) amqw.a((Object) bArr2);
        this.d = (Uri) amqw.a((Object) uri);
        this.e = j;
        this.f = list;
        this.g = xvd.a(str3);
    }
}
