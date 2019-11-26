package defpackage;

/* renamed from: ambt */
final class ambt {
    static void a(ayuo ayuo) {
        int i;
        amqw.a((Object) ayuo);
        boolean z = true;
        if ((ayuo.a & 1) != 0) {
            axcb axcb = ayuo.b;
            if (axcb == null) {
                axcb = axcb.c;
            }
            xvd.a(axcb.b);
            i = 1;
        } else {
            i = 0;
        }
        if ((ayuo.a & 2) != 0) {
            axcb axcb2;
            i++;
            aqzr aqzr = ayuo.c;
            if (aqzr == null) {
                aqzr = aqzr.b;
            }
            amqw.b(aqzr.a.size() == 1);
            aqzr aqzr2 = ayuo.c;
            if (aqzr2 == null) {
                aqzr2 = aqzr.b;
            }
            arah arah = ((arac) aqzr2.a.get(0)).b;
            if (arah == null) {
                arah = arah.c;
            }
            if (arah.a == 2) {
                axcb2 = (axcb) arah.b;
            } else {
                axcb2 = axcb.c;
            }
            xvd.a(axcb2.b);
        }
        if (i != 1) {
            z = false;
        }
        amqw.b(z);
    }
}
