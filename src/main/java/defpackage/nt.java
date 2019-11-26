package defpackage;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: nt */
public abstract class nt {
    public static final nr a = new nr();
    public nr b = null;

    public abstract nf a(int i);

    public abstract nf a(Bundle bundle, String str);

    public abstract nf a(String str);

    public abstract nl a(nf nfVar);

    public abstract or a();

    public abstract void a(Bundle bundle, String str, nf nfVar);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void a(ns nsVar);

    public abstract void b(int i);

    public abstract void b(ns nsVar);

    public abstract boolean b();

    public abstract void c();

    public abstract boolean d();

    public abstract int e();

    public abstract List f();

    public abstract boolean h();

    public nr g() {
        if (this.b == null) {
            this.b = a;
        }
        return this.b;
    }
}
