package defpackage;

/* renamed from: ywh */
public final /* synthetic */ class ywh implements aadm {
    private final ywa a;
    private final aadw b;

    public ywh(ywa ywa, aadw aadw) {
        this.a = ywa;
        this.b = aadw;
    }

    public final aadk a(aadd aadd, arfo arfo) {
        ywa ywa = this.a;
        aadw aadw = this.b;
        int a = arga.a(arfo.c);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 1) {
            return aadk.a(aadd, arfo).b();
        }
        aadn a2 = aadk.a(aadd, arfo);
        aadq a3 = a2.a();
        aadq yko;
        if (a3 instanceof apst) {
            apst apst = (apst) a3;
            yko = new yko(apst.a(), apst);
            ywa.a(yko).a(yko.getHeaderKey(), yko.getBodyKey());
            a2.a(yko);
        } else if (a3 instanceof apsu) {
            apsu apsu = (apsu) a3;
            a2.a(new ykg(apsu.a(), apsu));
        } else if (a3 instanceof apso) {
            apso apso = (apso) a3;
            yko = new ykd(apso.a(), apso);
            ywa.a(yko).a(yko.getViewerKey(), yko.getMessagesKey());
            ywa.a(yko).a(yko.getParticipantEntityKeys());
            ywa.a(yko).a(yko.getViewerKey());
            a2.a(yko);
        } else if (a3 instanceof apsz) {
            a3 = ykk.a((apsz) a3);
            ywa.a(a3).a(a3.getMessageKeys());
            a2.a(a3);
        } else if (a3 instanceof apsk) {
            apsk apsk = (apsk) a3;
            a = apsk.b.b;
            aadq ylh;
            if (a == 7) {
                a2.a(new yky(apsk.a(), apsk));
            } else if (a == 4) {
                a2.a(new ykx(apsk.a(), apsk));
            } else if (a == 5) {
                aadq yld = new yld(apsk.a(), apsk, false);
                ywa.a(yld).a(yld.getAuthorKey());
                ywa.a(yld).a(yld.getHeartedContactEntityKeys());
                a2.a(yld);
                a2.a(yld.getTemporaryClientId());
            } else if (a == 6) {
                ylh = new ylh(apsk.a(), apsk, null, false, false);
                ywa.a(ylh).a(ylh.getAuthorKey());
                ywa.a(ylh).a(ylh.getHeartedContactEntityKeys());
                a2.a(ylh);
                a2.a(ylh.getTemporaryClientId());
            } else if (a == 9) {
                ylh = new ykz(apsk.a(), apsk, null, false, false);
                ywa.a(ylh).a(ylh.getPlaylistKey());
                ywa.a(ylh).a(ylh.getAuthorKey());
                ywa.a(ylh).a(ylh.getHeartedContactEntityKeys());
                a2.a(ylh);
                a2.a(ylh.getTemporaryClientId());
            } else if (a != 8) {
                a2.a(1);
            } else {
                ylh = new ykc(apsk.a(), apsk, null, false, false);
                ywa.a(ylh).a(ylh.getChannelKey());
                ywa.a(ylh).a(ylh.getAuthorKey());
                ywa.a(ylh).a(ylh.getHeartedContactEntityKeys());
                a2.a(ylh);
                a2.a(ylh.getTemporaryClientId());
            }
            yki yki = (yki) aadw.a(a3.a());
            if (!(a2.a() == null || yki == null || yki.getClass() == a2.a().getClass())) {
                a2.a(yki.a);
            }
        } else if (a3 instanceof aqkj) {
            aqkj aqkj = (aqkj) a3;
            a2.a(new ykv(aqkj.a(), aqkj));
        } else if (a3 instanceof awht) {
            awht awht = (awht) a3;
            yko = new ylb(awht.a(), awht);
            ywa.a(yko).a(yko.getOwnerChannelModelKey());
            a2.a(yko);
        } else if (a3 instanceof aplo) {
            aplo aplo = (aplo) a3;
            a2.a(new yke(aplo.a(), aplo));
        }
        return a2.b();
    }
}
