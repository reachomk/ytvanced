package defpackage;

/* renamed from: anyr */
final class anyr implements aoac {
    private static final anzb b = new anyu();
    private final anzb a;

    public anyr() {
        anzb anzb;
        anzb[] anzbArr = new anzb[2];
        anzbArr[0] = anxm.a;
        try {
            anzb = (anzb) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            anzb = b;
        }
        anzbArr[1] = anzb;
        this.a = (anzb) anxw.a(new anyt(anzbArr), "messageInfoFactory");
    }

    public final anzz a(Class cls) {
        aoab.a(cls);
        anzc b = this.a.b(cls);
        if (!b.a()) {
            anzz a;
            if (anxl.class.isAssignableFrom(cls)) {
                if (anyr.a(b)) {
                    a = anzh.a(b, anzo.b, anyn.b, aoab.c, anxe.a, anyz.b);
                } else {
                    a = anzh.a(b, anzo.b, anyn.b, aoab.c, null, anyz.b);
                }
            } else if (anyr.a(b)) {
                a = anzh.a(b, anzo.a, anyn.a, aoab.a, anxe.a(), anyz.a);
            } else {
                a = anzh.a(b, anzo.a, anyn.a, aoab.b, null, anyz.a);
            }
            return a;
        } else if (anxl.class.isAssignableFrom(cls)) {
            return anzk.a(aoab.c, anxe.a, b.b());
        } else {
            return anzk.a(aoab.a, anxe.a(), b.b());
        }
    }

    private static boolean a(anzc anzc) {
        return anzc.c() == 1;
    }
}
