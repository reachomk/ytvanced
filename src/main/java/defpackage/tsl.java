package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: tsl */
public final class tsl {
    public final CopyOnWriteArrayList a;
    public final aac b;
    public int c;
    public long d;
    public boolean e;
    private boolean f;
    private final tsi g = new tsk(this);
    private final tsf h = new tsn(this);

    public tsl(tsj... tsjArr) {
        this.a = new CopyOnWriteArrayList(tsjArr);
        this.b = new aac(1);
        this.c = 1;
        tsjArr[0].a(this.g);
        this.b.put(tsjArr[0], Boolean.valueOf(true));
    }

    public final void a() {
        if (!this.f) {
            this.f = true;
            this.d = -1;
            c();
        }
    }

    public final void b() {
        if (this.f) {
            if (this.e) {
                this.e = false;
                tsd.a().b(this.h);
            }
            this.f = false;
        }
    }

    public final void c() {
        if (!this.e && this.f && this.c != 0) {
            this.e = true;
            tsd.a().a(this.h);
        }
    }
}
