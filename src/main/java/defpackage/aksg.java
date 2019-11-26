package defpackage;

/* renamed from: aksg */
final class aksg implements aksd {
    private final /* synthetic */ atze a;
    private final /* synthetic */ amqp b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ akse d;

    aksg(akse akse, atze atze, amqp amqp, Object obj) {
        this.d = akse;
        this.a = atze;
        this.b = amqp;
        this.c = obj;
    }

    public final void a(akrz akrz, String str, aqyf aqyf, aqyf aqyf2) {
        this.d.a(this.a, akrz, str, aqyf, aqyf2, false);
    }

    public final void a(akrz akrz, String str, aqyf aqyf, aqyf aqyf2, String str2) {
        aqyf aqyf3 = aqyf;
        aqyf aqyf4 = aqyf2;
        String str3 = str2;
        akse akse = this.d;
        atze atze = this.a;
        amqp amqp = this.b;
        Object obj = this.c;
        akse.b = true;
        if (akse.a(atze, akrz, str, aqyf, aqyf2, true)) {
            int intValue;
            amuu e = amur.e();
            e.b("com.google.android.libraries.youtube.innertube.services.flags.user_comments", str);
            if (obj != null) {
                e.b("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
            }
            if (!(aqyf3 == null || aqyf4 == null)) {
                asou asou = (asou) asor.e.createBuilder();
                int i = 0;
                intValue = aqyf3.b == 6 ? ((Integer) aqyf3.c).intValue() : 0;
                asou.copyOnWrite();
                asor asor = (asor) asou.instance;
                asor.a |= 1;
                asor.b = intValue;
                if (aqyf4.b == 6) {
                    i = ((Integer) aqyf4.c).intValue();
                }
                asou.copyOnWrite();
                asor asor2 = (asor) asou.instance;
                asor2.a |= 2;
                asor2.c = i;
                asou.copyOnWrite();
                asor2 = (asor) asou.instance;
                if (str3 != null) {
                    asor2.a |= 4;
                    asor2.d = str3;
                    e.b("com.google.android.libraries.youtube.innertube.services.flags.legal_report_details", (asor) ((anxl) asou.build()));
                } else {
                    throw new NullPointerException();
                }
            }
            if (amqp.a()) {
                aspc aspc = (aspc) asoz.d.createBuilder();
                intValue = ((aksj) amqp.b()).a;
                aspc.copyOnWrite();
                asoz asoz = (asoz) aspc.instance;
                asoz.a |= 1;
                asoz.b = intValue;
                intValue = ((aksj) amqp.b()).b;
                aspc.copyOnWrite();
                asoz = (asoz) aspc.instance;
                asoz.a |= 2;
                asoz.c = intValue;
                e.b("com.google.android.libraries.youtube.innertube.services.flags.video_report_details", (asoz) ((anxl) aspc.build()));
            }
            aaas aaas = akse.a;
            aphj aphj = atze.o;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            apxu apxu = aphg.l;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, e.b());
            akrz.dismiss();
        }
    }
}
