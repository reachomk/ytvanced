package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.EditText;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: abwt */
public final class abwt implements abrl, OnDismissListener, xcp {
    public final abwi a;
    public final EditText b;
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    public abrl d;
    private final Dialog e;
    private boolean f;

    public abwt(Context context, xci xci, abwl abwl) {
        this.e = new Dialog(context, R.style.action_panel_dialog_theme);
        this.e.setOnDismissListener(this);
        this.a = abwl.a(LayoutInflater.from(context).inflate(R.layout.live_chat_action_panel_dialog, null, false), true);
        this.b = this.a.e();
        this.e.setContentView(this.a.r);
        abwi abwi = this.a;
        abwi.p = true;
        abwi.q = true;
        xci.a((Object) this);
    }

    public final void a(ajwv ajwv, Editable editable, boolean z, boolean z2) {
        this.e.show();
        Window window = this.e.getWindow();
        window.setLayout(-1, -2);
        LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.dimAmount = 0.0f;
        window.setAttributes(attributes);
        this.f = z2;
        if (ajwv != null) {
            this.a.a();
            this.a.a(ajwv);
        }
        if (editable != null) {
            this.b.setText(editable);
            this.b.setSelection(editable.length());
        }
        if (z) {
            this.a.t();
        }
        int i = z ^ 1;
        Window window2 = this.e.getWindow();
        if (window2 == null) {
            return;
        }
        if (i == 0) {
            window2.setSoftInputMode(3);
        } else {
            window2.setSoftInputMode(5);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((abws) it.next()).a(this.a.p());
        }
    }

    public final void a(CharSequence charSequence) {
        if (this.d != null) {
            a();
            this.d.a(charSequence);
        }
    }

    public final void a(augl augl) {
        if (this.d != null) {
            a();
            this.d.a(augl);
        }
    }

    public final void a(apxu apxu) {
        if (this.d != null) {
            a();
            this.d.a(apxu);
        }
    }

    public final void b() {
        this.e.dismiss();
        abrl abrl = this.d;
        if (abrl != null) {
            abrl.b();
        }
    }

    private final void a() {
        if (this.e.isShowing()) {
            this.e.dismiss();
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        boolean z = false;
        if (i == -1) {
            clsArr = new Class[]{ahjn.class};
        } else if (i == 0) {
            ahjn ahjn = (ahjn) obj;
            if (ahjn.a == airc.FULLSCREEN) {
                z = true;
            }
            if (!((ahjn.a == airc.FULLSCREEN || ahjn.a == airc.DEFAULT) && this.f == z)) {
                a();
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
