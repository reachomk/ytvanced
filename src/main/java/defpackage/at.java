package defpackage;

import android.os.Handler;

/* renamed from: at */
public final class at implements af {
    public static final at i = new at();
    public int a = 0;
    public int b = 0;
    public boolean c = true;
    public boolean d = true;
    public Handler e;
    public final ai f = new ai(this);
    public final Runnable g = new as(this);
    public final ax h = new av(this);

    public final void a() {
        if (this.a == 0 && this.c) {
            this.f.a(aa.ON_STOP);
            this.d = true;
        }
    }

    private at() {
    }

    public final x y_() {
        return this.f;
    }
}
