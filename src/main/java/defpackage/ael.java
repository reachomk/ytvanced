package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: ael */
public abstract class ael {
    public static int p = -100;
    public static final zl q = new zl();
    public static final Object r = new Object();

    public static ael a(Activity activity, aei aei) {
        return new aek(activity, aei);
    }

    public abstract View a(int i);

    public void a() {
    }

    public abstract void a(Toolbar toolbar);

    public abstract void a(View view);

    public abstract void a(View view, LayoutParams layoutParams);

    public abstract void a(CharSequence charSequence);

    public abstract void b();

    public abstract void b(int i);

    public abstract void b(View view, LayoutParams layoutParams);

    public abstract void c();

    public void c(int i) {
    }

    public abstract ads d();

    public abstract boolean d(int i);

    public abstract MenuInflater f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void p();

    public int r() {
        throw null;
    }

    public static ael a(Dialog dialog, aei aei) {
        return new aek(dialog, aei);
    }

    ael() {
    }

    public static void s() {
        asr.a = true;
    }

    static void a(ael ael) {
        synchronized (r) {
            ael.b(ael);
        }
    }

    public static void b(ael ael) {
        synchronized (r) {
            Iterator it = q.iterator();
            while (it.hasNext()) {
                ael ael2 = (ael) ((WeakReference) it.next()).get();
                if (ael2 != ael) {
                    if (ael2 != null) {
                    }
                }
                it.remove();
            }
        }
    }
}
