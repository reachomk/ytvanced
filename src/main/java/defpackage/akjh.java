package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.view.View;
import com.facebook.litho.ComponentTree;

/* renamed from: akjh */
public final class akjh implements skl {
    public final bbma a;
    public bbmz b;
    private final Context c;
    private final bapu d;
    private final bapu e;
    private AlertDialog f;

    public akjh(Context context, bapu bapu, bapu bapu2, swi swi) {
        this.c = context;
        this.d = bapu;
        this.e = bapu2;
        this.a = swi;
    }

    public final void a(aqwh aqwh, swg swg) {
        bbmz bbmz = this.b;
        if (bbmz != null) {
            bbmz.bK_();
        }
        this.b = new bbmz();
        swf swf = (swf) this.d.get();
        Builder builder = new Builder(this.c);
        if (!aqwh.b.isEmpty()) {
            builder.setTitle(aqwh.b);
        }
        if (!aqwh.c.isEmpty()) {
            builder.setMessage(aqwh.c);
        }
        OnClickListener onClickListener = null;
        if (!aqwh.d.isEmpty()) {
            builder.setPositiveButton(aqwh.d, (aqwh.a & 32) != 0 ? new akjk(this, swf, aqwh, swg) : null);
        }
        if (!aqwh.e.isEmpty()) {
            String str = aqwh.e;
            if ((aqwh.a & 64) != 0) {
                onClickListener = new akjj(this, swf, aqwh, swg);
            }
            builder.setNegativeButton(str, onClickListener);
        }
        if ((aqwh.a & 16) != 0) {
            View cpq = new cpq(this.c);
            cmg cmg = cpq.v;
            akei akei = (akei) this.e.get();
            swk a = swk.i().a(cpq).a(false).a();
            anvf anvf = aqwh.f;
            if (anvf == null) {
                anvf = azuj.c;
            }
            cmy a2 = ComponentTree.a(cmg, akei.a(cmg, a, anvf.toByteArray(), this.b));
            a2.c = false;
            cpq.a(a2.a());
            builder.setView(cpq);
        }
        if (VERSION.SDK_INT >= 17) {
            builder.setOnDismissListener(new akjm(this));
        }
        this.f = builder.create();
        this.f.show();
    }

    public final void a() {
        AlertDialog alertDialog = this.f;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.f = null;
        }
        bbmz bbmz = this.b;
        if (bbmz != null) {
            bbmz.bK_();
            this.b = null;
        }
    }
}
