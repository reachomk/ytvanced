package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: cwj */
public final class cwj extends cmg {
    public cwo n;
    public coj o;
    public final cwg p = new cwg();
    private WeakReference q;

    public cwj(cmg cmg) {
        Context context = cmg.b;
        String str = cmg.c;
        cnh cnh = cmg.d;
        csq e = cmg.e();
        super(context, str, cnh);
        this.l = e;
    }

    public static cwj a(cwj cwj, cwh cwh) {
        cwj cwj2 = new cwj(cwj);
        cwj2.n = cwj.n;
        cwj2.o = cwj.o;
        cwj2.q = new WeakReference(cwh);
        return cwj2;
    }

    public final coj a(int i, Object[] objArr) {
        cwh cwh = (cwh) this.q.get();
        if (cwh != null) {
            return new coj(cwh, i, objArr);
        }
        throw new IllegalStateException("Called newEventHandler on a released Section");
    }

    public final cwh i() {
        return (cwh) this.q.get();
    }

    public final void a(csq csq) {
        this.l = csq;
    }

    /* Access modifiers changed, original: protected|final */
    public final csq d() {
        return this.l;
    }
}
