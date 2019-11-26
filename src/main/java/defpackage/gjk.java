package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;

/* renamed from: gjk */
final /* synthetic */ class gjk implements zkv {
    private final Activity a;
    private final bacy b;
    private final gjn c;
    private final Bitmap d;

    gjk(Activity activity, bacy bacy, gjn gjn, Bitmap bitmap) {
        this.a = activity;
        this.b = bacy;
        this.c = gjn;
        this.d = bitmap;
    }

    public final void a(zme zme) {
        Activity activity = this.a;
        bacy bacy = this.b;
        gjn gjn = this.c;
        Bitmap bitmap = this.d;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            baat baat = (baat) baao.c.createBuilder();
            baat.a(zme.b);
            baao baao = (baao) ((anxl) baat.build());
            bacw bacw = (bacw) ((anxo) bacy.b().toBuilder());
            bacx bacx = (bacx) bacw.instance;
            int i = bacx.b;
            bacx bacx2;
            if (i == 3) {
                bacd bacd = (bacd) ((anxo) ((baca) bacx.c).toBuilder());
                bacd.copyOnWrite();
                baca baca = (baca) bacd.instance;
                if (baao != null) {
                    baca.b = baao;
                    baca.a |= 1;
                    bacw.a(bacd);
                } else {
                    throw new NullPointerException();
                }
            } else if (i == 6) {
                baav baav = (baav) ((anxo) ((baas) bacx.c).toBuilder());
                baav.copyOnWrite();
                baas baas = (baas) baav.instance;
                if (baao != null) {
                    baas.b = baao;
                    baas.a |= 1;
                    bacw.a(baav);
                } else {
                    throw new NullPointerException();
                }
            } else if (i == 7) {
                bado bado = (bado) ((anxo) ((badp) bacx.c).toBuilder());
                bado.copyOnWrite();
                badp badp = (badp) bado.instance;
                if (baao != null) {
                    badp.b = baao;
                    badp.a |= 1;
                    bacw.a(bado);
                } else {
                    throw new NullPointerException();
                }
            } else if (i == 1) {
                badj badj = (badj) ((anxo) ((badg) bacx.c).toBuilder());
                badj.copyOnWrite();
                badg badg = (badg) badj.instance;
                if (baao != null) {
                    badg.f = baao;
                    badg.a |= 128;
                    bacw.a(badj);
                } else {
                    throw new NullPointerException();
                }
            } else if (i == 8) {
                badl badl = (badl) ((anxo) ((badi) bacx.c).toBuilder());
                badl.copyOnWrite();
                badi badi = (badi) badl.instance;
                if (baao != null) {
                    badi.b = baao;
                    badi.a |= 1;
                    bacw.copyOnWrite();
                    bacx2 = (bacx) bacw.instance;
                    bacx2.c = (anxl) badl.build();
                    bacx2.b = 8;
                } else {
                    throw new NullPointerException();
                }
            } else if (i == 9) {
                babj babj = (babj) ((anxo) ((babg) bacx.c).toBuilder());
                babj.copyOnWrite();
                babg babg = (babg) babj.instance;
                if (baao != null) {
                    babg.b = baao;
                    babg.a |= 1;
                    bacw.copyOnWrite();
                    bacx2 = (bacx) bacw.instance;
                    bacx2.c = (anxl) babj.build();
                    bacx2.b = 9;
                } else {
                    throw new NullPointerException();
                }
            }
            bacy.a(bacw);
            zki.a(bacy, zme);
            gjn.a(bacy);
            bitmap.recycle();
        }
    }
}
