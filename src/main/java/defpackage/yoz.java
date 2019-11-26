package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: yoz */
public final class yoz extends apa implements yij {
    private static final amur m;
    public final yil c;
    public yim d;
    public final List e = new ArrayList();
    public final yrz f;
    public final yxm g;
    public final Map h;
    public final ysa i;
    public final AtomicBoolean j;
    public yrv k;
    public int l = 1;
    private final ypn n;
    private final LayoutInflater o;
    private final OnClickListener p;
    private final String q;
    private final String r;
    private final String s;
    private final xsc t;
    private final yty u;
    private final ynv v;

    yoz(yil yil, ypn ypn, xsc xsc, yrz yrz, LayoutInflater layoutInflater, OnClickListener onClickListener, String str, String str2, String str3, yty yty, ynv ynv, yxm yxm, ysa ysa) {
        this.n = (ypn) amqw.a((Object) ypn);
        this.c = (yil) amqw.a((Object) yil);
        this.o = (LayoutInflater) amqw.a((Object) layoutInflater);
        this.p = (OnClickListener) amqw.a((Object) onClickListener);
        this.f = (yrz) amqw.a((Object) yrz);
        this.q = xvd.a(str);
        this.s = xvd.a(str3);
        this.t = (xsc) amqw.a((Object) xsc);
        this.u = (yty) amqw.a((Object) yty);
        this.v = ynv;
        this.g = (yxm) amqw.a((Object) yxm);
        this.h = new HashMap();
        this.i = (ysa) amqw.a((Object) ysa);
        this.j = new AtomicBoolean(false);
        this.r = xvd.a(str2);
    }

    public final void bk_() {
        yim yim = this.d;
        if (yim != null) {
            yim.bk_();
        }
        this.l = 2;
    }

    public final void bl_() {
        yim yim = this.d;
        if (yim != null) {
            yim.bl_();
        }
        this.l = 3;
    }

