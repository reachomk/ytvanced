package defpackage;

import android.util.Base64;

/* renamed from: aajn */
public final class aajn implements Runnable {
    private final aajj a;
    private final /* synthetic */ aajk b;

    public final void run() {
        this.b.b.edit().putString("com.google.android.libraries.youtube.innertube.pref.player_config_supplier", Base64.encodeToString(this.a.aF(), 0)).apply();
    }

    public /* synthetic */ aajn(aajk aajk, aajj aajj) {
        this.b = aajk;
        this.a = (aajj) amqw.a((Object) aajj);
    }
}
