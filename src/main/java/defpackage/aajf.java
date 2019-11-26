package defpackage;

import android.net.Uri;

/* renamed from: aajf */
public final class aajf {
    public final Uri a;
    public final String b;
    public final aajj c;
    private final boolean d;
    private final boolean e;

    public aajf(Uri uri, boolean z, boolean z2, String str, avti avti) {
        this.a = uri;
        this.d = z;
        this.e = z2;
        this.b = str;
        if (avti == null) {
            this.c = aajj.b;
            return;
        }
        awdf awdf = (awdf) awdg.J.createBuilder();
        arhh arhh = avti.b;
        if (arhh == null) {
            arhh = arhh.bv;
        }
        awdf.a(arhh);
        this.c = new aajj((awdg) ((anxl) awdf.build()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aajf) {
            aajf aajf = (aajf) obj;
            return this.a.equals(aajf.a) && this.d == aajf.d && this.e == aajf.e && this.b.equals(aajf.b) && this.c.equals(aajf.c);
        }
    }

    public final int hashCode() {
        amqw.b(false);
        return 0;
    }
}
