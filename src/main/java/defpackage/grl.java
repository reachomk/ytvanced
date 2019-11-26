package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UserMentionSuggestionRendererOuterClass;

/* renamed from: grl */
public final class grl {
    public final aaas a;
    public final grr b;
    public final apxu c;
    public final acvx d;
    public String e;
    private final Context f;
    private final akpe g;
    private final akvz h;
    private final acum i;
    private final xuu j;
    private final RecyclerView k;
    private final ayvv l;
    private final Handler m = new Handler();
    private final akpk n;
    private String o;

    public grl(Context context, akpe akpe, akvz akvz, aaas aaas, acum acum, xuu xuu, grr grr, RecyclerView recyclerView, apxu apxu, acvx acvx, ayvv ayvv) {
        this.f = context;
        this.g = akpe;
        this.h = akvz;
        this.a = aaas;
        this.i = acum;
        this.j = xuu;
        this.b = (grr) amqw.a((Object) grr);
        this.k = (RecyclerView) amqw.a((Object) recyclerView);
        this.c = (apxu) amqw.a((Object) apxu);
        this.d = acvx;
        this.l = (ayvv) amqw.a((Object) ayvv);
        aknh grp = new grp();
        grp.a(new grn(this, new grk(this)));
        apa a = this.g.a((akpb) this.h.get());
        a.a(true);
        a.a(grp);
        this.n = grp;
        this.k.setPadding(0, this.f.getResources().getDimensionPixelSize(R.dimen.user_mention_suggestions_list_padding_top), 0, 0);
        this.k.setClipToPadding(false);
        this.k.a(null);
        this.k.a(new ans());
        this.k.a(a);
        this.k.setMotionEventSplittingEnabled(false);
    }

    public final void a() {
        this.o = this.j.a(16);
        b(2);
    }

    public final void a(String str) {
        if (!str.equals(this.e)) {
            if (this.e != null || !str.isEmpty()) {
                this.m.removeCallbacksAndMessages(null);
                this.m.postDelayed(new grm(this, str), 200);
                b(6);
            }
        }
    }

    public final void a(atmg atmg) {
        if (atmg.d.equals(this.e)) {
            this.d.a(atmg.f.d());
            int size = this.n.size();
            this.n.clear();
            for (axak axak : atmg.c) {
                akpk akpk = this.n;
                anxr access$000 = anxl.checkIsLite(UserMentionSuggestionRendererOuterClass.userMentionSuggestionRenderer);
                axak.a(access$000);
                Object b = axak.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                akpk.add(b);
            }
            boolean z = atmg.c.size() == 0;
            this.b.a(z);
            if (size == 0 && !z) {
                b(5);
            }
            b(7);
        }
    }

    public final void b() {
        b(3);
        this.e = null;
        this.m.removeCallbacksAndMessages(null);
    }

    public final void a(ayvx ayvx) {
        acum acum = this.i;
        asmz asmz = (asmz) asmw.f.createBuilder();
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        if (ayvx != null) {
            asmw.c = ayvx;
            asmw.b = 227;
            acum.a((asmw) ((anxl) asmz.build()));
            return;
        }
        throw new NullPointerException();
    }

    private final void b(int i) {
        a((ayvx) ((anxl) a(i).build()));
    }

    public final aywa a(int i) {
        aywa aywa = (aywa) ayvx.g.createBuilder();
        String str = this.o;
        aywa.copyOnWrite();
        ayvx ayvx = (ayvx) aywa.instance;
        if (str != null) {
            ayvx.a |= 1;
            ayvx.d = str;
            ayvv ayvv = this.l;
            aywa.copyOnWrite();
            ayvx = (ayvx) aywa.instance;
            if (ayvv != null) {
                ayvx.a |= 4;
                ayvx.f = ayvv.c;
                aywa.copyOnWrite();
                ayvx ayvx2 = (ayvx) aywa.instance;
                ayvx2.a |= 2;
                ayvx2.e = i - 1;
                return aywa;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
