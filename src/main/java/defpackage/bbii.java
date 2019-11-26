package defpackage;

/* renamed from: bbii */
final class bbii extends bbig {
    public final barz a;
    public final boolean b = true;
    private boolean c = false;
    private boolean d = false;

    bbii(barz barz) {
        this.a = barz;
    }

    public final void a(Object obj) {
        amqw.b(this.c ^ 1, (Object) "Stream was terminated by error, no further calls are allowed");
        amqw.b(this.d ^ 1, (Object) "Stream is already completed, no further calls are allowed");
        this.a.a(obj);
    }

    public final void a(Throwable th) {
        this.a.a("Cancelled by client with StreamObserver.onError()", th);
        this.c = true;
    }

    public final void a() {
        this.a.a();
        this.d = true;
    }

    public final void a(String str, Throwable th) {
        this.a.a(str, th);
    }
}
