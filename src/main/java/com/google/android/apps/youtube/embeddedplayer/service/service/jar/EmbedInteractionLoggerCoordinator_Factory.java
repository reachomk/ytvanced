package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import defpackage.baqa;
import defpackage.bcaa;
import defpackage.xua;

public final class EmbedInteractionLoggerCoordinator_Factory implements baqa {
    private final bcaa a;
    private final bcaa b;

    private EmbedInteractionLoggerCoordinator_Factory(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static EmbedInteractionLoggerCoordinator_Factory a(bcaa bcaa, bcaa bcaa2) {
        return new EmbedInteractionLoggerCoordinator_Factory(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        return new EmbedInteractionLoggerCoordinator(this.a, (xua) this.b.get());
    }
}
