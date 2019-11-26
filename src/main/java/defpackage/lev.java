package defpackage;

import java.util.Arrays;

/* renamed from: lev */
public class lev {
    public final String a;
    public final leh b;
    public int c = 0;
    public apxu d;

    lev(String str, leh leh) {
        this.a = str;
        this.b = leh;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(int i) {
        int i2;
        if (i == 5) {
            i2 = this.c;
            if (i2 != 0) {
                if (i2 == 1) {
                    this.c = 5;
                    a();
                    return;
                }
            }
        }
        while (true) {
            i2 = this.c;
            if (i2 != i) {
                if (i <= i2) {
                    if (i < i2) {
                        amqw.b(i2 < 5);
                        i2 = this.c;
                        if (i2 <= 2) {
                            break;
                        }
                        if (i2 == 4) {
                            this.c = 3;
                            i2 = 3;
                        }
                        this.c = i2 - 1;
                        a();
                    } else {
                        continue;
                    }
                } else {
                    amqw.b(true);
                    this.c++;
                    a();
                }
            } else {
                break;
            }
        }
    }

    private final void a() {
        int i = this.c;
        if (i == 1) {
            this.b.a(this.d);
        } else if (i == 2) {
            this.b.h();
            this.b.n().b();
        } else if (i == 3) {
            this.b.j();
        } else if (i == 4) {
            this.b.i();
        } else if (i == 5) {
            this.b.g();
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lev) {
            lev lev = (lev) obj;
            if (amqq.a(this.a, lev.a) && amqq.a(this.b, lev.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
