package defpackage;

import com.google.android.youtube.R;
import java.lang.ref.WeakReference;

/* renamed from: wcw */
public final class wcw implements wfh {
    public String a;
    private final WeakReference b;
    private final nd c;
    private final wei d;
    private final albi e;

    public wcw(wcq wcq, wjv wjv, wei wei, albi albi) {
        this.b = new WeakReference((wcq) amqw.a((Object) wcq));
        this.c = (nd) amqw.a((Object) wjv);
        this.d = (wei) amqw.a((Object) wei);
        this.e = (albi) amqw.a((Object) albi);
    }

    public final String a() {
        return this.a;
    }

    public final void a(akbo akbo) {
        if (((wcq) this.b.get()) != null) {
            this.c.f();
            ajri ajri = akbo.b;
            if (!(ajri == null || ajri.b == null)) {
                this.e.b(this.e.b().b(ajqy.a(akbo.b.b)).d());
            }
            akbn akbn = akbo.a;
            if (akbn != null) {
                ajsn ajsn = akbn.a;
                if (ajsn != null) {
                    this.d.c(ajsn);
                }
            }
        }
    }

    public final void a(bqn bqn) {
        wcq wcq = (wcq) this.b.get();
        if (wcq != null) {
            xpr.a(wcq.a, (int) R.string.error_post_failed, 1);
        }
    }
}
