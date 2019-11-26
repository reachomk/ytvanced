package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: aeol */
public final class aeol implements abfd {
    public final bcaa a;
    public final String b;
    private final ScheduledExecutorService c;
    private final zzf d;
    private final afjj e;
    private final zzl f;
    private final zyw g;
    private final xsc h;
    private final aajx i;
    private final aeve j;
    private final aamj k;

    public aeol(bcaa bcaa, ScheduledExecutorService scheduledExecutorService, zzf zzf, String str, afjj afjj, zzl zzl, zyw zyw, xsc xsc, aajx aajx, aeve aeve, aamj aamj) {
        this.a = bcaa;
        this.c = scheduledExecutorService;
        this.d = zzf;
        this.b = str;
        this.e = afjj;
        this.f = zzl;
        this.g = zyw;
        this.h = xsc;
        this.i = aajx;
        this.j = aeve;
        this.k = aamj;
    }

    public final void a(aamk aamk, aaje aaje, xhf xhf) {
        this.e.a.a(new aehp());
        int i = aaje.l ^ 1;
        aepd a = aepe.a(this.f, this.g, this.d, this.h);
        aeoh aeoh = null;
        if (a != null) {
            aaje.m = new aeoo(this, aamk);
            auuo auuo = this.f.b().k;
            if (auuo == null) {
                auuo = auuo.k;
            }
            avtg avtg = auuo.c;
            if (avtg == null) {
                avtg = avtg.k;
            }
            avte avte = avtg.e;
            if (avte == null) {
                avte = avte.x;
            }
            if (!avte.g) {
                try {
                    aeog aeog = new aeog(a.a, a.b, aaje.a());
                    aaje.h = (atbq) amqw.a(aepe.a(aaje, aeog));
                    aeoh = aeog;
                } catch (bpx unused) {
                    if (i != 0) {
                        aeol.a(xhf, aamk, "Invalid InnerTube authentication headers for Onesie");
                    }
                    return;
                } catch (aeok e) {
                    if (i != 0) {
                        aeol.a(xhf, aamk, aeol.a(e));
                    }
                    return;
                }
            }
            Object aeoq = new aeoq(this, aamk, xhf, aeoh);
            if (aaje.c() > 0) {
                aeoq.b.c.schedule(new aeop(aeoq), (long) aaje.c(), TimeUnit.MILLISECONDS);
            }
            aaje.i = (aajh) amqw.a(aeoq);
            ((aepu) this.a.get()).a(aaje, this.j.a(aaje.b));
            return;
        }
        if (i != 0) {
            aeol.a(xhf, aamk, null);
        }
    }

    public final void a(aaje aaje, aakj aakj) {
        String valueOf;
        StringBuilder stringBuilder;
        aogi r = aakj.r();
        if (r == null) {
            for (atdz atdz : aakj.a.d) {
                ated ated;
                if (atdz.a == 63112829) {
                    ated = (ated) atdz.b;
                } else {
                    ated = ated.d;
                }
                if ((ated.a & 1) != 0) {
                    anze anze = ated.b;
                    if (anze == null) {
                        anze = atej.s;
                    }
                    atep atep = ((ajxu) ajzv.a(anze, ajxu.class)).g;
                    if (!(atep == null || (atep.a & 1) == 0)) {
                        return;
                    }
                }
            }
            aajs aajs = aakj.c;
            if (!(aajs == null || aajs.k() == null)) {
                aaje.a(aajs);
                aaje.a(aakj.n().as());
                try {
                    ((aepu) this.a.get()).a(aaje, this.j.a(aaje.b));
                } catch (RuntimeException e) {
                    valueOf = String.valueOf(e);
                    stringBuilder = new StringBuilder(valueOf.length() + 59);
                    stringBuilder.append("LoadOnesieVideo for prefetched playbacks got an exception: ");
                    stringBuilder.append(valueOf);
                    aepe.a(stringBuilder.toString());
                }
            }
            return;
        }
        for (aogm aogm : r.c) {
            ayxm ayxm = aogm.b;
            if (ayxm == null) {
                ayxm = ayxm.o;
            }
            if ((ayxm.a & 1) != 0) {
                ajxu ajxu = (ajxu) this.k.a(ayxm.b.d(), ajxu.class);
                if (ajxu == null) {
                    aepe.a("Invalid prefetched ads PlayerResponse");
                } else {
                    aten aten = ajxu.b;
                    if (!(aten == null || ajxu.g == null || aten.i.isEmpty())) {
                        aakj aakj2 = new aakj(ajxu, 0, this.i);
                        aajs aajs2 = aakj2.c;
                        if (!(aajs2 == null || aajs2.k() == null)) {
                            aaje.a(aajs2.c);
                            aaje.a(aajs2);
                            aaje.a(aakj2.n().as());
                            try {
                                ((aepu) this.a.get()).a(aaje, this.j.a(aaje.b));
                                return;
                            } catch (RuntimeException e2) {
                                valueOf = String.valueOf(e2);
                                stringBuilder = new StringBuilder(valueOf.length() + 63);
                                stringBuilder.append("LoadOnesieVideo for prefetched ads playbacks got an exception: ");
                                stringBuilder.append(valueOf);
                                aepe.a(stringBuilder.toString());
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a(String str, aajf aajf) {
        this.c.execute(new aeon(this, str, aajf));
    }

    public static void a(xhf xhf, aamk aamk, String str) {
        if (str != null) {
            aepe.a(str);
        }
        xhf.b(aamk);
    }

    public static String a(Exception exception) {
        String a = afht.a((Object) exception, true);
        if (exception.getCause() == null) {
            return a;
        }
        a = String.valueOf(a);
        String a2 = afht.a(exception.getCause(), true);
        StringBuilder stringBuilder = new StringBuilder((a.length() + 7) + String.valueOf(a2).length());
        stringBuilder.append(a);
        stringBuilder.append(";cause.");
        stringBuilder.append(a2);
        return stringBuilder.toString();
    }
}