    public final aqj a(ViewGroup viewGroup, int i) {
        Object inflate;
        ViewGroup viewGroup2 = viewGroup;
        ypn ypn = this.n;
        switch (i) {
            case 1:
                inflate = this.o.inflate(R.layout.pagination_indicator, viewGroup2, false);
                break;
            case 2:
                inflate = c(viewGroup2, R.layout.text_chat_message_inside_bubble);
                break;
            case 3:
                View c = c(viewGroup2, R.layout.video_chat_message_inside_bubble);
                View findViewById = c.findViewById(R.id.video_thumbnail);
                LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
                layoutParams.width = viewGroup.getResources().getDimensionPixelSize(R.dimen.video_chat_message_thumbnail_width);
                layoutParams.height = (int) (((float) layoutParams.width) / 1.777f);
                findViewById.setLayoutParams(layoutParams);
                inflate = c;
                break;
            case 4:
                inflate = this.o.inflate(R.layout.metadata_chat_message, viewGroup2, false);
                break;
            case 5:
                inflate = c(viewGroup2, R.layout.link_chat_message_inside_bubble);
                break;
            case 6:
                inflate = this.o.inflate(R.layout.chat_read_receipt, viewGroup2, false);
                break;
            case 7:
                inflate = this.o.inflate(R.layout.chat_typing_status_section, viewGroup2, false);
                break;
            case 8:
                inflate = c(viewGroup2, R.layout.playlist_chat_message_inside_bubble);
                break;
            case 9:
                inflate = c(viewGroup2, R.layout.channel_chat_message_inside_bubble);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        OnClickListener onClickListener = this.p;
        String str = this.q;
        String str2 = this.r;
        String str3 = this.s;
        yty yty = this.u;
        ynv ynv = this.v;
        ytp ytp = (ytp) ypn.a((ytp) ypn.c.get(), 3);
        amro a = amrn.a(new ypb(this));
        ynv ynv2 = ynv;
        yty yty2 = yty;
        ynv ynv3 = ynv2;
        String str4 = str3;
        ynv ynv4 = ynv2;
        yty yty3 = yty2;
        String str5 = str2;
        akkq akkq = (akkq) ypn.a((akkq) ypn.a.get(), 1);
        str2 = str4;
        ysp ysp = (ysp) ypn.a((ysp) ypn.b.get(), 2);
        String str6 = str5;
        return new ypo(akkq, ysp, ytp, (yub) ypn.a((yub) ypn.d.get(), 4), (ysn) ypn.a((ysn) ypn.e.get(), 5), (ysm) ypn.a((ysm) ypn.f.get(), 6), (yta) ypn.a((yta) ypn.g.get(), 7), (yqz) ypn.a((yqz) ypn.h.get(), 8), (ysy) ypn.a((ysy) ypn.i.get(), 9), (ynd) ypn.a((ynd) ypn.j.get(), 10), (View) ypn.a(inflate, 11), i, (OnClickListener) ypn.a(onClickListener, 13), (String) ypn.a(str, 14), (String) ypn.a(str6, 15), (String) ypn.a(str4, 16), (yty) ypn.a(yty2, 17), (ynv) ypn.a(ynv4, 18), (amro) ypn.a(a, 19));
    }

    public final void a(aqj aqj, int i) {
        yim yim;
        ypo ypo = (ypo) aqj;
        yki yki = (yki) this.e.get(i);
        Object obj = yki.a;
        CharSequence charSequence = null;
        if (TextUtils.equals("PAGINATION_INDICATOR", obj)) {
            ysq ysq = (ysq) ypo.p;
            yla yla = (yla) yki;
            ysq.f.b(yla.c);
            ysq.f.a(yla.d);
        } else if (TextUtils.equals("READ_RECEIPT", obj)) {
            xpr.a(((ysx) ypo.p).f, ((yle) yki).getReadReceiptText());
        } else {
            String a;
            obj = yki.a;
            ytv a2 = yoc.a(yki, i, this.e, this.t.a());
            ypa ypa = ypo.p;
            if (ypa instanceof yts) {
                a = ((yts) ypa).a((String) obj, a2);
            } else {
                a = ypa.a(obj);
            }
            charSequence = a;
        }
        if (this.d == null) {
            this.d = yil.a(this.l);
        }
        String str = "ChatMessageSetAdapter_";
        if (!TextUtils.isEmpty(charSequence)) {
            yim = this.d;
            String valueOf = String.valueOf(charSequence);
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            yim.a(valueOf);
        }
        yim = this.d;
        String valueOf2 = String.valueOf(obj);
        yim.a(valueOf2.length() == 0 ? new String(str) : str.concat(valueOf2), ypo);
    }

    public final int a() {
        return this.e.size();
    }

    public final int a(int i) {
        Class cls = ((yki) this.e.get(i)).getClass();
        Integer num = (Integer) m.get(cls);
        if (num != null) {
            return num.intValue();
        }
        throw new UnsupportedOperationException(cls.getName().concat(" is an unsupported ChatMessageModel!"));
    }

    private final View c(ViewGroup viewGroup, int i) {
        View inflate = this.o.inflate(R.layout.user_authored_chat_message, viewGroup, false);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.inside_bubble_stub);
        viewStub.setLayoutResource(i);
        viewStub.inflate();
        return inflate;
    }

    static {
        amuu amuu = new amuu();
        amuu.b(yla.class, Integer.valueOf(1));
        amuu.b(yld.class, Integer.valueOf(2));
        amuu.b(ylh.class, Integer.valueOf(3));
        amuu.b(ykx.class, Integer.valueOf(4));
        amuu.b(yky.class, Integer.valueOf(5));
        amuu.b(yle.class, Integer.valueOf(6));
        amuu.b(ykt.class, Integer.valueOf(7));
        amuu.b(ykz.class, Integer.valueOf(8));
        amuu.b(ykc.class, Integer.valueOf(9));
        m = amuu.b();
    }
}
