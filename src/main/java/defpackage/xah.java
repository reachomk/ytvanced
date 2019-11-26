package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.ConditionVariable;

/* renamed from: xah */
public abstract class xah {
    public final ConditionVariable a = new ConditionVariable();
    public final Object b = new Object();
    public boolean c;
    public Binder d;
    public final Class e;
    public final ServiceConnection f;

    public xah(Class cls) {
        this.e = (Class) amqw.a((Object) cls);
        this.f = new xag(this);
    }

    public abstract void a(Binder binder);

    public abstract void b(Binder binder);

    public final void a(Context context) {
        synchronized (this.b) {
            String str = "connect ";
            String simpleName = this.e.getSimpleName();
            if (simpleName.length() == 0) {
                simpleName = new String(str);
            } else {
                str.concat(simpleName);
            }
            if (!this.c) {
                this.c = true;
                Intent intent = new Intent(context, this.e);
                if (!context.bindService(intent, this.f, 1)) {
                    str = String.valueOf(intent);
                    StringBuilder stringBuilder = new StringBuilder(str.length() + 18);
                    stringBuilder.append("Could not bind to ");
                    stringBuilder.append(str);
                    throw new RuntimeException(stringBuilder.toString());
                }
            }
        }
    }

    public final Binder a() {
        Binder binder;
        synchronized (this.b) {
            binder = this.d;
        }
        return binder;
    }

    public final Binder b(Context context) {
        Binder binder;
        xak.b();
        a(context);
        xak.b();
        this.a.block();
        synchronized (this.b) {
            binder = this.d;
        }
        return binder;
    }
}
