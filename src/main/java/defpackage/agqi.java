package defpackage;

import android.net.Uri;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: agqi */
public final class agqi {
    public final String a;
    public final String b;
    public final agpy c;
    public final aaft d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final Date h;
    public final avoq i;
    private final Uri j;

    private agqi(String str, String str2, agpy agpy, Uri uri, aaft aaft, int i, boolean z, boolean z2, Date date, avoq avoq) {
        this.a = (String) amqw.a((Object) str);
        this.b = str2;
        this.c = agpy;
        this.j = uri;
        this.d = aaft;
        this.e = i;
        this.f = z;
        this.g = z2;
        this.h = date;
        this.i = avoq;
    }

    public agqi(agqi agqi, int i) {
        this(agqi.a, agqi.b, agqi.c, agqi.j, agqi.d, i, agqi.f, agqi.g, agqi.h, agqi.i);
    }

    public agqi(agqi agqi, aaft aaft) {
        this(agqi.a, agqi.b, agqi.c, agqi.j, aaft, agqi.e, agqi.f, agqi.g, agqi.h, agqi.i);
    }

    public final Uri a() {
        aaft aaft = this.d;
        return (aaft == null || aaft.a.isEmpty()) ? null : this.d.a(480).a();
    }

    public static agqi a(avoq avoq, boolean z, int i, aaft aaft, agpy agpy) {
        Uri uri;
        avoq avoq2 = avoq;
        String str = avoq2.b;
        String str2 = avoq2.f;
        if (avoq2.g.isEmpty()) {
            uri = null;
        } else {
            uri = Uri.parse(avoq2.g);
        }
        return new agqi(str, str2, agpy, uri, aaft, i, z, avoq2.j, new Date(TimeUnit.SECONDS.toMillis(avoq2.h)), avoq);
    }

    public static agqi a(int i, String str) {
        return agqi.a("PPSV", i, str);
    }

    public static agqi a(String str, int i, String str2) {
        return new agqi(str, str2, null, null, null, i, false, false, null, null);
    }
}
