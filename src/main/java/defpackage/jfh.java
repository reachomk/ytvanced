package defpackage;

import android.view.MenuItem;
import com.google.android.youtube.R;

/* renamed from: jfh */
public final class jfh implements ezu {
    private final aaas a;
    private final aphg b;

    public jfh(aaas aaas, aphg aphg) {
        this.a = (aaas) amqw.a((Object) aaas);
        this.b = (aphg) amqw.a((Object) aphg);
    }

    public final int a() {
        return R.id.add_connection;
    }

    public final void a(MenuItem menuItem) {
    }

    public final boolean b() {
        return true;
    }

    public final int c() {
        return R.menu.connections_overflow;
    }

    public final ezx d() {
        return null;
    }

    public final boolean b(MenuItem menuItem) {
        aphg aphg = this.b;
        if ((aphg.a & 4096) != 0) {
            aaas aaas = this.a;
            apxu apxu = aphg.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
        return true;
    }
}
