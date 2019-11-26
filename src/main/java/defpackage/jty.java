package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import java.util.HashSet;

/* renamed from: jty */
public final class jty extends ffv {
    public String c;
    private final HashSet d = new HashSet();
    private final Handler e;

    public jty(Handler handler) {
        this.e = handler;
    }

    public final boolean a(fob fob, int i) {
        if (fob.g()) {
            if (i == 1) {
                this.c = fob.b();
                this.e.postDelayed(new jub(this, fob), 5000);
            } else if (i == 2 && !this.d.contains(this.c)) {
                return false;
            }
        }
        return true;
    }

    public final void a(String str) {
        this.d.add(str);
        if (TextUtils.equals(str, this.c)) {
            f();
        }
    }
}
