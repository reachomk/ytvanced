package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedInteractionLoggingService.Stub;
import defpackage.acwc;
import defpackage.msf;
import defpackage.nhm;

public class EmbedInteractionLoggingService extends Stub {
    private final EmbedInteractionLoggerCoordinator a;

    public EmbedInteractionLoggingService(EmbedInteractionLoggerCoordinator embedInteractionLoggerCoordinator) {
        this.a = embedInteractionLoggerCoordinator;
    }

    public final int a(int i) {
        return this.a.a(i);
    }

    public final void b(int i) {
        this.a.b(i);
    }

    public final void c(int i) {
        this.a.c(i);
    }

    public final void a(int i, nhm nhm, boolean z) {
        this.a.a(i, msf.a(nhm), z);
    }

    public final void d(int i) {
        this.a.b(acwc.a(i));
    }

    public final void e(int i) {
        this.a.a(acwc.a(i));
    }
}
