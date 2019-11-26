package defpackage;

import android.content.SharedPreferences;

/* renamed from: mne */
public final class mne implements baqa {
    private final bcaa a;
    private final bcaa b;

    public mne(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public final /* synthetic */ Object get() {
        return new mnb((SharedPreferences) this.a.get(), (mni) this.b.get());
    }
}
