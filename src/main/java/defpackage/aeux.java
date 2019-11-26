package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;

@Deprecated
/* renamed from: aeux */
public final class aeux implements aeuy, Callback {
    private final aeuy a;
    private final Handler b = new Handler(Looper.getMainLooper(), this);

    public aeux(aeuy aeuy) {
        this.a = aeuy;
    }

    public final void a() {
        a(aeux.d(0));
    }

    public final void b() {
        a(aeux.d(1));
    }

    public final void c() {
        a(aeux.d(2));
    }

    public final void d() {
        a(aeux.d(3));
    }

    public final void e() {
        a(aeux.d(4));
    }

    public final void f() {
        a(aeux.d(7));
    }

    public final void a(afif afif) {
        a(aeux.a(8, (Object) afif));
    }

    public final void a(long j) {
        a(aeux.a(9, Long.valueOf(j)));
    }

    public final void b(long j) {
        a(aeux.a(10, Long.valueOf(j)));
    }

    public final void g() {
        a(aeux.d(5));
    }

    public final void h() {
        a(aeux.d(6));
    }

    public final void i() {
        a(aeux.d(21));
    }

    public final void a(aetv aetv) {
        a(aeux.a(11, (Object) aetv));
    }

    public final void a(int i) {
        a(aeux.a(15, Integer.valueOf(i)));
    }

    public final void a(long j, long j2) {
        a(aeux.a(16, new aetx(j, j2)));
    }

    public final void a(float f) {
        a(aeux.a(18, Float.valueOf(f)));
    }

    public final void a(String str, aevf aevf) {
        a(aeux.a(19, new aetu(str, aevf)));
    }

    public final void a(aett aett) {
        a(aeux.a(20, (Object) aett));
    }

    public final void j() {
        a(aeux.d(22));
    }

    public final void k() {
        a(aeux.d(23));
    }

    public final void b(int i) {
        Message d = aeux.d(24);
        d.arg1 = i;
        a(d);
    }

    public final void c(int i) {
        Message d = aeux.d(25);
        d.arg1 = i;
        a(d);
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                this.a.a();
                break;
            case 2:
                this.a.c();
                break;
            case 3:
                this.a.d();
                break;
            case 4:
                this.a.e();
                break;
            case 5:
                this.a.g();
                break;
            case 6:
                this.a.h();
                break;
            case 7:
                this.a.f();
                break;
            case 8:
                this.a.a((afif) message.obj);
                break;
            case 9:
                this.a.a(((Long) message.obj).longValue());
                break;
            case 10:
                this.a.b(((Long) message.obj).longValue());
                break;
            case 11:
                this.a.a((aetv) message.obj);
                break;
            case 15:
                this.a.a(((Integer) message.obj).intValue());
                break;
            case 16:
                aeuz aeuz = (aeuz) message.obj;
                this.a.a(aeuz.a(), aeuz.b());
                break;
            case 18:
                this.a.a(((Float) message.obj).floatValue());
                break;
            case 19:
                aeuw aeuw = (aeuw) message.obj;
                this.a.a(aeuw.a(), aeuw.b());
                break;
            case 20:
                this.a.a((aett) message.obj);
                break;
            case 21:
                this.a.i();
                break;
            case 22:
                this.a.j();
                break;
            case 23:
                this.a.k();
                break;
            case 24:
                this.a.b(message.arg1);
                break;
            case 25:
                this.a.c(message.arg1);
                break;
        }
        return true;
    }

    private static Message d(int i) {
        Message obtain = Message.obtain();
        obtain.what = i;
        return obtain;
    }

    private static Message a(int i, Object obj) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = obj;
        return obtain;
    }

    private final void a(Message message) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            handleMessage(message);
        } else {
            this.b.sendMessage(message);
        }
    }
}
