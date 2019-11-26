package defpackage;

/* renamed from: flx */
public final class flx extends akwi {
    private static final Class[] a = new Class[]{aygy.class, epr.class};
    private final akpb b;
    private final zzl c;

    public flx(int i, akpb akpb, zzl zzl) {
        super(i);
        this.b = (akpb) amqw.a((Object) akpb);
        this.c = zzl;
    }

    public final void a(akor akor, aknh aknh, int i) {
        boolean z = false;
        if (a(aknh, i)) {
            Object c;
            akpb akpb = this.b;
            Object c2 = aknh.c(i);
            for (i++; i < aknh.d(); i++) {
                if (akpb.a(aknh.c(i)) != -1) {
                    c = aknh.c(i);
                    break;
                }
            }
            c = null;
            if (c != null) {
                if (!foh.p(this.c) || !(c2 instanceof akvh) || !(c instanceof akao)) {
                    Class[] clsArr = a;
                    Class cls = c.getClass();
                    if (clsArr != null) {
                        for (Object a : clsArr) {
                            if (amqq.a(cls, a)) {
                                break;
                            }
                        }
                    }
                }
            }
            z = true;
        }
        akor.a("showLineSeparator", Boolean.valueOf(z));
    }
}
