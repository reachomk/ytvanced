package defpackage;

import android.content.SharedPreferences.Editor;

/* renamed from: adem */
final class adem implements Runnable {
    private final bbs a;
    private final /* synthetic */ adej b;

    adem(adej adej, bbs bbs) {
        this.b = adej;
        this.a = bbs;
    }

    public final void run() {
        Editor edit = this.b.a.edit();
        edit.putInt("MdxAutoCastCancelCount", 0);
        edit.apply();
        this.a.e();
        this.b.b = null;
    }
}
