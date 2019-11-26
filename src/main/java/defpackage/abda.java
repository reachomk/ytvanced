package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abda */
public final class abda extends aaml {
    public String a = "";
    public long b = 0;
    public aqui c;
    public List d = new ArrayList();

    protected abda(aamd aamd, afpt afpt, String str, boolean z, boolean z2) {
        super("log_event", aamd, afpt, aall.DISABLED, z, str, Boolean.valueOf(z2));
        g();
    }

    public final boolean n() {
        return this.d.isEmpty();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(n() ^ 1);
    }

    /* renamed from: o */
    public final asnc c() {
        asnc asnc = (asnc) asnd.g.createBuilder();
        asnc.a(this.d);
        long currentTimeMillis = System.currentTimeMillis();
        asnc.copyOnWrite();
        asnd asnd = (asnd) asnc.instance;
        asnd.a |= 2;
        asnd.c = currentTimeMillis;
        asni asni = (asni) asnj.d.createBuilder();
        long j = this.b;
        if (j != 0) {
            asni.copyOnWrite();
            asnj asnj = (asnj) asni.instance;
            asnj.a |= 2;
            asnj.c = j;
        }
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            asni.copyOnWrite();
            asnj asnj2 = (asnj) asni.instance;
            if (str != null) {
                asnj2.a |= 1;
                asnj2.b = str;
            } else {
                throw new NullPointerException();
            }
        }
        asnc.copyOnWrite();
        asnd asnd2 = (asnd) asnc.instance;
        asnd2.d = (asnj) ((anxl) asni.build());
        asnd2.a |= 4;
        aqui aqui = this.c;
        if (aqui != null) {
            asnc.copyOnWrite();
            asnd2 = (asnd) asnc.instance;
            asnd2.a |= 32;
            asnd2.f = aqui.f;
        }
        return asnc;
    }
}
