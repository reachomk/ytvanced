package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: alqx */
public final class alqx implements alrw {
    public final Executor a;
    public final Set b = new HashSet();
    public volatile boolean c;
    public volatile alte d;
    private final ScheduledExecutorService e;
    private final Random f = new Random();
    private ScheduledFuture g;

    public alqx(Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.a = executor;
        this.e = scheduledExecutorService;
    }

    public final Uri a(String str, Uri uri) {
        return uri;
    }

    public final void a(alrz alrz) {
        this.b.add(alrz);
    }

    public final void a() {
        this.g = this.e.schedule(new alqw(this), ((long) this.f.nextInt(500)) + 500, TimeUnit.MILLISECONDS);
    }

    public final void b() {
        this.c = false;
        this.d = null;
        ScheduledFuture scheduledFuture = this.g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.g = null;
        }
        this.a.execute(new alqz(this));
    }

    public final void c() {
        a();
    }

    public final boolean d() {
        return this.c;
    }

    public final List e() {
        if (this.d == null) {
            Collections.emptyList();
        }
        axqs axqs = (axqs) axqt.g.createBuilder();
        axqs.a();
        axqs.a(3);
        return Collections.singletonList((axqt) ((anxl) axqs.build()));
    }

    public final Future a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (str.hashCode() % 2 == 0) {
            arrayList.add(altj.j().a(18).a(2000).b(-1).a());
        }
        String.format(Locale.US, "Fetching fake metadata. videoId = %s, cached = %s", new Object[]{str, Boolean.valueOf(arrayList.isEmpty() ^ 1)});
        afsx a = afsx.a();
        this.e.schedule(new alqy(this, a, new altl(str, arrayList)), ((long) this.f.nextInt(950)) + 50, TimeUnit.MILLISECONDS);
        return a;
    }

    public final Future a(String str) {
        return a(str, null);
    }

    public final alte g() {
        return this.d;
    }
}
