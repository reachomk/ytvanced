package defpackage;

import android.text.TextUtils;

/* renamed from: udg */
public abstract class udg implements udc {
    private static final udk b = new udj();
    private static final udk c = new udi();
    private static final udk d = new udl();

    public abstract void b(bcfe bcfe);

    private static void a(udk udk, anzd anzd) {
        if (TextUtils.isEmpty(udk.c(anzd))) {
            udk.a(anzd, tuz.a(udk.b(anzd)));
        } else {
            udk.a(anzd, null);
        }
        udk.a(anzd);
    }

    public final void a(bcfe bcfe) {
        int i;
        int i2;
        bcfd bcfd = (bcfd) ((anxo) bcfe.toBuilder());
        udg.a(b, bcfd);
        if (!((((bcfe) bcfd.instance).a & 512) == 0 || (bcfd.d().a & 1) == 0)) {
            anxl anxl = bcfd.d().b;
            if (anxl == null) {
                anxl = bbzz.k;
            }
            bcac bcac = (bcac) ((anxo) anxl.toBuilder());
            udg.a(c, bcac);
            bcag bcag = (bcag) ((anxo) bcfd.d().toBuilder());
            bcag.a(bcac);
            bcfd.a(bcag);
        }
        if (!((((bcfe) bcfd.instance).a & 256) == 0 || bcfd.c().j.size() == 0)) {
            bceh bceh = (bceh) ((anxo) bcfd.c().toBuilder());
            for (i = 0; i < ((bcei) bceh.instance).j.size(); i++) {
                bcej bcej = (bcej) ((anxo) ((bcek) ((bcei) bceh.instance).j.get(i)).toBuilder());
                if (!TextUtils.isEmpty(bcej.a())) {
                    bcej.copyOnWrite();
                    ((bcek) bcej.instance).c = anxl.emptyLongList();
                    for (String a : udg.a(bcej.a())) {
                        long longValue = tuz.a(a).longValue();
                        bcej.copyOnWrite();
                        bcek bcek = (bcek) bcej.instance;
                        if (!bcek.c.a()) {
                            bcek.c = anxl.mutableCopy(bcek.c);
                        }
                        bcek.c.a(longValue);
                    }
                }
                bcej.copyOnWrite();
                bcek bcek2 = (bcek) bcej.instance;
                bcek2.a &= -2;
                bcek2.b = bcek.e.b;
                bceh.copyOnWrite();
                bcei bcei = (bcei) bceh.instance;
                bcei.a();
                bcei.j.set(i, (bcek) ((anxl) bcej.build()));
            }
            bcfd.a(bceh);
        }
        if (!((((bcfe) bcfd.instance).a & 32) == 0 || bcfd.b().a.size() == 0)) {
            bcbz bcbz = (bcbz) ((anxo) bcfd.b().toBuilder());
            for (i = 0; i < ((bcca) bcbz.instance).a.size(); i++) {
                bcbv bcbv = (bcbv) ((anxo) ((bcbw) ((bcca) bcbz.instance).a.get(i)).toBuilder());
                if (!TextUtils.isEmpty(bcbv.a())) {
                    bcbv.copyOnWrite();
                    ((bcbw) bcbv.instance).t = anxl.emptyLongList();
                    String[] a2 = udg.a(bcbv.a());
                    long[] jArr = new long[a2.length];
                    i2 = 0;
                    while (true) {
                        if (i2 >= r7) {
                            break;
                        }
                        jArr[i2] = tuz.a(a2[i2]).longValue();
                        i2++;
                    }
                    for (long j : jArr) {
                        bcbv.copyOnWrite();
                        bcbw bcbw = (bcbw) bcbv.instance;
                        if (!bcbw.t.a()) {
                            bcbw.t = anxl.mutableCopy(bcbw.t);
                        }
                        bcbw.t.a(j);
                    }
                }
                bcbv.copyOnWrite();
                bcbw bcbw2 = (bcbw) bcbv.instance;
                bcbw2.a &= -262145;
                bcbw2.s = bcbw.v.s;
                bcbz.copyOnWrite();
                bcca bcca = (bcca) bcbz.instance;
                bcca.a();
                bcca.a.set(i, (bcbw) ((anxl) bcbv.build()));
            }
            bcfd.a(bcbz);
        }
        if (!((((bcfe) bcfd.instance).a & 32768) == 0 || bcfd.e().d.size() == 0)) {
            bcdc bcdc = (bcdc) ((anxo) bcfd.e().toBuilder());
            for (int i3 = 0; i3 < ((bccz) bcdc.instance).d.size(); i3++) {
                bcdd bcdd = (bcdd) ((anxo) ((bcde) ((bccz) bcdc.instance).d.get(i3)).toBuilder());
                udg.a(d, bcdd);
                bcdc.copyOnWrite();
                bccz bccz = (bccz) bcdc.instance;
                bccz.a();
                bccz.d.set(i3, (bcde) ((anxl) bcdd.build()));
            }
            bcfd.copyOnWrite();
            bcfe bcfe2 = (bcfe) bcfd.instance;
            bcfe2.p = (bccz) ((anxl) bcdc.build());
            bcfe2.a |= 32768;
        }
        b((bcfe) ((anxl) bcfd.build()));
    }

    private static String[] a(String str) {
        return str.replaceFirst("^/+", "").split("/+");
    }
}
