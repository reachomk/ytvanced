package defpackage;

/* renamed from: sjr */
final class sjr extends basg {
    private final /* synthetic */ sjs b;

    sjr(sjs sjs, barz barz) {
        this.b = sjs;
        super(barz);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(basc basc, baum baum) {
        if (this.b.a != null) {
            try {
                siv a = sga.b.a();
                sjs sjs = this.b;
                String a2 = a.a(sjs.a, sjs.b);
                if (a2 != null) {
                    Object str;
                    baur a3 = baur.a("Authorization", baum.a);
                    String str2 = "Bearer ";
                    if (a2.length() == 0) {
                        str = new String(str2);
                    } else {
                        str = str2.concat(a2);
                    }
                    baum.a(a3, str);
                    this.a.a(basc, baum);
                    return;
                }
                throw new bawb(bavx.f);
            } catch (siy e) {
                throw new bawb(bavx.f.b(e));
            }
        }
        throw new bawb(bavx.h);
    }
}
