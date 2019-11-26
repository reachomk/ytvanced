package defpackage;

/* renamed from: adwn */
final /* synthetic */ class adwn implements adwj {
    private final adwl a;
    private final acvx b;

    adwn(adwl adwl, acvx acvx) {
        this.a = adwl;
        this.b = acvx;
    }

    public final void a(adwg adwg) {
        adwl adwl = this.a;
        acvx acvx = this.b;
        if (adwl.c != null) {
            int ordinal = adwg.ordinal();
            adqd adqd = null;
            acwc acwc = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : acwc.MDX_SMART_REMOTE_BUTTON_ENTER : acwc.MDX_SMART_REMOTE_BUTTON_RIGHT_ARROW : acwc.MDX_SMART_REMOTE_BUTTON_LEFT_ARROW : acwc.MDX_SMART_REMOTE_BUTTON_DOWN_ARROW : acwc.MDX_SMART_REMOTE_BUTTON_UP_ARROW;
            if (acwc != null) {
                atss atss = (atss) atst.q.createBuilder();
                atsg atsg = (atsg) atsh.c.createBuilder();
                atsg.a(!adwl.t ? 3 : 2);
                atss.a((atsh) ((anxl) atsg.build()));
                acvx.a(3, new acvs(acwc), (atst) ((anxl) atss.build()));
            }
            adqe adqe = adwl.c;
            int ordinal2 = adwg.ordinal();
            if (ordinal2 == 0) {
                adqd = adqd.KEY_UP;
            } else if (ordinal2 == 1) {
                adqd = adqd.KEY_DOWN;
            } else if (ordinal2 == 2) {
                adqd = adqd.KEY_LEFT;
            } else if (ordinal2 == 3) {
                adqd = adqd.KEY_RIGHT;
            } else if (ordinal2 == 4) {
                adqd = adqd.KEY_ENTER;
            }
            adqe.a(adqd);
        }
    }
}
