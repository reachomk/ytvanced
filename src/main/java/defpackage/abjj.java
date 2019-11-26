package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: abjj */
public final class abjj extends aaml {
    public final Set a = new HashSet();
    public String b;
    public String c;

    public abjj(aamd aamd, afpt afpt) {
        super("subscription/unsubscribe", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.b(this.a.size() > 0);
    }

    public final /* synthetic */ anzd c() {
        String str;
        atiz atiz = (atiz) atja.f.createBuilder();
        Set set = this.a;
        atiz.copyOnWrite();
        atja atja = (atja) atiz.instance;
        if (!atja.c.a()) {
            atja.c = anxl.mutableCopy(atja.c);
        }
        anvf.addAll(set, atja.c);
        if (!TextUtils.isEmpty(this.b)) {
            str = this.b;
            atiz.copyOnWrite();
            atja = (atja) atiz.instance;
            if (str != null) {
                atja.a |= 2;
                atja.d = str;
            } else {
                throw new NullPointerException();
            }
        }
        if (!TextUtils.isEmpty(this.c)) {
            str = this.c;
            atiz.copyOnWrite();
            atja = (atja) atiz.instance;
            if (str != null) {
                atja.a |= 4;
                atja.e = str;
            } else {
                throw new NullPointerException();
            }
        }
        return atiz;
    }
}
