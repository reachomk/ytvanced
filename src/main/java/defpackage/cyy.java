package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;

/* renamed from: cyy */
final class cyy extends EditText {
    public final cyx a = new cyx(this);
    public cmg b;
    public coj c;
    public coj d;
    public coj e;
    public int f;

    cyy(Context context) {
        super(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        coj coj = this.d;
        if (coj != null) {
            Object obj = (dcd) cyq.b.a();
            if (obj == null) {
                obj = new dcd();
            }
            coj.a.m().a(coj, obj);
            cyq.b.a(obj);
        }
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        coj coj = this.e;
        if (coj != null) {
            Object obj = (czm) cyq.c.a();
            if (obj == null) {
                obj = new czm();
            }
            ((Boolean) coj.a.m().a(coj, obj)).booleanValue();
            cyq.c.a(obj);
        }
        return super.onKeyUp(i, keyEvent);
    }
}
