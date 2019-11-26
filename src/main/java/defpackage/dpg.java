package defpackage;

import android.content.IntentFilter;

/* renamed from: dpg */
final class dpg implements Runnable {
    private final /* synthetic */ dos a;

    dpg(dos dos) {
        this.a = dos;
    }

    public final void run() {
        dos dos = this.a;
        xma xma = new xma(dos.aD, (xmc) dos.ag.get(), (xci) dos.i.get());
        xma.c = xma.b.b();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        xma.a.registerReceiver(xma, intentFilter);
    }
}
