package defpackage;

import com.google.android.youtube.R;

/* renamed from: jkq */
final /* synthetic */ class jkq implements Runnable {
    private final jkp a;
    private final String b;
    private final boolean c;

    jkq(jkp jkp, String str, boolean z) {
        this.a = jkp;
        this.b = str;
        this.c = z;
    }

    public final void run() {
        jkp jkp = this.a;
        String str = this.b;
        boolean z = this.c;
        jkp.a.c.d(new fnn());
        fnp a = jkp.a.a(str, null);
        if (a != null && z) {
            jkj jkj = jkp.a;
            jkj.a(jkj.i, a);
            jkj.a(jkj.j, a);
            jkj.a(jkj.k, a);
            jkj.g.remove(a);
            xpr.a(jkp.a.a, (int) R.string.delete_inprogress_upload_done, 1);
        }
    }
}
