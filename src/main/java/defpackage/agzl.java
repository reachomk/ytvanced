package defpackage;

import android.content.Context;
import android.os.Binder;

/* renamed from: agzl */
public final class agzl implements agxk {
    private final Context a;
    private final xah b;

    public agzl(Context context, xah xah) {
        this.a = context;
        this.b = xah;
    }

    public final void a(agqz agqz) {
    }

    public final void a(agqz agqz, int i, agqf agqf) {
    }

    public final void b(agqz agqz) {
    }

    public final void c(agqz agqz) {
    }

    public final void d(agqz agqz) {
    }

    public final void e(agqz agqz) {
    }

    public final void f(agqz agqz) {
    }

    public final void a() {
        this.b.a(this.a);
    }

    public final void b() {
        xah xah = this.b;
        Context context = this.a;
        synchronized (xah.b) {
            String str = "disconnect ";
            String simpleName = xah.e.getSimpleName();
            if (simpleName.length() == 0) {
                simpleName = new String(str);
            } else {
                str.concat(simpleName);
            }
            if (xah.c) {
                xah.c = false;
                Binder binder = xah.d;
                if (binder != null) {
                    xah.b(binder);
                }
                context.unbindService(xah.f);
                xah.a.close();
                xah.d = null;
            }
        }
    }
}
