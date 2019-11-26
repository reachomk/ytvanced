package defpackage;

import android.text.TextUtils;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* renamed from: vmu */
public final class vmu extends xto {
    private final /* synthetic */ aakj a;

    public vmu(Executor executor, String str, aakj aakj) {
        this.a = aakj;
        super(executor, str);
    }

    public final Object a() {
        Pattern pattern;
        atnu atnu;
        atdz atdz;
        aagr aagr;
        aagt a;
        atdz[] atdzArr = this.a.a.d;
        int length = atdzArr.length;
        int i = 0;
        while (true) {
            pattern = null;
            if (i >= length) {
                atnu = null;
                break;
            }
            atdz = atdzArr[i];
            if (((atdz.a == 63178286 ? (aywx) atdz.b : aywx.d).a & 1) == 0) {
                i++;
            } else {
                atnu = (atdz.a == 63178286 ? (aywx) atdz.b : aywx.d).b;
                if (atnu == null) {
                    atnu = atnu.d;
                }
            }
        }
        if (atnu == null) {
            aagr = null;
        } else {
            a = vng.a(atnu);
            a.S = Long.MAX_VALUE;
            aagr = (aagr) a.b();
        }
        if (aagr == null) {
            return null;
        }
        CharSequence charSequence;
        a = aagr.an();
        a.o = this.a.h();
        a.j = this.a.b();
        a.s = this.a.n();
        for (atdz atdz2 : this.a.a.d) {
            if (atdz2.a == 63178286) {
                charSequence = ((aywx) atdz2.b).c;
                break;
            }
        }
        charSequence = null;
        if (!TextUtils.isEmpty(charSequence)) {
            pattern = Pattern.compile(charSequence);
        }
        a.al = pattern;
        return (aagr) a.b();
    }
}
