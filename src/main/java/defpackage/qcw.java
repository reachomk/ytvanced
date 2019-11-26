package defpackage;

import android.content.Context;
import android.os.IBinder;

/* renamed from: qcw */
public abstract class qcw {
    private final String a;
    private Object b;

    protected qcw(String str) {
        this.a = str;
    }

    public abstract Object a(IBinder iBinder);

    public final Object a(Context context) {
        if (this.b == null) {
            pzr.a((Object) context);
            context = psl.c(context);
            if (context != null) {
                try {
                    this.b = a((IBinder) context.getClassLoader().loadClass(this.a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new qcv("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new qcv("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new qcv("Could not access creator.", e3);
                }
            }
            throw new qcv("Could not get remote context.");
        }
        return this.b;
    }
}
