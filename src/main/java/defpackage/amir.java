package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: amir */
public final class amir {
    private static final bcpu e = new bcpu(bcrr.a(10, 3600000));
    public final xsc a;
    public final ScheduledExecutorService b;
    public final alyz c;
    public final ambw d;
    private final amca f;

    public amir(xsc xsc, ScheduledExecutorService scheduledExecutorService, alyz alyz, ambw ambw, amca amca) {
        this.a = xsc;
        this.b = scheduledExecutorService;
        this.c = alyz;
        this.d = ambw;
        this.f = amca;
    }

    /* Access modifiers changed, original: final */
    public final amje a(String str, amip amip) {
        return new amje(str, this, amnb.a(TimeUnit.HOURS, this.b).a(new amiu(this, str, amip)));
    }

    /* Access modifiers changed, original: final */
    public final amje a(Iterable iterable, amip amip) {
        String str = ((amje) iterable.iterator().next()).a;
        return new amje(str, this, anic.a(new aniq(amul.a(iterable)), new amiw(this, str, amip), aniv.a));
    }

    public final String a(String str, amip amip, amjc amjc) {
        this.b.execute(new amiv(this, amjc, str, amip));
        str = String.valueOf(amip.a());
        String str2 = "Executing UploadTask ";
        return str.length() == 0 ? new String(str2) : str2.concat(str);
    }

    public final void a(String str, alzf alzf, amip amip, amjc amjc, long j, boolean z, String str2) {
        String str3 = str;
        amip amip2 = amip;
        try {
            amec amec;
            ambv a = this.c.a(str, alzf);
            this.f.a(a);
            amea amea = a.b;
            if (amea == null) {
                String.valueOf(str2).concat(" finished and job removed");
                amec = null;
            } else {
                amec = amip2.a(amea);
                String valueOf = String.valueOf(amec);
                String.valueOf(str2).length();
                valueOf.length();
            }
            if (!z) {
                if (amec == null) {
                    ameb ameb = (ameb) amec.g.createBuilder();
                    ameb.b(2);
                    amec = (amec) ((anxl) ameb.build());
                }
                ambw ambw = this.d;
                int i = amip2.g;
                int a2 = amee.a(amec.b);
                int i2 = 1;
                if (a2 == 0) {
                    a2 = 1;
                }
                int a3 = ayuc.a(amec.c);
                if (a3 == 0) {
                    a3 = 1;
                }
                if (str3 != null) {
                    ayte ayte = (ayte) aytb.f.createBuilder();
                    aysx a4 = ambw.a(str);
                    ayte.copyOnWrite();
                    aytb aytb = (aytb) ayte.instance;
                    if (a4 != null) {
                        aytb.b = a4;
                        aytb.a |= 1;
                        ayte.copyOnWrite();
                        aytb aytb2 = (aytb) ayte.instance;
                        if (i != 0) {
                            aytb2.a |= 2;
                            aytb2.c = i - 1;
                            a2--;
                            if (a2 == 1) {
                                i2 = 2;
                            } else if (a2 == 2) {
                                i2 = 3;
                            } else if (a2 == 3) {
                                i2 = 4;
                            }
                            ayte.copyOnWrite();
                            aytb aytb3 = (aytb) ayte.instance;
                            aytb3.a = 4 | aytb3.a;
                            aytb3.d = i2 - 1;
                            ayte.copyOnWrite();
                            aytb3 = (aytb) ayte.instance;
                            aytb3.a |= 8;
                            aytb3.e = a3 - 1;
                            aytb3 = (aytb) ((anxl) ayte.build());
                            if (aytb3 != null) {
                                asmz asmz = (asmz) asmw.f.createBuilder();
                                asmz.copyOnWrite();
                                asmw asmw = (asmw) asmz.instance;
                                asmw.c = aytb3;
                                asmw.b = 47;
                                ambw.a.a((asmw) ((anxl) asmz.build()));
                            }
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    throw new NullPointerException();
                }
                amip2.a(this.a.a() - j, amea);
            }
            a(str, amec, amip, amjc, str2);
        } catch (alzc e) {
            amjc.a.a(e);
        }
    }

    public final void a(String str, amec amec, amip amip, amjc amjc, String str2) {
        if (amec == null) {
            amjc.a.a(amjd.a(str).a());
            return;
        }
        int a = amee.a(amec.b);
        if (a != 0 && a == 3) {
            bcpu bcpu = new bcpu(new bcqa(this.a.a()), new bcqa(amec.e));
            bcqf bcqf = bcpu.a;
            if (bcqf == null) {
                bcqf = bcpu.a;
            }
            if (bcpu.compareTo(bcqf) > 0) {
                bcqf = e;
                if (bcqf == null) {
                    bcqf = bcpu.a;
                }
                if (bcpu.compareTo(bcqf) < 0) {
                    bcpu.a();
                    String.valueOf(str2).length();
                    amjc.a(this.b.schedule(new amiy(this, str, amip, amjc), bcpu.b, TimeUnit.MILLISECONDS));
                    return;
                }
                bcpu.a();
                String.valueOf(str2).length();
                amjc.a.a(amjd.a(str).a(amqp.b(bcpu)).a());
                return;
            }
            this.b.execute(new amix(this, str, amip, amjc));
            return;
        }
        amjc.a.a(amjd.a(str).a());
    }

    public final amje a(Iterable iterable, String str, amip amip) {
        if (amux.b(iterable, amja.a)) {
            Collection hashSet = new HashSet();
            amqp amqp = ampo.a;
            for (amjd amjd : iterable) {
                if (!amjd.d()) {
                    hashSet.addAll(amjd.b());
                    amqp c = amjd.c();
                    if (c.a()) {
                        if (amqp.a()) {
                            Object obj = (bcpu) amqp.b();
                            bcpu bcpu = (bcpu) c.b();
                            if (amwe.a.compare(obj, bcpu) > 0) {
                                obj = bcpu;
                            }
                            amqp = amqp.b(obj);
                        } else {
                            amqp = c;
                        }
                    }
                }
            }
            amjg a = amjd.a(str);
            a.a(amuw.a(hashSet));
            Object a2 = a.a(amqp).a();
            String a3 = amip.a();
            String valueOf = String.valueOf(a2);
            String.valueOf(a3).length();
            valueOf.length();
            return new amje(str, this, anjf.a(a2));
        }
        String.valueOf(amip.a()).concat(" unblocked");
        return a(str, amip);
    }
}
