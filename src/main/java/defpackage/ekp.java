package defpackage;

import android.app.Activity;
import android.os.Build.VERSION;
import java.util.Observable;
import java.util.Observer;

/* renamed from: ekp */
public final class ekp implements Observer, xpd {
    private static final boolean c = (VERSION.SDK_INT >= 24);
    private static final boolean d;
    public int a = 0;
    public ekr b;
    private final Activity e;
    private final ekn f;
    private final eiw g;
    private final boolean h;
    private final boolean i;
    private final eku j = new eku(this);
    private final fps k;
    private final fpr l = new eks(this);

    public ekp(Activity activity, ekn ekn, eiw eiw, fps fps) {
        boolean z = c;
        boolean z2 = d;
        this.e = activity;
        this.f = ekn;
        this.g = eiw;
        this.k = fps;
        this.h = z;
        this.i = z2;
    }

    private static boolean c(int i) {
        return i == 4 || i == 3;
    }

    private static int e(boolean z) {
        return !z ? 3 : 4;
    }

    public final void a(int i) {
        if (i == 0) {
            this.f.a(eko.WATCH_WHILE);
            if (this.h) {
                a();
            }
        } else if (i == 1) {
            a();
        } else if (i != 2) {
            b();
        } else if (!this.h) {
            b();
        }
    }

    public final void a(boolean z) {
        if (ekp.c(this.a)) {
            b(ekp.e(z));
        } else if (this.a == 2) {
            b(z);
        }
    }

    public final void update(Observable observable, Object obj) {
        if (this.a == 2) {
            a();
        }
    }

    private final void a() {
        b(this.e.hasWindowFocus());
    }

    private final void b(boolean z) {
        if (!ekp.c(this.a)) {
            int i = 2;
            if (!this.i || z) {
                for (int a : eiw.a) {
                    if ((amqq.a(this.g.a(a).a, afjs.a) ^ 1) == 0) {
                        break;
                    }
                }
                i = ekp.e(z);
            }
            b(i);
        }
    }

    private final void b() {
        if (this.a != 0) {
            b(1);
        }
    }

    public final void b(int i) {
        int i2 = this.a;
        Object obj = (i2 == 1 || i2 == 0) ? 1 : null;
        Object obj2 = (i == 1 || i == 0) ? 1 : null;
        if (i2 != i && ((obj == null || obj2 == null) && this.f.c == eko.WATCH_WHILE)) {
            if (this.b != null) {
                boolean c = ekp.c(i2);
                if (i != 0) {
                    if (i != 1) {
                        if (i != 3) {
                            if (i == 4) {
                                if (c) {
                                    this.b.a(true);
                                } else {
                                    d(true);
                                }
                            }
                        } else if (c) {
                            this.b.a(false);
                        } else {
                            d(false);
                        }
                    } else if (c) {
                        c(false);
                    }
                } else if (c) {
                    c(true);
                }
            }
            this.a = i;
            if (i2 == 2) {
                for (int a : eiw.a) {
                    this.g.a(a).deleteObserver(this);
                }
            }
            if (i == 2) {
                for (int a2 : eiw.a) {
                    this.g.a(a2).addObserver(this);
                }
            }
            i = this.a;
            if (i == 1 || i == 0) {
                eku eku = this.j;
                if (eku.a) {
                    xsb.b(eku.b.f.b, eko.WATCH_WHILE, eku);
                    eku.a = false;
                }
            } else {
                Object obj3 = this.j;
                if (!obj3.a) {
                    xsb.a(obj3.b.f.b, eko.WATCH_WHILE, obj3);
                    obj3.a = true;
                }
            }
        }
    }

    private final void c(boolean z) {
        this.b.c(z);
        this.k.b(this.l);
    }

    private final void d(boolean z) {
        if (this.b.e_(z)) {
            this.k.a(this.l);
        }
    }

    static {
        boolean z = true;
        if (VERSION.SDK_INT >= 23) {
            z = false;
        }
        d = z;
    }
}
