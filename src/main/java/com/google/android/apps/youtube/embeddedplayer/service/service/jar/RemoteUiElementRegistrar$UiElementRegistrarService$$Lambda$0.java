package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

final /* synthetic */ class RemoteUiElementRegistrar$UiElementRegistrarService$$Lambda$0 implements Runnable {
    private final UiElementRegistrarService a;
    private final int b;

    RemoteUiElementRegistrar$UiElementRegistrarService$$Lambda$0(UiElementRegistrarService uiElementRegistrarService, int i) {
        this.a = uiElementRegistrarService;
        this.b = i;
    }

    public final void run() {
        UiElementRegistrarService uiElementRegistrarService = this.a;
        uiElementRegistrarService.a.b(this.b);
    }
}
