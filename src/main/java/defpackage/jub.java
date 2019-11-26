package defpackage;

import android.text.TextUtils;

/* renamed from: jub */
final /* synthetic */ class jub implements Runnable {
    private final jty a;
    private final fob b;

    jub(jty jty, fob fob) {
        this.a = jty;
        this.b = fob;
    }

    public final void run() {
        jty jty = this.a;
        if (TextUtils.equals(this.b.b(), jty.c) && jty.a != null) {
            jty.f();
        }
    }
}
