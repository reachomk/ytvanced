package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: dsq */
class dsq extends Activity implements uhf {
    private volatile uhd a;
    private final Object b = new Object();

    dsq() {
    }

    /* Access modifiers changed, original: protected */
    public void h() {
        throw null;
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        h();
        super.onCreate(bundle);
    }

    public final Object b() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new uhd(this);
                }
            }
        }
        return this.a.b();
    }
}
