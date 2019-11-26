package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: abif */
public final class abif {
    public final ajvn a;
    public List b;
    public Object c;
    private List d;
    private List e;

    public abif(ajvn ajvn) {
        this.a = ajvn;
    }

    public final List a() {
        if (this.d == null) {
            this.b = new ArrayList();
            this.d = abif.a(this.a.a, new abie(this));
        }
        return this.d;
    }

    public final List b() {
        if (this.e == null) {
            this.e = abif.a(this.a.b, abih.a);
        }
        return this.e;
    }

    private static List a(Object[] objArr, amqd amqd) {
        List g = amul.g();
        if (objArr != null) {
            if (r1 > 0) {
                g = new ArrayList();
                for (Object a : objArr) {
                    g.addAll((Collection) amqd.a(a));
                }
            }
        }
        return g;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof abif) {
            abif abif = (abif) obj;
            int size = a().size();
            int size2 = b().size();
            if (size == abif.a().size() && size2 == abif.b().size() && a().equals(abif.a()) && b().equals(abif.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((!a().isEmpty() ? a().hashCode() : 0) + 527) * 31;
        if (!b().isEmpty()) {
            i = b().hashCode();
        }
        return hashCode + i;
    }
}
