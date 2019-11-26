package defpackage;

import android.app.Application;
import android.util.Log;
import android.view.View;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/* renamed from: sfe */
public final class sfe {
    private static final amur a;
    private final String b;
    private final String c;
    private final String d;
    private final siv e;
    private final aodg f;
    private final siw g;

    public sfe(Application application, sgz sgz, siv siv) {
        this(application.getPackageName(), sgz.i, sgz.j.a, sgz.a, siv);
    }

    public sfe(String str, String str2, String str3, String str4, siv siv) {
        this.b = str;
        this.d = str4;
        this.e = siv;
        this.c = str2;
        try {
            sga.b.c();
        } catch (IllegalStateException unused) {
        }
        aodg aodg = null;
        this.g = null;
        try {
            aodg = (aodg) a.get(new URL(str3).getHost());
        } catch (MalformedURLException unused2) {
        }
        if (aodg == null) {
            aodg = aodg.ENVIRONMENT_UNKNOWN;
        }
        this.f = aodg;
    }

    public final void a(View view, sfz sfz) {
        anbn anbn;
        amqw.a((Object) view);
        amqw.a((Object) sfz);
        aodm a = a();
        a.a(sfz.b());
        a.a(sfz.a());
        aodj aodj = (aodj) ((anxl) a.build());
        tru.a(view);
        siv siv = this.e;
        String str = this.c;
        trv b = (view == null || tru.a(view) == null) ? null : tru.b(view);
        if (b == null || b.a() == null) {
            anbn = null;
        } else {
            anbq anbq = (anbq) ((anxo) trt.a().toBuilder());
            anbt anbt = (anbt) anbu.e.createBuilder();
            anbt.a(472);
            anbq.a((anbu) ((anxl) anbt.build()));
            ArrayList arrayList = new ArrayList();
            angm angm = ((anbn) anbq.instance).b;
            if (angm == null) {
                angm = angm.d;
            }
            trt.a(arrayList, b, -1, angm);
            if (arrayList.size() > 0) {
                anbq.copyOnWrite();
                ((anbn) anbq.instance).c = anxl.emptyProtobufList();
                anbq.copyOnWrite();
                anbn = (anbn) anbq.instance;
                if (!anbn.c.a()) {
                    anbn.c = anxl.mutableCopy(anbn.c);
                }
                anvf.addAll(arrayList, anbn.c);
            }
            anbn = (anbn) ((anxl) anbq.build());
        }
        siv.a(str, aodj, null, anbn);
    }

