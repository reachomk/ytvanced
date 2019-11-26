package defpackage;

import android.text.TextUtils;

/* renamed from: lri */
public abstract class lri implements lrm {
    private boolean a;
    private boolean b;
    private String c;
    private String d;

    public abstract String a(Object obj);

    public final boolean b(Object obj) {
        this.d = a(obj);
        String str = this.d;
        if (str == null) {
            return false;
        }
        obj = (this.b && TextUtils.equals(this.c, str)) ? 1 : null;
        if (!this.a || obj != null) {
            return true;
        }
        this.b = false;
        return false;
    }

    public final void a(int i, int i2) {
        boolean a = lrh.a(i);
        boolean a2 = lrh.a(i2);
        if (!a && a2) {
            this.a = true;
            this.b = true;
            this.c = this.d;
        } else if (a && !a2) {
            this.a = false;
        }
    }
}
