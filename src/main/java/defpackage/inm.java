package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: inm */
public final class inm implements akot {
    public static final amur a = amur.a("offline_playlist_top_level_tab_id", "FEwhat_to_watch");
    public final aaas b;
    private final Resources c;
    private final View d;
    private final TextView e = ((TextView) this.d.findViewById(R.id.title));
    private final TextView f = ((TextView) this.d.findViewById(R.id.description));
    private final inb g;
    private final anm h;
    private final xsc i;

    public inm(Context context, aaas aaas, inh inh, xsc xsc, ViewGroup viewGroup) {
        this.b = aaas;
        this.d = LayoutInflater.from(context).inflate(R.layout.commute_shelf_item, viewGroup, false);
        this.i = xsc;
        RecyclerView recyclerView = (RecyclerView) this.d.findViewById(R.id.collage);
        this.c = context.getResources();
        this.g = inh.a(new apr(this.c.getDimensionPixelSize(R.dimen.offline_commute_playlist_item_image_width), this.c.getDimensionPixelSize(R.dimen.offline_commute_playlist_item_image_height)), new apr(this.c.getDimensionPixelSize(R.dimen.offline_commute_playlist_item_image_width), this.c.getDimensionPixelSize(R.dimen.offline_commute_playlist_item_image_double_height)), this.c.getDimensionPixelSize(R.dimen.offline_commute_playlist_item_avatar_width_height));
        this.h = new anm(2);
        anm anm = this.h;
        inb inb = this.g;
        inb.getClass();
        anm.b = new ind(inb);
        recyclerView.a(this.h);
        recyclerView.a(this.g);
        inb inb2 = this.g;
        inb2.getClass();
        recyclerView.a(new ine(inb2, this.c.getDimensionPixelSize(R.dimen.offline_commute_playlist_item_image_padding)));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.d;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        azfa azfa;
        ink ink = (ink) obj;
        this.d.setOnClickListener(new inl(this, ink));
        inb inb = this.g;
        inb.f = ink.c;
        inb.e = ink.d;
        inb.d = ink.f;
        inb.aa_();
        xpr.a(this.e, ink.b);
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(this.c.getQuantityString(R.plurals.video_count, ink.e, new Object[]{Integer.valueOf(ink.e)})).append(" · ").append(hsv.a(this.c, this.i, ink.g.a));
        xpr.a(this.f, spannableStringBuilder);
        azfd azfd = (azfd) ((anxo) akor.a.a(ink.a, acwc.BUNDLE_ITEM_COMMUTE_SHELF, akor.a("position", -1)).toBuilder());
        apwv apwv = (apwv) apww.d.createBuilder();
        apwz apwz = (apwz) apxa.c.createBuilder();
        anvu a = anvu.a(ink.a);
        apwz.copyOnWrite();
        apxa apxa = (apxa) apwz.instance;
        apxa.a = 1 | apxa.a;
        apxa.b = a;
        apwv.copyOnWrite();
        apww apww = (apww) apwv.instance;
        apww.c = (apxa) ((anxl) apwz.build());
        apww.a |= 4;
        azfd.copyOnWrite();
        azfa azfa2 = (azfa) azfd.instance;
        azfa2.g = (apww) ((anxl) apwv.build());
        azfa2.a |= 64;
        azfa2 = (azfa) ((anxl) azfd.build());
        byte[] bArr = akor.b;
        if (bArr != null && bArr.length > 0) {
            azfd = (azfd) azfa.h.createBuilder();
            azfd.a(anvu.a(akor.b));
            azfa = (azfa) ((anxl) azfd.build());
        } else if (akor.c == null) {
            azfa = null;
        } else {
            azfd = (azfd) azfa.h.createBuilder();
            azfd.a(akor.c.dU);
            azfa = (azfa) ((anxl) azfd.build());
        }
        akor.a.b(acxf.a(azfa2), acxf.a(azfa));
    }
}
