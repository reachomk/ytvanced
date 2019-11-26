package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import android.provider.Settings.System;
import android.view.accessibility.CaptioningManager;

/* renamed from: akjq */
final /* synthetic */ class akjq implements bbmk {
    private final akjn a;
    private final Context b;
    private final akdy c;

    akjq(akjn akjn, Context context, akdy akdy) {
        this.a = akjn;
        this.b = context;
        this.c = akdy;
    }

    public final void a(bbmh bbmh) {
        akjn akjn = this.a;
        Context context = this.b;
        akdy akdy = this.c;
        akjr akjr = new akjr(akjn, new Handler(context.getMainLooper()), bbmh);
        ContentResolver contentResolver = context.getContentResolver();
        contentResolver.registerContentObserver(System.CONTENT_URI, true, akjr);
        akju akju = new akju(akjn, bbmh);
        CaptioningManager captioningManager = akjn.a;
        if (captioningManager != null) {
            captioningManager.addCaptioningChangeListener(akju);
        }
        akjp akjp = new akjp(akjn, bbmh);
        if (akdy != null) {
            akdy.a(akjp);
        }
        bbmh.a(new akjs(akjn, contentResolver, akjr, akju, akdy, akjp));
    }
}
