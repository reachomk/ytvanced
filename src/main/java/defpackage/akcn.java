package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: akcn */
public class akcn implements OnClickListener, OnDismissListener {
    private boolean a = false;
    public final aaas d;
    public final Object e;
    public AlertDialog f;

    protected akcn(aaas aaas, Object obj) {
        this.d = (aaas) amqw.a((Object) aaas);
        this.e = obj;
    }

    /* Access modifiers changed, original: protected */
    public void a() {
    }

    /* Access modifiers changed, original: protected */
    public void a(int i) {
    }

    /* Access modifiers changed, original: protected */
    public void b() {
    }

    /* Access modifiers changed, original: protected */
    public boolean b(int i) {
        return false;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        amqw.b(dialogInterface == this.f);
        if (i >= 0) {
            a(i);
        } else if (i == -1) {
            a();
            c(1);
        } else if (i == -3) {
            c(2);
        } else {
            if (i == -2) {
                b();
                c(3);
            }
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.a) {
            this.a = true;
            b(5);
        }
    }

    public final void a(AlertDialog alertDialog) {
        amqw.a((Object) alertDialog);
        amqw.b(this.f == null);
        this.f = alertDialog;
        this.f.setOnDismissListener(this);
    }

    public final void d() {
        amqw.b(this.f != null);
        this.f.show();
    }

    public final void c(int i) {
        amqw.b(this.f != null);
        b(i);
        this.a = true;
        this.f.dismiss();
    }

    /* Access modifiers changed, original: protected */
    public Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.e);
        hashMap.put(acwi.b, Boolean.TRUE);
        return hashMap;
    }
}
