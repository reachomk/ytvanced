package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.common.widget.TintableImageView;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.youtube.R;

/* renamed from: kau */
public final class kau {
    public final akkq a;
    public final akvp b;
    public final ViewStub c;
    public final ViewStub d;
    public final ViewStub e;
    public final ViewStub f;
    public final ColorStateList g;
    public CircularImageView h;
    public FrameLayout i;
    public ImageView j;
    public ImageView k;
    public TintableImageView l;

    public kau(akkq akkq, akvp akvp, View view) {
        this.a = akkq;
        this.b = akvp;
        this.c = (ViewStub) view.findViewById(R.id.circular_avatar_view_stub);
        this.d = (ViewStub) view.findViewById(R.id.cropped_square_avatar_view_stub);
        this.e = (ViewStub) view.findViewById(R.id.square_avatar_view_stub);
        this.f = (ViewStub) view.findViewById(R.id.icon_avatar_view_stub);
        this.g = xwe.b(view.getContext(), R.attr.ytIcon1);
        this.h = (CircularImageView) view.findViewById(R.id.circular_avatar);
        this.i = (FrameLayout) view.findViewById(R.id.cropped_square_avatar);
        this.k = (ImageView) view.findViewById(R.id.square_avatar);
        this.l = (TintableImageView) view.findViewById(R.id.icon_avatar);
    }

    public static aygk a(aqfa aqfa) {
        if (aqfa == null || (aqfa.a & 1) == 0) {
            return null;
        }
        apps apps = aqfa.b;
        if (apps == null) {
            apps = apps.c;
        }
        aygk aygk = apps.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        return aygk;
    }

    public static aygk b(aqfa aqfa) {
        if (aqfa == null || (aqfa.a & 2) == 0) {
            return null;
        }
        awkr awkr = aqfa.c;
        if (awkr == null) {
            awkr = awkr.c;
        }
        aygk aygk = awkr.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        return aygk;
    }

    public static aygk c(aqfa aqfa) {
        if (aqfa == null || (aqfa.a & 4) == 0) {
            return null;
        }
        awkt awkt = aqfa.d;
        if (awkt == null) {
            awkt = awkt.c;
        }
        aygk aygk = awkt.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        return aygk;
    }

    public static arwf d(aqfa aqfa) {
        if (aqfa == null || (aqfa.a & 128) == 0) {
            return null;
        }
        arwj arwj = aqfa.e;
        if (arwj == null) {
            arwj = arwj.c;
        }
        arwf arwf = arwj.b;
        if (arwf == null) {
            arwf = arwf.c;
        }
        return arwf;
    }
}
