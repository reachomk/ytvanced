package defpackage;

import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedImageClientService;

/* renamed from: myx */
final /* synthetic */ class myx implements Runnable {
    private final myv a;
    private final IEmbedImageClientService b;

    myx(myv myv, IEmbedImageClientService iEmbedImageClientService) {
        this.a = myv;
        this.b = iEmbedImageClientService;
    }

    public final void run() {
        this.a.b = this.b;
    }
}
