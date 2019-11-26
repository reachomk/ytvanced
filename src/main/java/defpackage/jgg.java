package defpackage;

/* renamed from: jgg */
public final class jgg extends aktw {
    private final akpk a = new akpk();

    public jgg(akvz akvz, appg appg) {
        amqw.a((Object) akvz);
        amqw.a((Object) appg);
        if (jgg.a(appg) != null) {
            akvz.a(appk.class);
            this.a.add(jgg.a(appg));
        }
    }

    public final aknh a() {
        return this.a;
    }

    private static appk a(appg appg) {
        appo appo = appg.c;
        if (appo == null) {
            appo = appo.e;
        }
        if ((appo.a & 4) == 0) {
            return null;
        }
        appo appo2 = appg.c;
        if (appo2 == null) {
            appo2 = appo.e;
        }
        appk appk = appo2.d;
        if (appk == null) {
            appk = appk.d;
        }
        return appk;
    }
}
