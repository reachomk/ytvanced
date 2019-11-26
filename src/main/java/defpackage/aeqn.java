package defpackage;

import android.os.Handler;

/* renamed from: aeqn */
final class aeqn implements ova {
    public final oyk a = new oyk();
    private Handler b;
    private oux c;

    public final void a(oux oux) {
        oux oux2 = this.c;
        if (oux != oux2) {
            if (oux2 != null) {
                oux2.a(this);
            }
            if (oux != null) {
                if (this.b == null) {
                    this.b = new Handler(ozp.a());
                }
                oux.a(this.b, this);
            }
            this.c = oux;
        }
    }

    public final void b(int i, long j, long j2) {
        this.a.a(new aeqq(i, j, j2));
    }
}
