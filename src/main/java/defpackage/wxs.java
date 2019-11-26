package defpackage;

import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: wxs */
public abstract class wxs implements wxg {
    public static final LinkedBlockingQueue a = new LinkedBlockingQueue();
    private final wxg b;

    wxs(wxg wxg) {
        this.b = (wxg) amqw.a((Object) wxg);
    }

    public abstract void a(Runnable runnable);

    public final void a(Object obj, Object obj2) {
        wxr a = wxs.a();
        a.a = this.b;
        a.b = obj;
        a.c = obj2;
        a.d = null;
        a.e = true;
        a(a);
    }

    public final void a(Object obj, Exception exception) {
        wxr a = wxs.a();
        a.a = this.b;
        a.b = obj;
        a.d = exception;
        a.c = null;
        a.e = false;
        a(a);
    }

    private static wxr a() {
        wxr wxr = (wxr) a.poll();
        return wxr == null ? new wxr() : wxr;
    }
}
