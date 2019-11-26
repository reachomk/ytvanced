package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abpe */
public final class abpe implements abxw {
    public final Handler a;
    public final akpk b = new akpk();
    public final Map c = new HashMap();
    public final abpi d = new abpi(this);

    public abpe(Handler handler) {
        this.a = handler;
    }

    public final void ah_() {
        xak.a();
        e();
    }

    public final void ai_() {
        xak.a();
        for (abpj abpj : this.c.values()) {
            long currentTimeMillis = (abpj.c + abpj.b) - System.currentTimeMillis();
            if (currentTimeMillis > 0) {
                this.a.postDelayed(abpj, currentTimeMillis);
            } else {
                this.a.post(abpj);
            }
        }
    }

    public final void aj_() {
        xak.a();
        for (abpj removeCallbacks : this.c.values()) {
            this.a.removeCallbacks(removeCallbacks);
        }
    }

    public final void ak_() {
        xak.a();
        e();
    }

    private final void e() {
        for (abpj removeCallbacks : this.c.values()) {
            this.a.removeCallbacks(removeCallbacks);
        }
        this.c.clear();
        this.b.clear();
    }

    public final void a(String str, Object obj, long j) {
        xak.a();
        if (!this.c.containsKey(str)) {
            abpj abpj = new abpj(this, str, obj, j, System.currentTimeMillis());
            this.c.put(str, abpj);
            this.b.add(0, obj);
            this.a.postDelayed(abpj, j);
        }
    }
}
