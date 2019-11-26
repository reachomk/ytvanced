package defpackage;

import android.app.Activity;
import android.content.res.Configuration;

/* renamed from: fjr */
public final class fjr implements exw, xoc {
    public final fjs a;
    public fjt b;
    private int c;
    private int d = 0;

    public fjr(Activity activity) {
        fjq fjq = new fjq(activity);
        this.a = fjq;
        a(activity.getResources().getConfiguration());
    }

    public final void a(int i) {
        int i2 = 0;
        if (this.a.d() && ((i == 2 && this.d == 1) || (i == 4 && this.d == 2))) {
            i = 0;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        this.a.a(-1);
                        i2 = i;
                        this.c = i2;
                    }
                } else if (!this.a.c() && fka.b(this.a.a()) && this.a.a() == this.a.b()) {
                    this.a.a(-1);
                    this.c = i2;
                }
                this.a.a(6);
                i2 = i;
                this.c = i2;
            }
        } else if (!this.a.c() && fka.a(this.a.a()) && this.a.a() == this.a.b()) {
            this.a.a(-1);
            this.c = i2;
        }
        this.d = 1;
        this.a.a(7);
        i2 = i;
        this.c = i2;
    }

    public final void a(Configuration configuration) {
        if (this.a.e() == -1) {
            this.d = configuration.orientation;
        }
    }

    public final void a(boolean z, int i) {
        this.a.a(z, i);
        b(z, i);
    }

    public final void b(boolean z, int i) {
        int a = this.a.a();
        this.a.b(z, i);
        if (!this.a.c()) {
            int a2 = this.a.a();
            fjt fjt;
            if (a != 2) {
                if (a == 1 && a2 == 2) {
                    a2 = this.c;
                    if (a2 == 2) {
                        a(0);
                    } else if (a2 == 3) {
                        fjt = this.b;
                        if (fjt != null) {
                            fjt.a(2);
                        }
                    }
                }
            } else if (a2 == 1) {
                a2 = this.c;
                if (a2 == 4) {
                    a(0);
                } else if (a2 == 5) {
                    fjt = this.b;
                    if (fjt != null) {
                        fjt.a(1);
                    }
                }
            }
        }
    }
}
