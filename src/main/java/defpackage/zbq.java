package defpackage;

import java.util.Locale;

/* renamed from: zbq */
public final class zbq {
    private static final amur c;
    public final zn a;
    public zbw b = zbw.NO_HEART_ADDED;

    public zbq(zn znVar) {
        this.a = (zn) amqw.a((Object) znVar);
    }

    public final void a(zbs zbs) {
        zbx zbx = (zbx) ((amur) c.get(this.b)).get(zbs);
        if (zbx != null) {
            zbx.a(this);
            return;
        }
        throw new IllegalStateException(String.format(Locale.US, "No resolution for event %s when in state %s", new Object[]{zbs, this.b}));
    }

    static {
        amuu amuu = new amuu();
        zbw zbw = zbw.NO_HEART_ADDED;
        amuu amuu2 = new amuu();
        amuu2.b(zbs.HEART_CLICK, new zbv(zbw.ADDING_HEART, zbt.FILL_DUE_TO_CLICK));
        amuu2.b(zbs.UNHEART_CLICK, new zbu());
        amuu2.b(zbs.HEART_UPDATE, new zbv(zbw.ADDING_HEART, zbt.FILL_DUE_TO_UPDATE));
        amuu2.b(zbs.UNHEART_UPDATE, new zbu());
        amuu2.b(zbs.ANIMATION_FINISHED, new zby());
        amuu.b(zbw, amuu2.b());
        zbw = zbw.ADDING_HEART;
        amuu2 = new amuu();
        amuu2.b(zbs.HEART_CLICK, new zbu());
        amuu2.b(zbs.UNHEART_CLICK, new zbv(zbw.ADDING_HEART_REMOVE_WHEN_DONE));
        amuu2.b(zbs.HEART_UPDATE, new zbu());
        amuu2.b(zbs.UNHEART_UPDATE, new zbv(zbw.ADDING_HEART_REMOVE_WHEN_DONE));
        amuu2.b(zbs.ANIMATION_FINISHED, new zbv(zbw.HEART_ADDED));
        amuu.b(zbw, amuu2.b());
        zbw = zbw.HEART_ADDED;
        amuu2 = new amuu();
        amuu2.b(zbs.HEART_CLICK, new zbu());
        amuu2.b(zbs.UNHEART_CLICK, new zbv(zbw.REMOVING_HEART, zbt.UNFILL_DUE_TO_CLICK));
        amuu2.b(zbs.HEART_UPDATE, new zbu());
        amuu2.b(zbs.UNHEART_UPDATE, new zbv(zbw.REMOVING_HEART, zbt.UNFILL_DUE_TO_UPDATE));
        amuu2.b(zbs.ANIMATION_FINISHED, new zby());
        amuu.b(zbw, amuu2.b());
        zbw = zbw.REMOVING_HEART;
        amuu2 = new amuu();
        amuu2.b(zbs.HEART_CLICK, new zbv(zbw.REMOVING_HEART_ADD_WHEN_DONE));
        amuu2.b(zbs.UNHEART_CLICK, new zbu());
        amuu2.b(zbs.HEART_UPDATE, new zbv(zbw.REMOVING_HEART_ADD_WHEN_DONE));
        amuu2.b(zbs.UNHEART_UPDATE, new zbu());
        amuu2.b(zbs.ANIMATION_FINISHED, new zbv(zbw.NO_HEART_ADDED));
        amuu.b(zbw, amuu2.b());
        zbw = zbw.ADDING_HEART_REMOVE_WHEN_DONE;
        amuu2 = new amuu();
        amuu2.b(zbs.HEART_CLICK, new zbv(zbw.ADDING_HEART));
        amuu2.b(zbs.UNHEART_CLICK, new zbu());
        amuu2.b(zbs.HEART_UPDATE, new zbv(zbw.ADDING_HEART));
        amuu2.b(zbs.UNHEART_UPDATE, new zbu());
        amuu2.b(zbs.ANIMATION_FINISHED, new zbv(zbw.REMOVING_HEART, zbt.UNFILL_DUE_TO_UPDATE));
        amuu.b(zbw, amuu2.b());
        zbw = zbw.REMOVING_HEART_ADD_WHEN_DONE;
        amuu2 = new amuu();
        amuu2.b(zbs.HEART_CLICK, new zbu());
        amuu2.b(zbs.UNHEART_CLICK, new zbv(zbw.REMOVING_HEART));
        amuu2.b(zbs.HEART_UPDATE, new zbu());
        amuu2.b(zbs.UNHEART_UPDATE, new zbv(zbw.REMOVING_HEART));
        amuu2.b(zbs.ANIMATION_FINISHED, new zbv(zbw.ADDING_HEART, zbt.FILL_DUE_TO_UPDATE));
        amuu.b(zbw, amuu2.b());
        c = amuu.b();
    }
}
