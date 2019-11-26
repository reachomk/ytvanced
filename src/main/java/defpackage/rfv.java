package defpackage;

/* renamed from: rfv */
final class rfv implements rgz {
    private static final rgf b = new rfy();
    private final rgf a;

    public rfv() {
        rgf rgf;
        rgf[] rgfArr = new rgf[2];
        rgfArr[0] = rer.a;
        try {
            rgf = (rgf) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            rgf = b;
        }
        rgfArr[1] = rgf;
        this.a = (rgf) rfc.a(new rfx(rgfArr), "messageInfoFactory");
    }

    public final rha a(Class cls) {
        rhc.a(cls);
        rgg b = this.a.b(cls);
        if (b.b()) {
            if (reu.class.isAssignableFrom(cls)) {
                return rgn.a(rhc.c, rej.a, b.c());
            }
            return rgn.a(rhc.a, rej.a(), b.c());
        } else if (reu.class.isAssignableFrom(cls)) {
            if (rfv.a(b)) {
                return rgl.a(b, rgr.b, rfr.b, rhc.c, rej.a, rgd.b);
            }
            return rgl.a(b, rgr.b, rfr.b, rhc.c, null, rgd.b);
        } else if (rfv.a(b)) {
            return rgl.a(b, rgr.a, rfr.a, rhc.a, rej.a(), rgd.a);
        } else {
            return rgl.a(b, rgr.a, rfr.a, rhc.b, null, rgd.a);
        }
    }

    private static boolean a(rgg rgg) {
        return rgg.a() == 1;
    }
}
