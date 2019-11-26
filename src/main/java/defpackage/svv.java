package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.google.android.youtube.R;

/* renamed from: svv */
final class svv {
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

    private static brj a(Context context, bapb bapb, int i) {
        brj brj = null;
        if (svv.b(context)) {
            return null;
        }
        String str = null;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < bapb.a(); i3++) {
            bape g = bapb.g(i3);
            if (g.a() != null) {
                int abs = Math.abs(((int) g.c()) - i);
                if (abs == 0) {
                    str = g.a();
                    break;
                } else if (abs < i2) {
                    str = g.a();
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
        i = svj.a(context, bapb);
        if (i != 0) {
            brj = bqy.b(context).a(Integer.valueOf(i));
        }
        if (brj == null) {
            return brj;
        }
        cfy a = bapb.b() == 4 ? (cgg) cgg.b(bup.b).b((int) aocf.UNSET_ENUM_VALUE, (int) aocf.UNSET_ENUM_VALUE) : cgg.a();
        baoz baoz = (baoz) sza.a.a();
        try {
            if (bapb.a(baoz) != null && baoz.a() == 154604025) {
                baoj a2 = baoj.a(baoz.c());
                if (a2.b()) {
                    a = (cgg) a.h();
                } else if (a2.a() > 0.5f) {
                    a = (cgg) a.a(new ccq((int) syq.a(a2.a(), context.getResources().getDisplayMetrics())));
                }
            }
            sza.a.a(baoz);
            return (brj) brj.b(a);
        } catch (Throwable th) {
            sza.a.a(baoz);
        }
    }

    protected static ImageView a(Context context) {
        return new ImageView(context);
    }

    protected static void a(cmg cmg, cmn cmn, bapb bapb, int i, bapb bapb2, bapb bapb3, cqp cqp, cqp cqp2) {
        Context context = cmg.b;
        cqp2.a = new crd(cmn.a(), cmn.b());
        brj a = svv.a(context, bapb, cmn.a());
        if (a != null) {
            if (bapb2 != null) {
                brj a2 = svv.a(context, bapb2, cmn.a());
                if (a2 != null) {
                    a.b(a2);
                }
            }
            if (bapb3 != null) {
                brj a3 = svv.a(context, bapb3, cmn.a());
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

    protected static void a(ImageView imageView, bapb bapb, bapb bapb2, bapb bapb3, sxh sxh, Boolean bool, brj brj, crd crd, sxd sxd) {
        if (brj == null) {
            String valueOf = String.valueOf(bapb.toString());
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
            imageView.setTag(R.id.elements_image, bapb);
        }
        brj.a(new svy(crd, imageView, bapb, sxh, bapb2, bapb3));
    }

    private static boolean b(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).isDestroyed();
        }
        if (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
            if (context != null && svv.b(context)) {
                return true;
            }
        }
        return false;
    }

    static void a(cmg cmg, ImageView imageView) {
        Context context = cmg.b;
        if (!svv.b(context)) {
            bqy.b(context).a((View) imageView);
        }
    }

    static boolean a(coa coa) {
        return ((bapb) coa.b).equals(coa.a) ^ 1;
    }
}
