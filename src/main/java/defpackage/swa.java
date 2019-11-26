package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.google.android.youtube.R;

/* renamed from: swa */
final class swa {
    private static final cdh a = cdh.a(200);

    public static ScaleType a(int i) {
        if (i == 2) {
            return ScaleType.CENTER_INSIDE;
        }
        if (i == 3) {
            return ScaleType.CENTER_CROP;
        }
        if (i != 4) {
            return ScaleType.FIT_XY;
        }
        return ScaleType.CENTER;
    }

    private static brj a(Context context, bdhi bdhi, int i) {
        brj brj = null;
        if (swa.b(context)) {
            return null;
        }
        String str = null;
        int i2 = Integer.MAX_VALUE;
        for (bdhk bdhk : bdhi.a) {
            if (bdhk.b()) {
                int abs = Math.abs(bdhk.b - i);
                if (abs == 0) {
                    str = bdhk.a();
                    break;
                } else if (abs < i2) {
                    str = bdhk.a();
                    i2 = abs;
                }
            }
        }
        if (str != null) {
            if (str.startsWith("//")) {
                String str2 = "https:";
                str = str.length() == 0 ? new String(str2) : str2.concat(str);
            }
            brj = bqy.b(context).a(str);
        }
        i = svk.a(context, bdhi);
        if (i != 0) {
            brj = bqy.b(context).a(Integer.valueOf(i));
        }
        if (brj == null) {
            return brj;
        }
        cfy a = bdhi.b == 4 ? (cgg) cgg.b(bup.b).b((int) aocf.UNSET_ENUM_VALUE, (int) aocf.UNSET_ENUM_VALUE) : cgg.a();
        bdhl bdhl = bdhi.c;
        if (bdhl != null) {
            bdgj bdgj = (bdgj) szb.a(bdhl, bdgj.a);
            if (bdgj != null) {
                if (bdgj.c()) {
                    a = (cgg) a.h();
                } else if (bdgj.b()) {
                    a = (cgg) a.a(new ccq((int) syq.a(bdgj.a(), context.getResources().getDisplayMetrics())));
                }
            }
        }
        return (brj) brj.b(a);
    }

    protected static void a(int i, int i2, crd crd, bdhi bdhi) {
        float f;
        bdhk[] bdhkArr = bdhi.a;
        if (bdhkArr.length != 0) {
            bdhk bdhk = bdhkArr[0];
            f = ((float) bdhk.b) / ((float) bdhk.c);
        } else {
            f = 1.0f;
        }
        cya.a(i, i2, f, crd);
    }

    protected static ImageView a(Context context) {
        return new ImageView(context);
    }

    protected static void a(cmg cmg, cmn cmn, bdhi bdhi, int i, bdhi bdhi2, bdhi bdhi3, cqp cqp, cqp cqp2) {
        Context context = cmg.b;
        cqp2.a = new crd(cmn.a(), cmn.b());
        brj a = swa.a(context, bdhi, cmn.a());
        if (a != null) {
            if (bdhi2 != null) {
                brj a2 = swa.a(context, bdhi2, cmn.a());
                if (a2 != null) {
                    a.b(a2);
                }
            }
            if (bdhi3 != null) {
                brj a3 = swa.a(context, bdhi3, cmn.a());
                if (a3 != null) {
                    a.a(a3);
                }
            }
            if (i == 1) {
                a.a(a);
            }
            cqp.a = a;
        }
    }

    protected static void a(ImageView imageView, bdhi bdhi, bdhi bdhi2, bdhi bdhi3, sxh sxh, Boolean bool, brj brj, crd crd, sxd sxd) {
        if (brj == null) {
            String valueOf = String.valueOf(bdhi.toString());
            String str = "Failed to find a valid source for the image. ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            sxd.b(2, valueOf);
            return;
        }
        if (bool != null && bool.booleanValue()) {
            imageView.setTag(R.id.elements_image, bdhi);
        }
        brj.a(new svz(crd, imageView, bdhi, sxh, bdhi2, bdhi3));
    }

    private static boolean b(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).isDestroyed();
        }
        if (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
            if (context != null && swa.b(context)) {
                return true;
            }
        }
        return false;
    }

    static void a(cmg cmg, ImageView imageView) {
        Context context = cmg.b;
        if (!swa.b(context)) {
            bqy.b(context).a((View) imageView);
        }
    }

    static boolean a(coa coa) {
        return ((bdhi) coa.b).equals(coa.a) ^ 1;
    }
}
