package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: tih */
public final class tih implements thx {
    private final qea a = new qea();

    public final thx a(Bitmap bitmap) {
        this.a.a = bitmap;
        return this;
    }

    public final thx a(String str) {
        this.a.b = str;
        return this;
    }

    public final thx a(thr thr) {
        tig tig = new tig(thr);
        qea qea = this.a;
        qea.a(false);
        qea.h = tig;
        return this;
    }

    public final thx b(String str) {
        this.a.d = str;
        return this;
    }

    public final thx c(String str) {
        this.a.e = str;
        return this;
    }

    public final thx a(Map map) {
        qea qea = this.a;
        qea.a(true);
        for (Entry entry : map.entrySet()) {
            qea.c.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return this;
    }

    public final thu a() {
        qea qea = this.a;
        qdx qdx = new qdx(new ApplicationErrorReport(), (byte) 0);
        qdx.m = qea.a;
        qdx.f = null;
        qdx.a = qea.b;
        qdx.c = qea.d;
        qdx.b = qea.c;
        qdx.e = qea.e;
        qdx.h = qea.f;
        qdx.i = false;
        qdx.j = null;
        qdx.k = null;
        qdx.l = qea.g;
        qdx.p = qea.h;
        qdx.n = qea.i;
        qdx.o = false;
        return new tie(qdx);
    }
}
