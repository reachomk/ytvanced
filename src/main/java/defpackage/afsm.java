package defpackage;

import android.content.SharedPreferences;

/* renamed from: afsm */
public final class afsm implements baqa {
    private final bcaa a;

    public afsm(bcaa bcaa) {
        this.a = bcaa;
    }

    public final /* synthetic */ Object get() {
        return new afsn((SharedPreferences) this.a.get());
    }
}
