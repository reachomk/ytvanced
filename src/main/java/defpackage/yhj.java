package defpackage;

import android.widget.Toast;
import com.google.android.youtube.R;

/* renamed from: yhj */
final class yhj implements alht {
    private final /* synthetic */ yhk a;

    public final Object a() {
        return this.a.f;
    }

    public final void c() {
        yhk yhk = this.a;
        int i = yhk.b;
        int i2 = i - 1;
        if (i != 0) {
            Object obj;
            boolean z = false;
            if (i2 == 0) {
                obj = 2;
            } else if (i2 != 2) {
                Toast.makeText(yhk.a, R.string.common_error_forbidden_action, 0).show();
                return;
            } else {
                obj = 4;
            }
            if (obj == 2) {
                z = true;
            }
            yhk.a(z, true);
            return;
        }
        throw null;
    }

    public final void b() {
        yhk yhk = this.a;
        int i = yhk.b;
        int i2 = i - 1;
        if (i != 0) {
            boolean z = true;
            if (i2 != 1) {
                if (i2 == 3) {
                    z = false;
                } else {
                    return;
                }
            }
            yhk.a(z, false);
            return;
        }
        throw null;
    }

    public final void a(bqn bqn) {
        yhk yhk = this.a;
        int i = yhk.b;
        int i2 = i - 1;
        if (i != 0) {
            boolean z = true;
            if (i2 == 1) {
                z = false;
            } else if (i2 != 3) {
                return;
            }
            yhk.a(z, false);
            return;
        }
        throw null;
    }

    /* synthetic */ yhj(yhk yhk) {
        this.a = yhk;
    }
}
