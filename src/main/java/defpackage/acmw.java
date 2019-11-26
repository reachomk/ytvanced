package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.livechat.ui.view.LiveChatRecyclerView;
import com.google.android.youtube.R;

/* renamed from: acmw */
public final class acmw extends nf {
    public akpe Z;
    public abpo a;
    public abrq aa;
    public acfc ab;
    public akvz ac;
    public acmx ad;
    public Activity ae;
    public LiveChatRecyclerView af;
    public View ag;
    public apxu ah;
    public aufw ai;
    public boolean aj;
    public boolean ak;
    private acna al;
    public abpm b;
    public acvx c;

    public final void a(Activity activity) {
        super.a(activity);
        this.ae = activity;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((acmy) xse.a(p())).a(this);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.lc_live_chat_fragment, viewGroup, false);
        this.af = (LiveChatRecyclerView) inflate.findViewById(R.id.conversation_list);
        this.ag = inflate.findViewById(R.id.more_comments_icon);
        this.aa.c = true;
        this.al = new acna(this, this.ac);
        this.af.setOnTouchListener(new acmv(this, new ScaleGestureDetector(p(), new acmz(this))));
        return inflate;
    }

    public final void B() {
        super.B();
        if (this.a.l()) {
            this.a.m();
        } else {
            f();
        }
    }

    public final void ad_() {
        super.ad_();
        this.a.n();
    }

    public final void N_() {
        super.N_();
        this.a.o();
    }

    public final void f() {
        this.a.a(this.al);
        aufw aufw = this.ai;
        if (aufw == null) {
            apxu apxu = this.ah;
            if (apxu != null) {
                this.a.a(apxu);
            }
        } else {
            int i = aufw.a;
            abpo abpo;
            Object obj;
            if ((i & 1) != 0) {
                abpo = this.a;
                obj = aufw.b;
                if (obj == null) {
                    obj = awzv.d;
                }
                abpo.b(ajtj.a(obj));
            } else if ((i & 2) != 0) {
                abpo = this.a;
                obj = aufw.c;
                if (obj == null) {
                    obj = ayhc.e;
                }
                abpo.b(ajtj.a(obj));
            } else if ((i & 4) != 0) {
                abpo = this.a;
                obj = aufw.d;
                if (obj == null) {
                    obj = atuj.f;
                }
                abpo.b(ajtj.a(obj));
            } else if ((i & 8) != 0) {
                abpo = this.a;
                obj = aufw.e;
                if (obj == null) {
                    obj = auga.e;
                }
                abpo.b(ajtj.a(obj));
            } else if ((i & 16) != 0) {
                abpo = this.a;
                obj = aufw.f;
                if (obj == null) {
                    obj = awgm.d;
                }
                abpo.b(ajtj.a(obj));
            }
        }
        this.b.a = this.a;
    }
}
