package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.youtube.R;

/* renamed from: kai */
public final class kai extends jxa {
    private final View f = this.b.findViewById(R.id.avatar_layout);

    public kai(Context context, akkq akkq, flu flu, akop akop, akvo akvo, est est, eur eur) {
        super(context, akkq, flu, akop, akvo, est, eur);
    }

    private static CharSequence a(ajsx ajsx) {
        return ajqy.a(ajsx.c);
    }

    private static CharSequence b(ajsx ajsx) {
        return ajqy.a(ajsx.b);
    }

    public final /* bridge */ /* synthetic */ byte[] k(Object obj) {
        return ((ajsx) obj).h;
    }

    public final /* bridge */ /* synthetic */ auvr j(Object obj) {
        return ((ajsx) obj).i;
    }

    public final /* bridge */ /* synthetic */ apdh[] i(Object obj) {
        return ((ajsx) obj).g;
    }

    public final /* bridge */ /* synthetic */ aygk h(Object obj) {
        return ((ajsx) obj).a;
    }

    public final /* synthetic */ CharSequence g(Object obj) {
        return kai.b((ajsx) obj);
    }

    public final /* synthetic */ CharSequence f(Object obj) {
        return kai.b((ajsx) obj);
    }

    public final /* synthetic */ CharSequence e(Object obj) {
        return kai.a((ajsx) obj);
    }

    public final /* synthetic */ CharSequence d(Object obj) {
        return kai.a((ajsx) obj);
    }

    public final /* synthetic */ CharSequence c(Object obj) {
        return ajqy.a(((ajsx) obj).e);
    }

    public final /* synthetic */ void a(Object obj, axwa axwa) {
        ajsx ajsx = (ajsx) obj;
        aqea aqea = ajsx.f;
        if (aqea != null) {
            aqdz aqdz = (aqdz) ((anxo) aqea.toBuilder());
            aqdz.copyOnWrite();
            aqea aqea2 = (aqea) aqdz.instance;
            if (axwa != null) {
                aqea2.b = axwa;
                aqea2.a |= 1;
                ajsx.f = (aqea) ((anxl) aqdz.build());
                return;
            }
            throw new NullPointerException();
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        super.a_(akor, (ajsx) obj);
        Resources resources = this.a.getResources();
        LayoutParams layoutParams = this.f.getLayoutParams();
        layoutParams.width = resources.getDimensionPixelSize(R.dimen.list_item_thumbnail_width);
        this.f.setLayoutParams(layoutParams);
    }
}
