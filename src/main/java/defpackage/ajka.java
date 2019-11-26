package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: ajka */
public final class ajka implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private ajka(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static ajka a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new ajka(bcaa, bcaa2, bcaa3);
    }

    public final /* synthetic */ Object get() {
        return new ajjl((Context) this.a.get(), (SharedPreferences) this.b.get(), (ahhq) this.c.get());
    }
}
