package defpackage;

import android.text.TextUtils;

/* renamed from: ppb */
public class ppb {
    private poq a;
    public final pon i;
    public final String j;

    protected ppb(String str, String str2) {
        ppj.a(str);
        this.j = str;
        this.i = new pon(str2);
        str = null;
        if (!TextUtils.isEmpty(null)) {
            pon pon = this.i;
            if (!TextUtils.isEmpty(null)) {
                str = String.format("[%s] ", new Object[]{null});
            }
            pon.a = str;
        }
    }

    public void a(long j, int i) {
    }

    public void a(String str) {
    }

    public void e() {
    }

    public final void a(poq poq) {
        this.a = poq;
        if (this.a == null) {
            e();
        }
    }

    public final void a(String str, long j) {
        Object[] objArr = new Object[]{str, null};
        this.a.a(this.j, str, j);
    }

    public final long f() {
        return this.a.a();
    }
}
