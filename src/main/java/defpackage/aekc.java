package defpackage;

import android.os.Looper;

/* renamed from: aekc */
final class aekc extends Thread {
    private final /* synthetic */ aejy a;

    aekc(aejy aejy, String str) {
        this.a = aejy;
        super(str);
    }

    public final void run() {
        Looper.prepare();
        this.a.c();
        Looper.loop();
    }
}
