package defpackage;

import java.util.Arrays;

/* renamed from: ixr */
public final /* synthetic */ class ixr implements Runnable {
    private final ixp a;

    public ixr(ixp ixp) {
        this.a = ixp;
    }

    public final void run() {
        ixp ixp = this.a;
        if (ixp.v == null) {
            afpt c = ixp.p.c();
            if (c instanceof ust) {
                afpz b = ixp.u.b((ust) c);
                if (b.a()) {
                    ixp.l = b.c();
                } else {
                    ixp.l = "";
                }
            } else {
                ixp.l = "";
            }
            c = ixp.p.c();
            if (c != null && c.g()) {
                ixp.t.a(baur.a("X-Goog-PageId", baum.a), c.c());
            }
            if (amqu.a(ixp.l)) {
                Object h;
                ixp.t.a(baur.a("x-goog-api-key", baum.a), (Object) "AIzaSyA8eiZmM1FaDVjRy-df2KTyQ_vz_yYM39w");
                if (!amqu.a(ixp.p.h())) {
                    h = ixp.p.h();
                } else if (ixp.p.g()) {
                    h = ixp.q.getString("incognito_visitor_id", null);
                } else {
                    h = ixp.q.getString("visitor_id", null);
                }
                if (h != null) {
                    ixp.t.a(baur.a("X-Goog-Visitor-Id", baum.a), h);
                }
            }
            bawm a = bawm.a("embeddedassistant.googleapis.com", 443, ixp.j);
            a.c.addAll(Arrays.asList(new basb[]{new iyh(ixp.t, ixp.l)}));
            a.g = ixp.r;
            ixp.x = a.b();
            ixp.v = new amoy(ixp.x);
        }
        amoy amoy = ixp.v;
        bbio bbio = ixp.y;
        barx barx = amoy.a;
        bauw bauw = amov.a;
        if (bauw == null) {
            synchronized (amov.class) {
                bauw = amov.a;
                if (bauw == null) {
                    bauv a2 = bauw.a();
                    a2.c = baux.BIDI_STREAMING;
                    a2.d = bauw.a("google.assistant.embedded.v1.EmbeddedAssistant", "YTAssist");
                    a2.e = true;
                    a2.a = bbic.a(amoh.c);
                    a2.b = bbic.a(amoj.d);
                    bauw = a2.a();
                    amov.a = bauw;
                }
            }
        }
        ixp.w = bbif.a(barx.a(bauw, amoy.b), bbio);
        amoi amoi = (amoi) amof.g.createBuilder();
        amol amol = ixp.h;
        amoi.copyOnWrite();
        amof amof = (amof) amoi.instance;
        if (amol != null) {
            amof.b = amol;
            amof.a = 1;
            amoq amoq = ixp.i;
            amoi.copyOnWrite();
            amof = (amof) amoi.instance;
            if (amoq != null) {
                amof.c = amoq;
                amor amor = ixp.a;
                amoi.copyOnWrite();
                amof = (amof) amoi.instance;
                if (amor != null) {
                    amof.e = amor;
                    asad asad = (asad) asaa.i.createBuilder();
                    arzx arzx = ixp.k;
                    asad.copyOnWrite();
                    asaa asaa = (asaa) asad.instance;
                    if (arzx != null) {
                        asaa.a |= 4096;
                        asaa.f = arzx.c;
                        boolean z = ixp.B;
                        asad.copyOnWrite();
                        asaa = (asaa) asad.instance;
                        asaa.a |= 8192;
                        asaa.g = z;
                        float f = ixp.C;
                        asad.copyOnWrite();
                        asaa = (asaa) asad.instance;
                        asaa.a |= 16384;
                        asaa.h = f;
                        try {
                            atgy atgy = (atgy) anxl.parseFrom(atgy.s, ixp.o);
                            if (atgy != null) {
                                azkr azkr = (azkr) azks.c.createBuilder();
                                azkt azkt = (azkt) azku.c.createBuilder();
                                azkt.a(atgy);
                                azkr.a(azkt);
                                asad.a(azkr);
                            }
                        } catch (anyg unused) {
                        }
                        ashy a3 = ixp.m.a();
                        asad.copyOnWrite();
                        asaa = (asaa) asad.instance;
                        if (a3 != null) {
                            asaa.b = a3;
                            asaa.a |= 1;
                            azya azya = (azya) azyb.c.createBuilder();
                            anvu toByteString = ((asaa) ((anxl) asad.build())).toByteString();
                            azya.copyOnWrite();
                            azyb azyb = (azyb) azya.instance;
                            if (toByteString != null) {
                                azyb.a = 1;
                                azyb.b = toByteString;
                                ampa ampa = (ampa) amox.b.createBuilder();
                                anvu toByteString2 = ((azyb) ((anxl) azya.build())).toByteString();
                                ampa.copyOnWrite();
                                amox amox = (amox) ampa.instance;
                                if (toByteString2 != null) {
                                    amox.a = toByteString2;
                                    amox amox2 = (amox) ((anxl) ampa.build());
                                    amoi.copyOnWrite();
                                    amof amof2 = (amof) amoi.instance;
                                    if (amox2 != null) {
                                        amof2.f = amox2;
                                        amow amow = (amow) amot.b.createBuilder();
                                        String str = ixp.f;
                                        amow.copyOnWrite();
                                        amot amot = (amot) amow.instance;
                                        if (str != null) {
                                            amot.a = str;
                                            amoi.copyOnWrite();
                                            ((amof) amoi.instance).d = (amot) ((anxl) amow.build());
                                            bbio bbio2 = ixp.w;
                                            if (bbio2 != null) {
                                                amok amok = (amok) amoh.c.createBuilder();
                                                amok.copyOnWrite();
                                                amoh amoh = (amoh) amok.instance;
                                                amoh.b = (anxl) amoi.build();
                                                amoh.a = 2;
                                                bbio2.a((amoh) ((anxl) amok.build()));
                                                ixp.z.run();
                                                return;
                                            }
                                            ixp.a();
                                            ixp.c.post(new ixx(ixp, new NullPointerException()));
                                            return;
                                        }
                                        throw new NullPointerException();
                                    }
                                    throw new NullPointerException();
                                }
                                throw new NullPointerException();
                            }
                            throw new NullPointerException();
                        }
                        throw new NullPointerException();
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
