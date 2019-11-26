package defpackage;

import android.support.v7.app.AlertController;
import android.view.View;

/* renamed from: aec */
final class aec implements Runnable {
    private final /* synthetic */ View a;
    private final /* synthetic */ View b;
    private final /* synthetic */ AlertController c;

    aec(AlertController alertController, View view, View view2) {
        this.c = alertController;
        this.a = view;
        this.b = view2;
    }

    public final void run() {
        AlertController.a(this.c.g, this.a, this.b);
    }
}
