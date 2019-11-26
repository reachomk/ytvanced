package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: wmy */
abstract class wmy implements akot, OnDismissListener {
    public boolean a;
    private final wmp b;

    public wmy(wmp wmp) {
        this.b = wmp;
    }

    public abstract void b();

    public void a_(akor akor, Object obj) {
        this.b.a.add(this);
        this.a = true;
    }

    public void a(akpb akpb) {
        this.b.a.remove(this);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.a) {
            b();
        }
    }
}