    public final void a(View view, sfz sfz, aodi aodi) {
        amqw.a((Object) view);
        amqw.a((Object) sfz);
        amqw.a((Object) aodi);
        trs a = tru.a(view);
        if (a == null || a.a(4)) {
            aodm a2 = a();
            a2.a(sfz.b());
            a2.a(sfz.a());
            aodj aodj = (aodj) ((anxl) a2.build());
            siv siv = this.e;
            String str = this.c;
            String str2 = "ClientVe";
            anbn anbn = null;
            if (view != null) {
                trs a3 = tru.a(view);
                String valueOf;
                StringBuilder stringBuilder;
                if (a3 == null) {
                    valueOf = String.valueOf(view);
                    stringBuilder = new StringBuilder(valueOf.length() + 131);
                    stringBuilder.append("Failed to create ClientVisualElementsProto for user interaction on view ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(" because the view is not tagged for visual element logging.");
                    Log.e(str2, stringBuilder.toString());
                } else {
                    String str3 = " because that user interaction is not enabled for the VE.";
                    String str4 = " on ";
                    String str5 = "Failed to create ClientVisualElementsProto for user interaction ";
                    if (a3.a(4) || trs.e == 5) {
                        trx trx = a3.b;
                        if (trx == null) {
                            valueOf = String.valueOf(a3);
                            stringBuilder = new StringBuilder(valueOf.length() + 129);
                            stringBuilder.append("Failed to create ClientVisualElementsProto for user interaction on ");
                            stringBuilder.append(valueOf);
                            stringBuilder.append(" because there is no runtime impression information on the VE.");
                            Log.e(str2, stringBuilder.toString());
                        } else {
                            anbq anbq;
                            anbu anbu;
                            anxl anxl;
                            if (a3.a(4) || trs.e == 5) {
                                anbq = (anbq) ((anxo) trt.a().toBuilder());
                                anbt anbt = (anbt) anbu.e.createBuilder();
                                anbt.a(a3.a);
                                anbt.copyOnWrite();
                                anbu = (anbu) anbt.instance;
                                anbu.a |= 8;
                                anbu.d = 4;
                                anbq.a((anbu) ((anxl) anbt.build()));
                                anxl = (anbn) ((anxl) anbq.build());
                            } else {
                                String valueOf2 = String.valueOf(a3);
                                StringBuilder stringBuilder2 = new StringBuilder(valueOf2.length() + 136);
                                stringBuilder2.append(str5);
                                stringBuilder2.append(4);
                                stringBuilder2.append(str4);
                                stringBuilder2.append(valueOf2);
                                stringBuilder2.append(str3);
                                Log.e(str2, stringBuilder2.toString());
                                anxl = null;
                            }
                            anbq = (anbq) ((anxo) anxl.toBuilder());
                            if (anbq != null) {
                                angm angm = trx.b;
                                if (angm == null) {
                                    angm = angm.d;
                                }
                                anbq.copyOnWrite();
                                anbn anbn2 = (anbn) anbq.instance;
                                if (angm != null) {
                                    anbn2.d = angm;
                                    anbn2.a |= 2;
                                    anxl anxl2 = anbn2.f;
                                    if (anxl2 == null) {
                                        anxl2 = anbu.e;
                                    }
                                    anbt anbt2 = (anbt) ((anxo) anxl2.toBuilder());
                                    int i = trx.c;
                                    anbt2.copyOnWrite();
                                    anbu = (anbu) anbt2.instance;
                                    anbu.a = 4 | anbu.a;
                                    anbu.c = i;
                                    anbq.a((anbu) ((anxl) anbt2.build()));
                                    anbn = (anbn) ((anxl) anbq.build());
                                } else {
                                    throw new NullPointerException();
                                }
                            }
                        }
                    }
                    valueOf = String.valueOf(a3);
                    StringBuilder stringBuilder3 = new StringBuilder(valueOf.length() + 136);
                    stringBuilder3.append(str5);
                    stringBuilder3.append(4);
                    stringBuilder3.append(str4);
                    stringBuilder3.append(valueOf);
                    stringBuilder3.append(str3);
                    Log.e(str2, stringBuilder3.toString());
                }
            } else {
                Log.e(str2, "Failed to create ClientVisualElementsProto for user interaction because the view is null.");
            }
            siv.a(str, aodj, aodi, anbn);
            return;
        }
        throw new IllegalArgumentException("Attempted to log click on view without click tracking.");
    }

    public final void a(sfz sfz, sfz sfz2) {
        amqw.a((Object) sfz);
        amqw.a((Object) sfz2);
        aodm a = a();
        a.a(sfz2.b());
        a.a(sfz2.a());
        int b = sfz.b();
        a.copyOnWrite();
        aodj aodj = (aodj) a.instance;
        if (b != 0) {
            aodj.a |= 2;
            aodj.d = aodh.a(b);
            this.e.a(this.c, (aodj) ((anxl) a.build()), aodi.EVENT_TRANSITION, null);
            return;
        }
        throw new NullPointerException();
    }

    public final void a(sfz sfz, aodi aodi) {
        amqw.a((Object) sfz);
        amqw.a((Object) aodi);
        aodm a = a();
        a.a(sfz.b());
        a.a(sfz.a());
        this.e.a(this.c, (aodj) ((anxl) a.build()), aodi, null);
    }

    private final aodm a() {
        aodm aodm = (aodm) aodj.i.createBuilder();
        String str = this.b;
        aodm.copyOnWrite();
        aodj aodj = (aodj) aodm.instance;
        if (str != null) {
            aodj.a |= 64;
            aodj.h = str;
            str = sga.a.toString();
            aodm.copyOnWrite();
            aodj = (aodj) aodm.instance;
            if (str != null) {
                aodj.a |= 8;
                aodj.e = str;
                aodg aodg = this.f;
                aodm.copyOnWrite();
                aodj = (aodj) aodm.instance;
                if (aodg != null) {
                    aodj.a |= 16;
                    aodj.f = aodg.getNumber();
                    str = this.d;
                    aodm.copyOnWrite();
                    aodj = (aodj) aodm.instance;
                    if (str != null) {
                        aodj.a |= 32;
                        aodj.g = str;
                        return aodm;
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    static {
        amuu amuu = new amuu();
        amuu.b("oauthintegrations.googleapis.com", aodg.ENVIRONMENT_PROD);
        amuu.b("staging-oauthintegrations.sandbox.googleapis.com", aodg.ENVIRONMENT_STAGING);
        amuu.b("staging-qual-oauthintegrations.sandbox.googleapis.com", aodg.ENVIRONMENT_TEST_STAGING);
        amuu.b("autopush-oauthintegrations.sandbox.googleapis.com", aodg.ENVIRONMENT_AUTOPUSH);
        a = amuu.b();
    }
}
