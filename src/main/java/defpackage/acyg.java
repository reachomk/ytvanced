package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: acyg */
public final class acyg implements dig {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final afpu f;
    private volatile aqrw g;

    public acyg(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, afpu afpu, bcaa bcaa5) {
        this.a = (bcaa) amqw.a((Object) bcaa);
        this.b = (bcaa) amqw.a((Object) bcaa2);
        this.c = (bcaa) amqw.a((Object) bcaa3);
        this.e = bcaa4;
        this.f = (afpu) amqw.a((Object) afpu);
        this.d = (bcaa) amqw.a((Object) bcaa5);
    }

    public final void a(String str, Map map) {
        if (this.g == null) {
            aqrw aqrw;
            arvt b = ((zzl) this.d.get()).b();
            if (!(b == null || (b.a & 524288) == 0)) {
                aukv aukv = b.n;
                if (aukv == null) {
                    aukv = aukv.d;
                }
                if ((aukv.a & 4) != 0) {
                    aukv aukv2 = b.n;
                    if (aukv2 == null) {
                        aukv2 = aukv.d;
                    }
                    aqrw = aukv2.b;
                    if (aqrw == null) {
                        aqrw = aqrw.d;
                    }
                    this.g = aqrw;
                }
            }
            aqrw = aqrw.d;
            this.g = aqrw;
        }
        if (this.g.c && map != null) {
            if ("process".equals(map.get("action"))) {
                return;
            }
        }
        xvo a = ((afmi) this.c.get()).a(xvo.a(Uri.parse(dim.a(str, map))));
        a.b("proc", String.valueOf(xuy.a()));
        acyd acyd = new acyd(a.a().toString(), (List) this.e.get(), this.f.c(), aftp.a);
        if (((xhv) this.b.get()).c()) {
            str = String.valueOf(acyd.d);
            String str2 = "Pinging ";
            if (str.length() == 0) {
                str = new String(str2);
            } else {
                str2.concat(str);
            }
            ((xhf) this.a.get()).b(acyd);
        }
    }
}
