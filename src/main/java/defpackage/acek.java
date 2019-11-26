package defpackage;

import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;

/* renamed from: acek */
public final class acek {
    private static final SparseArray n = new acen();
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    private final acep o;
    private final Handler p;
    private int q = 0;

    public acek(Handler handler, acep acep) {
        this.o = acep;
        this.a = 1;
        this.p = new acem(this, handler.getLooper());
    }

    public static int a(int i) {
        if (i == 11 || i == 10 || i == 9) {
            return 9;
        }
        if (i == 4 || i == 8 || i == 7 || i == 6) {
            return 5;
        }
        if (i == 2) {
            i = 1;
        }
        return i;
    }

    public final void a() {
        this.j = false;
        f();
    }

    public final void b(int i) {
        this.g = true;
        this.d = i;
        f();
    }

    public final void b() {
        this.k = true;
        int i = this.a;
        if (i == 6) {
            f(6);
        } else if (i == 7 || i == 8 || i == 5) {
            f();
        } else if (this.f) {
            xtl.d("LiveSC: Stream was cancelled by user before it went live.");
        } else if (i == 13) {
            xtl.c("LiveSC: Stream went into Error state before it went live.");
        } else {
            StringBuilder stringBuilder = new StringBuilder(22);
            stringBuilder.append("State was: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final void c() {
        int i = this.a;
        if (i != 13) {
            this.c = acek.a(i);
            e(13);
        }
    }

    public final void c(int i) {
        int i2 = this.a;
        boolean z = i2 == 4 || i2 == 8 || i2 == 6 || i2 == 7;
        amqw.b(z);
        i2 = this.a;
        if (i2 == 4 || i2 == 6 || i2 == 7) {
            this.i = false;
        }
        this.f = true;
        this.q = i;
        f();
    }

    public final boolean d() {
        return this.a == 8;
    }

    public final boolean e() {
        int i = this.a;
        return i == 4 || i == 2 || i == 1 || i == 5 || i == 6 || i == 7 || i == 8;
    }

    public final void a(int i, boolean z, boolean z2, boolean z3) {
        xak.a();
        String str = "UNKNOWN";
        String valueOf = String.valueOf((String) n.get(this.a, str));
        String str2 = "update - Current state: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            str2.concat(valueOf);
        }
        if (z && !z3 && this.a == i) {
            String str3 = (String) n.get(i);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str3).length() + 32);
            stringBuilder.append("Entering ");
            stringBuilder.append(str3);
            stringBuilder.append(" state already occurred");
            xtl.d(stringBuilder.toString());
            return;
        }
        String valueOf2;
        if (z) {
            valueOf2 = String.valueOf((String) n.get(i, str));
            valueOf = "update - Entering state: ";
            if (valueOf2.length() == 0) {
                valueOf2 = new String(valueOf);
            } else {
                valueOf.concat(valueOf2);
            }
        }
        if (!z2 || this.a == i) {
            if (z2) {
                valueOf2 = String.valueOf((String) n.get(i, str));
                valueOf = "update - Exiting state: ";
                if (valueOf2.length() == 0) {
                    valueOf2 = new String(valueOf);
                } else {
                    valueOf.concat(valueOf2);
                }
            }
            this.a = i;
            boolean z4 = true;
            switch (i) {
                case 1:
                    if (!this.m) {
                        if (z) {
                            this.b = 1;
                            this.o.d(false);
                        }
                        if (!this.l) {
                            e(2);
                            break;
                        }
                    }
                    this.b = 2;
                    e(5);
                    break;
                    break;
                case 2:
                    if (z) {
                        this.g = false;
                        this.o.e();
                        return;
                    } else if (this.g) {
                        e(3);
                        return;
                    } else if (z2) {
                        e(4);
                        return;
                    }
                    break;
                case 3:
                    if (z) {
                        this.o.f_(this.d);
                        return;
                    }
                    break;
                case 4:
                    if (z) {
                        this.j = true;
                        this.o.d();
                        return;
                    } else if (this.f) {
                        e(9);
                        return;
                    } else if (!this.j) {
                        e(6);
                        return;
                    }
                    break;
                case 5:
                    if (z) {
                        acep acep = this.o;
                        if (this.b != 2) {
                            z4 = false;
                        }
                        acep.d(z4);
                    }
                    if (!this.l) {
                        if (this.j) {
                            e(4);
                            return;
                        } else {
                            e(6);
                            return;
                        }
                    }
                    break;
                case 6:
                    if (z) {
                        this.o.f();
                        return;
                    } else if (z2) {
                        if (!this.k || this.m) {
                            e(7);
                            return;
                        } else {
                            e(8);
                            return;
                        }
                    } else if (this.f) {
                        e(9);
                        return;
                    }
                    break;
                case 7:
                    if (z) {
                        this.o.g();
                        return;
                    } else if (this.k) {
                        e(8);
                        return;
                    } else if (this.f) {
                        e(9);
                        return;
                    }
                    break;
                case 8:
                    if (z) {
                        this.b = 2;
                        this.o.bn_();
                        return;
                    } else if (this.f) {
                        e(9);
                        return;
                    }
                    break;
                case 9:
                    if (z) {
                        this.o.j();
                        if (!this.k) {
                            e(11);
                            return;
                        } else if (!this.h || this.e) {
                            e(10);
                            return;
                        } else {
                            this.o.k();
                            return;
                        }
                    } else if (this.e) {
                        e(10);
                        return;
                    }
                    break;
                case 10:
                    if (z) {
                        Handler handler = this.p;
                        handler.sendMessageDelayed(Message.obtain(handler, 1003, 10, 0), 3000);
                        return;
                    } else if (z2) {
                        e(11);
                        return;
                    }
                    break;
                case 11:
                    if (z) {
                        this.o.l();
                        return;
                    } else if (z2) {
                        e(12);
                        return;
                    }
                    break;
                case 12:
                    if (z) {
                        this.o.g_(this.q);
                        return;
                    }
                    break;
                case 13:
                    if (z) {
                        this.o.m();
                        return;
                    } else if (z2) {
                        e(this.c);
                        return;
                    }
                    break;
            }
            return;
        }
        xtl.d("Exiting current state already occurred");
    }

    public final void f() {
        this.p.sendEmptyMessage(1000);
    }

    public final void d(int i) {
        Handler handler = this.p;
        handler.sendMessage(Message.obtain(handler, 1001, i, 0));
    }

    public final void e(int i) {
        Handler handler = this.p;
        handler.sendMessage(Message.obtain(handler, 1002, i, 0));
    }

    public final void f(int i) {
        Handler handler = this.p;
        handler.sendMessage(Message.obtain(handler, 1003, i, 0));
    }
}
