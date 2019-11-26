package defpackage;

import android.app.Application;
import android.content.Context;

/* renamed from: alvu */
public final class alvu extends alvp {
    private boolean a = false;
    private final Application b;
    private final xci c;
    private final tyy d;

    public alvu(Context context, xci xci) {
        this.b = (Application) amqw.a((Object) context);
        this.c = xci;
        this.d = new tyy(true);
        alvx alvx = new alvx();
    }

    public final boolean a(Context context, aycm aycm) {
        return false;
    }

    public final void a(aydm aydm) {
        aydm aydm2 = aydm;
        if ((aydm2.a & 16) != 0) {
            aydm aydm3;
            aydk aydk = aydm2.d;
            if (aydk == null) {
                aydk = aydk.o;
            }
            byte b = (byte) 0;
            if (aydk.b) {
                aydk aydk2;
                byte b2;
                byte b3;
                txv txv = new txv();
                aydk aydk3 = aydm2.d;
                if (aydk3 == null) {
                    aydk3 = aydk.o;
                }
                if (aydk3.c) {
                    aydk2 = aydm2.d;
                    if (aydk2 == null) {
                        aydk2 = aydk.o;
                    }
                    txv.e = amqp.c(new txz(aydk2.d));
                    b2 = (byte) 1;
                } else {
                    b2 = (byte) 0;
                }
                aydk2 = aydm2.d;
                if (aydk2 == null) {
                    aydk2 = aydk.o;
                }
                if (aydk2.e) {
                    txv.g = amqp.c(new tzb());
                    b2 = (byte) 1;
                }
                aydk2 = aydm2.d;
                if (aydk2 == null) {
                    aydk2 = aydk.o;
                }
                if (aydk2.f) {
                    txv.c = amqp.c(this.d);
                    b2 = (byte) 1;
                }
                aydk2 = aydm2.d;
                if (aydk2 == null) {
                    aydk2 = aydk.o;
                }
                if (aydk2.g) {
                    Object tzc;
                    aydk3 = aydm2.d;
                    if (aydk3 == null) {
                        aydk3 = aydk.o;
                    }
                    int i = aydk3.h;
                    aydk2 = aydm2.d;
                    if (aydk2 == null) {
                        aydk2 = aydk.o;
                    }
                    tzv alwd = aydk2.i ? new alwd() : null;
                    if (i > 0) {
                        tzc = new tzc(alwd, i);
                    } else {
                        tzc = new tzc(alwd);
                    }
                    txv.f = amqp.c(tzc);
                    b2 = (byte) 1;
                }
                aydk2 = aydm2.d;
                if (aydk2 == null) {
                    aydk2 = aydk.o;
                }
                if (aydk2.l) {
                    txv.k = amqp.c(new txr());
                    b2 = (byte) 1;
                }
                aydk2 = aydm2.d;
                if (aydk2 == null) {
                    aydk2 = aydk.o;
                }
                if (aydk2.m) {
                    txv.d = amqp.c(new tzq(true));
                    b2 = (byte) 1;
                }
                aydk2 = aydm2.d;
                if (aydk2 == null) {
                    aydk2 = aydk.o;
                }
                if ((aydk2.a & 32768) != 0) {
                    aydk2 = aydm2.d;
                    if (aydk2 == null) {
                        aydk2 = aydk.o;
                    }
                    aydi aydi = aydk2.n;
                    if (aydi == null) {
                        aydi = aydi.e;
                    }
                    if (aydi.b) {
                        tza tza = new tza();
                        tza.a = true;
                        aydk2 = aydm2.d;
                        if (aydk2 == null) {
                            aydk2 = aydk.o;
                        }
                        aydi = aydk2.n;
                        if (aydi == null) {
                            aydi = aydi.e;
                        }
                        tza.b = aydi.c;
                        aydk2 = aydm2.d;
                        if (aydk2 == null) {
                            aydk2 = aydk.o;
                        }
                        aydi = aydk2.n;
                        if (aydi == null) {
                            aydi = aydi.e;
                        }
                        boolean z = aydi.d;
                        tza.c = z;
                        if (z && !tza.b) {
                            tyv.d("PrimesMemoryLeakConfig", "Can not quantify leak size without heapdump", new Object[0]);
                        }
                        txv.l = amqp.c(new tyx(tza.a, tza.b, tza.c, (byte) 0));
                        b2 = (byte) 1;
                    }
                }
                if (b2 == (byte) 0) {
                    aydm3 = aydm2;
                    b3 = b2;
                } else {
                    txv.a = new alwb(this.c);
                    b3 = b2;
                    txd.a(txn.a(this.b, new alvw(txw.a(new txy(txv.a, txv.b, txv.c, txv.d, txv.e, txv.f, txv.g, txv.h, txv.i, txv.j, txv.k, txv.l, txv.m, txv.n, txv.o)))));
                    aydm3 = aydm;
                }
                aydk aydk4 = aydm3.d;
                if (aydk4 == null) {
                    aydk4 = aydk.o;
                }
                if (aydk4.f) {
                    txd.a().a.b();
                }
                aydk4 = aydm3.d;
                if (aydk4 == null) {
                    aydk4 = aydk.o;
                }
                if (aydk4.c) {
                    txd.a().a.c();
                }
                b = b3;
            } else {
                aydm3 = aydm2;
            }
            aydk aydk5 = aydm3.d;
            if (aydk5 == null) {
                aydk5 = aydk.o;
            }
            boolean z2 = aydk5.b && b != (byte) 0;
            this.a = z2;
        }
    }

    public final boolean a() {
        return this.a;
    }
}
