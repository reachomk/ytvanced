package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;

/* renamed from: inq */
public final class inq extends akpl {
    public final agwh a;
    public aqdo b;
    private final View c;
    private final TextView d = ((TextView) this.c.findViewById(R.id.title));
    private final RecyclerView e;
    private final agvx f;
    private final akvo g;
    private final View h = this.c.findViewById(R.id.contextual_menu_anchor);
    private final apr i;
    private final apr j;
    private final fap k;
    private final flu l;
    private final akwz m;

    public inq(Context context, akvo akvo, bcaa bcaa, akpe akpe, akvz akvz, acwa acwa, fas fas, flu flu) {
        this.g = akvo;
        agvz b = ((agwc) bcaa.get()).b();
        this.f = b.n();
        this.a = b.k();
        this.c = LayoutInflater.from(context).inflate(R.layout.commute_shelf_layout, null);
        this.k = fas.a(context, (ViewStub) this.c.findViewById(R.id.title_badge));
        this.e = (RecyclerView) this.c.findViewById(R.id.playlists);
        this.e.a(new ans(0, false));
        this.e.setNestedScrollingEnabled(false);
        this.e.a(new eyq(context.getResources().getDimensionPixelOffset(R.dimen.offline_commute_playlist_item_padding)));
        this.m = new inu(this.e, akpe, akvz, acwa);
        this.m.b.a(new inp(this));
        this.i = new apr(-1, -2);
        this.j = new apr(-1, 0);
        this.l = flu;
        this.l.a(this.c);
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        this.m.a.clear();
        this.b = null;
    }

    public static avmo a(agqi agqi) {
        if (agqi != null) {
            avoq avoq = agqi.i;
            if (!(avoq == null || avoq.i.size() == 0)) {
                for (avoo avoo : avoq.i) {
                    if ((avoo.a & 2) != 0) {
                        avmo avmo = avoo.b;
                        if (avmo == null) {
                            avmo = avmo.d;
                        }
                        return avmo;
                    }
                }
            }
        }
        return null;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        aqdo aqdo = (aqdo) obj;
        this.b = aqdo;
        Object a = amux.a(this.f.a(), ins.a);
        Object inr = new inr(this);
        amqw.a(a);
        amqw.a(inr);
        ink[] inkArr = (ink[]) amvj.a(amux.a(new amuz(a, inr), inv.a)).toArray(new ink[0]);
        if (inkArr.length > 0) {
            arml arml;
            this.m.a.clear();
            this.m.a(inkArr);
            TextView textView = this.d;
            if ((aqdo.a & 1) != 0) {
                arml = aqdo.b;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
            akvo akvo = this.g;
            View view = this.h;
            anxp anxp = aqdo.d;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(MenuRendererOuterClass.menuRenderer);
            anxp.a(access$000);
            Object b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            akvo.a(view, (auvn) b, aqdo, akor.a);
            fap fap = this.k;
            anxp anxp2 = aqdo.c;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            anxr access$0002 = anxl.checkIsLite(MetadataBadgeRendererOuterClass.metadataBadgeRenderer);
            anxp2.a(access$0002);
            obj = anxp2.h.b(access$0002.d);
            if (obj == null) {
                obj = access$0002.b;
            } else {
                obj = access$0002.a(obj);
            }
            fap.a((auxa) obj);
            this.c.setLayoutParams(this.i);
        } else {
            this.c.setLayoutParams(this.j);
        }
        flv.a(akor, 1);
        this.l.a(akor);
    }
}
