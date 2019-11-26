package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.view.accessibility.CaptioningManager;
import android.view.accessibility.CaptioningManager.CaptioningChangeListener;

/* renamed from: akjs */
final /* synthetic */ class akjs implements bbnt {
    private final akjn a;
    private final ContentResolver b;
    private final ContentObserver c;
    private final CaptioningChangeListener d;
    private final akdy e;
    private final akdx f;

    akjs(akjn akjn, ContentResolver contentResolver, ContentObserver contentObserver, CaptioningChangeListener captioningChangeListener, akdy akdy, akdx akdx) {
        this.a = akjn;
        this.b = contentResolver;
        this.c = contentObserver;
        this.d = captioningChangeListener;
        this.e = akdy;
        this.f = akdx;
    }

    public final void a() {
        akjn akjn = this.a;
        ContentResolver contentResolver = this.b;
        ContentObserver contentObserver = this.c;
        CaptioningChangeListener captioningChangeListener = this.d;
        akdy akdy = this.e;
        akdx akdx = this.f;
        contentResolver.unregisterContentObserver(contentObserver);
        CaptioningManager captioningManager = akjn.a;
        if (!(captioningManager == null || captioningChangeListener == null)) {
            captioningManager.removeCaptioningChangeListener(captioningChangeListener);
        }
        if (akdy != null) {
            akdy.b(akdx);
        }
    }
}
