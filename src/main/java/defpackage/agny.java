package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: agny */
public final class agny {
    public static amqp a(agnf agnf, Uri uri) {
        Throwable th;
        int i = 0;
        try {
            agmm a = agnf.a(uri, false);
            try {
                ampo ampo;
                if (a instanceof agoo) {
                    agoo agoo = (agoo) a;
                    agoo.a();
                    cil cil = new cil(new bakt(agoo.c().a.a.a()), new agom());
                    agoq agoq = agoo.c().c;
                    ArrayList arrayList = new ArrayList();
                    long j = 0;
                    for (cis cis : cil.b()) {
                        int a2 = cis instanceof ckh ? agos.a(((ckh) cis).i) : 1;
                        azpy azpy = (azpy) azpz.g.createBuilder();
                        azpy.a(bani.a(cis, ""));
                        azpy.a(a2);
                        azpy.copyOnWrite();
                        azpz azpz = (azpz) azpy.instance;
                        azpz.a |= 16;
                        azpz.f = true;
                        azpz = (azpz) ((anxl) azpy.build());
                        agok agok = agoo.c().b;
                        if (agos.a(azpz.b).lastIndexOf(47) == 0) {
                            String b = agos.b(azpz.b);
                            List a3 = agok.a(b);
                            String a4 = agos.a(azpz.b);
                            int parseInt = Integer.parseInt(a4.substring(a4.lastIndexOf(91) + 1, a4.lastIndexOf(93)));
                            if (parseInt < 0) {
                                throw new agml("Mp4Path contains negative box index.");
                            } else if (parseInt < a3.size()) {
                                agoh agoh = (agoh) a3.get(parseInt);
                                if ("uuid".equals(b)) {
                                    int a5 = azqn.a(azpz.c);
                                    if (a5 == 0) {
                                        a5 = 1;
                                    }
                                    if (a5 != agoh.f()) {
                                        throw new agml("Yt4UUID mismatch.");
                                    }
                                }
                                agoi a6 = agoh.a(azpz.f ^ 1);
                                amqp amqp = ampo.a;
                                amqp amqp2 = ampo.a;
                                long j2 = -1;
                                if (cis instanceof ckt) {
                                    j2 = cis.e();
                                    for (azql azql : agoq.a().c) {
                                        if (agos.a(((azpz) azql.c.get(i)).b, azpz.b)) {
                                            Object obj = azql.b;
                                            if (obj == null) {
                                                obj = azlk.f;
                                            }
                                            amqp = amqp.b(obj);
                                            amqw.b(amqp.a(), (Object) "Found an mdat box not referenced in stream data.");
                                        } else {
                                            i = 0;
                                        }
                                    }
                                    amqw.b(amqp.a(), (Object) "Found an mdat box not referenced in stream data.");
                                } else if (cis instanceof cjd) {
                                    cjd cjd = (cjd) cis;
                                    j = cjd.a + cjd.d();
                                } else if (a6.b() > 10485760) {
                                    ampo = ampo.a;
                                    if (a != null) {
                                        a.close();
                                    }
                                    return ampo;
                                } else {
                                    amqp2 = amqp.b(anvu.a(agoo.c().a.a(a6)));
                                }
                                long j3 = j;
                                j = j2;
                                azpy azpy2 = (azpy) ((anxo) azpz.toBuilder());
                                azpy2.b(a6.b());
                                azpy2.a(j);
                                azpz azpz2 = (azpz) ((anxl) azpy2.build());
                                azqq azqq = (azqq) azqr.h.createBuilder();
                                azqq.a(true);
                                azqq.b(true);
                                azqq.a(azpz2);
                                if (amqp.a()) {
                                    azqq.a((azlk) amqp.b());
                                }
                                if (amqp2.a()) {
                                    azqq.a((anvu) amqp2.b());
                                }
                                arrayList.add((azqr) ((anxl) azqq.build()));
                                String str = azpz2.b;
                                i = azpz2.c;
                                String.valueOf(str).length();
                                j = j3;
                                i = 0;
                            } else {
                                String str2 = azpz.b;
                                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 33);
                                stringBuilder.append("No box found for the given path ");
                                stringBuilder.append(str2);
                                stringBuilder.append(".");
                                throw new agml(stringBuilder.toString());
                            }
                        }
                        throw new agml("Not a top-level path.");
                    }
                    azqo azqo = (azqo) azqp.h.createBuilder();
                    azqo.a(true);
                    azqo.a(agoq.a());
                    azqo.a(agoq.c());
                    azqo.copyOnWrite();
                    azqp azqp = (azqp) azqo.instance;
                    azqp.a();
                    anvf.addAll(arrayList, azqp.e);
                    azqo.a(j);
                    if (agoq.b().a()) {
                        azqo.a((azqb) agoq.b().b());
                    }
                    amqp b2 = amqp.b((azqp) ((anxl) azqo.build()));
                    if (a != null) {
                        a.close();
                    }
                    return b2;
                }
                xtl.c("Tried to make progress from non-YT4 file.");
                ampo = ampo.a;
                if (a != null) {
                    a.close();
                }
                return ampo;
            } catch (NumberFormatException e) {
                throw new agml(e);
            } catch (Throwable e2) {
                th = e2;
                try {
                } catch (Throwable e22) {
                    Throwable th2 = e22;
                    if (a != null) {
                        a.close();
                    }
                }
            }
        } catch (IOException unused) {
            return ampo.a;
        } catch (Throwable e222) {
            ankx.a(th, e222);
        }
    }

    public static azqq a(String str, int i, amqp amqp) {
        azqq azqq = (azqq) azqr.h.createBuilder();
        azpy azpy = (azpy) azpz.g.createBuilder();
        azpy.a(str);
        azpy.a(-1);
        if (amqp.a()) {
            azqq.a(anvu.a((byte[]) amqp.b()));
            azpy.b((long) ((byte[]) amqp.b()).length);
        } else {
            azpy.b(-1);
        }
        if (i != 1) {
            azpy.a(i);
        }
        azqq.a(azpy);
        return azqq;
    }
}
