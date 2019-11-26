package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import defpackage.ngm;

final /* synthetic */ class EmbedImageClientService$$Lambda$0 implements Runnable {
    private final EmbedImageClientService a;
    private final ngm b;

    EmbedImageClientService$$Lambda$0(EmbedImageClientService embedImageClientService, ngm ngm) {
        this.a = embedImageClientService;
        this.b = ngm;
    }

    public final void run() {
        EmbedImageClientService embedImageClientService = this.a;
        embedImageClientService.a.remove(this.b);
    }
}
