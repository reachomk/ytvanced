package defpackage;

import android.util.SparseArray;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLoggerCoordinator;

/* renamed from: njb */
final class njb implements nhj {
    public static int a = 1;
    public int b;
    public final SparseArray c = new SparseArray();
    private final EmbedInteractionLoggerCoordinator d;
    private final mqy e;

    public final void a(int i) {
        arej arej = (arej) this.c.get(i);
        if (arej != null) {
            this.d.b(arej.l.d());
            mqy mqy = this.e;
            apxu apxu = arej.k;
            if (apxu == null) {
                apxu = apxu.d;
            }
            mqy.a(apxu, null);
        }
    }

    /* synthetic */ njb(EmbedInteractionLoggerCoordinator embedInteractionLoggerCoordinator, mqy mqy) {
        this.d = embedInteractionLoggerCoordinator;
        this.e = mqy;
    }
}
