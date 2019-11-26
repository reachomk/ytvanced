package defpackage;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;

/* renamed from: agaz */
final class agaz implements aghq {
    private final /* synthetic */ agak a;

    public final void a(String str, boolean z) {
        if (!z) {
            agak agak = this.a;
            if (agxj.a(agak.e, agak.L)) {
                this.a.t().a(str);
                this.a.t().b(str);
                agdo t = this.a.t();
                t.f(t.d(str));
            }
        }
        agdk agdk = this.a.t;
        xvd.a(str);
        List<oww> list = (List) agdk.a.get();
        if (list != null) {
            for (oww oww : list) {
                if (oww != null) {
                    Set<String> c = oww.c();
                    String concat = String.valueOf(str).concat(".");
                    for (String str2 : c) {
                        if (str2 != null && str2.startsWith(concat)) {
                            for (oww oww2 : list) {
                                if (oww2 != null) {
                                    NavigableSet<oxf> a = oww2.a(str2);
                                    if (a != null) {
                                        for (oxf b : a) {
                                            try {
                                                oww2.b(b);
                                            } catch (owv unused) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* synthetic */ agaz(agak agak) {
        this.a = agak;
    }
}
