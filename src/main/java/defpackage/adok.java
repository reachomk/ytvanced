package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: adok */
public final class adok {
    public final String a;

    public adok(String str) {
        this.a = str;
    }

    public static ausr a(int i) {
        aust aust = (aust) ausu.l.createBuilder();
        aust.a(3);
        adok.a(aust, 3);
        ausr ausr = (ausr) auss.d.createBuilder();
        ausr.a(4);
        i++;
        aust.a(adok.a(2, i + i, 7));
        ausr.a(aust);
        return ausr;
    }

    public static void a(ausr ausr) {
        ausz ausz = (ausz) auta.d.createBuilder();
        ausz.a(adok.c(18));
        ausz.b(adok.c(24));
        auta auta = (auta) ((anxl) ausz.build());
        autg autg = (autg) aute.d.createBuilder();
        autg.copyOnWrite();
        aute aute = (aute) autg.instance;
        if (auta != null) {
            if (!aute.c.a()) {
                aute.c = anxl.mutableCopy(aute.c);
            }
            aute.c.add(auta);
            aute aute2 = (aute) ((anxl) autg.build());
            aust aust = (aust) ((anxo) ausr.a().toBuilder());
            aust.a();
            aust.a(aute2);
            ausr.a(aust);
            return;
        }
        throw new NullPointerException();
    }

    public static void b(ausr ausr) {
        autg autg = (autg) aute.d.createBuilder();
        autg.a(auqx.DAY_OF_WEEK_SATURDAY);
        autg.a(auqx.DAY_OF_WEEK_SUNDAY);
        aute aute = (aute) ((anxl) autg.build());
        aust aust = (aust) ((anxo) ausr.a().toBuilder());
        aust.a();
        aust.a(aute);
        ausr.a(aust);
    }

    public static int b(int i) {
        amqw.a(i >= 0);
        return (int) TimeUnit.DAYS.toSeconds((long) i);
    }

    private static int c(int i) {
        amqw.a(true);
        return (int) TimeUnit.HOURS.toMillis((long) i);
    }

    public static void a(ausr ausr, int i, int i2, int i3) {
        ausr.a(2);
        aust aust = (aust) ausu.l.createBuilder();
        aust.a(3);
        adok.a(aust, i);
        aust.a(adok.a(2, i2, i3));
        ausr.a(aust);
    }

    private static ausw a(int i, int i2, int i3) {
        ausv ausv = (ausv) ausw.e.createBuilder();
        ausv.copyOnWrite();
        ausw ausw = (ausw) ausv.instance;
        ausw.a |= 1;
        ausw.b = 1;
        ausz ausz = (ausz) auta.d.createBuilder();
        ausz.a(i2);
        ausz.b(i2);
        ausv.copyOnWrite();
        ausw ausw2 = (ausw) ausv.instance;
        ausw2.c = (auta) ((anxl) ausz.build());
        ausw2.a |= 2;
        i2 = adok.b(i3);
        ausv.copyOnWrite();
        ausw ausw3 = (ausw) ausv.instance;
        ausw3.a |= 4;
        ausw3.d = i2;
        return (ausw) ((anxl) ausv.build());
    }

    private static void a(aust aust, int i) {
        autb autb = (autb) autc.d.createBuilder();
        autb.copyOnWrite();
        autc autc = (autc) autb.instance;
        autc.a |= 1;
        autc.b = i - 1;
        ausz ausz = (ausz) auta.d.createBuilder();
        ausz.a(0);
        ausz.b(0);
        autb.copyOnWrite();
        autc = (autc) autb.instance;
        autc.c = (auta) ((anxl) ausz.build());
        autc.a |= 2;
        aust.copyOnWrite();
        ausu ausu = (ausu) aust.instance;
        if (!ausu.b.a()) {
            ausu.b = anxl.mutableCopy(ausu.b);
        }
        ausu.b.add((autc) ((anxl) autb.build()));
    }
}
