package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.widget.EditText;

/* renamed from: zlw */
public final class zlw {
    public final zmc a;
    public final zla b;
    public final zkz c;
    public final zkw d;

    zlw(zla zla, zkz zkz) {
        zmc zmc = new zmc(zla);
        zkw zkw = new zkw();
        this.b = zla;
        this.c = zkz;
        this.a = zmc;
        this.d = zkw;
    }

    public static Rect a(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getHitRect(rect);
        return rect;
    }

    public static Rect a(EditText editText) {
        Rect rect = new Rect();
        editText.getHitRect(rect);
        return rect;
    }

    public final void a(bacz bacz) {
        this.b.a(bacz);
    }

    public final void a(boolean z, zlz zlz) {
        zkz zkz = this.c;
        synchronized (zkz.c) {
            zkz.a.add(zlz);
        }
        zla zla = this.b;
        babr babr = (babr) babo.c.createBuilder();
        babr.copyOnWrite();
        babo babo = (babo) babr.instance;
        babo.a |= 1;
        babo.b = z;
        babo babo2 = (babo) ((anxl) babr.build());
        babp babp = (babp) babm.c.createBuilder();
        babp.copyOnWrite();
        babm babm = (babm) babp.instance;
        if (babo2 != null) {
            babm.b = babo2;
            babm.a = 4;
            zla.a.add((babm) ((anxl) babp.build()));
            return;
        }
        throw new NullPointerException();
    }
}
