package defpackage;

import java.util.concurrent.Executor;
import org.json.JSONException;

/* renamed from: adyw */
public class adyw implements adxz {
    public static final String f = xtl.b("MDX.transport");
    private final Executor a;
    private final xci b;
    private final adzc c = new adyy(this);
    public final adzb g;
    public int h = 0;
    public final Object i = new Object();

    public adyw(adzb adzb, Executor executor, xci xci) {
        this.g = (adzb) amqw.a((Object) adzb);
        this.a = (Executor) amqw.a((Object) executor);
        this.b = (xci) amqw.a((Object) xci);
        this.g.a(this.c);
    }

    public final void a(adya adya) {
    }

    public final void c() {
    }

    public final void d() {
    }

    public void a(adxy adxy) {
        adys adys = this.g.c;
        adys.a = adxy;
        for (adym adym = (adym) adys.b.poll(); adym != null; adym = (adym) adys.b.poll()) {
            try {
                String.format("Processing queued messages: %s", new Object[]{adym});
                adys.a.a(adym);
            } catch (JSONException unused) {
                String str = "MDX.transport";
                xtl.a(str, String.format("Could not process queued message: %s", new Object[]{adym}));
            }
        }
    }

    public final void a() {
        synchronized (this.i) {
            if (this.h == 0) {
                this.h = 1;
            }
        }
    }

    public void a(adiv adiv, adja adja) {
        this.b.d(new adcj(adiv, "local_ws"));
        this.a.execute(new adyz(this, adiv, adja));
    }

    public void a(boolean z) {
        synchronized (this.i) {
            this.h = 0;
        }
        this.g.b();
    }

    public final int e() {
        int i;
        synchronized (this.i) {
            i = this.h;
        }
        return i;
    }
}
