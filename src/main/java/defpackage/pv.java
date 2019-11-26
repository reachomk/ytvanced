package defpackage;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: pv */
public abstract class pv {
    public abstract rh a(pu puVar);

    public abstract void a();

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void b();

    public static pv a(af afVar) {
        return new px(afVar, ((bi) afVar).R_());
    }
}
