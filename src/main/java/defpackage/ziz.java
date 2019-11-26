package defpackage;

import android.net.Uri;

/* renamed from: ziz */
public abstract class ziz {
    public abstract zix a();

    public abstract ziz a(int i);

    public abstract ziz a(long j);

    public abstract ziz a(Uri uri);

    public abstract ziz a(String str);

    public abstract ziz b(long j);

    public abstract ziz b(String str);

    public abstract ziz c(long j);

    public abstract ziz d(long j);

    public final zix b() {
        zix a = a();
        boolean z = a.a() != Long.MIN_VALUE || a.h() == 2;
        uhy.b(z, (Object) "encountered non-IMAGE_FROM_FILE file without unique ID specified");
        uhy.b(a.e() >= 0, "encountered file (%s) with negative size (%s)", a.b(), Long.valueOf(a.e()));
        uhy.b(a.g() >= 0, "encountered file (%s) with negative lastModifiedTime (%s)", a.b(), Long.valueOf(a.g()));
        return a;
    }
}
