package defpackage;

import com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBar;

/* renamed from: lkh */
final class lkh extends emo implements ajan, xcp {
    public final zyw i;
    public final ajam j;
    public final bdfu k = new bdfu();
    public final xci l;

    lkh(zyw zyw, ajam ajam, xci xci, InlineTimeBar inlineTimeBar) {
        super(inlineTimeBar, new emr());
        this.i = zyw;
        this.j = ajam;
        this.l = xci;
        a(aicd.a);
        inlineTimeBar.a(0);
        inlineTimeBar.a(true);
    }

    public final long e() {
        return 1;
    }

    public final void a(aicd aicd) {
        super.a(aicd);
        aihq aihq = this.c;
        aihq.s = false;
        aihq.q = false;
        aihq.r = false;
        aihq.m = 17170445;
        this.a.a(aihq);
    }

    public final void a(float f) {
        this.a.setAlpha(f);
    }

    public final void a(ahkm ahkm) {
        long j = ahkm.a;
        long j2 = ahkm.c;
        long j3 = ahkm.d;
        long j4 = ahkm.e;
        b(false);
        a(j, j2, j3, j4);
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().b.f().a(emg.a(this.i, 2251799813685248L, 1)).a(new lkk(this), lkj.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkm.class};
        } else if (i == 0) {
            a((ahkm) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
