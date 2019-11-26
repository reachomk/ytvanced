package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aaft */
public final class aaft {
    public final List a;
    private aygk b;

    public aaft(aygk aygk) {
        this.b = aygk;
        if (aygk != null) {
            this.a = new ArrayList(aygk.b.size());
            for (aygm aafo : aygk.b) {
                this.a.add(new aafo(aafo));
            }
            return;
        }
        this.a = Collections.emptyList();
    }

    public aaft(List list) {
        this.b = null;
        this.a = list;
    }

    public aaft(Uri... uriArr) {
        amqw.a((Object) uriArr);
        this.a = new ArrayList();
        this.a.add(new aafo(uriArr[0]));
        this.b = null;
    }

    public aaft() {
        this.b = null;
        this.a = Collections.emptyList();
    }

    public final boolean a() {
        return this.a.size() > 0;
    }

    public final aafo b() {
        return a() ? (aafo) this.a.get(0) : null;
    }

    public final aafo c() {
        if (!a()) {
            return null;
        }
        List list = this.a;
        return (aafo) list.get(list.size() - 1);
    }

    public final aafo a(int i) {
        if (!a()) {
            return null;
        }
        if (i <= 0) {
            return b();
        }
        for (aafo aafo : this.a) {
            if (aafo.a >= i) {
                return aafo;
            }
        }
        return c();
    }

    public final aafo a(int i, int i2) {
        aafo aafo = null;
        if (a() && i >= 0 && i2 >= 0) {
            int i3 = 0;
            for (aafo aafo2 : this.a) {
                int i4 = i - aafo2.a;
                int i5 = i2 - aafo2.b;
                i4 = (i4 * i4) + (i5 * i5);
                if (aafo == null || i4 < i3) {
                    aafo = aafo2;
                    i3 = i4;
                }
            }
        }
        return aafo;
    }

    public final aygk d() {
        if (this.b == null) {
            aygj aygj = (aygj) aygk.f.createBuilder();
            int size = this.a.size();
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    aygl aygl = (aygl) aygm.e.createBuilder();
                    aygl.a(((aafo) this.a.get(i)).a);
                    aygl.b(((aafo) this.a.get(i)).b);
                    aygl.a(((aafo) this.a.get(i)).a().toString());
                    aygj.a(aygl);
                }
            }
            this.b = (aygk) ((anxl) aygj.build());
        }
        return this.b;
    }
}
