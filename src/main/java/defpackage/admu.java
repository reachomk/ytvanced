package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: admu */
final /* synthetic */ class admu implements Runnable {
    private final adms a;
    private final adpy b;
    private final aagr c;

    admu(adms adms, adpy adpy, aagr aagr) {
        this.a = adms;
        this.b = adpy;
        this.c = aagr;
    }

    public final void run() {
        adms adms = this.a;
        adpy adpy = this.b;
        aagr aagr = this.c;
        if (!adms.o) {
            airi airi;
            ajpu ajpu;
            adms.i = adpy;
            if (adpy.a()) {
                airi = airi.INTERSTITIAL_PLAYING;
            } else if (adpy == adpy.BUFFERING || adpy == adpy.PLAYING || adpy == adpy.PAUSED || adpy == adpy.VIDEO_CUED) {
                airi = airi.VIDEO_PLAYING;
            } else if (adpy == adpy.ENDED) {
                airi = airi.ENDED;
            } else if (adms.k.a != null) {
                airi = airi.PLAYBACK_LOADED;
            } else {
                airi = airi.NEW;
            }
            adms.a(airi, aagr);
            switch (adpy.ordinal()) {
                case 0:
                case 6:
                    adms.a(adms.n, 4);
                    break;
                case 1:
                    break;
                case 2:
                    adms.a(adms.j);
                    adms.a(adms.n, 2);
                    break;
                case 3:
                    adms.a(adms.j);
                    adms.a(adms.n, 3);
                    break;
                case 4:
                    adms.a(adms.j);
                    adms.a(adms.n, 5);
                    break;
                case 7:
                    adms.a(adms.l);
                    adms.a(adms.n, 2);
                    break;
                case 8:
                    adms.a(vra.USER_SKIPPED);
                    break;
                case 9:
                    adms.a(vra.VIDEO_ENDED);
                    break;
                case 10:
                    adms.a(adms.l);
                    adms.a(adms.n, 3);
                    break;
                case 11:
                    adms.a(adms.l);
                    adms.a(adms.n, 5);
                    break;
                case 12:
                    adms.s();
                    adms.a(adms.n, 8);
                    break;
            }
            if (adms.h.a()) {
                ajpu = adms.l;
            } else {
                ajpu = adms.j;
            }
            adms.a(ajpu, 7);
            adms.a(0);
            if (adpy.b()) {
                if (!adms.e.hasMessages(1)) {
                    Handler handler = adms.e;
                    handler.sendMessageDelayed(Message.obtain(handler, 1), 1000);
                }
            } else if (adms.e.hasMessages(1)) {
                adms.e.removeMessages(1);
            }
        }
    }
}
