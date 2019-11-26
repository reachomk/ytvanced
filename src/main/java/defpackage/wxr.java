package defpackage;

/* renamed from: wxr */
final class wxr implements Runnable {
    public wxg a;
    public Object b;
    public Object c;
    public Exception d;
    public boolean e;

    private wxr() {
    }

    public final void run() {
        if (this.e) {
            this.a.a(this.b, this.c);
        } else {
            this.a.a(this.b, this.d);
        }
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = false;
        try {
            wxs.a.put(this);
        } catch (InterruptedException e) {
            xtl.b("Interrupted when releasing runnable to the queue", e);
        }
    }

    /* synthetic */ wxr(byte b) {
    }
}
