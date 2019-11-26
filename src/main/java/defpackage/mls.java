package defpackage;

import android.content.Context;

/* renamed from: mls */
final /* synthetic */ class mls implements amro {
    private final mlp a;

    mls(mlp mlp) {
        this.a = mlp;
    }

    public final Object get() {
        mlp mlp = this.a;
        Context context = mlp.d;
        int a = mlp.b.a();
        StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append(a);
        stringBuilder.append("_ep_prefs");
        return context.getSharedPreferences(stringBuilder.toString(), 0);
    }
}
