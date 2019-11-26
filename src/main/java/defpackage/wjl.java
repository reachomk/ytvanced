package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: wjl */
public final class wjl implements akot {
    public final wdt a;
    public final wlx b;
    private final View c = View.inflate(this.d, R.layout.comment_poll, null);
    private final Context d;
    private final ViewGroup e = ((ViewGroup) this.c.findViewById(R.id.comment_poll_list));
    private final wji f;

    public wjl(Context context, wdt wdt, wji wji, wlx wlx) {
        this.d = (Context) amqw.a((Object) context);
        this.a = (wdt) amqw.a((Object) wdt);
        this.f = (wji) amqw.a((Object) wji);
        this.b = (wlx) amqw.a((Object) wlx);
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        this.f.a(this.e);
    }

    private static void a(apxx apxx, akor akor) {
        if (apxx != null) {
            axfq axfq = (axfq) axfr.c.createBuilder();
            axfq.a(akor.a.d());
            apxx.a(axft.b, (axfr) ((anxl) axfq.build()));
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        boolean z;
        awly awly = (awly) obj;
        akor.a.a(awly.d.d(), null);
        wei wei = (wei) amqw.a((wei) akor.a("commentThreadMutator"));
        for (int i = 0; i < awly.c.size(); i++) {
            if (((awlw) awly.c.get(i)).d) {
                z = true;
                break;
            }
        }
        z = false;
        int i2 = 0;
        while (i2 < awly.c.size()) {
            anxl anxl;
            apxx apxx;
            awlw awlw;
            awlz awlz = (awlz) ((anxo) ((awlw) awly.c.get(i2)).toBuilder());
            awlw awlw2 = (awlw) awlz.instance;
            if ((awlw2.a & 128) != 0) {
                anxl = awlw2.i;
                if (anxl == null) {
                    anxl = apxu.d;
                }
                apxx = (apxx) ((anxo) anxl.toBuilder());
                wjl.a(apxx, akor);
                awlz.copyOnWrite();
                awlw = (awlw) awlz.instance;
                awlw.i = (apxu) ((anxl) apxx.build());
                awlw.a |= 128;
            }
            awlw2 = (awlw) awlz.instance;
            if ((awlw2.a & 256) != 0) {
                anxl = awlw2.j;
                if (anxl == null) {
                    anxl = apxu.d;
                }
                apxx = (apxx) ((anxo) anxl.toBuilder());
                wjl.a(apxx, akor);
                awlz.copyOnWrite();
                awlw = (awlw) awlz.instance;
                awlw.j = (apxu) ((anxl) apxx.build());
                awlw.a |= 256;
            }
            awlw2 = (awlw) awlz.instance;
            if ((awlw2.a & 8) != 0) {
                anxl = awlw2.e;
                if (anxl == null) {
                    anxl = apxu.d;
                }
                apxx = (apxx) ((anxo) anxl.toBuilder());
                wjl.a(apxx, akor);
                awlz.copyOnWrite();
                awlw = (awlw) awlz.instance;
                awlw.e = (apxu) ((anxl) apxx.build());
                awlw.a |= 8;
            }
            akor a = this.f.a(akor);
            a.a("has_voted", Boolean.valueOf(z));
            a.a("is_last_item", Boolean.valueOf(i2 == awly.c.size() + -1));
            View a2 = this.f.a(a, (awlw) ((anxl) awlz.build()));
            this.e.addView(a2);
            a2.setOnClickListener(new wjk(this, wei, awly, awlz, akor));
            i2++;
        }
    }
}
