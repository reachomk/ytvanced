package defpackage;

/* renamed from: airp */
public final class airp implements airt, xcp {
    private final xci a;
    private Throwable b;
    private aahr c;
    private volatile ahjn d = new ahjn(airc.DEFAULT, airc.DEFAULT);
    private airo e;

    public airp(xci xci) {
        this.a = xci;
    }

    public final synchronized void a() {
        b();
        this.b = null;
        this.e = new airo();
        this.a.a(this.e);
    }

    public final synchronized void b() {
        airo airo = this.e;
        if (airo != null) {
            this.a.b(airo);
            this.e = null;
            this.b = new Throwable("currentPlaybackSequenceMonitor became null here");
        }
    }

    public final synchronized boolean c() {
        return this.e != null;
    }

    public final synchronized int d() {
        l();
        return this.e.b.get();
    }

    public final synchronized boolean e() {
        boolean z;
        l();
        airo airo = this.e;
        z = airo.c || airo.a();
        return z;
    }

    public final synchronized boolean f() {
        l();
        return this.e.a();
    }

    public final ahjn g() {
        return this.d;
    }

    public final String h() {
        l();
        return this.e.a;
    }

    public final void a(boolean z) {
        l();
        this.e.c = z;
    }

    public final void b(boolean z) {
        l();
        this.e.d = z;
    }

    public final boolean i() {
        l();
        return this.e.d;
    }

    public final boolean j() {
        airo airo = this.e;
        return airo != null && airo.e;
    }

    public final void c(boolean z) {
        l();
        this.e.e = z;
    }

    public final aahr k() {
        return this.c;
    }

    private final void l() {
        if (!c()) {
            throw new RuntimeException("PlaybackMonitor queried outside playback sequence", this.b);
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aetv.class, ahjn.class};
        } else if (i == 0) {
            this.c = ((aetv) obj).b;
            return null;
        } else if (i == 1) {
            this.d = (ahjn) obj;
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
