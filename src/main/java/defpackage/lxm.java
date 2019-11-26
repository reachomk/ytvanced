package defpackage;

import android.os.Bundle;

/* renamed from: lxm */
public final /* synthetic */ class lxm implements dxz {
    public static final dxz a = new lxm();

    private lxm() {
    }

    public final nd a(apxu apxu) {
        aljs aljs = new aljs();
        Bundle bundle = new Bundle();
        aobp.a(bundle, "phonebook_endpoint", (anze) apxu);
        aljs.f(bundle);
        return aljs;
    }
}
