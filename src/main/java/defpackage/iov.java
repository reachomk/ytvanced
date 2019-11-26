package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.google.android.youtube.R;

/* renamed from: iov */
public final class iov extends imv {
    private final akvo b;
    private final View c = K_().findViewById(R.id.contextual_menu_anchor);
    private final hlv d;

    public iov(Context context, aaas aaas, flu flu, akvo akvo, hmc hmc, inh inh) {
        super(context, aaas, flu, inh, R.layout.offline_bundle_item_layout, new apr(context.getResources().getDimensionPixelSize(R.dimen.offline_bundle_item_image_width), context.getResources().getDimensionPixelSize(R.dimen.offline_bundle_item_image_height)), new apr(context.getResources().getDimensionPixelSize(R.dimen.offline_bundle_item_image_width), context.getResources().getDimensionPixelSize(R.dimen.offline_bundle_item_image_double_height)), context.getResources().getDimensionPixelSize(R.dimen.bundle_item_avatar_width_height));
        this.b = akvo;
        this.d = hmc.a((ViewStub) K_().findViewById(R.id.offline_badge), null);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        auvn auvn;
        avmq avmq = (avmq) obj;
        super.a(akor, avmq);
        akor.a("PlaylistPresenterConstants.PLAYLIST_ID", avmq.g);
        this.d.a(akor);
        acvx acvx = akor.a;
        akvo akvo = this.b;
        View K_ = K_();
        View view = this.c;
        auvr auvr = avmq.j;
        if (auvr == null) {
            auvr = auvr.c;
        }
        if ((auvr.a & 1) == 0) {
            auvn = null;
        } else {
            auvr = avmq.j;
            if (auvr == null) {
                auvr = auvr.c;
            }
            auvn = auvr.b;
            if (auvn == null) {
                auvn = auvn.l;
            }
        }
        akvo.a(K_, view, auvn, avmq, acvx);
    }
}
