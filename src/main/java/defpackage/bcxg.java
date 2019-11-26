package defpackage;

/* renamed from: bcxg */
final class bcxg extends bcup {
    private boolean a;
    private boolean b;
    private final /* synthetic */ bdae c;
    private final /* synthetic */ bcup d;
    private final /* synthetic */ bcxh e;

    bcxg(bcxh bcxh, bdae bdae, bcup bcup) {
        this.e = bcxh;
        this.c = bdae;
        this.d = bcup;
    }

    public final void e_(Object obj) {
        if (!this.b) {
            this.a = true;
            try {
                obj = ((Boolean) this.e.a.a(obj)).booleanValue();
                if (obj != null) {
                    this.b = true;
                    this.c.a(Boolean.valueOf(1 ^ this.e.b));
                    b();
                }
            } catch (Throwable th) {
                bcva.a(th, this, obj);
            }
        }
    }

    public final void a(Throwable th) {
        if (this.b) {
            bdeh.a(th);
            return;
        }
        this.b = true;
        this.d.a(th);
    }

    public final void bM_() {
        if (!this.b) {
            this.b = true;
            if (this.a) {
                this.c.a(Boolean.valueOf(false));
            } else {
                this.c.a(Boolean.valueOf(this.e.b));
            }
        }
    }
}
