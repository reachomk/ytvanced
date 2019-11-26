package defpackage;

import android.content.Context;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ptd */
public abstract class ptd {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void a(pth pth);

    public abstract void c();

    public abstract psa d();

    public abstract void e();

    public abstract boolean f();

    public abstract boolean g();

    public pts a(pts pts) {
        throw new UnsupportedOperationException();
    }

    public pts b(pts pts) {
        throw new UnsupportedOperationException();
    }

    public psw a(pss pss) {
        throw new UnsupportedOperationException();
    }

    public Context a() {
        throw new UnsupportedOperationException();
    }

    public Looper b() {
        throw new UnsupportedOperationException();
    }
}
