package defpackage;

/* renamed from: baxc */
public abstract class baxc extends baxh {
    private boolean a;
    public final bbho j;
    public bazn k;
    public boolean l;
    public batc m = batc.a;
    public boolean n = false;
    public Runnable o;
    public volatile boolean p;
    public boolean q;
    public boolean r;

    protected baxc(int i, bbho bbho, bbht bbht) {
        super(i, bbho, bbht);
        this.j = (bbho) amqw.a((Object) bbho, (Object) "statsTraceCtx");
    }

    public void a(boolean z) {
        throw null;
    }

    public final void b(bavx bavx, boolean z, baum baum) {
        amqw.a((Object) bavx, (Object) "status");
        amqw.a((Object) baum, (Object) "trailers");
        if (!this.q || z) {
            this.q = true;
            this.r = bavx.a();
            synchronized (this.t) {
                this.x = true;
            }
            if (this.n) {
                this.o = null;
                a(bavx, 1, baum);
                return;
            }
            this.o = new baxb(this, bavx, baum);
            if (z) {
                this.s.close();
            } else {
                this.s.a();
            }
        }
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ bbhq a() {
        return this.k;
    }

    public final void a(bavx bavx, int i, baum baum) {
        if (!this.a) {
            this.a = true;
            bbho bbho = this.j;
            int i2 = 0;
            if (bbho.b.compareAndSet(false, true)) {
                bawd[] bawdArr = bbho.a;
                int length = bawdArr.length;
                while (i2 < length) {
                    bawdArr[i2].a();
                    i2++;
                }
            }
            this.k.a(bavx, i, baum);
            bbht bbht = this.u;
            if (bbht == null) {
                return;
            }
            if (bavx.a()) {
                bbht.c++;
            } else {
                bbht.d++;
            }
        }
    }
}
