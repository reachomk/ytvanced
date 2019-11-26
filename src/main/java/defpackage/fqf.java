package defpackage;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint;

/* renamed from: fqf */
public final class fqf extends fja implements zbd {
    public aaas ae;
    public aarh af;
    public akvz ag;
    public akpe ah;
    public xxo ai;
    private EditText aj;
    private String ak;
    private aphg al;
    private byte[] am;

    public final void b(Bundle bundle) {
        Object obj;
        super.b(bundle);
        ((fqh) xse.a(p())).a(this);
        apxu a = fiw.a((fja) this).a();
        amqw.a(a != null);
        anxr access$000 = anxl.checkIsLite(ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint.conversationReplyPanelEndpoint);
        a.a(access$000);
        amqw.a(a.h.a(access$000.d));
        access$000 = anxl.checkIsLite(ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint.conversationReplyPanelEndpoint);
        a.a(access$000);
        Object b = a.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint conversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint = (ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint) obj;
        this.ak = conversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint.b;
        this.al = null;
        if ((conversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint.a & 2) != 0) {
            aqpl aqpl = conversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint.c;
            if (aqpl == null) {
                aqpl = aqpl.c;
            }
            aphg aphg = aqpl.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            this.al = aphg;
        }
        this.am = a.b.d();
        amqw.a(TextUtils.isEmpty(this.ak) ^ 1);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.conversation_reply_panel, viewGroup, false);
        this.aj = (EditText) layoutInflater.inflate(R.layout.conversation_reply_panel_action_bar_search, viewGroup, false);
        EditText editText = this.aj;
        if (VERSION.SDK_INT >= 23) {
            editText.setTextAppearance(R.style.f589ThemeOverlay.YouTube.ActionBar.Title.Search);
        } else {
            editText.setTextAppearance(editText.getContext(), R.style.f589ThemeOverlay.YouTube.ActionBar.Title.Search);
        }
        this.ai = new xxo(this.ak, this.al, this.am, this.af, this.ae, new zbc(inflate, this.ag, this.ah, this));
        this.ai.a();
        return inflate;
    }

    public final void W_() {
        super.W_();
        this.aj.setOnFocusChangeListener(new fqe(this));
    }

    public final void N_() {
        super.N_();
        this.aj.setOnFocusChangeListener(null);
    }

    public final ezz W() {
        if (p() == null) {
            return super.W();
        }
        faf i = ((fag) super.W()).i();
        i.a = a((int) R.string.conversation_reply_panel_title);
        i.b = this.aj;
        i.a(amwp.a);
        return i.a();
    }

    public final void f() {
        this.ai.a();
    }

    public final void i() {
        super.i();
        xxo xxo = this.ai;
        if (xxo != null) {
            xxo.b();
            this.ai = null;
        }
    }
}
