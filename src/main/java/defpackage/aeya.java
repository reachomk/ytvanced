package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: aeya */
final class aeya implements okv {
    private final aexc b;

    aeya(aexc aexc) {
        this.b = aexc;
    }

    public final okq a() {
        return null;
    }

    public final synchronized List a(String str, boolean z, boolean z2) {
        List emptyList;
        aajj aajj;
        afak afak;
        Set emptySet;
        afaj afaj = this.b.j;
        if (afaj == null) {
            aajj = aajj.b;
            afak = null;
        } else {
            aajj = afaj.d();
            afak = afaj.g();
        }
        if (afak == null || afak.d != 2) {
            emptySet = Collections.emptySet();
        } else {
            emptySet = aajj.ai();
        }
        Set set = emptySet;
        Set ah = aajj.ah();
        if (afjk.a == null) {
            afjk.a = new afjp();
        }
        okq okq = (okq) afjk.a.a(str, z, ah, set, 0);
        if (okq == null) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = Collections.singletonList(okq);
        }
        return emptyList;
    }
}
