package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: abiy */
public final class abiy extends aaml {
    public final Set a = new HashSet();
    public String b;
    public String c;

    public abiy(aamd aamd, afpt afpt) {
        super("subscription/subscribe", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.b(this.a.size() > 0);
    }

    public final /* synthetic */ anzd c() {
        String str;
        ativ ativ = (ativ) atiw.f.createBuilder();
        Set set = this.a;
        ativ.copyOnWrite();
        atiw atiw = (atiw) ativ.instance;
        if (!atiw.c.a()) {
            atiw.c = anxl.mutableCopy(atiw.c);
        }
        anvf.addAll(set, atiw.c);
        if (!TextUtils.isEmpty(this.b)) {
            str = this.b;
            ativ.copyOnWrite();
            atiw = (atiw) ativ.instance;
            if (str != null) {
                atiw.a |= 2;
                atiw.d = str;
            } else {
                throw new NullPointerException();
            }
        }
        if (!TextUtils.isEmpty(this.c)) {
            str = this.c;
            ativ.copyOnWrite();
            atiw = (atiw) ativ.instance;
            if (str != null) {
                atiw.a |= 4;
                atiw.e = str;
            } else {
                throw new NullPointerException();
            }
        }
        return ativ;
    }
}
