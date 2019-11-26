package defpackage;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: abza */
public class abza {
    public final Handler a;
    public final abzi b;

    public abza(String str) {
        amqw.a((Object) str);
        HandlerThread handlerThread = new HandlerThread(str, 0);
        handlerThread.start();
        Object handler = new Handler(handlerThread.getLooper());
        this.a = (Handler) amqw.a(handler);
        this.b = new abzi(handler.getLooper());
    }

    public final void a(abzo abzo) {
        synchronized (this.b) {
            this.b.g = abzo;
        }
    }

    public final void a() {
        synchronized (this.b) {
            this.b.a = false;
        }
    }

    public final void b() {
        a();
        a(new abze(this));
    }

    public final void a(Runnable runnable) {
        amqw.a((Object) runnable);
        this.a.post(runnable);
    }

    public final void a(Runnable runnable, Handler handler) {
        synchronized (this.b) {
            abzi abzi = this.b;
            abzi.d = runnable;
            abzi.c = handler;
        }
    }

    public final void a(abzk abzk) {
        amqw.a((Object) abzk);
        a(new abzg(this, new abzc(abzk)));
    }

    public final void c() {
        synchronized (this.b) {
            abzi abzi = this.b;
            if (abzi.a) {
                if (abzi.a()) {
                    this.b.b();
                } else {
                    a(this.b.h);
                }
            }
        }
    }

    public final abyq d() {
        return this.b.b;
    }
}
