package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: hoe */
public final class hoe extends hnm {
    private final Context a;
    private final eki b;

    public hoe(bcaa bcaa, eki eki, Context context) {
        super(bcaa, atwd.class);
        this.b = eki;
        this.a = context;
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ Object a(amur amur) {
        return atwd.d;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a(agvz agvz, amur amur) {
        if (!this.b.d() && !this.b.c()) {
            return atwd.d;
        }
        String str = "downloads_page_filter_type";
        amqw.a(hnn.a(amur, str));
        int a = aqxx.a(((Integer) amur.get(str)).intValue());
        atwc atwc = (atwc) atwd.d.createBuilder();
        atvw atvw = (atvw) atvx.c.createBuilder();
        Context context = this.a;
        axqm axqm = (axqm) axqn.f.createBuilder();
        axqm.a(hoe.a(context.getString(R.string.downloads_page_playlists_and_videos_menu_item), a == 2, 2));
        axqm.a(hoe.a(context.getString(R.string.downloads_page_playlists_menu_item), a == 3, 3));
        axqm.a(hoe.a(context.getString(R.string.downloads_page_videos_menu_item), a == 4, 4));
        axqn axqn = (axqn) ((anxl) axqm.build());
        if (axqn != null) {
            atvw.copyOnWrite();
            atvx atvx = (atvx) atvw.instance;
            atvx.b = axqn;
            atvx.a |= 1;
        }
        atwc.copyOnWrite();
        atwd atwd = (atwd) atwc.instance;
        atwd.c = (atvx) ((anxl) atvw.build());
        atwd.a |= 2;
        if (this.b.f()) {
            atwc.a(ajqy.a(this.a.getString(R.string.downloaded_items_title)));
        }
        return (atwd) ((anxl) atwc.build());
    }

    private static axql a(String str, boolean z, int i) {
        aqxy aqxy = (aqxy) aqxw.c.createBuilder();
        aqxy.a(i);
        aqxy.build();
        axqo axqo = (axqo) axqp.c.createBuilder();
        awzv a = hss.a(i);
        if (a != null) {
            axqo.copyOnWrite();
            axqp axqp = (axqp) axqo.instance;
            axqp.b = a;
            axqp.a |= 1;
        }
        axqk axqk = (axqk) axql.i.createBuilder();
        axqk.copyOnWrite();
        axql axql = (axql) axqk.instance;
        if (str != null) {
            axql.a |= 1;
            axql.d = str;
            axqk.a(z);
            axqk.copyOnWrite();
            axql axql2 = (axql) axqk.instance;
            axql2.c = (anxl) axqo.build();
            axql2.b = 3;
            return (axql) ((anxl) axqk.build());
        }
        throw new NullPointerException();
    }
}
