package defpackage;

/* renamed from: ryl */
public final class ryl {
    public final rze a = new rze();

    public final void a(Object obj) {
        this.a.a(obj);
    }

    public final boolean b(Object obj) {
        ryi ryi = this.a;
        synchronized (ryi.a) {
            if (ryi.c) {
                return false;
            }
            ryi.c = true;
            ryi.e = obj;
            ryi.b.a(ryi);
            return true;
        }
    }

    public final void a(Exception exception) {
        this.a.a(exception);
    }

    public final boolean b(Exception exception) {
        ryi ryi = this.a;
        pzr.a((Object) exception, (Object) "Exception must not be null");
        synchronized (ryi.a) {
            if (ryi.c) {
                return false;
            }
            ryi.c = true;
            ryi.f = exception;
            ryi.b.a(ryi);
            return true;
        }
    }
}
